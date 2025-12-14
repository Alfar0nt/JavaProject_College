import java.io.*;
import java.util.*;

// Model class
class Person {
    private String id;
    private String name;
    private String email;
    private int age;
    
    public Person(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    @Override
    public String toString() {
        return id + "|" + name + "|" + email + "|" + age;
    }
    
    public static Person fromString(String data) {
        String[] parts = data.split("\\|");
        if (parts.length == 4) {
            return new Person(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]));
        }
        return null;
    }
}

// File storage handler
class FileStorage {
    private static final String FILE_NAME = "data.txt";
    
    public static void saveToFile(List<Person> persons) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Person person : persons) {
                writer.write(person.toString());
                writer.newLine();
            }
        }
    }
    
    public static List<Person> loadFromFile() throws IOException {
        List<Person> persons = new ArrayList<>();
        File file = new File(FILE_NAME);
        
        if (!file.exists()) {
            return persons;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Person person = Person.fromString(line);
                if (person != null) {
                    persons.add(person);
                }
            }
        }
        return persons;
    }
}

// CRUD operations
class CRUDOperations {
    private List<Person> persons;
    
    public CRUDOperations() {
        persons = new ArrayList<>();
        loadData();
    }
    
    public void addPerson(Person person) throws IOException {
        persons.add(person);
        saveData();
        System.out.println("Person added successfully!");
    }
    
    public List<Person> getAllPersons() {
        return new ArrayList<>(persons);
    }
    
    public Person getPersonById(String id) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
    
    public boolean updatePerson(String id, String name, String email, int age) throws IOException {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                person.setName(name);
                person.setEmail(email);
                person.setAge(age);
                saveData();
                return true;
            }
        }
        return false;
    }
    
    public boolean deletePerson(String id) throws IOException {
        Person toRemove = null;
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                toRemove = person;
                break;
            }
        }
        
        if (toRemove != null) {
            persons.remove(toRemove);
            saveData();
            return true;
        }
        return false;
    }
    
    public List<Person> searchByName(String name) {
        List<Person> results = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(person);
            }
        }
        return results;
    }
    
    private void loadData() {
        try {
            persons = FileStorage.loadFromFile();
        } catch (IOException e) {
            System.out.println("No existing data found. Starting with empty list.");
        }
    }
    
    private void saveData() throws IOException {
        FileStorage.saveToFile(persons);
    }
}

// Main class with all helper methods
public class CRUDSystem {
    private static CRUDOperations crud = new CRUDOperations();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            printMenu();
            int choice = getIntInput("Enter your choice: ");
            
            try {
                switch (choice) {
                    case 1:
                        addNewPerson();
                        break;
                    case 2:
                        viewAllPersons();
                        break;
                    case 3:
                        searchPerson();
                        break;
                    case 4:
                        updatePerson();
                        break;
                    case 5:
                        deletePerson();
                        break;
                    case 6:
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void printMenu() {
        System.out.println("===== PERSON MANAGEMENT SYSTEM =====");
        System.out.println("1. Add New Person");
        System.out.println("2. View All Persons");
        System.out.println("3. Search Person");
        System.out.println("4. Update Person");
        System.out.println("5. Delete Person");
        System.out.println("6. Exit");
        System.out.println("====================================");
    }
    
    private static void addNewPerson() throws IOException {
        System.out.println("\n--- Add New Person ---");
        
        String id = getStringInput("Enter ID: ");
        String name = getStringInput("Enter Name: ");
        String email = getStringInput("Enter Email: ");
        int age = getIntInput("Enter Age: ");
        
        Person person = new Person(id, name, email, age);
        crud.addPerson(person);
    }
    
    private static void viewAllPersons() {
        System.out.println("\n--- All Persons ---");
        List<Person> persons = crud.getAllPersons();
        
        if (persons.isEmpty()) {
            System.out.println("No persons found.");
        } else {
            System.out.println("ID\tName\t\tEmail\t\t\tAge");
            System.out.println("------------------------------------------------------");
            for (Person person : persons) {
                System.out.printf("%s\t%-15s\t%-20s\t%d%n",
                    person.getId(),
                    person.getName(),
                    person.getEmail(),
                    person.getAge());
            }
        }
    }
    
    private static void searchPerson() {
        System.out.println("\n--- Search Person ---");
        String name = getStringInput("Enter name to search: ");
        List<Person> results = crud.searchByName(name);
        
        if (results.isEmpty()) {
            System.out.println("No persons found.");
        } else {
            System.out.println("Found " + results.size() + " person(s):");
            System.out.println("ID\tName\t\tEmail\t\t\tAge");
            System.out.println("------------------------------------------------------");
            for (Person person : results) {
                System.out.printf("%s\t%-15s\t%-20s\t%d%n",
                    person.getId(),
                    person.getName(),
                    person.getEmail(),
                    person.getAge());
            }
        }
    }
    
    private static void updatePerson() throws IOException {
        System.out.println("\n--- Update Person ---");
        String id = getStringInput("Enter ID of person to update: ");
        
        Person person = crud.getPersonById(id);
        if (person == null) {
            System.out.println("Person not found!");
            return;
        }
        
        System.out.println("Current details:");
        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Age: " + person.getAge());
        
        System.out.println("\nEnter new details (leave blank to keep current):");
        
        String name = getStringInput("New Name [" + person.getName() + "]: ");
        String email = getStringInput("New Email [" + person.getEmail() + "]: ");
        String ageStr = getStringInput("New Age [" + person.getAge() + "]: ");
        
        if (name.isEmpty()) name = person.getName();
        if (email.isEmpty()) email = person.getEmail();
        int age = ageStr.isEmpty() ? person.getAge() : Integer.parseInt(ageStr);
        
        if (crud.updatePerson(id, name, email, age)) {
            System.out.println("Person updated successfully!");
        } else {
            System.out.println("Failed to update person.");
        }
    }
    
    private static void deletePerson() throws IOException {
        System.out.println("\n--- Delete Person ---");
        String id = getStringInput("Enter ID of person to delete: ");
        
        if (crud.deletePerson(id)) {
            System.out.println("Person deleted successfully!");
        } else {
            System.out.println("Person not found!");
        }
    }
    
    // Helper methods for input
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }
}
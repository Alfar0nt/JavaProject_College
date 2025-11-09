package allAboutArray.multiDimensionalArray;

public class tugasPertemuan10 {
 public static void main(String[] args) {
        System.out.println("Assignment - Create Random Image object using Array");
        System.out.println("Random Emoji Generator\n");
        
        // Generate 1 random emoji
        System.out.println("Your Random Emoji:");
        char[][] emoji = generateRandomEmoji();
        printEmoji(emoji);
    }
    
    // Method to generate a random emoji
    public static char[][] generateRandomEmoji() {
        // Define the 4 specified emoji patterns
        char[][][] emojiTemplates = {
            // First emoji: <(￣︶￣)>
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'<', '(', '￣', '︶', '￣', ')', '>'}
            },
            // Second emoji: ＼(￣▽￣)／
            {
                {' ', ' ', '￣', ' ', ' ','￣', ' '},
                {'＼', '(', ' ', '▽', ' ', ')', '／'}
            },
            // Third emoji: (≧◡≦)
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'(', '≧', '◡', '≦', ')', ' ', ' '}
            },
            // Fourth emoji: (*¯︶¯*)
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'(', '*', '¯', '︶', '¯', '*', ')'}
            }
        };
        
        // Randomly select one emoji template
        int randomIndex = (int)(Math.random() * emojiTemplates.length);
        return emojiTemplates[randomIndex];
    }
    
    // Method to print the emoji
    public static void printEmoji(char[][] emoji) {
        for (int i = 0; i < emoji.length; i++) {
            for (int j = 0; j < emoji[i].length; j++) {
                System.out.print(emoji[i][j]);
            }
            System.out.println();
        }
    }
}

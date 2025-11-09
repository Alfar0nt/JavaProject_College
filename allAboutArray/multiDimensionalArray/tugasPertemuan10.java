package allAboutArray.multiDimensionalArray;

public class tugasPertemuan10 {
    public static void main(String[] args) {
        System.out.println("Assignment - Create Random Image object using Array");
        System.out.println("Random Emoji Generator\n");
        
        // Define the 4 specified emoji patterns
        char[][][] emojiTemplates = {
            // First emoji: <(￣︶￣)>
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'<', '(', '￣', '︶', '￣', ')', '>'}
            },
            // Second emoji: ＼(￣▽￣)／
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'＼', '(', '￣', '▽', '￣', ')', '／'}
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
        char[][] selectedEmoji = emojiTemplates[randomIndex];
        
        // Print the selected emoji
        System.out.println("Your Random Emoji:");
        for (int i = 0; i < selectedEmoji.length; i++) {
            for (int j = 0; j < selectedEmoji[i].length; j++) {
                System.out.print(selectedEmoji[i][j]);
            }
            System.out.println();
        }
    }
}

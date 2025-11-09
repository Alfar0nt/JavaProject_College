package allAboutArray.multiDimensionalArray;

public class tugasPertemuan10 {
    public static void main(String[] args) {
        char[][][] emojiTemplates = {
            // <(￣︶￣)>
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'<', '(', '￣', '︶', '￣', ')', '>'}
            },
            // ＼(￣▽￣)／
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'＼', '(', '￣', '▽', '￣', ')', '／'}
            },
            // (≧◡≦)
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'(', '≧', '◡', '≦', ')', ' ', ' '}
            },
            // (*¯︶¯*)
            {
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'(', '*', '¯', '︶', '¯', '*', ')'}
            }
        };
        
        // buat milih emojinya secara random
        int randomIndex = (int)(Math.random() * emojiTemplates.length);
        char[][] selectedEmoji = emojiTemplates[randomIndex];
        
        // print emojinya
        for (int i = 0; i < selectedEmoji.length; i++) {
            for (int j = 0; j < selectedEmoji[i].length; j++) {
                System.out.print(selectedEmoji[i][j]);
            }
            System.out.println();
        }
    }
}

import java.util.ArrayList;

class word_search {

    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        ArrayList<Character> words_list = new ArrayList<>();

        // Store all characters of word
        for(int w = 0; w < word.length(); w++) {
            words_list.add(word.charAt(w));
        }

        boolean is_exist = false;

        // Traverse board
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                // Check if board character exists in word
                if(words_list.contains(board[i][j])) {
                    is_exist = true;
                    System.out.println(board[i][j] + " exists in word");
                }
            }
        }

        return is_exist;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'A','B','C'},
            {'D','E','F'},
            {'G','H','I'}
        };

        String word = "BEH";

        WordSearch obj = new WordSearch();

        boolean result = obj.exist(board, word);

        System.out.println(result);
    }
}
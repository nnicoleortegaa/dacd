public class LettersList {
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    /* Complete the getLettersList method that get the list of letters in the input word. */
    public static String[] getLettersList(String word) {
        String[] letters = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.substring(i, i + 1);
        }
        return letters;
    }

}


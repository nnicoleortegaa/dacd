public class Chessboard {
    public static void main(String[] args) {
        char[][] chessboard = new char[8][8];

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if ((x + y) % 2 == 0) {
                    chessboard[x][y] = '\u25A1';
                } else {
                    chessboard[x][y] = '\u25A0';
                }
            }
        }

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(chessboard[x][y]);
            }
            System.out.println();
        }
    }
}
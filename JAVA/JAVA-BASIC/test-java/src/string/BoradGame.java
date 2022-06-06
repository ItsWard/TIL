package string;

public class BoradGame {

    public static void main(String[] args) {
        int[][] board1 = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int output1 = boardGame(board1, "RDLLD");
    }


    public static Integer boardGame(int[][] board, String operation) {
        // TODO:
        int max = board.length;
        char operator;

        Piece piece = new Piece(0, 0, max);

        for(int i = 0; i < operation.length() ; i++){
            operator = operation.charAt(i);
            if(piece.move(operator)){
                piece.setScore(piece.getScore() + board[piece.getY()][piece.getX()]);
            }
            else
                return null;
        }

        return piece.getScore();

    }
    static class Piece {

        private int x;
        private int y;
        private int score;
        private boolean status;
        private int max;

        final static boolean BOARD_IN = true;
        final static boolean BOARD_OUT = false;

        public Piece(int x, int y, int max) {
            this.x = x;
            this.y = y;
            this.score = 0;
            this.max = max;
            this.status = isInBoard(this.x, this.y, this.max);
        }

        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }

        public void setScore(int score){
            this.score = score;
        }

        public int getScore(){
            return score;
        }

        private boolean isInBoard(int x, int y, int max) {
            if ((x >= 0 && x < max) && (y >= 0 && y < max))
                return BOARD_IN;
            else
                return BOARD_OUT;
        }

        public boolean move(char operator) {
            if (status == BOARD_IN) {
                switch (operator) {
                    case 'R':
                        this.x++;
                        break;
                    case 'L':
                        this.x--;
                        break;
                    case 'U':
                        this.y--;
                        break;
                    case 'D':
                        this.y++;
                        break;
                }
                status = isInBoard(this.x, this.y, this.max);
            }

            return status;
        }
    }
}

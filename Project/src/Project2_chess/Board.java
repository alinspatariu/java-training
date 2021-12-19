package Project2_chess;

public class Board {
    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    Place[][] pieces;

    public Board() {
        this.resetBoard();
    }

    public void resetBoard()
    {

        //pieces[0][0] = new Place(0, 0, new Rook(true));
        //pieces[0][1] = new (0, 1, new Knight(true));
        //pieces[0][2] = new Spot(0, 2, new Bishop(true));
        //pieces[0][3] =sad;
        //pieces[0][4] = sad;
        //pieces[0][5] = sad;
        //pieces[0][6] =sad;
        //pieces[0][7]=sad;

        for(int i=0;i<=7;i++)
        {
            pieces[1][i] = new Place(1,i,new Pawn(true));
        }

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                pieces[i][j] = new Place (i, j, null);
            }
        }
    }

}

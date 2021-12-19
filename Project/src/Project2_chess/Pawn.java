package Project2_chess;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }

    public boolean canMove(Board board, Place start, Place end)
    {
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        int x = Math.abs(start.getxCoord() - end.getxCoord());
        int y = Math.abs(start.getyCoord() - end.getyCoord());

        return x * y==1;

    }
}


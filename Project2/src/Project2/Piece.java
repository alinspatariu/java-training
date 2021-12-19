package Project2_chess;

public abstract class Piece {
    private int xCoord;
    private int yCoord;

    private boolean killed= false;


    private boolean white = false;
    private boolean black = false;

    public Piece(boolean white)
    {
        this.setWhite(white);
    }
    public void setBlack(boolean white)
    {
        this.black=black;
    }

    public boolean isBlack() {
        return black;
    }

    public boolean isWhite()
    {
        return this.white;
    }

    public void setWhite(boolean white)
    {
        this.white = white;
    }

    public boolean isKilled()
    {
        return this.killed;
    }

    public void setKilled(boolean killed)
    {
        this.killed = killed;
    }

    public abstract boolean canMove(Board board, Place start, Place end);
}

package Project2_chess;

public class Place {
    private int xCoord;
    private int yCoord;
    private Piece piece;

    public Place(int xCoord, int yCoord, Piece piece)
    {
        this.setPiece(piece);
        this.setxCoord(xCoord);
        this.setxCoord(yCoord);
    }

    public Piece getPiece()
    {
        return this.piece;
    }

    public void setPiece(Piece p)
    {
        this.piece = p;
    }

    public int getxCoord()
    {
        return this.xCoord;
    }

    public void setxCoord(int x)
    {
        this.xCoord= x;
    }

    public int getyCoord()
    {
        return this.yCoord;
    }

    public void setyCoord(int y)
    {
        this.yCoord = y;
    }
}


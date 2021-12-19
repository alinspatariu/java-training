package Project2_chess;

public class Move {
        private Player player;
        private Place start;
        private Place end;
        private Piece pieceMoved;
        private Piece pieceKilled;
        private boolean castlingMove = false;

        public Move(Player player, Place start, Place end)
        {
            this.player = player;
            this.start = start;
            this.end = end;
            this.pieceMoved = start.getPiece();
        }
        // the method will move the Pawn
        public boolean isCastlingMove()
        {
            return this.castlingMove;
        }

        public void setCastlingMove(boolean castlingMove)
        {
            this.castlingMove = castlingMove;
        }

}

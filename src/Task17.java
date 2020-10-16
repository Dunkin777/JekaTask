import java.util.ArrayList;

public class Task17 {
    public static void main(String[] args) {
        ArrayList<ChessPiece> list = new ArrayList<>();
        for (int i = 0; i<4;i++){
            list.add(ChessPiece.PAWN_WHITE);
        }
        for (int i = 0; i<4;i++){
            list.add(ChessPiece.BISHOP_BLACK);
        }
        for (ChessPiece chesspiece : list) {
            System.out.print(chesspiece.getDesignation());
        }

        System.out.println();
        ChessPiece[][] chessPiecesArray = {parse("♜____♜♚_"),parse("_♖__♟♟_♟"),parse("♟_♞___♟_"),parse("♛__♗____"),parse("___♝♙___"), parse("____♗♙__"), parse("♙__♕_♙_♙"), parse("_____♖♔_")};

        ChessBoard chessBoard = new ChessBoard(chessPiecesArray);

        chessBoard.print();

    }

    static ChessPiece[] parse(String string){
        ChessPiece[] ChessPieceArray = new ChessPiece[string.length()];
        for (int i = 0; i < ChessPieceArray.length; i++) {
            switch (string.charAt(i)) {
                case '♔' -> ChessPieceArray[i] = ChessPiece.KING_WHITE;
                case '♚' -> ChessPieceArray[i] = ChessPiece.KING_BLACK;
                case '♕' -> ChessPieceArray[i] = ChessPiece.QUEEN_WHITE;
                case '♛' -> ChessPieceArray[i] = ChessPiece.QUEEN_BLACK;
                case '♗' -> ChessPieceArray[i] = ChessPiece.ROOK_WHITE;
                case '♝' -> ChessPieceArray[i] = ChessPiece.ROOK_BLACK;
                case '♖' -> ChessPieceArray[i] = ChessPiece.BISHOP_WHITE;
                case '♜' -> ChessPieceArray[i] = ChessPiece.BISHOP_BLACK;
                case '♘' -> ChessPieceArray[i] = ChessPiece.KNIGHT_WHITE;
                case '♞' -> ChessPieceArray[i] = ChessPiece.KNIGHT_BLACK;
                case '♙' -> ChessPieceArray[i] = ChessPiece.PAWN_WHITE;
                case '♟' -> ChessPieceArray[i] = ChessPiece.PAWN_BLACK;
                case '_' -> ChessPieceArray[i] = ChessPiece.EMPTY;
            }
        }
        return ChessPieceArray;
    }
}

class ChessBoard{
    private final ChessPiece[][] chessPiecesArray;

    public ChessBoard(ChessPiece[][] chessPiecesArray) {
        this.chessPiecesArray = chessPiecesArray;
    }
    public void print(){
        for (ChessPiece[] subArray : chessPiecesArray) {
            for (ChessPiece chessPiece: subArray)
                  {
                System.out.print(chessPiece.getDesignation());
            }
            System.out.println();
        }
        }
    }
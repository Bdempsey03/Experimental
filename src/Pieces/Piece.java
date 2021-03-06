package Pieces;

import Graphics.Board;
import Graphics.BoardSquare;

import java.util.ArrayList;

public interface Piece {
    char colour = 'x';
    char getColor();
    boolean validMove(BoardSquare[][] theBoard, Move theMove);
    ArrayList<Move> listMoves();
    public String toString();


}

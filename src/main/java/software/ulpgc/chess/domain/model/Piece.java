package software.ulpgc.chess.domain.model;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import static software.ulpgc.chess.domain.model.Color.*;

public enum Piece {
    WhitePawn, WhiteRook, WhiteKnight, WhiteBishop, WhiteKing, WhiteQueen,
    BlackPawn, BlackRook, BlackKnight, BlackBishop, BlackKing, BlackQueen;

    public boolean isWhite() {
        return this.name().startsWith("White");
    }

    public boolean isBlack() {
        return this.name().startsWith("Black");
    }

    public boolean isRook() {
        return this.name().endsWith("Rook");
    }

    public boolean isPawn() {
        return this.name().endsWith("Pawn");
    }

    public boolean isKnight() {
        return this.name().endsWith("Knight");
    }

    public boolean isBishop() {
        return this.name().endsWith("Bishop");
    }

    public boolean isQueen() {
        return this.name().endsWith("Queen");
    }

    public boolean isKing() {
        return this.name().endsWith("King");
    }

}

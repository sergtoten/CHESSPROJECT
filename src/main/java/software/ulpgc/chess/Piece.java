package software.ulpgc.chess;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import static software.ulpgc.chess.Color.*;

public enum Piece {
    WhitePawn, WhiteRook, WhiteKnight, WhiteBishop, WhiteKing, WhiteQueen,
    BlackPawn, BlackRook, BlackKnight, BlackBishop, BlackKing, BlackQueen;

    private static final Set<Piece> WhitesPieces = Collections.unmodifiableSet(EnumSet.of(WhitePawn, WhiteRook, WhiteKnight, WhiteBishop, WhiteKing, WhiteQueen));

    Color color() {
        return isWhite() ? White : Black;
    }

    private boolean isWhite() {
        return WhitesPieces.contains(this);
    }

    boolean isPawn() {
        return this == WhitePawn || this == BlackPawn;
    }

    boolean isRook() {
        return this == WhiteRook || this == BlackRook;
    }

    boolean isKnight() {
        return this == WhiteKnight || this == BlackKnight;
    }

    boolean isBishop() {
        return this == WhiteBishop || this == BlackBishop;
    }

    boolean isKing() {
        return this == WhiteKing || this == BlackKing;
    }

    boolean isQueen() {
        return this == WhiteQueen || this == BlackQueen;
    }

}

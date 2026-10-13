package software.ulpgc.chess.adapters;

import software.ulpgc.chess.domain.model.Board;
import software.ulpgc.chess.domain.model.Piece;
import software.ulpgc.chess.domain.model.Rank;
import software.ulpgc.chess.domain.model.Square;
import software.ulpgc.chess.ports.BoardDeserializer;

import java.util.HashMap;
import java.util.Map;

public class FenBoardDeserializer implements BoardDeserializer {
    private static final Map<Character, Piece> PIECES = Map.ofEntries(
            Map.entry('P', Piece.WhitePawn),   Map.entry('p', Piece.BlackPawn),
            Map.entry('N', Piece.WhiteKnight), Map.entry('n', Piece.BlackKnight),
            Map.entry('B', Piece.WhiteBishop), Map.entry('b', Piece.BlackBishop),
            Map.entry('R', Piece.WhiteRook),   Map.entry('r', Piece.BlackRook),
            Map.entry('Q', Piece.WhiteQueen),  Map.entry('q', Piece.BlackQueen),
            Map.entry('K', Piece.WhiteKing),   Map.entry('k', Piece.BlackKing)
    );

    @Override
    public Board deserialize(String value) {
        String placement = value.trim().split("\\s+")[0];
        return new Board(piecesIn(placement.split("/")));
    }

    private Map<Square, Piece> piecesIn(String[] ranks) {
        Map<Square, Piece> map = new HashMap<>();
        int rank = Rank.values().length - 1;
        for (String row : ranks)
            map.putAll(piecesInRank(rank--, row));
        return Map.copyOf(map);
    }

    private Map<Square, Piece> piecesInRank(int rank, String row) {
        Map<Square, Piece> map = new HashMap<>();
        int file = 0;
        for (char c : row.toCharArray()) {
            if (c >= '1' && c <= '8')
                file += c - '0';
            else
                map.put(Square.at(file++, rank), pieceFor(c));
        }
        return map;
    }

    private Piece pieceFor(char c) {
        return PIECES.get(c);
    }
}
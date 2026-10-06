package software.ulpgc.chess;

import java.text.ParseException;

public record Square(File file, Rank rank) {

    public static Square from(String square) {
        return new Square(File.fromChar(square.charAt(0)), Rank.fromChar(Integer.parseInt(square.substring(1))));
    }

    public static Square at(String square) {
        return from(square);
    }

    private static class ParseException extends Exception {
        public ParseException(String s) {

        }
    }
}

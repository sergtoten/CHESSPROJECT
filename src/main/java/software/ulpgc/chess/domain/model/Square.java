package software.ulpgc.chess.domain.model;

import java.util.Arrays;

public record Square(File file, Rank rank) {
    public static Square at(String square) {
        return new Square(fileIn(square), rankIn(square));
    }

    public static Square at(int i, int j) {
        return new Square(File.values()[i],  Rank.values()[j]);
    }

    private static Rank rankIn(String square) {
        return rankIn(square.charAt(1));
    }

    private static Rank rankIn(char c) {
        return Arrays.stream(Rank.values())
                .filter(rank -> rank.symbol() == c)
                .findFirst()
                .orElse(null);
    }

    private static File fileIn(String square) {
        return fileIn(square.charAt(0));
    }

    private static File fileIn(char c ) {
        return Arrays.stream(File.values())
                .filter(file -> file.symbol() == c)
                .findFirst()
                .orElse(null);
    }
}

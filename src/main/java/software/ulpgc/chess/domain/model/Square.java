package software.ulpgc.chess.domain.model;

public record Square(File file, Rank rank) {

    public static Square at(String square) {
        return new Square(fileIn(square), rankIn(square));
    }
    private static Rank rankIn(String square) {
        return rankIn(square.charAt(1));
    }

    private static Rank rankIn(char c) {
        for (Rank r : Rank.values()) {
            if (r.value() == c) return r;
        } return null;
    }

    private static File fileIn(String square) {
        return fileIn(square.charAt(0));
    }

    private static File fileIn(char c ) {
        for (File f : File.values()) {
            if (f.symbol() == c) {
                return f;
            }
        } return null;
    }
}

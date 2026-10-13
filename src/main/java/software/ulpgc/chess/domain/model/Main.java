package software.ulpgc.chess.domain.model;

import static software.ulpgc.chess.domain.model.File.A;
import static software.ulpgc.chess.domain.model.Rank.R1;

public class Main {

    static void main() {
        Square a = new Square(A, R1);
        Square b = new Square(A, R1);
        Square c = b;

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

}

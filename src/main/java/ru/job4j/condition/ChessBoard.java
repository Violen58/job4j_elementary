package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rslX = 0;
        int rslY = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 != x2 && y1 != y2) {
                rslX = Math.abs(x2 - x1);
                rslY = Math.abs(y2 - y1);
            }
        }
        return rslX == rslY ? rslX : 0;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(1, 1, 4, 4));
        System.out.println(ChessBoard.way(1, 1, 3, 4));
        System.out.println(ChessBoard.way(1, 1, 1, 1));
    }

}

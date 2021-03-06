package org.mom47.chess.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Point {
    private int rank;
    private int file;

    @JsonCreator
    public Point(@JsonProperty("file") int file, @JsonProperty("rank") int rank) {
        this.file = file;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public int getFile() {
        return file;
    }

    @JsonIgnore
    public Point getUp() {
        return new Point(file, rank + 1);
    }

    @JsonIgnore
    public Point getUpRight() {
        return new Point(file + 1, rank + 1);
    }

    @JsonIgnore
    public Point getRight() {
        return new Point(file + 1, rank);
    }

    @JsonIgnore
    public Point getDownRight() {
        return new Point(file + 1, rank - 1);
    }

    @JsonIgnore
    public Point getDown() {
        return new Point(file, rank - 1);
    }

    @JsonIgnore
    public Point getDownLeft() {
        return new Point(file - 1, rank - 1);
    }

    @JsonIgnore
    public Point getLeft() {
        return new Point(file - 1, rank);
    }

    @JsonIgnore
    public Point getUpLeft() {
        return new Point(file - 1, rank + 1);
    }

    @JsonIgnore
    public Point getUpLeftHorse() {
        return new Point(file - 1, rank + 2);
    }

    @JsonIgnore
    public Point getUpRightHorse() {
        return new Point(file + 1, rank + 2);
    }

    @JsonIgnore
    public Point getRightUpHorse() {
        return new Point(file + 2, rank + 1);
    }

    @JsonIgnore
    public Point getRightDownHorse() {
        return new Point(file + 2, rank - 1);
    }

    @JsonIgnore
    public Point getDownRightHorse() {
        return new Point(file + 1, rank - 2);
    }

    @JsonIgnore
    public Point getDownLeftHorse() {
        return new Point(file - 1, rank - 2);
    }

    @JsonIgnore
    public Point getLeftUpHorse() {
        return new Point(file - 2, rank + 1);
    }

    @JsonIgnore
    public Point getLeftDownHorse() {
        return new Point(file - 2, rank - 1);
    }

    public Point[] getUpPath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        int size = Math.min(count, 7 - rank);
        Point[] path = new Point[size];
        int j = 1;
        for (int i = 0; i <= size - 1; i++) {
            path[i] = new Point(file, rank + j);
            j++;
        }

        return path;
    }

    public Point[] getRightPath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        int size = Math.min(count, 7 - file);
        Point[] path = new Point[size];
        int j = 1;
        for (int i = 0; i <= size - 1; i++) {
            path[i] = new Point(file + j, rank);
            j++;
        }

        return path;
    }

    public Point[] getLeftPath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        int size = Math.min(count, file);
        Point[] path = new Point[size];
        int j = 1;
        for (int i = 0; i <= size - 1; i++) {
            path[i] = new Point(file - j, rank);
            j++;
        }

        return path;
    }

    public Point[] getDownPath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        int size = Math.min(count, rank);
        Point[] path = new Point[size];
        int j = 1;
        for (int i = 0; i <= size - 1; i++) {
            path[i] = new Point(file, rank - j);
            j++;
        }

        return path;
    }

    public Point[] getUpLeftPath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        int x = file;
        int y = rank;
        int max = Math.min(x, 7 - y);
        int size = Math.min(count, max);
        Point[] path = new Point[size];
        int j = 1;
        for (int i = 0; i <= size - 1; i++) {
            path[i] = new Point(file - j, rank + j);
            j++;
        }

        return path;
    }

    public Point[] getUpRightPath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        int x = file;
        int y = rank;
        int max = Math.max(x, y);
        int size = Math.min(count, 7 - max);
        Point[] path = new Point[size];
        int j = 1;
        for (int i = 0; i <= size - 1; i++) {
            path[i] = new Point(file + j, rank + j);
            j++;
        }

        return path;
    }

    public Point[] getDownLeftPath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        int x = file;
        int y = rank;
        int max = Math.min(x, y);
        int size = Math.min(count, max);
        Point[] path = new Point[size];
        int j = 1;
        for (int i = 0; i <= size - 1; i++) {
            path[i] = new Point(file - j, rank - j);
            j++;
        }

        return path;
    }

    public Point[] getDownRightPath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        int x = file;
        int y = rank;
        int max = Math.min(7 - x, y);
        int size = Math.min(count, max );
        Point[] path = new Point[size];
        int j = 1;
        for (int i = 0; i <= size - 1; i++) {
            path[i] = new Point(file + j, rank - j);
            j++;
        }

        return path;
    }

    public Point[] getDownRightHorsePath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        Point[] path = new Point[count];
        int j = 1;
        int x = 2;
        for (int i = 0; i <= count - 1; i++) {
            path[i] = new Point(file + j, rank - x);
            j++;
            x++;
            x++;
            if (path[i].rank < 0 || path[i].file > 7) {
                path = new Point[]{ };
                return path;
            }
        }

        return path;
    }

    public Point[] getDownLeftHorsePath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        Point[] path = new Point[count];
        int j = 1;
        int x = 2;
        for (int i = 0; i <= count - 1; i++) {
            path[i] = new Point(file - j, rank - x);
            j++;
            x++;
            x++;
            if (path[i].rank < 0 || path[i].file < 0) {
                path = new Point[]{ };
                return path;
            }
        }

        return path;
    }

    public Point[] getUpRightHorsePath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        Point[] path = new Point[count];
        int j = 1;
        int x = 2;
        for (int i = 0; i <= count - 1; i++) {
            path[i] = new Point(file + j, rank + x);
            j++;
            x++;
            x++;
            if (path[i].rank > 7 || path[i].file > 7) {
                path = new Point[]{ };
                return path;
            }
        }

        return path;
    }

    public Point[] getUpLeftHorsePath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        Point[] path = new Point[count];
        int j = 1;
        int x = 2;
        for (int i = 0; i <= count - 1; i++) {
            path[i] = new Point(file - j, rank + x);
            j++;
            x++;
            x++;
            if (path[i].rank > 7 || path[i].file < 0) {
                path = new Point[]{ };
                return path;
            }
        }

        return path;
    }

    public Point[] getLeftUpHorsePath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        Point[] path = new Point[count];
        int j = 1;
        int x = 2;
        for (int i = 0; i <= count - 1; i++) {
            path[i] = new Point(file - x, rank + j);
            j++;
            x++;
            x++;
            if (path[i].rank > 7 || path[i].file < 0) {
                path = new Point[]{ };
                return path;
            }
        }

        return path;
    }

    public Point[] getLeftDownHorsePath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        Point[] path = new Point[count];
        int j = 1;
        int x = 2;
        for (int i = 0; i <= count - 1; i++) {
            path[i] = new Point(file - x, rank - j);
            j++;
            x++;
            x++;
            if (path[i].rank < 0 || path[i].file < 0) {
                path = new Point[]{ };
                return path;
            }
        }

        return path;
    }

    public Point[] getRightUpHorsePath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        Point[] path = new Point[count];
        int j = 1;
        int x = 2;
        for (int i = 0; i <= count - 1; i++) {
            path[i] = new Point(file + x, rank + j);
            j++;
            x++;
            x++;
            if (path[i].rank > 7 || path[i].file > 7) {
                path = new Point[]{ };
                return path;
            }
        }

        return path;
    }

    public Point[] getRightDownHorsePath(int count) {
        Point point = new Point(file, rank);
        int rank = point.rank;
        int file = point.file;
        Point[] path = new Point[count];
        int j = 1;
        int x = 2;
        for (int i = 0; i <= count - 1; i++) {
            path[i] = new Point(file + x, rank - j);
            j++;
            x++;
            x++;
            if (path[i].rank < 0 || path[i].file > 7) {
                path = new Point[]{ };
                return path;
            }
        }

        return path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (rank != point.rank) return false;
        return file == point.file;
    }

    @Override
    public String toString() {
        return "File: " + file + " Rank: " + rank;
    }
}

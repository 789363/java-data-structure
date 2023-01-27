import java.util.*;

public class Maze {
    public static final int[][] MAZE = {
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1 },
            { 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
    };
    public static final int ROW = MAZE.length;
    public static final int COL = MAZE[0].length;
    public static int[][] path = new int[ROW][COL];
    public static final int[] ROW_OFFSETS = { -1, 1, 0, 0 };
    public static final int[] COL_OFFSETS = { 0, 0, -1, 1 };
    public static final String[] DIRS = { "N", "S", "W", "E" };

    public static void main(String[] args) {
        Stack<Pair> stack = new Stack<>();
        int startRow = 1, startCol = 1;
        int endRow = 8, endCol = 10;

        stack.push(new Pair(startRow, startCol));
        path[startRow][startCol] = 1;

        while (!stack.isEmpty()) {
            Pair curr = stack.pop();
            int row = curr.getRow();
            int col = curr.getCol();

            if (row == endRow && col == endCol) {
                printPath();
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nextRow = row + ROW_OFFSETS[i];
                int nextCol = col + COL_OFFSETS[i];

                if (isValidMove(nextRow, nextCol)) {
                    stack.push(new Pair(nextRow, nextCol, curr, DIRS[i]));
                    path[nextRow][nextCol] = path[row][col] + 1;
                }
            }
        }
    }

    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < ROW && col >= 0 && col < COL && MAZE[row][col] == 0 && path[row][col] == 0;
    }

    public static void printPath() {
        for (int[] row : path) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

class Pair {
    private int row;
    private int col;
    private Pair parent;
    private String dir;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Pair(int row, int col, Pair parent, String dir) {
        this.row = row;
        this.col = col;
        this.parent = parent;
        this.dir = dir;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Pair getParent() {
        return parent;
    }

    public String getDir() {
        return dir;
    }
}

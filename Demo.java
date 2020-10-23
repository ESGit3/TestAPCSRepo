public class Demo {
    public static String arrToString(int[] arr) {
        String a = "{";
        if (arr.length == 0) return "{}";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i] + ", ";
        }
        a = a.substring(0, a.length() - 2);
        a += "}";
        return a;
    }

    public static String arrayDeepToString(int[][] arr) {
        String a = "{";
        if (arr.length == 0) return "{}";
        for (int i = 0; i < arr.length; i++) {
            a += arrToString(arr[i]) + ", ";
        }
        a = a.substring(0, a.length() - 2);
        a += "}";
        return a.replace("}, ", "}, \n");
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = (int)Math.round(Math.random() * (maxValue + 1));
            }
        }
        return arr;
    }

    public static int[][] create2DArrayRandomized(int rows, int maxCols, int maxValue) {
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int randCol = (int)Math.round(Math.random() * (maxCols + 1));
            arr[i] = new int[randCol];
            for (int j = 0; j < randCol; j++) {
                arr[i][j] = (int)Math.round(Math.random() * (maxValue + 1));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 6; j > i; j--) {
                    System.out.print(i);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
                for (int j = Integer.parseInt(args[0]) + 1; j > i; j--) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
        int[][] test = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arrayDeepToString(test));
        System.out.println(arrayDeepToString(create2DArrayRandomized(4,5, 6)));
    }
}

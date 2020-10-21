public class Demo {
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
    }
}

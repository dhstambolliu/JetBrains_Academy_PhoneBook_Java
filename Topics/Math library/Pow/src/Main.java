import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();

        Double result = Math.pow(a, b);
        System.out.println(result);
    }
}
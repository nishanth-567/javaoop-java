public class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public class Main {
        public static void main(String[] args) {
            Calc calculator = new Calc();
            System.out.println("Addition of 2 numbers: " +calculator.add(1,2));
            System.out.println("Addition of 2 doubles: " +calculator.add(2.45, 5.854));
            System.out.println("Addition of 3 numbers: " +calculator.add(1,78,8));
    }
}
}

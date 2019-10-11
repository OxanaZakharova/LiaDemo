public class Math {

    public int div(int a, int b) {

        return a/b;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public double substract(double a, double b){
        return a-b;
    }

    public int fibonacci(int a) throws Exception {
        if (a < 0) throw new Exception();
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fibonacci(a - 2)+fibonacci(a -1);
    }

    public int factorial(int a) throws Exception {
        if (a < 0 ) throw new Exception();
        if (a == 0) return 1;
        return a * factorial(a-1);
    }

}

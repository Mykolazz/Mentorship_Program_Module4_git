public class Arithmetic {
    public int add (int a, int b){
        return a+b;
    }

    public int sub (int a, int b){
        return a-b;
    }

    public int div (int a, int b){
        return a/b;
    }

    public int multiplication (int a, int b){
        return a*b;
    }

    public double sqrt (int a){
        return Math.sqrt(a);
    }

    public int addAdvanced(int a, int b){
        System.out.println("This is add method");
        return a+b;
    }

    public int addAdvanced(int a, int b, int c){
        System.out.println("This is add method for 3 params");
        return a+b+c;
    }

    public int addAdvanced(int a, int b, int c, int d){
        System.out.println("This is add method for 4 params");
        return a+b+c+d;
    }
}

package student;

public class Homework1 {

    public double shippingCalculator(int n){
        double sum = 10.95;
        for(int i = 0; i < n; i++){
            sum = sum + 2.95;
        }
        return 0;
    }
    public boolean isValidTriangle(int a, int b, int c){
        if(a+b <= c) return false;
        if(a+c <= b) return false;
        if(b+c <= a) return false;
        return true;
    }
    public boolean isPrime(int number){
        double d = (double)number;
        if(number == 1) return false;
        if(number == 2) return true;
        for(int i = 2; i <= Math.sqrt(d); i++){
            if(number % i == 0) return false;
        }
        return true;
    }
    public  int hex2int(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return decimal;
    }
    public String int2hex(int value) {
        String hex = Integer.toHexString(value);
        return hex;
    }

}


package pr;

class myMath{
    static long result;
    void add(long a, long b){
        result = a+b;
    }

    long subtract(long a, long b) {
        return a-b;
    }

    long multiply(long a, long b) {
        return a*b;
    }

    double divide(double a, double b) {
        return a/b;
    }
}
public class Exam5 {
    public static void main(String[] args) {
        myMath math = new myMath();

        math.add(5,4);
        long result1 = myMath.result;
        long result2 =math.subtract(5, 4);
        long result3 =math.multiply(5, 4);
        double result4 =math.divide(5, 4);

        System.out.println(result1+" "+result2+" "+result3+" "+result4);
    }
}
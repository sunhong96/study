package pr;


class Data{
    int x;


}
public class xxxx {

    static void change(Data d){
        d.x = 1000;
        System.out.println(d.x);
    }
    static int factorial(int n){
        int result = 0;

        if (n==1)
            result = 1;
        else
            result = n * factorial(n-1);

        return result;

    }
    public static void main(String[] args) {
        Data d = new Data();

        d.x = 10;
        System.out.println(d.x);

        change(d);
        System.out.println(d.x);

        int result = factorial(4);
        System.out.println(result);
    }


}

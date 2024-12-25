public class Fibonacci {
    public static void FibonacciSeries(int a,int b,int c, int n){
        if(n==0){
            return ;
        }
        System.out.println(a);
        FibonacciSeries(c,b+a,b+c,n-1);
    }
    public static void main (String[]args){
        FibonacciSeries(0,1,1,5);
    }
}

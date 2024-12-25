public class Recursion {
    public static void printnum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }sum+=n;
               printnum(n-1,sum);

    }
    public static void main(String[]args){

    printnum(9,0);
}
}

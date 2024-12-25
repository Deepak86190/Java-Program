public class StringPattern {
    public static void main(String[] args) {
        String str = "abcde";
        for(int i =0;i<=5;i++){
            for(int j=i+1;j<=5;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}

public class TryCatchExc {
    public static void main(String[]args){
        try {
            int arr[] ={1,2,4,5};
            System.out.println(arr[10]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}

abstract class Bank{
    abstract int InterstRate();
}
class Axis extends Bank{
    int InterstRate(){return 8;}
}
class Sbi extends Bank{
    int InterstRate(){return 9;}
}
class Hdfc extends Bank{
    int InterstRate(){return 10;}
}
public class Test_MethodOverload {
    public static void main(String args[]){
        Bank b = new Hdfc();
       Sbi s=new Sbi();
        Axis a= new Axis();
        Hdfc h= new Hdfc();
        b.InterstRate();
        System.out.println("Sbi Rate "+s.InterstRate());
        System.out.println("Hdfc Rate "+h.InterstRate());
        System.out.println("Axis Rate "+a.InterstRate());
    }
}

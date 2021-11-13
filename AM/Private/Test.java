package pack1;
import static java.lang.System.*;
class Test{
    private int a=100;
    private void m1(){
        out.println("Private Method - m1()");
    }
    public static void main(String[] args){
        Test t =new Test();
        System.out.println(t.a);
        t.m1();
    }
}

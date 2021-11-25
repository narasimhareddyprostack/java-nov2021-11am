class Parent{
    public void m1(float f){
        System.out.println("Parent Class - m1 () Method" +  f);
    }
}
class Child extends Parent{
    /* public void m1(int i){
        System.out.println("Child Class - m1 () Method");
    } */
public static void main(String[] args){

    Child obj = new Child();
    obj.m1(10);
}
}

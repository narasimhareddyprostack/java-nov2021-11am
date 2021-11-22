class Parent{
    public void m1(){
        System.out.println("Parent Class - M1 method");
    }
}
class Child extends Parent{
    public void m2(){
        System.out.println("Child Class - M1 method");
    }
}
class Test{
    public static void main(String[] args){
        Child obj=new Parent(); //Object created stored into ref c, and type is child class
       //obj.m1();
       //obj.m2();
    }
}
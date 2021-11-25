class Demo{
    public void m1(){
        System.out.println("No - Arguments");
    }
   
    public void m1(double d){
         System.out.println("double - Arguments");
         System.out.println(d);
         
    }
    public static void main(String[] args){
        Demo d = new Demo();
        d.m1();
        d.m1(10);
        d.m1('A');
    }
}
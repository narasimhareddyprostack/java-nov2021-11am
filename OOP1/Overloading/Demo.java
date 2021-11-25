class Demo{
   
     
      public void m1(float f){
        System.out.println("Float argument  ");
     }
    public static void main(String[] args){
        Demo d = new Demo();
        d.m1("Ravi Kumar");
        d.m1(null);
        d.m1(10);
        
    }
}
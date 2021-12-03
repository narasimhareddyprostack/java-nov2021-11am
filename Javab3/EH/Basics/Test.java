class Test{
    public static void main(String[] args){
      try{
        System.out.println("Hello,GM");
        System.out.println(10/5);  //2
        System.out.println(10/0);  //ArithmeticException - object
       
      }
      catch(Exception e){
          System.out.println(e);
      }
    System.out.println("Good Bye");
    }
}
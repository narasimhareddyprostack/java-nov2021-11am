class Employee {
    int emp_id;
    String emp_Name;

}
class NullPointerDemo{
    public static void main(String[] args){
        try{
        int[] size = {38,40,44};
        Employee e = null;
        e.emp_id = 101;
        System.out.println(10/0);
        System.out.println(size[10]);
        }
       
        catch(NullPointerException e){
        System.out.println(e);
        //e.printTraceTrace();
        }
        catch(ArithmeticException e){
        System.out.println(e);
        //e.printTraceTrace();
        }
         catch(Exception e){
            System.out.println(e);
        //e.printTraceTrace();
        }
       
        System.out.println("Test Case123");
    }
}
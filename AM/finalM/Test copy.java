class P{
    public void getName(){
    System.out.println("P Claas - getName Method");
    }
}
class C extends P{
    public void getName(){
    System.out.println("Child Claas - getName Method");
    }
public static void main(String[] args){
    C obj = new C();
    obj.getName();
}
}
//create custom or user defined exeption
class InsufficientException extends Exception{
    public String toString(){
        return "No Money ... Please Deposit then withdraw!";
    }
}
class Bank{
    double balance = 5000;
    public void withDraw(double amount) throws InsufficientException{
        if(balance>amount){
            System.out.print("Please Withdrawn and enjoy");
        }else{
            throw new InsufficientException();
            
        }
    }
    public static void main(String[] args) throws InsufficientException{
        Bank c1 = new Bank();
        c1.withDraw(7000);
        System.out.println("Hello,GM");
        
    }
}

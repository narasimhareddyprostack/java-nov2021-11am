class PaymentFailureException extends Exception{
    public String toString(){
        return "Paymenet Failure - User Defined Exception";
    }
}
class Product{
    public void buyProduct() throws PaymentFailureException{
        throw new  PaymentFailureException();
    }
}
class Demo{
   /*  public static void main(String[] args){
        Product p = new Product();
        try{
            p.buyProduct();
        }
        catch(PaymentFailureException pfe){
            pfe.printStackTrace();
        }
        
    } */
    public static void main(String[] args) throws PaymentFailureException{
        Product p = new Product();
        p.buyProduct();
    }
}
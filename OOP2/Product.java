class Product{
    int product_Id;
    Product(){
        System.out.print("Parameterized Const - 0"); 
    }
    Product(int i){
        System.out.println(i);
        System.out.println(this.product_Id);
        this.product_Id = i;
        System.out.println("Parameterized Const - 1");
        System.out.println(this.product_Id);
        
    }
    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product(101);

    }

}
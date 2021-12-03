class Product{
    int product_Id;
    String product_Name;
    Product(int a, String s){
        this.product_Id = a;
        this.product_Name=s;
        System.out.println("Executing Automatically");
    }
    public static void main(String[] args){
        Product p1 =new Product(101, "Iphone 5s");
        System.out.println(p1.product_Name);
        Product p2 =new Product(102, "Samsung");
        System.out.println(p2.product_Name);

    }
}
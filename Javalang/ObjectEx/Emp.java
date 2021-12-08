class Emp extends Object{
    String name;
    int sal;
    Emp(String name, int sal){
        this.name = name;
        this.sal = sal;
    }
    public static void main(String[] args){
        Emp e1 = new Emp("Rahul Gandhi", 45000);
        Emp e2 = new Emp("Priyanka Gandhi", 55000);
        Emp e3 = e1;
        System.out.println(e1.equals(e2));//false
        System.out.println(e3.equals(e1));
    }
}
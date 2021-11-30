class Test{
public static void main(String[] args){
    PermanentEmployee pe = new PermanentEmployee();
    ContractEmployee ce = new ContractEmployee();
    pe.setEmp_Id(101);
    pe.setEmp_Name("Rahul Gandhi");
    System.out.println(pe.getEmp_Name());
    System.out.println("*****************");
    ce.setEmp_Id(102);
    ce.setEmp_Name("Priyanka Gandhi");
    System.out.println(ce.getEmp_Name());

}
}
class Test{
    public static void main(String[] args){
        Employee e = new Employee();
        e.setEmp_Id(101);
        e.setEmp_Name("Rahul Gandhi");

        System.out.println("********");
        System.out.println(e.getEmp_Id());
        System.out.println(e.getEmp_Name());
    }
}
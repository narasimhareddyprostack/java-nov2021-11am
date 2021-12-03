public class Employee{
    private int employee_id;
    private String emp_Name;
    public void setEmp_Id(int id){
        this.employee_id = id;
    }
    public int getEmp_Id(){
        return this.employee_id;
    }
    public void setEmp_Name(String name){
        this.emp_Name = name;
    }
    public String getEmp_Name(){
        return this.emp_Name;
    }
}
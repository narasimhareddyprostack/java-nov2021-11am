package poly;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Savings_Account sa1 = new Savings_Account();
    sa1.setAcc_Id(101);
    sa1.setAcc_Name("Rahul Gandhi");
    sa1.setAcc_Balance(5000);
    sa1.setMin_Bal(500);
    System.out.println("**********");
    System.out.println(sa1.getAcc_Name());
    
    
    System.out.println("**** Current Account Details******");
    Current_Account ca1 = new Current_Account();
    ca1.setAcc_Id(101);
    ca1.setAcc_Name("Priyanka Gandhi");
    ca1.setAcc_Balance(10000);
    ca1.setMin_Bal(10);
    System.out.println("**********");
    System.out.println(ca1.getAcc_Name());
    
	/*
	 * sa1.cal_Bal(); 
	 * ca1.cal_Bal();
	 */
    AccountService.showDetails(sa1);
    AccountService.showDetails(ca1);
    
	}

}

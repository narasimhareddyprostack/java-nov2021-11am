package poly;

public class Savings_Account extends Account {
	private double min_Bal;

	public double getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public void cal_Bal() {
		double balance = getAcc_Balance();
		double min_Bal = getMin_Bal();
		balance = balance - min_Bal;
		System.out.println("Saving Balance :"+balance);
	}
	

}

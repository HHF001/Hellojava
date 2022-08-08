class Balance080407{
	protected double balance;
	
	public Balance080407(double balanceIn) {
		balance = balanceIn;
	}
	
	public void printBlance() {
		System.out.println("your account balance is $"+balance);
	}
}

class CheckingAccount extends Balance080407{
	public CheckingAccount(double balance) {
		super(balance);
	}
	
	@Override
	public void printBlance(){
		System.out.println("Your checking account balance is $"+balance);
	}
	
	public static void main(String[] args) {
		CheckingAccount myCheckings = new CheckingAccount(5000);
		myCheckings.printBlance();                                           //应该是调用子类重写之后的printBlance()方法
	}
}
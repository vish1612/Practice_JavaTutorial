package OOPsConcepts;

public class InterfaceDemo_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceDemo_HSBCBank hsbc = new InterfaceDemo_HSBCBank();
		hsbc.credit();
		hsbc.debit();
		hsbc.educationLoan();
		hsbc.HomeLoan();
		hsbc.transferMoney();
		hsbc.mutualfund(); 
		System.out.println(InterfaceDemo_USBank.min_bal);
		
		System.out.println("------------------------");
		InterfaceDemo_USBank us = new InterfaceDemo_HSBCBank(); //Runtime Polymorphism
		us.credit();
		us.debit();
		us.transferMoney();
		System.out.println(InterfaceDemo_USBank.min_bal);
		
	}

}

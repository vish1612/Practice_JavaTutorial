package OOPsConcepts;

public class InterfaceDemo_HSBCBank implements InterfaceDemo_USBank, InterfaceDemo_BrazilBank{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("---Credit Money");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("---Debit Money");
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("---Transfer Money");
	}
	
	public void educationLoan() {
		System.out.println("---Education Loan");
	}
	
	public void HomeLoan() {
		System.out.println("---Home Loan");
	}

	@Override
	public void mutualfund() {
		// TODO Auto-generated method stub
		System.out.println("-----Mutual fund");
	}
	
}

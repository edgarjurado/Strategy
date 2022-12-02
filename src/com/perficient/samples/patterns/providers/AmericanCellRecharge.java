package com.perficient.samples.patterns.providers;

public class AmericanCellRecharge implements IProviderRecharge {
	
	private String companyName="American Cell";;
	
	public AmericanCellRecharge() {
		
	}
	
	@Override
	public boolean recharge(String cellNumber, float amount) {
		boolean result=false;
		if(recordPayment(amount, cellNumber)) {
			System.out.println("Adding " + amount + " of " + companyName + " credit to " + cellNumber);
			result=true;
		}
		return result;
	}

	@Override
	public boolean recordPayment(float amount, String cellNumber) {
		System.out.println("Payment received by " + companyName);
		return true;
	}

	@Override
	public String getCompanyName() {
		return companyName;
	}

}

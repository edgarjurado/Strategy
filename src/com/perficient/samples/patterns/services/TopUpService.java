package com.perficient.samples.patterns.services;

import com.perficient.samples.patterns.configuration.Companies;
import com.perficient.samples.patterns.providers.Iprovider;
import com.perficient.samples.patterns.providers.Provider;

public class TopUpService implements ITopupService {

	Iprovider provider;
	
	@Override
	public Iprovider getProvider() {
		return provider;
	}

	private void recordRequest() {
		System.out.println("Topup requested for " + provider.getCompanyName());
	}
	
	@Override
	public boolean recharge(String cellNumber, float amount, String company) {
		provider=new Provider(Companies.getProvider(company));
		recordRequest();
		return provider.recharge(cellNumber, amount);
	}
	
	
}

package com.perficient.samples.patterns.services;

import com.perficient.samples.patterns.providers.Iprovider;

public interface ITopupService {

	Iprovider getProvider();

	boolean recharge(String cellNumber, float amount, String company);

}
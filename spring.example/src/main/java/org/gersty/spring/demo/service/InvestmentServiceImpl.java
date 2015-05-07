package org.gersty.spring.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

import org.gersty.spring.demo.domain.Investment;


@Service
public class InvestmentServiceImpl implements InvestmentService{

	public List<Investment> retrieveInvestments(){
		List<Investment> investments = new ArrayList<Investment>();

		investments.add(new Investment("investment 1", "mutual fund"));
		investments.add(new Investment("investment 2", "high risk"));
		investments.add(new Investment("investment 3", "real estate"));
		investments.add(new Investment("investment 4", "low yield index"));

		return investments;


	}

}
package org.gersty.spring.demo.service;

import java.util.List;
import org.gersty.spring.demo.domain.Investment;

public interface InvestmentService {
	List<Investment> retrieveInvestments();
}
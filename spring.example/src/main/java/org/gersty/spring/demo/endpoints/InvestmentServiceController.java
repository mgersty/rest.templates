package org.gersty.spring.demo.endpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.gersty.spring.demo.domain.Investment;
import org.gersty.spring.demo.service.InvestmentService;


@Controller
@RequestMapping("services")
public class InvestmentServiceController {
	
	@Autowired
	InvestmentService investmentService;


	@RequestMapping(value="/investments", method=RequestMethod.GET, produces={"application/json"})
    @ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Investment> retrieveInvestments() {
		
		System.out.println("Retreiving Investments");
		return investmentService.retrieveInvestments();
		
	}
}
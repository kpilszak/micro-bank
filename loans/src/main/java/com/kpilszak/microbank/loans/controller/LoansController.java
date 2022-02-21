package com.kpilszak.microbank.loans.controller;

import com.kpilszak.microbank.loans.model.Customer;
import com.kpilszak.microbank.loans.model.Loans;
import com.kpilszak.microbank.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {
	
	@Autowired
	private LoansRepository loansRepository;
	
	@PostMapping("/myLoans")
	public List<Loans> getLoansDetails(@RequestBody Customer customer) {
		List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
		if (loans != null) {
			return loans;
		} else {
			return null;
		}
	}
}

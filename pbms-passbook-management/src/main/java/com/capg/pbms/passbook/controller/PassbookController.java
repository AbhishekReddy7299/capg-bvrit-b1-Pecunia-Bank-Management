package com.capg.pbms.passbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.pbms.passbook.model.Transaction;
import com.capg.pbms.passbook.model.TransactionList;
import com.capg.pbms.passbook.service.ITransactionService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/passbook")
public class PassbookController {
	@Autowired
	ITransactionService transactionService;
	 
	
	@GetMapping("/allTransactionsById/id/{id}")
	public List<Transaction> printTransactions(@PathVariable("id") long accountId) {
		 	return  transactionService.printTransactions(accountId);
	
	}

	@GetMapping("/lastTransactionById/id/{id}") 
	public Transaction getTransactionById(@PathVariable("id") long accountId) {
		return transactionService.getTransactionById(accountId);
	}

	@GetMapping("/allTransactions")
	public TransactionList getAllTransactions() {
		 
		return transactionService.getAllTransactions();
	}

	
}

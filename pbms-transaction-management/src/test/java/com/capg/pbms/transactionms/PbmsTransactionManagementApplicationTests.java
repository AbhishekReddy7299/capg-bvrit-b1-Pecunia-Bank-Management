  package com.capg.pbms.transactionms;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.capg.pbms.transactionms.model.Customer;
import com.capg.pbms.transactionms.model.Transaction;
import com.capg.pbms.transactionms.repository.CustomerRepo;
import com.capg.pbms.transactionms.repository.TransactionRepo;
import com.capg.pbms.transactionms.service.TransactionService;
import com.capg.pbms.transactionms.service.TransactionServiceImpl;

@SpringBootTest
class PbmsTransactionManagementApplicationTests {
//	@Autowired
	TransactionService service=new TransactionServiceImpl(); 
	Map<Long,Transaction> t=new HashMap<Long,Transaction>();
//	
//	@Autowired
//	TransactionRepo repo;
//	CustomerRepo custrepo;
	Transaction transaction=new Transaction(123456789012L,123456789012L,1000.00, "cheque",LocalDate.now(), 123456, 20000.00, null);
//	Customer customer=new Customer(123456789012L, "123456", "1", "savings", "Active", 2000.00, 3.00,LocalDate.now(), "`123456789012", "asdfg", "1234567890", "wer3456", "1234567890", "MALE", 	null, null);
//	
//	 
//	@Test
//	public void getone() {
//		 
//		assertEquals(true,service.addAccount(customer));
//	}	
	@Test
	public void getBalance() {
		assertEquals(true,service.getBalanceById(12345678901L));
	}
//	 
//	@Test
//	public void credit() {
//		assertEquals(true,service.creditUsingCheque(123456789012L,  1000.00, transaction));
//	}

	@Test
	void contextLoads() {
	}
 
}

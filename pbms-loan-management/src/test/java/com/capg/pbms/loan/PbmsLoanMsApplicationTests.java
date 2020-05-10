package com.capg.pbms.loan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.capg.pbms.loan.model.Customer;
import com.capg.pbms.loan.model.LoanRequest;
import com.capg.pbms.loan.repo.IAccountRepo;
import com.capg.pbms.loan.repo.ILoanRequestRepo;
import com.capg.pbms.loan.service.LoanServiceImpl;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.capg.pbms.loan.exception.AccountException;
import static org.junit.jupiter.api.Assertions.assertThrows;
@SpringBootTest
class PbmsLoanMsApplicationTests {
//	@Autowired
//	IAccountRepo accountrepo;
	ILoanRequestRepo loanrepo;
	LoanServiceImpl service;
 
	LoanRequest loan1=new LoanRequest( 123456789012L,100000.00, "house loan", 3, 300.00, "Accepted", 500.00, 690);
	LoanRequest loan=new LoanRequest(123456789013L,100000.00, "house loan", 3, 300.00, "Accepted", 500.00, 690);
	Customer customer=new Customer(123456789012L, "123456", "1", "savings", "Active", 2000.00, 3.00,null, "`123456789012", "asdfg", "1234567890", "wer3456", "1234567890", "MALE", 	null, null);

//	@Test
//	public void addAccount() {
//		Customer customer=new Customer(123456789012L, "123456", "1", "savings", "Active", 2000.00, 3.00,null, "`123456789012", "asdfg", "1234567890", "wer3456", "1234567890", "MALE", 	null, null);
//		Customer c=service.addaccount(customer);
//		assertEquals(true,service.getLoanById(c.getAccountId()));
//			}
	@Test
	public void testFlightNumberwithLessDigits() throws AccountException{
	
		Exception exception = assertThrows(AccountException.class, () -> {
			 service.isValidAccountId(123456789012L);
		    });
		    String expectedMessage = "ID should be of 12 digits";
		    String actualMessage = exception.getMessage();	 
		    assertTrue(actualMessage.contains(expectedMessage));
	}

//		@Test
//		void account() {
//			long n=loan.getLoanRequestId();
//			assertTrue(service.getLoanById(c.getAccountId()));
//		}
	@Test
	void contextLoads() {
	}

}

package com.capg.pbms.passbook.repo;

 
import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.passbook.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Long> {
	
 
	 	 
}

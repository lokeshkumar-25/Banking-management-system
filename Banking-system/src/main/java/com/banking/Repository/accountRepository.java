package com.banking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.banking.Entity.accountEntity;

public interface accountRepository extends JpaRepository <accountEntity,Long> {
	
 
}

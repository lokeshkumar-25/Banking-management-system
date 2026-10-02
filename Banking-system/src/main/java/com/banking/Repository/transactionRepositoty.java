package com.banking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.Entity.transactionEntity;

public interface transactionRepositoty extends JpaRepository<transactionEntity,Long>{

}

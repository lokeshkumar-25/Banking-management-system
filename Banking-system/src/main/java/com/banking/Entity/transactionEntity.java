package com.banking.Entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="transaction")
public class transactionEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	@Enumerated(EnumType.STRING)
	private transactionType type;
	
	private BigDecimal amount;
	
	private String Description;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private accountEntity account;

     // Constructors	
	
	public transactionEntity() {
		
	}
	
    //Getter & Setter

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public transactionType getType() {
		return type;
	}

	public void setType(transactionType type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public accountEntity getAccount() {
		return account;
	}

	public void setAccount(accountEntity account) {
		this.account = account;
	}
	
	
}
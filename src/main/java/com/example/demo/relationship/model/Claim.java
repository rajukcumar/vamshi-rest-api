package com.example.demo.relationship.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "claim")
@Getter
@Setter
@Data
public class Claim  extends BaseCase{
	@Id
	@Column(name = "claim_id")
	@JsonFormat
	private Long claimId;

	@Column(name = "market_id")
	@JsonFormat
	private Long marketId;
	
	@Column(name = "product_id")
	@JsonFormat
	private Long productId;
	

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "case_active_date")
	private Date caseActiveDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "case_expire_date")
	private Date caseExpireDate;
}

package com.lmig.ci.lmbc.empr.relationship.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "claim")
@Getter
@Setter
public class Claim  extends BaseCase{
	@Id
	@Column(name = "claim_id")
	private Long claimId;

	@Column(name = "market_id")

	private Long marketId;
	
	@Column(name = "product_id")
	private Long productId;
	

	@Column(name = "case_active_date")
	private Date caseActiveDate;

	@Column(name = "case_expire_date")
	private Date caseExpireDate;
}

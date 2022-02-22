package com.example.demo.relationship.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="case_claim_relationship")
public class CaseClaimRelationship extends BaseCase {

	@Id
	@Column(name="ccr_id")
	private Long ccrId;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "ccr_active_date")
	private Date ccrActiveDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "ccr_expire_date")
	private Date ccrExpireDate;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "case_id", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  private Case caseObj;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "claim_id", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  private Claim claimObj;
	
}

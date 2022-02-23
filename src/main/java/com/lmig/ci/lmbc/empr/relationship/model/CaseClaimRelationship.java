package com.lmig.ci.lmbc.empr.relationship.model;

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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "case_claim_relationship")
@Setter
@Getter
public class CaseClaimRelationship extends BaseCase {

	private static final long serialVersionUID = 2976889300509602026L;

	@Id
	@Column(name = "ccr_id")
	private Long ccrId;

	@Column(name = "ccr_active_date")
	private Date ccrActiveDate;

	@Column(name = "ccr_expire_date")
	private Date ccrExpireDate;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "case_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Case caseObj;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "claim_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Claim claimObj;

}

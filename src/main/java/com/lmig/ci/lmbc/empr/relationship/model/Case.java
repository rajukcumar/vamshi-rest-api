package com.lmig.ci.lmbc.empr.relationship.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "case_tab")
public class Case extends BaseCase {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "case_id")
	private Long caseId;

	@Column(name = "source_id")
	private Long sourceId;

	@Column(name = "case_active_date")
	private Date caseActiveDate;

	@Column(name = "case_expire_date")
	private Date caseExpireDate;

}

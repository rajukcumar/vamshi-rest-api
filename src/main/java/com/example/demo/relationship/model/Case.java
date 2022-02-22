package com.example.demo.relationship.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "case_tab")
public class Case implements Serializable{
	@Id
	@Column(name = "case_id")
	private Long caseId;
	@Column(name = "source_id")
	private Long sourceId;
	@Column(name = "cas_active_date")
	private Date caseActiveDate;

}

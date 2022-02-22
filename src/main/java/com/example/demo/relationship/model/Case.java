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

@Data
@Entity
@Setter
@Getter
@Table(name = "case_tab")
public class Case extends BaseCase {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "case_id")
	@JsonFormat
	private Long caseId;

	@Column(name = "source_id")
	@JsonFormat
	private Long sourceId;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "case_active_date")
	private Date caseActiveDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "case_expire_date")
	private Date caseExpireDate;

}

package com.lmig.ci.lmbc.empr.relationship.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;
@Data
@MappedSuperclass
public class BaseCase implements Serializable {

	private static final long serialVersionUID = -6275682075926550945L;

	@Column(name = "row_create_date_ts")
	private Date rowCreateDateTs;
	
	@Column(name = "row_create_id")
	private Long rowCreateId;
	
	@Column(name = "row_change_date_ts")
	private Date rowChangeDateTs;
	
	@Column(name = "row_change_id")
	private Long rowChangeId;
}

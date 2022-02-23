package com.example.demo.relationship.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
@MappedSuperclass
public class BaseCase implements Serializable {

	private static final long serialVersionUID = -6275682075926550945L;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name = "row_create_date_ts")
	private Date rowCreateDateTs;
	
	@Column(name = "row_create_id")
	private Long rowCreateId;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name = "row_change_date_ts")
	private Date rowChangeDateTs;
	
	@Column(name = "row_change_id")
	@JsonFormat
	private Long rowChangeId;
}

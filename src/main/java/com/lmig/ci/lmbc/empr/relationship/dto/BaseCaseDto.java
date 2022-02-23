package com.lmig.ci.lmbc.empr.relationship.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BaseCaseDto implements Serializable {

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date rowCreateDateTs;
	
	@JsonFormat
	private Long rowCreateId;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date rowChangeDateTs;
	
	
	@JsonFormat
	private Long rowChangeId;
}

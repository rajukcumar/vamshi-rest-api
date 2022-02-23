package com.lmig.ci.lmbc.empr.relationship.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ClaimDto extends BaseCaseDto {

	@JsonFormat
	private Long claimId;

	@JsonFormat
	private Long marketId;
	
	@JsonFormat
	private Long productId;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date caseActiveDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date caseExpireDate;
}

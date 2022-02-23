package com.lmig.ci.lmbc.empr.relationship.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CaseClaimRelationshipDetailsDto extends BaseCaseDto {

	@JsonFormat
	private Long ccrId;
	
	@JsonFormat
	private Long caseId;

	@JsonFormat
	private Long claimId;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date ccrActiveDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date ccrExpireDate;
}

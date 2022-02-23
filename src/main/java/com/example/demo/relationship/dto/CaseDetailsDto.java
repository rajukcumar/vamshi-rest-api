package com.example.demo.relationship.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CaseDetailsDto extends BaseCaseDto {

	@JsonFormat
	private Long caseId;

	@JsonFormat
	private Long sourceId;

	@JsonFormat(pattern = "DD/MM/YYYY")
	private Date caseActiveDate;

	@JsonFormat(pattern = "DD/MM/YYYY")
	private Date caseExpireDate;
	
	private List<ClaimDto> claimsDto;
	private List<CaseClaimRelationshipDetailsDto> caseClaimRelationshipDetailsDto;

}

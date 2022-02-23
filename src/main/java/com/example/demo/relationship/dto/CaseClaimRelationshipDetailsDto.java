package com.example.demo.relationship.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CaseClaimRelationshipDetailsDto implements Serializable {

	@JsonFormat
	private Long ccrId;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date ccrActiveDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date ccrExpireDate;
}

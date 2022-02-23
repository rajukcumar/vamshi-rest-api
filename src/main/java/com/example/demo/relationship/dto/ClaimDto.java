package com.example.demo.relationship.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ClaimDto implements Serializable {

	@JsonFormat
	private Long claimId;
}

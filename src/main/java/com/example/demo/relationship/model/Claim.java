package com.example.demo.relationship.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "claim")
public class Claim  extends BaseCase{
	@Id
	@Column(name = "claim_id")
	@JsonFormat
	private Long claimId;

}

package com.example.demo.relationship.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "claim")
@Getter
@Setter
@Data
public class Claim  extends BaseCase{
	@Id
	@Column(name = "claim_id")
	@JsonFormat
	private Long claimId;

}

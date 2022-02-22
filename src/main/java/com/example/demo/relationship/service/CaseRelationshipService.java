package com.example.demo.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.relationship.dto.CaseDetailsDto;
import com.example.demo.relationship.model.Case;
import com.example.demo.relationship.repository.CaseClaimRelationshipRepository;
import com.example.demo.relationship.repository.CaseRepository;
import com.example.demo.relationship.repository.ClaimRepository;

@Service
public class CaseRelationshipService {
	@Autowired
	private CaseClaimRelationshipRepository caseClaimRelationshipRepository;
	@Autowired
	private CaseRepository caseRepository;
	@Autowired
	private ClaimRepository claimRepository;

	public CaseDetailsDto getCaseDetailsByCaseId(Long caseId) {
		CaseDetailsDto caseDetailsDto=new CaseDetailsDto();
		Case caseObj=caseRepository.findById(caseId).get();
		if(caseObj!=null) {
		caseDetailsDto.setCaseId(caseObj.getCaseId());
		}
		return caseDetailsDto;
	}

}

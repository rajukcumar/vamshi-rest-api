package com.example.demo.relationship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.relationship.dto.CaseDetailsDto;
import com.example.demo.relationship.model.Case;
import com.example.demo.relationship.model.CaseClaimRelationship;
import com.example.demo.relationship.model.Claim;
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
		CaseDetailsDto caseDetailsDto = new CaseDetailsDto();
		Case caseObj = caseRepository.findById(caseId).get();
		if (caseObj != null) {
			caseDetailsDto.setCaseId(caseObj.getCaseId());
		}
		List<CaseClaimRelationship> ccrRows = caseClaimRelationshipRepository.findByCaseId(caseId);
		if (ccrRows != null && !ccrRows.isEmpty()) {
			for (CaseClaimRelationship ccrRow : ccrRows) {
				Claim cliam = claimRepository.findById(ccrRow.getClaimObj().getClaimId()).get();
				if (cliam != null) {

				}
			}
		}
		return caseDetailsDto;
	}

}

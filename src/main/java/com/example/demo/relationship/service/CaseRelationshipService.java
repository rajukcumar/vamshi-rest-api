package com.example.demo.relationship.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.relationship.dto.CaseClaimRelationshipDetailsDto;
import com.example.demo.relationship.dto.CaseDetailsDto;
import com.example.demo.relationship.dto.ClaimDto;
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
		List<CaseClaimRelationshipDetailsDto> ccrDetailsDtoList = new ArrayList<CaseClaimRelationshipDetailsDto>();
		caseDetailsDto.setCaseClaimRelationshipDetailsDto(ccrDetailsDtoList);
		List<ClaimDto> claimDtoList = new ArrayList<ClaimDto>();
		caseDetailsDto.setClaimsDto(claimDtoList);
		Case caseObj = caseRepository.findById(caseId).get();
		if (caseObj != null) {
			caseDetailsDto.setCaseId(caseObj.getCaseId());
			caseDetailsDto.setCaseActiveDate(caseObj.getCaseActiveDate());
			List<CaseClaimRelationship> ccrRows = caseClaimRelationshipRepository.findByCaseObjCaseId(caseId);
			if (ccrRows != null && !ccrRows.isEmpty()) {
				for (CaseClaimRelationship ccrRow : ccrRows) {
					CaseClaimRelationshipDetailsDto caseClaimRelationshipDetailsDto=new CaseClaimRelationshipDetailsDto();
					caseClaimRelationshipDetailsDto.setCcrId(ccrRow.getCcrId());
					Claim cliam = claimRepository.findById(ccrRow.getClaimObj().getClaimId()).get();
					if (cliam != null) {
						ClaimDto claimDto=new ClaimDto();
						claimDto.setClaimId(cliam.getClaimId());
						claimDtoList.add(claimDto);
					}
					ccrDetailsDtoList.add(caseClaimRelationshipDetailsDto);
				}
			}
		}
		
		return caseDetailsDto;
	}

}

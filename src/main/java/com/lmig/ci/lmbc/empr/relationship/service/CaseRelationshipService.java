package com.lmig.ci.lmbc.empr.relationship.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmig.ci.lmbc.empr.relationship.dto.CaseClaimRelationshipDetailsDto;
import com.lmig.ci.lmbc.empr.relationship.dto.CaseDetailsDto;
import com.lmig.ci.lmbc.empr.relationship.dto.ClaimDto;
import com.lmig.ci.lmbc.empr.relationship.model.Case;
import com.lmig.ci.lmbc.empr.relationship.model.CaseClaimRelationship;
import com.lmig.ci.lmbc.empr.relationship.model.Claim;
import com.lmig.ci.lmbc.empr.relationship.repository.CaseClaimRelationshipRepository;
import com.lmig.ci.lmbc.empr.relationship.repository.CaseRepository;
import com.lmig.ci.lmbc.empr.relationship.repository.ClaimRepository;

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
		Optional<Case> obj = caseRepository.findById(caseId);
		if (obj.isPresent()) {
			Case caseObj = obj.get();
			caseDetailsDto.setCaseId(caseObj.getCaseId());
			caseDetailsDto.setCaseActiveDate(caseObj.getCaseActiveDate());
			List<CaseClaimRelationship> ccrRows = caseClaimRelationshipRepository.findByCaseObjCaseId(caseId);
			if (ccrRows != null && !ccrRows.isEmpty()) {
				for (CaseClaimRelationship ccrRow : ccrRows) {
					CaseClaimRelationshipDetailsDto caseClaimRelationshipDetailsDto = new CaseClaimRelationshipDetailsDto();
					caseClaimRelationshipDetailsDto.setCcrId(ccrRow.getCcrId());
					Optional<Claim> clmObj = claimRepository.findById(ccrRow.getClaimObj().getClaimId());
					if (clmObj.isPresent()) {
						Claim claim = clmObj.get();
						ClaimDto claimDto = new ClaimDto();
						claimDto.setClaimId(claim.getClaimId());
						claimDtoList.add(claimDto);
					}
					ccrDetailsDtoList.add(caseClaimRelationshipDetailsDto);
				}
			}
		}

		return caseDetailsDto;
	}

}

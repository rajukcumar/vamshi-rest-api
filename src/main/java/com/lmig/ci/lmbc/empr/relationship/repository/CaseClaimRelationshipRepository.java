package com.lmig.ci.lmbc.empr.relationship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmig.ci.lmbc.empr.relationship.model.CaseClaimRelationship;

public interface CaseClaimRelationshipRepository extends JpaRepository<CaseClaimRelationship, Long> {

	List<CaseClaimRelationship> findByCaseObjCaseId(Long caseId);
	List<CaseClaimRelationship> findByClaimObjClaimId(Long claimId);
}

package com.lmig.ci.lmbc.empr.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmig.ci.lmbc.empr.relationship.model.Case;

public interface CaseRepository extends JpaRepository<Case, Long> {

}

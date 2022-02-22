package com.example.demo.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.relationship.model.CaseClaimRelationship;

public interface CaseClaimRelationshipRepository extends JpaRepository<CaseClaimRelationship, Long> {

}

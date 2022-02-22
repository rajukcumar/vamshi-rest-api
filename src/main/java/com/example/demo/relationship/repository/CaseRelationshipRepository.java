package com.example.demo.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.relationship.model.Case;

public interface CaseRelationshipRepository extends JpaRepository<Case, Long> {

}

package com.example.demo.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.relationship.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

}

package com.example.demo.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.relationship.model.Case;
import com.example.demo.relationship.repository.CaseRelationshipRepository;

@RestController
@RequestMapping("api")
public class CaseRelationshipController {

@Autowired	
private CaseRelationshipRepository caseRepo;	

@RequestMapping("getCaseById")
public ResponseEntity<Case> getCaseById(@RequestParam(name="caseid", required=true) Long caseId) {
	return new ResponseEntity<>(caseRepo.findById(caseId).get(), HttpStatus.OK);
}
}
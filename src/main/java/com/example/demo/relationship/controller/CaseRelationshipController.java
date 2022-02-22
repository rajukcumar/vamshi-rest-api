package com.example.demo.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.relationship.dto.CaseDetailsDto;
import com.example.demo.relationship.service.CaseRelationshipService;

@RestController
@RequestMapping("api")
public class CaseRelationshipController {

@Autowired	
private CaseRelationshipService caseRelationshipService;	

@RequestMapping("getCaseById")
public ResponseEntity<CaseDetailsDto> getCaseById(@RequestParam(name="caseid", required=true) Long caseId) {
	return new ResponseEntity<>(caseRelationshipService.getCaseDetailsByCaseId(caseId), HttpStatus.OK);
}
}
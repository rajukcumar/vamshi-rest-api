package com.example.demo.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.relationship.dto.CaseDetailsDto;
import com.example.demo.relationship.service.CaseRelationshipService;

@RestController
@RequestMapping("current")
public class CurrentCaseRelationshipController {

@Autowired	
private CaseRelationshipService caseRelationshipService;	

@RequestMapping(value="getCurrentCaseRelationshipByCaseId", method=RequestMethod.GET)
public ResponseEntity<CaseDetailsDto> getCaseById(@RequestParam(name="caseId", required=true) Long caseId) {
	return new ResponseEntity<>(caseRelationshipService.getCaseDetailsByCaseId(caseId), HttpStatus.OK);
}
}
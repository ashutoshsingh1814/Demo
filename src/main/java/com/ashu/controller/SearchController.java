package com.ashu.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.entity.PatientEntity;
import com.ashu.repo.RsRepo;




@RestController
public class SearchController {
	
	@Autowired
	private RsRepo rsRepo;
	@GetMapping("/search/{mail}")
	ResponseEntity<String> getPatientById(@PathVariable String mail){
	
		 Optional<PatientEntity> user = rsRepo.findByMail(mail);
		if(user.isPresent()) {
			return new ResponseEntity<>("Patient Information Found"+user, HttpStatus.FOUND);
		}
		return new ResponseEntity<>("Patient Not Found"+user, HttpStatus.NOT_FOUND);
	}

}

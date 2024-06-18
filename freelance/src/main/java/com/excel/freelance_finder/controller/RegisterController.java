package com.excel.freelance_finder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.freelance_finder.dto.ClientDto;
import com.excel.freelance_finder.dto.FreelancerDto;
import com.excel.freelance_finder.listdto.JobApplicationList;
import com.excel.freelance_finder.listdto.JobPostingList;
import com.excel.freelance_finder.listdto.SkillList;
import com.excel.freelance_finder.responce.CommonResponce;
import com.excel.freelance_finder.service.FreelanceFinderService;

@RestController
public class RegisterController {

	@Autowired
	private FreelanceFinderService finderService;
	
	public ResponseEntity<CommonResponce<String>> postClientInfo(@RequestBody ClientDto dto){
		String clientEmail = finderService.insertClientInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponce.<String>builder()
				.data(clientEmail)
				.message("Client Record Inserted")
				.build());
	}

//-------------------------------------------------------------------------------------------------------	
	public ResponseEntity<CommonResponce<String>> postFreelancerInfo(@RequestBody FreelancerDto dto){
		String freelancerEmail = finderService.insertFreelancerInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponce.<String>builder()
				.data(freelancerEmail)
				.message("Client Record Inserted")
				.build());
	}
	
//------------------------------------------------------------------------------------------------------
	
	public ResponseEntity<CommonResponce<String>> postJobPosting(@RequestBody JobPostingList dto){
		String clientEmail = finderService.jobPosting(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponce.<String>builder()
				.data(clientEmail)
				.message("Client Record Inserted")
				.build());
	}
//-------------------------------------------------------------------------------------------------------	
	public ResponseEntity<CommonResponce<String>> postJobPosting(@RequestBody JobApplicationList dto){
		String freelancerEmail = finderService.jobApplication(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponce.<String>builder()
				.data(freelancerEmail)
				.message("Client Record Inserted")
				.build());
	}
//-------------------------------------------------------------------------------------------------------	
	
	public ResponseEntity<CommonResponce<String>> postSkills(@RequestBody SkillList dto){
		String freelancerEmail = finderService.insertSkills(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponce.<String>builder()
				.data(freelancerEmail)
				.message("Client Record Inserted")
				.build());
	}
//---------------------------------------------------------------------------------------------------------	
	
}











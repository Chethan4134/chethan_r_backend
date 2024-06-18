package com.excel.freelance_finder.util;

import java.util.List;
import java.util.stream.Collectors;

import com.excel.freelance_finder.dto.ClientDto;
import com.excel.freelance_finder.dto.FreelancerDto;
import com.excel.freelance_finder.dto.JobApplicationDto;
import com.excel.freelance_finder.dto.JobPostingDto;
import com.excel.freelance_finder.dto.SkillsDto;
import com.excel.freelance_finder.entity.ClientUser;
import com.excel.freelance_finder.entity.Freelancer;
import com.excel.freelance_finder.entity.JobApplication;
import com.excel.freelance_finder.entity.JobPosting;
import com.excel.freelance_finder.entity.Skills;

public class FreelancerUtils {

	public static ClientUser dtoToClientUser(ClientDto dto) {
		return ClientUser.builder()
				.firstName(dto.getFirstName())
				.lastName(dto.getLastName())
				.phone(dto.getPhone())
				.clientemail(dto.getClientemail())
				.gender(dto.getGender())
				.dateOfBirth(dto.getDateOfBirth())
				.password(dto.getPassword())
				.reEnterPassword(dto.getReEnterPassword())
				.build();
	}
	
	public static List<JobPosting> dtoToJobPosting(List<JobPostingDto> dto){
		return dto.stream().map(e -> JobPosting.builder()
				.titel(e.getTitel())
				.description(e.getDescription())
				.skillsRequired(e.getSkillsRequired())
				.budget(e.getBudget())
				.postingAt(e.getPostingAt())
				.build()).collect(Collectors.toList());
	}
	
	public static Freelancer dtoToFreelancer(FreelancerDto dto) {
		return Freelancer.builder()
				.firstName(dto.getFirstName())
				.lastName(dto.getLastName())
				.phone(dto.getPhone())
				.freelancerEmail(dto.getFreelancerEmail())
				.gender(dto.getGender())
				.dateOfBirth(dto.getDateOfBirth())
				.password(dto.getPassword())
				.reEnterPassword(dto.getReEnterPassword())
				.build();
	}
	
	public static List<JobApplication> dtoToJobApplication(List<JobApplicationDto> dto){
		return dto.stream().map(e -> JobApplication.builder()
				.applicationStatus(e.getApplicationStatus())
				.appliedAt(e.getAppliedAt())
				.build()).collect(Collectors.toList());
	}
	
	public static Skills dtoToSkills(SkillsDto dto) {
		return Skills.builder()
				.skillName(dto.getSkillName())
				.build();
	}
}

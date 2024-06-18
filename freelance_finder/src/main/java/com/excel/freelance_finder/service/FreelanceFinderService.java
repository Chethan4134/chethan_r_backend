package com.excel.freelance_finder.service;

import com.excel.freelance_finder.dto.ClientDto;
import com.excel.freelance_finder.dto.FreelancerDto;
import com.excel.freelance_finder.listdto.JobApplicationList;
import com.excel.freelance_finder.listdto.JobPostingList;
import com.excel.freelance_finder.listdto.SkillList;

public interface FreelanceFinderService {

	String insertClientInfo(ClientDto dto);

	String jobPosting(JobPostingList dto);

	String insertFreelancerInfo(FreelancerDto dto);

	String jobApplication(JobApplicationList dto);

	String insertSkills(SkillList dto);
}

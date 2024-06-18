package com.excel.freelance_finder.service.Implimentation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.excel.freelance_finder.Repository.ClientRepository;
import com.excel.freelance_finder.Repository.FreelancerRepository;
import com.excel.freelance_finder.Repository.SkillRepository;
import com.excel.freelance_finder.constant.FreelancerConstant;
import com.excel.freelance_finder.dto.ClientDto;
import com.excel.freelance_finder.dto.FreelancerDto;
import com.excel.freelance_finder.entity.ClientUser;
import com.excel.freelance_finder.entity.Freelancer;
import com.excel.freelance_finder.entity.JobApplication;
import com.excel.freelance_finder.entity.JobPosting;
import com.excel.freelance_finder.entity.Skills;
import com.excel.freelance_finder.exeption.FreelanceException;
import com.excel.freelance_finder.listdto.JobApplicationList;
import com.excel.freelance_finder.listdto.JobPostingList;
import com.excel.freelance_finder.listdto.SkillList;
import com.excel.freelance_finder.service.FreelanceFinderService;
import com.excel.freelance_finder.util.FreelancerUtils;

public class FreelanceFinderImplentation implements FreelanceFinderService {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private FreelancerRepository freelancerRepository;

	@Autowired
	private SkillRepository skillRepository;

//-------------------------------------------------------------------------------------------------------------	
	@Override
	public String insertClientInfo(ClientDto dto) {
		Optional<ClientUser> optional = clientRepository.findByClientEmail(dto.getClientemail());
		if (!optional.isPresent()) {
			ClientUser clientUser = FreelancerUtils.dtoToClientUser(dto);
			ClientUser user = clientRepository.save(clientUser);
			return user.getClientemail();
		}
		throw new FreelanceException(FreelancerConstant.ID_ALREADY_EXIST);
	}

//-------------------------------------------------------------------------------------------------------------

	@Override
	public String insertFreelancerInfo(FreelancerDto dto) {
		Optional<Freelancer> optional = freelancerRepository.findByFreelancerEmail(dto.getFreelancerEmail());
		if (!optional.isPresent()) {
			Freelancer freelancer = FreelancerUtils.dtoToFreelancer(dto);
			Freelancer freelancerUser = freelancerRepository.save(freelancer);
			return freelancerUser.getFreelancerEmail();
		}

		throw new FreelanceException(FreelancerConstant.ID_ALREADY_EXIST);
	}

//--------------------------------------------------------------------------------------------------------------
	@Override
	public String jobPosting(JobPostingList dto) {
		Optional<ClientUser> optional = clientRepository.findByClientEmail(dto.getClientemail());
		if (!optional.isPresent()) {
			ClientUser clientUser = optional.get();
			List<JobPosting> jobPosting = FreelancerUtils.dtoToJobPosting(dto.getJobPosting());

			jobPosting.stream().forEach(e -> e.setClientUser(clientUser));
			clientUser.setJobPosting(jobPosting);
			clientRepository.save(clientUser);
			return clientUser.getClientemail();
		}
		throw new FreelanceException(FreelancerConstant.ID_IS_NOT_EXIST);
	}

//---------------------------------------------------------------------------------------------------------------	

	@Override
	public String jobApplication(JobApplicationList dto) {
		Optional<Freelancer> optional = freelancerRepository.findByFreelancerEmail(dto.getFreelancerEmail());
		if (!optional.isPresent()) {
			Freelancer freelancerUser = optional.get();
			List<JobApplication> application = FreelancerUtils.dtoToJobApplication(dto.getJobApplication());

			application.stream().forEach(e -> e.setFreelancer(freelancerUser));
			freelancerUser.setJobAppliers(application);
			freelancerRepository.save(freelancerUser);
			return freelancerUser.getFreelancerEmail();
		}
		throw new FreelanceException(FreelancerConstant.ID_IS_NOT_EXIST);
	}
//-----------------------------------------------------------------------------------------------------------------

	@Override
	public String insertSkills(SkillList dto) {
		Optional<Freelancer> optional = freelancerRepository.findByFreelancerEmail(dto.getFreelancerEmail());
		if (!optional.isPresent()) {
			Freelancer freelancer = optional.get();
			List<Skills> skill = dto.getFreelancerSkills().stream().map(e -> {
				Optional<Skills> skillOptional = skillRepository.findBySkillName(e.getSkillName());
				return skillOptional.isPresent() ? skillOptional.get() : FreelancerUtils.dtoToSkills(e);
			}).collect(Collectors.toList());

			skill.stream().forEach(technicalSkill -> {
				if (!technicalSkill.getFreelancers().contains(freelancer)) {
					technicalSkill.getFreelancers().add(freelancer);
				}
			});
			freelancer.setSkills(skill);
			freelancerRepository.save(freelancer);
			return freelancer.getFreelancerEmail();

		}
		throw new FreelanceException(FreelancerConstant.ID_IS_NOT_EXIST);
	}
//-----------------------------------------------------------------------------------------------------------------

}

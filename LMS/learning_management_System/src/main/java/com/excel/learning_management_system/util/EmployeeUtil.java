package com.excel.learning_management_system.util;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.excel.learning_management_system.dto.EmployeeAddressInfoDto;
import com.excel.learning_management_system.dto.EmployeeBankInfoDto;
import com.excel.learning_management_system.dto.EmployeeContactInfoDto;
import com.excel.learning_management_system.dto.EmployeeEducationInfoDto;
import com.excel.learning_management_system.dto.EmployeeExperienceInfoDto;
import com.excel.learning_management_system.dto.EmployeePrimaryInfoDto;
import com.excel.learning_management_system.dto.EmployeeSecondaryInfoDto;
import com.excel.learning_management_system.dto.EmployeeTechnicalSkillDto;
import com.excel.learning_management_system.entity.EmployeeAddressInfo;
import com.excel.learning_management_system.entity.EmployeeBankInfo;
import com.excel.learning_management_system.entity.EmployeeContactInfo;
import com.excel.learning_management_system.entity.EmployeeEducationInfo;
import com.excel.learning_management_system.entity.EmployeeExperienceInfo;
import com.excel.learning_management_system.entity.EmployeePrimaryInfo;
import com.excel.learning_management_system.entity.EmployeeSecondaryInfo;
import com.excel.learning_management_system.entity.EmployeeTechnicalSkill;

public class EmployeeUtil {

	public static EmployeePrimaryInfo dtoToEntity(EmployeePrimaryInfoDto dto) {
		
		return EmployeePrimaryInfo.builder()
//				.id(dto.getId())
				.employeeId(dto.getEmployeeId())
				.employeeName(dto.getEmployeeName())
				.dateOfJoining(dto.getDateOfJoining())
				.dateOfBirth(dto.getDateOfBirth())
				.email(dto.getEmail())
				.bloodGroup(dto.getBloodGroup())
				.designation(dto.getDesignation())
				.gender(dto.getGender())
				.nationality(dto.getNationality())
				.employeeStatus(dto.getEmployeeStatus())
				.build();
	}
	
//	public static EmployeePrimaryInfoDto entityToDto(EmployeePrimaryInfo PrimaryInfo) {
//		return EmployeePrimaryInfoDto.builder()
//				.id(PrimaryInfo.getId())
//				.employeeId(PrimaryInfo.getEmployeeId())
//				.employeeName(PrimaryInfo.getEmployeeName())
//				.dateOfJoining(PrimaryInfo.getDateOfJoining())
//				.dateOfBirth(PrimaryInfo.getDateOfBirth())
//				.email(PrimaryInfo.getEmail())
//				.bloodGroup(PrimaryInfo.getBloodGroup())
//				.designation(PrimaryInfo.getDesignation())
//				.gender(PrimaryInfo.getGender())
//				.nationality(PrimaryInfo.getNationality())
//				.employeeStatus(PrimaryInfo.getEmployeeStatus())
//				.build();
//	}
//	
	
	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto secondaryInfo) {
		return EmployeeSecondaryInfo.builder()
				.panNo(secondaryInfo.getPanNo())
				.aadharNo(secondaryInfo.getAadharNo())
				.passportNo(secondaryInfo.getPassportNo())
				.fatherName(secondaryInfo.getFatherName())
				.motherName(secondaryInfo.getMotherName())
				.spouseName(secondaryInfo.getSpouseName())
				.maritalStatus(secondaryInfo.getMaritalStatus())
				.build();
	}
	
	
	public static EmployeeBankInfo dtoToBankEntity(EmployeeBankInfoDto bankInfoDto) {
		return EmployeeBankInfo.builder()
				.bankId(bankInfoDto.getBankId())
				.accountNo(bankInfoDto.getAccountNo())
				.bankName(bankInfoDto.getBankName())
				.accountType(bankInfoDto.getAccountType())
				.ifscCode(bankInfoDto.getIfscCode())
				.branch(bankInfoDto.getIfscCode())
				.state(bankInfoDto.getState())
				.build();
	}

	public static List<EmployeeEducationInfo> dtoToEducationEntity(List<EmployeeEducationInfoDto> dto){
		return dto.stream()
					.map(e -> EmployeeEducationInfo.builder()
							.educationType(e.getEducationType())
							.yearOfPassing(e.getYearOfPassing())
							.percentage(e.getPercentage())
							.univercityName(e.getUnivercityName())
							.instituteName(e.getInstituteName())
							.specialization(e.getSpecialization())
							.state(e.getState())
							.build())
					.collect(Collectors.toList());
		
	}
	
	public static List<EmployeeAddressInfo> dtoToAddressEntity(List<EmployeeAddressInfoDto> dto){
		return dto.stream()
					.map(e -> EmployeeAddressInfo.builder()
							.addressType(e.getAddressType())
							.doorNo(e.getDoorNo())
							.street(e.getStreet())
							.locality(e.getLocality())
							.city(e.getCity())
							.state(e.getState())
							.pinCode(e.getPinCode())
							.landMark(e.getLandMark())
							.build())
					.collect(Collectors.toList());
		
	}
	
	public static List<EmployeeContactInfo> dtoToContactEntity(List<EmployeeContactInfoDto> dto){
		return dto.stream()
					.map(e -> EmployeeContactInfo.builder()
							.contactType(e.getContactType())
							.contactNumber(e.getContactNumber())
							.build())
					.collect(Collectors.toList());
		
	}
	
	
	public static EmployeeTechnicalSkill dtoToSkills(EmployeeTechnicalSkillDto dto) {
		return EmployeeTechnicalSkill.builder()
				.skillType(dto.getSkillType())
				.skillRating(dto.getSkillRating())
				.yearOfExperience(dto.getYearOfExperience())
				.employee(new ArrayList<>())
				.build();
	}
	
	public static List<EmployeeExperienceInfo> dtoToExperienceEntity(List<EmployeeExperienceInfoDto> dto) {
	return dto.stream().map(exp -> EmployeeExperienceInfo.builder()
				.companyName(exp.getCompanyName())
				.yearOfExperience(exp.getYearOfExperience())
				.dateOfJoining(exp.getDateOfJoining())
				.dateOfRelieving(exp.getDateOfRelieving())
				.designation(exp.getDesignation())
				.location(exp.getLocation())
				.build()).collect(Collectors.toList());
	}
	
	
}

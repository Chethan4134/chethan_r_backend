package com.excel.learning_management_system.service;

import com.excel.learning_management_system.dto.EmployeeBankInfoDto;
import com.excel.learning_management_system.dto.EmployeePrimaryInfoDto;
import com.excel.learning_management_system.dto.EmployeeSecondaryInfoDto;
import com.excel.learning_management_system.listdto.EmployeeAddressList;
import com.excel.learning_management_system.listdto.EmployeeContactList;
import com.excel.learning_management_system.listdto.EmployeeEducationListDto;
import com.excel.learning_management_system.listdto.EmployeeExperienceList;
import com.excel.learning_management_system.listdto.EmployeeTechnicalSkillList;

public interface EmployeeInfoService {
	
	public Integer  savePrimaryInfo( EmployeePrimaryInfoDto dto);

	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto);

	public String addEducationDetails(EmployeeEducationListDto dto);

	public String saveBankInfo(EmployeeBankInfoDto dto);

	public String insertTechnicalSkill(EmployeeTechnicalSkillList dto);
	
	public String addAddressDetails(EmployeeAddressList dto);

	public String addContactDetails(EmployeeContactList dto);

	public String addExpirenceDetails(EmployeeExperienceList dto);

	
	
}

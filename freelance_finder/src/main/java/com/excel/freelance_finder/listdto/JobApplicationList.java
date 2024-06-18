package com.excel.freelance_finder.listdto;

import java.util.List;

import com.excel.freelance_finder.dto.JobApplicationDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobApplicationList {

	private String freelancerEmail;
	private List<JobApplicationDto> jobApplication;
}

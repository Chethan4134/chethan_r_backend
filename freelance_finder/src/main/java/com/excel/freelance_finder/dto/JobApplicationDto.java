package com.excel.freelance_finder.dto;

import java.time.LocalDate;

import com.excel.freelance_finder.enums.Status;

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
public class JobApplicationDto {

	private Status applicationStatus;
	private LocalDate appliedAt;
}

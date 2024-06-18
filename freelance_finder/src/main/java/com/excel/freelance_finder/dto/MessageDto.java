package com.excel.freelance_finder.dto;

import java.time.LocalDate;


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

public class MessageDto {

	private String freelancerEmail;
	private String clientEmail;
	private String content;
	private LocalDate sentAt;
}

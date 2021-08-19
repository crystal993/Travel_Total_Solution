package com.work.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/** 
 * 회원 도메인 클래스 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
	private String memberId;
	private String memberPw;
	private String name;
	private String email;
	private String gender;
	private String mobile;
	private int birth;
	private String entryDate;
	private String grade;
}

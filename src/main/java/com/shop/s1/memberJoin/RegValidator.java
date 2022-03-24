package com.shop.s1.memberJoin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class RegValidator implements Validator {

	
	private static final String emailRegex=
			 "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
			 "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	//패턴은 일반적인 이메일 정규식 사용
	private Pattern pattern;
	
	public RegValidator() {
		pattern=Pattern.compile(emailRegex);
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return MemberJoinDTO.class.isAssignableFrom(clazz);
		//안되면 MemberJoinDTO.class.equals(clazz); 이렇게 써보기
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("RegValidator#validate():"+this);
		MemberJoinDTO memberJoinDTO =(MemberJoinDTO)target;
		if(memberJoinDTO.getM_email()==null||memberJoinDTO.getM_email().trim().isEmpty()) {
			errors.rejectValue("m_email", "required");
		}else {
			Matcher matcher=pattern.matcher(memberJoinDTO.getM_email());
			if(!matcher.matches()) {
				errors.rejectValue("m_email", "bad");
			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "m_name", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "m_address", "required");
		ValidationUtils.rejectIfEmpty(errors, "m_pw", "required");
		ValidationUtils.rejectIfEmpty(errors, "m_confirmPW", "required");
		if(!memberJoinDTO.getM_pw().isEmpty()) {
			if(!memberJoinDTO.CheckM_confirmPW()) {
				errors.rejectValue("m_confirmPW", "nomatch");
			}
		}
		
		
	}

}

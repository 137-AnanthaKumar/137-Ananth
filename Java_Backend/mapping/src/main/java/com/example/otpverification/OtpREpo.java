package com.example.otpverification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpREpo extends JpaRepository<OtpEntity, Long> {

	OtpEntity findByPhoneNo(String phoneNo);

	


	

}

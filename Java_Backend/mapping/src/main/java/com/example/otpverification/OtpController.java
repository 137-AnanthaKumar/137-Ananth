package com.example.otpverification;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.twilio.SmsSender;

@RestController
@RequestMapping("/otp")
public class OtpController {
	@Autowired
	private SmsSender smssend;

	@Autowired
	private OtpREpo repo;
	OtpClass otprr=new OtpClass();
	
 @PostMapping("/getotp")
 public ResponseEntity<String> sentOtp( @RequestBody OtpEntity otpentity) {
	 
	 
		    repo.save(otpentity);
			String phoneNo= otpentity.getPhoneNo();
			int h = new Random().nextInt(900000) + 100000;
			String messege="Your One Time PassWord is"+" "+h;
			otprr.setDefaultOtp(h);
			smssend.sendSms(phoneNo, messege);
			
			return ResponseEntity.ok("Successfully Send Otp..!"+h);
			
			
	 }
	
	
	
   
	 
 
 
 @PutMapping("/verifyotp/{phoneNo}")
 public  ResponseEntity<String>  VerifyOtp(@PathVariable String phoneNo,@RequestBody OtpClass otp ){
	
		 

		 if( otprr.getDefaultOtp() !=0 && otp.getOtp()==otprr.getDefaultOtp()) {
//			 System.out.println(otprr.getDefaultOtp());
			 OtpEntity otpentity=new OtpEntity();	
			 otpentity=repo.findByPhoneNo(phoneNo);
			 System.out.println(otpentity.getPhoneNo());
			 otpentity.setStatus("verified");
			
			 repo.save(otpentity);
				smssend.sendSms(phoneNo, "otpVerifiCation success...");

			 System.out.println("Completed");
			 
			 
			 return ResponseEntity.ok("Otp Verified SusssesFully..!");
			 }
		 else if(otprr.getNoOfAttemt()==0 && otp.getOtp()!=otprr.getDefaultOtp() ) {
			 otprr.setNoOfAttemt(1);
			 System.out.println(otp.getOtp());
//			 System.out.println(c);

				smssend.sendSms(phoneNo, "You entered Wrong otp You have 2 left");

			 return ResponseEntity.ok("Wrong Otp .Enter Again.2 left!");

           
		 }
		 else if(otprr.getNoOfAttemt()==1 && otp.getOtp()!=otprr.getDefaultOtp() ) {
			 otprr.setNoOfAttemt(2);
			 System.out.println(otp.getOtp());
//			 System.out.println(i);

				smssend.sendSms(phoneNo, "You entered Wrong otp You have 1left");

			 return ResponseEntity.ok("Wrong Otp .Enter Again.1 left!");

           
		 }
		 else if( otprr.getNoOfAttemt()==2&& otp.getOtp()!=otprr.getDefaultOtp() ) {
			
			 System.out.println(otp.getOtp());
			 
//			 System.out.println(i);
			 otprr.setDefaultOtp(0);
				smssend.sendSms(phoneNo, "You Entered Wrong Otp Again and again Plese Try Again..");

			 return ResponseEntity.ok("You Entered Wrong Otp Again and again Plese Try Again..!");
           
		 }

		
		 else {
			 return ResponseEntity.ok("SomeThing Wrong Try Again.!");

		 }
		
	
 }


}

package com.example.otpverification;

public class OtpClass {
   private int otp;
   private int defaultOtp;
   private int noOfAttemt=0;

public int getNoOfAttemt() {
	return noOfAttemt;
}

public void setNoOfAttemt(int noOfAttemt) {
	this.noOfAttemt = noOfAttemt;
}

public int getDefaultOtp() {
	return defaultOtp;
}

public void setDefaultOtp(int defaultOtp) {
	this.defaultOtp = defaultOtp;
}

public int getOtp() {
	return otp;
}

public void setOtp(int otp) {
	this.otp = otp;
}
}

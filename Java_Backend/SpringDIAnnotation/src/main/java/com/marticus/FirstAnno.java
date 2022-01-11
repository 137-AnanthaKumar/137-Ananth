package com.marticus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("FirstAnno")
@Scope("prototype")
public class FirstAnno {
	
	@Autowired
	@Qualifier("akila")
	private Second second;

	public Second getSecond() {
		return second;
	}

	public void setSecond(Second second) {
		this.second = second;
	}
	@Autowired
	@Qualifier("akila")
	public void Test()
	{
		
		System.out.println("Hello World Spring DI with Annotation");
		
		
	}
	
	
}
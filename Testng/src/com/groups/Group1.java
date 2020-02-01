package com.groups;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups="rt")
	public void main(){
	System.out.println("ravi");
		
	}
	@Test(groups={"rt","st"})
	public void main1(){
	System.out.println("ramesh");
	}
	@Test(groups="st")
	public void main2(){
	System.out.println("krishna");

	}
}

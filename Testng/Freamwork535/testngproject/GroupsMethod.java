package com.testngproject;

import org.testng.annotations.Test;

public class GroupsMethod {
	@Test(timeOut=15)
	 public  void welcome(){
		 System.out.println("welcome");	 
	 }
@Test(dependsOnGroups={"group1.*"})
	 public  void message(){
		 System.out.println("message"); 
	 }
@Test(groups={"group3"})
	 public  void send(){
		 System.out.println("send");
	 }
	 }
package com.groups;

	import org.testng.annotations.Test;
	public class Groups {
		
		@Test(groups="rt")
		public void main(){
		System.out.println("siva");
			
		}
		@Test(groups="rt")
		public void main1(){
		System.out.println("prasanth");
		}
		@Test(groups="st")
		public void main2(){
		System.out.println("trinadh");

		}
		

	}




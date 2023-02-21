package com.comit.course_02_flow_control;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<10; i++)
		{
			if(i==5)
			{
				continue;  // it will skip the 5
			}
			System.out.println(i);
			
		}
	}

}

package com.ils.junit1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MencobaJUnitRunner {
	 public static void main(String[] args) {
	        Result result = JUnitCore.runClasses(MencobaJUnit.class);
	        for (Failure failure : result.getFailures()) {
	          System.out.println(failure.toString());
	        }
	        if (result.wasSuccessful()){
	            System.out.println("Membandingkan hasil telah sesuai...");
	        }
	    } 
}

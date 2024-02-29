package appium1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Actions extends Parameters {

	public void addTwoNumbers(String num1 , String num2) {
	
				String[] index1,index2;
				index1=num1.split("");  
				index2=num2.split(""); 
			  
			   	for(int i=0; i<index1.length;i++) {
		            if (index1[i].matches("[0-9]")){
				driver.findElement(By.id("com.google.android.calculator:id/digit_"+index1[i])).click();
			   	}
		            else if(index1[i].matches(".")) {
		        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
			
		            }
		            else {
		            	System.out.print("you send invalid input");
		            }
		            }
				driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
				
			   	for(int i=0; i<index2.length;i++) {
		            if (index2[i].matches("[0-9]")){
				driver.findElement(By.id("com.google.android.calculator:id/digit_"+index2[i])).click();
			   	}
		            else if(index2[i].matches(".")) {
		        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
			
		            } else {
		            	System.out.print("you send invalid input");
		            }}
					driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
}
	public void subtractionTwoNumbers(String num1 , String num2) {
		
		String[] index1,index2;
		index1=num1.split("");  
		index2=num2.split(""); 
	  
	   	for(int i=0; i<index1.length;i++) {
            if (index1[i].matches("[0-9]")){
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+index1[i])).click();
	   	}
            else if(index1[i].matches(".")) {
        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
	
            }
            else {
            	System.out.print("you send invalid input");
            }}
		driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
		
	   	for(int i=0; i<index2.length;i++) {
            if (index2[i].matches("[0-9]")){
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+index2[i])).click();
	   	}
            else if(index2[i].matches(".")) {
        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
	
            } else {
            	System.out.print("you send invalid input");
            }
            }
				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
}

	public void multiplicationTwoNumbers(String num1 , String num2) {
		String[] index1,index2;
		index1=num1.split("");  
		index2=num2.split(""); 
	  
		for(int i=0; i<index1.length;i++) {
            if (index1[i].matches("[0-9]")){
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+index1[i])).click();
	   	}
            else if(index1[i].matches(".")) {
        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
	
            }
            else {
            	System.out.print("you send invalid input");
            }
            }
		
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		
		for(int i=0; i<index2.length;i++) {
            if (index2[i].matches("[0-9]")){
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+index2[i])).click();
	   	}
            else if(index2[i].matches(".")) {
        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
	
            }
            else {
            	System.out.print("you send invalid input");
            }
            }
		
				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
}
	public void sqrtAnyNumber(String num) {
		driver.findElement(By.id("com.google.android.calculator:id/op_sqrt")).click();
		String[] index = index=num.split("");  

	   	for(int i=0; i<index.length;i++) {
            if (index[i].matches("[0-9]")){
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+index[i])).click();
	   	}
            else if(index[i].matches(".")) {
        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
	
            } else {
            	System.out.print("you send invalid input");
            }
            }
	   	
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}
	public void	 powerTwoNumbers(String num1 , String num2) {
		String[] index1,index2;
		index1=num1.split("");  
		index2=num2.split(""); 
	  
	 	for(int i=0; i<index1.length;i++) {
	 	     if (index1[i].matches("[0-9]")){
	 			driver.findElement(By.id("com.google.android.calculator:id/digit_"+index1[i])).click();
	 		   	}
	 	            else if(index1[i].matches(".")) {
	 	        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
	 		
	 	            } else {
	 	            	System.out.print("you send invalid input");
	 	            }
	 	     }
		driver.findElement(By.id("com.google.android.calculator:id/op_pow")).click();
		
		for(int i=0; i<index2.length;i++) {
            if (index2[i].matches("[0-9]")){
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+index2[i])).click();
	   	}
            else if(index2[i].matches(".")) {
        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
	
            } else {
            	System.out.print("you send invalid input");
            }
            }
				driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
}
	public void factorialAnyNumber(String num) {
		String[] index = null;
		index=num.split("");  
	   	for(int i=0; i<index.length;i++) {
            if (index[i].matches("[0-9]")){
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+index[i])).click();
	   	}
            else if(index[i].matches(".")) {
        		driver.findElement(By.id("com.google.android.calculator:id/dec_point")).click();
	
            } else {
            	System.out.print("you send invalid input");
            }
            }
		driver.findElement(By.id("com.google.android.calculator:id/op_fact")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}

	public void takeScreenshot() {
		
		Date currentDate = new Date();
		String actualDate = currentDate.toString().replace(":", "_");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		
		File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationpath = System.getProperty("user.dir") + File.separator + "screenshots" + 
		File.separator +  actualDate + ".png";
		
        
        File finalDestination = new File(destinationpath);
        
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}

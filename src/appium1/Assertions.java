package appium1;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Assertions extends Parameters {
	public void checkResultIsCorrect(Double actualResult) {

		Double expectedResult =Double.parseDouble(driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText());
				
          Assert.assertEquals(expectedResult,actualResult);
}
}

package com.typeracer;

import java.util.Arrays;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomatePage {

	public static void main(String[] args) throws InterruptedException {
		MainPage mp=new MainPage();
		
		mp.signIn.click();
		mp.userName.sendKeys("brkovl");
		mp.password.sendKeys("abcdef");
		
		mp.joinRace.click();
		Thread.sleep(1000);
		String text=mp.text.getText();
		System.out.println(text);
		String[] textArray=text.split(" ");
		
		System.out.println(Arrays.toString(textArray));
		
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(mp.textType));
		
		for (int i = 0; i < textArray.length; i++) {
			Thread.sleep(400);
			mp.textType.sendKeys(textArray[i]+Keys.SPACE);
		}
		
		
		
		

	}

}

package com.cricket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saiki\\Documents\\WebTablesSel\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.firstpost.com/firstcricket/points-table/series/ipl-2021.html");

		List<WebElement> Datas = driver.findElements(By.tagName("th"));

		for (int i = 0; i < Datas.size(); i++) {

			System.out.print(Datas.get(i).getText()+"\t");

			List<WebElement> Content = driver.findElements(By.tagName("td"));

			for (int j = 0; j < Content.size(); j++) {

			System.out.print(Content.get(j).getText()+"\t");
			
			List<WebElement> TRtag = driver.findElements(By.tagName("tr"));

			for (int k = 0; i < TRtag.size(); k++) {

			System.out.print(TRtag.get(i).getText()+"\t ");

			}
			
			System.out.println();

		}

	}

	}
	}

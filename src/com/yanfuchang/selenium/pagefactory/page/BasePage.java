package com.yanfuchang.selenium.pagefactory.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	private final int TIMEOUT = 3;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
//		PageFactory.initElements(new DefaultElementLocatorFactory(driver), this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}
	
	public BasePage(WebDriver driver,final String title) {
		this.driver = driver;
		
		new WebDriverWait(driver, TIMEOUT).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver arg0) {
				String acTitle = arg0.getTitle();
				return acTitle.equals(title);
			}
		});
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}
}

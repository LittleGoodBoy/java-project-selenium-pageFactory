package com.yanfuchang.selenium.pagefactory.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BaiduPage extends BasePage{
	
	@FindBy(id = "kw")
	@CacheLookup
	private WebElement searchBar;  // 搜索框
	
	@FindBy(id = "su")
	@CacheLookup
	private WebElement searchButton;  // 搜索按钮
	
	public BaiduPage(WebDriver driver) {
		super(driver);
	}
	
	public BaiduPage(WebDriver driver,String title) {
		super(driver,title);
	}
	
	/**
	 * 	页面相关操作
	 */
	// 清空搜索框
	public void clearSearch() {
		searchBar.click();//先将光标定位到该元素上
		searchBar.clear();
	}
	// 向输入框输入指定内容
	public void sendKeys(String text) {
		searchBar.sendKeys(text);
	}
	// 点击搜索按钮
	public void clickSearch() {
		searchButton.click();
	}
}

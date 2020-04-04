package com.yanfuchang.selenium.pagefactory.business;

import org.openqa.selenium.WebDriver;

import com.yanfuchang.selenium.pagefactory.page.BaiduPage;

/**
 *	业务逻辑
 */
public class BaiduBusiness {
	
	public static void searchForCondition(WebDriver driver,String condition) {
		BaiduPage page = new BaiduPage(driver);
		//1、点击搜索框,目的：将光标聚焦到搜索框
		page.clearSearch();
		//2、输入查询内容到搜索框
		page.sendKeys(condition);
		//3、点击查询按钮
		page.clickSearch();
	}

}

package com.yanfuchang.selenium.pagefactory.page;

import org.openqa.selenium.WebDriver;
/**
 *	当某个页面的事件执行完成之后,发生页面跳转,此时可以返回该类,实例化并验证跳转之后的title
 */
public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage(WebDriver driver,String title) {
		super(driver,title);
	}
}

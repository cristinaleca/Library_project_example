package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookSearchPage_Zebo extends BasePage{
   BookSearchPage bookSearchPage = new BookSearchPage();
    public BookSearchPage_Zebo(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

@FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement booksModule;

@FindBy(xpath = "//input[@class='form-control input-sm input-small input-inline']")
    public WebElement searchBox;

 @FindBy(xpath="//td[@class='dataTables_empty']")
 public WebElement result;






}

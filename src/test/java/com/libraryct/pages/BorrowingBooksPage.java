package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BorrowingBooksPage   {

    public BorrowingBooksPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//span[.='Borrowing Books']")
    public WebElement BorrowingBooks;

    @FindBy(css="#borrowed_list")
    public WebElement BorrowedTable;

    @FindBy(css="#borrowed_list>thead>tr>th")
    public List<WebElement> BorrowedHeaders;

    @FindBy(css="##borrowed_list>tbody>tr>")
    List<WebElement> BorrowedRows;




}

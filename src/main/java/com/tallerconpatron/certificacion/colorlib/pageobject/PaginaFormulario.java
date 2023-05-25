package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/form-validation.html")
public class PaginaFormulario extends PageObject {

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")
     public WebElementFacade tittle;

    @FindBy(xpath = "//*[@id=\"req\"]" )
    public WebElementFacade required;

    @FindBy(xpath = "//*[@id=\"sport\"]")
    public WebElementFacade option1;

    @FindBy(xpath = "//*[@id=\"sport2\"]")
    public WebElementFacade option2;

    @FindBy(xpath = "//*[@id=\"url1\"]")
    public  WebElementFacade url;

    @FindBy(xpath = "//*[@id=\"email1\"]")
    public  WebElementFacade email;

    @FindBy(xpath = "//*[@id=\"pass1\"]")
    public WebElementFacade password1;

    @FindBy(xpath = "//*[@id=\"pass2\"]")
    public WebElementFacade confirmPassword1;

    @FindBy(xpath = "//*[@id=\"minsize1\"]")
    public WebElementFacade minSize;

    @FindBy(xpath = "//*[@id=\"maxsize1\"]")
    public WebElementFacade maxSize;

    @FindBy(xpath = "//*[@id=\"number2\"]")
    public WebElementFacade number;

    @FindBy(xpath = "//*[@id=\"ip\"]")
    public WebElementFacade ip;

    @FindBy(xpath = "//*[@id=\"date3\"]")
    public WebElementFacade date;

    @FindBy(xpath = "//*[@id=\"past\"]")
    public WebElementFacade date2;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[14]/input")
    public WebElementFacade buttonSubmit;

}

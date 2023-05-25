package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/index.html")
public class PaginaPrincipal extends PageObject {

    @FindBy(id="bootstrap-admin-template")
    public WebElementFacade title;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]")
    public WebElementFacade formulario1;

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]")
    public WebElementFacade formulario;

}

package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaFormulario;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaLogin;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaPrincipal;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;


public class TaskAction extends BasePage {

    private PaginaLogin paginaLogin;
    private PaginaPrincipal paginaPrincipal;

    private PaginaFormulario paginaFormulario;

    @Step
    public void openPage(){
        openApp();
    }

    @Step
    public void sigIn(String strUser, String strPassword){
        sendKeyUser(strUser);
        sendKeyPassword(strPassword);
        paginaLogin.btnSingIn.waitUntilClickable().click();
    }

    public void sendKeyUser(String strUser){
        paginaLogin.user.click();
        paginaLogin.user.clear();
        paginaLogin.user.sendKeys(strUser);

    }

    public void sendKeyPassword(String strPassword){
        paginaLogin.password.click();
        paginaLogin.password.clear();
        paginaLogin.password.sendKeys(strPassword);
    }

    public void selectFormulario(){
        paginaPrincipal.formulario1.click();
        paginaPrincipal.formulario.click();
    }

    public void verifyFormulario(){
        assertEquals(paginaFormulario.tittle.getText(),"Popup Validation");
    }



    public void fillFields(String required, String option1, String option2,String url, String email, String password1,String confirmPassword1, String minSize, String maxSize, String number, String ip, String date, String date2){
        paginaFormulario.required.click();
        paginaFormulario.required.clear();
        paginaFormulario.required.sendKeys(required);

        paginaFormulario.option1.selectByValue(option1);

        paginaFormulario.option2.selectByValue(option2);


        paginaFormulario.url.click();
        paginaFormulario.url.clear();
        paginaFormulario.url.sendKeys(url);

        paginaFormulario.email.click();
        paginaFormulario.email.clear();
        paginaFormulario.email.sendKeys(email);

        paginaFormulario.password1.click();
        paginaFormulario.password1.clear();
        paginaFormulario.password1.sendKeys(password1);

        paginaFormulario.confirmPassword1.click();
        paginaFormulario.confirmPassword1.clear();
        paginaFormulario.confirmPassword1.sendKeys(confirmPassword1);

        paginaFormulario.minSize.click();
        paginaFormulario.minSize.clear();
        paginaFormulario.minSize.sendKeys(minSize);

        paginaFormulario.maxSize.click();
        paginaFormulario.maxSize.clear();
        paginaFormulario.maxSize.sendKeys(maxSize);

        paginaFormulario.number.click();
        paginaFormulario.number.clear();
        paginaFormulario.number.sendKeys(number);

        paginaFormulario.ip.click();
        paginaFormulario.ip.clear();
        paginaFormulario.ip.sendKeys(ip);

        paginaFormulario.date.click();
        paginaFormulario.date.clear();
        paginaFormulario.date.sendKeys(date);

        paginaFormulario.date2.click();
        paginaFormulario.date2.clear();
        paginaFormulario.date2.sendKeys(date2);

    }

    public void submitInfo(){
        paginaFormulario.buttonSubmit.waitUntilClickable().click();
    }

    public void requiredWillBeEmpty(){
        assertEquals(paginaFormulario.required.getText(),null);
    }
}

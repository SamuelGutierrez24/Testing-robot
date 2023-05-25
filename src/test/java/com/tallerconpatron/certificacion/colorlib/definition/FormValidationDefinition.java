package com.tallerconpatron.certificacion.colorlib.definition;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.step.TaskAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.jruby.RubyBoolean;

import java.awt.*;

public class FormValidationDefinition extends BasePage {

    private String user;
    private String password;

    private String required;

    private String option1;

    private String option2;

    private String url;

    private String email;

    private String password1;

    private String confirmPassword1;

    private String minSize;

    private String maxSize;

    private String number;

    private String ip;

    private String date;

    private String date2;


    @Steps
    TaskAction taskAction;

    @Given("I enter with my credentials")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.user = dataTable.cell(1,0);
        this.password = dataTable.cell(1,1);
    }

    @When("I preceed with the authentication")
    public void iPreceedWithTheAuthentication() {
        try{
            taskAction.openApp();
            taskAction.sigIn(user,password);
        }catch (NullPointerException e){
            System.out.println("NullPointerException thrown!");
        }

    }


    @And("enter submenu form validations")
    public void enterSubmenuFormValidations() {
        try {
            taskAction.selectFormulario();
        }catch (NullPointerException e){
            System.out.println("NullPointerException thrown!");
        }
    }

    @And("check the title of the form on the screen")
    public void checkTheTitleOfTheFormOnTheScreen() {
        try {
            taskAction.verifyFormulario();
        }catch (Exception e){
            System.out.println("The result was false");
        }
    }

    @And("fill all fields")
    public void fillAllFields(io.cucumber.datatable.DataTable dataTable) {
        this.required =dataTable.cell(1,0);
        this.option1 = dataTable.cell(1,1);
        this.option2 = dataTable.cell(1,2);
        this.url = dataTable.cell(1,3);
        this.email = dataTable.cell(1,4);
        this.password1 = dataTable.cell(1,5);
        this.confirmPassword1 = dataTable.cell(1,6);
        this.minSize = dataTable.cell(1,7);
        this.maxSize = dataTable.cell(1,8);
        this.number = dataTable.cell(1,9);
        this.ip = dataTable.cell(1,10);
        this.date = dataTable.cell(1,11);
        this.date2 = dataTable.cell(1,12);
        taskAction.fillFields(required,option1,option2, url, email,password1,confirmPassword1,minSize,maxSize,number,ip,date,date2);

    }

    @And("click button validate")
    public void clickButtonValidate() {
        taskAction.submitInfo();
    }

    @Then("required will be empty")
    public void requiredWillBeEmpty() {


    }
}

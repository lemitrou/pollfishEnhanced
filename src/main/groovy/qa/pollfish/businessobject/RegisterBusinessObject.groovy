package qa.pollfish.businessobject

import org.testng.Assert
import qa.pollfish.dtos.ResearcherUser
import qa.pollfish.enums.user.FindUs
import qa.pollfish.enums.user.LikeTo
import qa.pollfish.pageobject.RegisterPageObject

class RegisterBusinessObject {

    RegisterPageObject registerPageObject = new RegisterPageObject()


    RegisterPageObject getSingleActionsOnPage(){
        return registerPageObject
    }


    /**
     * Actions
     *
     */


    void registerNewUser(ResearcherUser researcherUser){
        getSingleActionsOnPage().inputEmail(researcherUser.email)
        getSingleActionsOnPage().pressRegisterButton()

        getSingleActionsOnPage().inputPassword(researcherUser.password)
        getSingleActionsOnPage().pressNextButton()

        getSingleActionsOnPage().inputName(researcherUser.name)
        getSingleActionsOnPage().pressNextButton()

        getSingleActionsOnPage().inputCompanyName(researcherUser.companyName)
        getSingleActionsOnPage().pressNextButton()

        getSingleActionsOnPage().selectWouldLikeTo(LikeTo.GET_PAID_SURVEY)
        getSingleActionsOnPage().pressNextButton()

        getSingleActionsOnPage().pressOkGotItButton()

        getSingleActionsOnPage().selectFindUs(FindUs.GOOGLE)
        getSingleActionsOnPage().pressNextButton()

        !researcherUser.receiveUpdates ?: getSingleActionsOnPage().pressCheckboxReceiveUpdates()

        getSingleActionsOnPage().pressIAccept()
    }

    /**
     * Verifications
     */

    void verifyEmailValidation(){
        //Assert.assertTrue(driver.findElement(RegisterPageObject.Locator.EMAIL_VALIDATION.get()).isDisplayed())
    }

    void verifyPasswordValidation(){
        //Assert.assertTrue(driver.findElement(RegisterPageObject.Locator.PASSWORD_VALIDATION.get()).isDisplayed())
    }
}

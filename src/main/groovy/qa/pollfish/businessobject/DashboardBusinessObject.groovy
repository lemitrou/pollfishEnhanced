package qa.pollfish.businessobject

import qa.pollfish.dtos.ResearcherUser
import qa.pollfish.pageobject.DashboardPageObject
import qa.pollfish.pageobject.RegisterPageObject

class DashboardBusinessObject {

    DashboardPageObject dashboardPageObject = new DashboardBusinessObject()


    DashboardPageObject getSingleActionsOnPage(){
        return dashboardPageObject
    }

    /**
     * Verification methods
     */

    void verifyUserEmail(ResearcherUser user){
        // Assert.assertEquals (driver.findElement(DashboardPageObject.Locators.USER_EMAIL_SPAN.get()).getTex(), user.email)
    }
}

package qa.pollfish

import org.testng.Assert
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test
import qa.pollfish.businessobject.DashboardBusinessObject
import qa.pollfish.businessobject.RegisterBusinessObject
import qa.pollfish.dataloaders.LoadUserData
import qa.pollfish.dtos.ResearcherUser
import qa.pollfish.navigation.Navigate

class RegisterUserValidation {

    Navigate navigate = new Navigate()

    RegisterBusinessObject registerBusinessObject = new RegisterBusinessObject()

    DashboardBusinessObject dashboardBusinessObject = new DashboardBusinessObject()

    ResearcherUser user

    @BeforeClass
    void precodition(){
        user = LoadUserData.loadResearcherUser()

        navigate.toSignUpPage()

        registerBusinessObject.registerNewUser(user)
    }

    @Test
    void verifyAfterRegistrationNavigateToDashboard(){
        dashboardBusinessObject.verifyUserEmail(user)
    }

}

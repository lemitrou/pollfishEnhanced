package qa.pollfish.dataloaders

import qa.pollfish.dtos.ResearcherUser
import qa.pollfish.enums.user.FindUs
import qa.pollfish.enums.user.LikeTo
import qa.pollfish.utils.Utils

class LoadUserData {

    static ResearcherUser loadResearcherUser(String myemail = "test${Utils.generateId()}@mailinator.com", String mypassword = 'a11111111!', String myname = 'John Doe', String mycompanyName = 'PollfishTest', LikeTo mylikeTo = LikeTo.GET_PAID_SURVEY, FindUs myfindUs = FindUs.FRIEND, boolean myreceiveUpdates = true){
        ResearcherUser user = new ResearcherUser()
        user.with {
            email = myemail
            password = mypassword
            name = myname
            companyName = mycompanyName
            likeTo = mylikeTo
            findUs = myfindUs
            receiveUpdates = myreceiveUpdates
        }

        return user
    }

}

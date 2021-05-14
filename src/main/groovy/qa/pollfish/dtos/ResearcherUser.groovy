package qa.pollfish.dtos

import qa.pollfish.enums.user.FindUs
import qa.pollfish.enums.user.LikeTo

class ResearcherUser {
    String email
    String password
    String name
    String companyName
    LikeTo likeTo
    FindUs findUs
    boolean receiveUpdates
}

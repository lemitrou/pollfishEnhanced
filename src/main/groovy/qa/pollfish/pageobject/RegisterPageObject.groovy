package qa.pollfish.pageobject

import qa.pollfish.enums.user.FindUs
import qa.pollfish.enums.user.LikeTo

class RegisterPageObject {

    enum Locator {
        INPUT_COMPANY_EMAIL('css=label:contains(Company Email) input'),
        INPUT_PASSWORD('css=label:contains(Company Email) input'),
        INPUT_USER_NAME('//xpath/test/locator'),
        INPUT_COMPANY_NAME('css=test_locator'),
        SELECT_I_WOULD_LIKE_TO('//xpath/test/locator'),
        SELECT_FIND_US('css=test_locator'),
        BUTTON_REGISTER('//xpath/test/locator'),
        BUTTON_NEXT('css=test_locator'),
        BUTTON_OK_GOT_IT('//xpath/test/locator'),
        BUTTON_ACCEPT('css=test_locator'),
        CHECKBOX_RECEIVE_UPDATES('//xpath/test/locator'),
        EMAIL_VALIDATION('css=div:contains(Please enter a valid email address)'),
        PASSWORD_VALIDATION('css=div:contains(Your password must be at least 4 characters long)')

        String locator

        Locator(String loc){
            this.locator = loc
        }

        String get(){
            return locator
        }
    }

    void inputEmail(String email){

    }

    void inputPassword(String password){

    }

    void inputName(String name){

    }

    void inputCompanyName(String companyName){

    }

    void selectWouldLikeTo(LikeTo likeTo){

    }

    void selectFindUs(FindUs findUs){

    }

    void pressRegisterButton(){

    }

    void pressNextButton(){

    }

    void pressOkGotItButton(){

    }

    void pressCheckboxReceiveUpdates(){

    }

    void pressIAccept(){

    }
}

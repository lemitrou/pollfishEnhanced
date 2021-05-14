package qa.pollfish.pageobject

class DashboardPageObject {

    enum Locators {
        USER_EMAIL_SPAN("css=.pf-header__user-email")

        String locator

        Locators (String loc){
            locator = loc
        }

        String get(){
            return locator
        }
    }
}

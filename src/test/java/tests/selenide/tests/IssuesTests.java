package tests.selenide.tests;

import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.selenide.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class IssuesTests extends TestBase {
    private static final String
            repositoryName = "eroshenkoam/allure-qaguru",
            issueText = "Заменяем степы на Listener";

    @Test
    void checkIssueName(){
        open("/", MainPage.class)
                .search(repositoryName)
                .clickOnLinkWithText(repositoryName)
                .gotoIssues()
                .shouldHaveIssue(issueText);
    }
}

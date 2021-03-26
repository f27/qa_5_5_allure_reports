package tests.annotations.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.annotations.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

@DisplayName("Issue tests with annotations")
public class IssuesTests extends TestBase {
    private static final String
            repositoryName = "eroshenkoam/allure-qaguru",
            issueText = "Заменяем степы на Listener";

    @Test
    @DisplayName("Checking issue name")
    void checkIssueName(){
        open("/", MainPage.class)
                .search(repositoryName)
                .clickOnLinkWithText(repositoryName)
                .gotoIssues()
                .shouldHaveIssue(issueText);
    }
}

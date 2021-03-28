package tests.annotations.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.annotations.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

@DisplayName("Issue tests with annotations")
public class IssuesTests extends TestBase {
    private static final String
            repositoryName = "f27/qa_5_5_allure_reports",
            issueText = "This is test issue",
            issueComment = "New issue for test";

    @Test
    @DisplayName("Checking issue name")
    void checkIssueName(){
        open("/", MainPage.class)
                .search(repositoryName)
                .clickOnLinkWithText(repositoryName)
                .gotoIssues()
                .clickOnIssue(issueText)
                .shouldHaveComment(issueComment);
    }
}

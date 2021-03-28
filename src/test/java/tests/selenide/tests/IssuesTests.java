package tests.selenide.tests;

import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.selenide.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class IssuesTests extends TestBase {
    private static final String
            repositoryName = "f27/qa_5_5_allure_reports",
            issueText = "This is test issue",
            issueComment = "New issue for test";

    @Test
    void checkIssueName(){
        open("/", MainPage.class)
                .search(repositoryName)
                .clickOnLinkWithText(repositoryName)
                .gotoIssues()
                .clickOnIssue(issueText)
                .shouldHaveComment(issueComment);
    }
}

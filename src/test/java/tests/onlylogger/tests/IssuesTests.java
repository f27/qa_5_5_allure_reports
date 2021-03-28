package tests.onlylogger.tests;

import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.onlylogger.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.*;

public class IssuesTests extends TestBase {

    @Test
    void checkIssueTest(){
        open("/", MainPage.class)
                .search(repositoryName)
                .clickOnLinkWithText(repositoryName)
                .gotoIssues()
                .clickOnIssue(issueText)
                .shouldHaveComment(issueComment);
    }
}

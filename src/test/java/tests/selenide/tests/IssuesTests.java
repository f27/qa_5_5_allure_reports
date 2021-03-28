package tests.selenide.tests;

import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.selenide.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.*;

public class IssuesTests extends TestBase {

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

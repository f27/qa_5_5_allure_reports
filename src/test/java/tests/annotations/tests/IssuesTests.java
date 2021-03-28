package tests.annotations.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.annotations.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.*;

public class IssuesTests extends TestBase {

    @Test
    @DisplayName("Checking issue's name and comment")
    void checkIssueTest(){
        open("/", MainPage.class)
                .search(repositoryName)
                .clickOnLinkWithText(repositoryName)
                .gotoIssues()
                .clickOnIssue(issueText)
                .shouldHaveComment(issueComment);
    }
}

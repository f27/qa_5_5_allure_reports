package tests.selenide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class IssuesPage {
    private static final SelenideElement issuesDiv = $("div[aria-label=Issues]");

    public IssuePage clickOnIssue(String issueText) {
        issuesDiv.$(byLinkText(issueText)).click();

        return page(IssuePage.class);
    }
}

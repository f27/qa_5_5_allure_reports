package tests.selenide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IssuesPage {
    private static final SelenideElement issuesDiv = $("div[aria-label=Issues]");

    public IssuesPage shouldHaveIssue(String issueText) {
        issuesDiv.shouldHave(text(issueText));

        return this;
    }
}

package tests.annotations.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

@DisplayName("Issues page")
public class IssuesPage {
    private static final SelenideElement issuesDiv = $("div[aria-label=Issues]");

    @Step("Issue '{issueText}' should exist")
    public IssuesPage shouldHaveIssue(String issueText) {
        issuesDiv.shouldHave(text(issueText));

        return this;
    }
}

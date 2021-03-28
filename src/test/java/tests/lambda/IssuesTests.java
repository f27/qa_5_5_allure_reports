package tests.lambda;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;
import static tests.TestData.*;

@DisplayName("Issue tests with lambda")
public class IssuesTests extends TestBase {

    @Test
    @DisplayName("Checking issue name")
    @Owner("f27")
    @Feature("Issues")
    @Severity(CRITICAL)
    @Epic("GitHub web")
    @Description("Search for repository, going to repository's page, going to issues tab and verify that the issue exist")
    void checkIssueName() {

        step("Open main page", () -> open("/"));

        step("Searching '" + repositoryName + "'", (step) -> {
            step.parameter("Repository name", repositoryName);
            $(byName("q")).setValue(repositoryName).submit();
        });

        step("Click on link with text '" + repositoryName + "'", (step) -> {
            step.parameter("Link text", repositoryName);
            $(".codesearch-results").$(byLinkText(repositoryName)).click();
        });

        step("Going to issues tab", () -> $("[data-content=Issues]").click());

        step("Click on issue '" + issueText + "'", (step) -> {
            step.parameter("Issue name", issueText);
            $("div[aria-label=Issues]").$(byLinkText(issueText)).click();
        });

        step("Click on issue '" + issueComment + "'", (step) -> {
            step.parameter("Issue comment", issueComment);
            $(".js-comment-body").shouldHave(text(issueComment));
        });
    }
}

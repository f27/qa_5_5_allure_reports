package tests.annotations.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

@DisplayName("Repository page")
public class RepositoryPage {
    private static final SelenideElement issuesTab = $("[data-content=Issues]");

    @Step("Going to issues tab")
    public IssuesPage gotoIssues() {
        issuesTab.click();

        return page(IssuesPage.class);
    }
}

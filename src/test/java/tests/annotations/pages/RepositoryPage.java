package tests.annotations.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RepositoryPage {
    private static final SelenideElement issuesTab = $("[data-content=Issues]");

    @Step("Go to issues tab")
    public IssuesPage gotoIssues() {
        issuesTab.click();

        return page(IssuesPage.class);
    }
}

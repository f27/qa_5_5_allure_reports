package tests.selenide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RepositoryPage {
    private static final SelenideElement issuesTab = $("[data-content=Issues]");

    public IssuesPage gotoIssues() {
        issuesTab.click();

        return page(IssuesPage.class);
    }
}

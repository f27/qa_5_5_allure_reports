package tests.annotations.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultsPage {
    private static final SelenideElement results = $(".codesearch-results");

    @Step("Click on link with text {linktext}")
    public RepositoryPage clickOnLinkWithText(String linktext) {
        results.$(byLinkText(linktext)).click();

        return page(RepositoryPage.class);
    }
}

package tests.onlylogger.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultsPage {
    private static final SelenideElement results = $(".codesearch-results");

    public RepositoryPage clickOnLinkWithText(String linkText) {
        results.$(byLinkText(linkText)).click();

        return page(RepositoryPage.class);
    }
}

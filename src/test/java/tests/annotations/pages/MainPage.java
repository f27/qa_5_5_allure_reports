package tests.annotations.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    private static final SelenideElement searchInput = $(byName("q"));

    @Step("Search for {searchText}")
    public SearchResultsPage search(String searchText) {
        searchInput.setValue(searchText).submit();

        return page(SearchResultsPage.class);
    }
}

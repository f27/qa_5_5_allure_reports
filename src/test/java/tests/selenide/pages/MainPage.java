package tests.selenide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    private static final SelenideElement searchInput = $(byName("q"));

    public SearchResultsPage search(String searchText) {
        searchInput.setValue(searchText).submit();

        return page(SearchResultsPage.class);
    }
}

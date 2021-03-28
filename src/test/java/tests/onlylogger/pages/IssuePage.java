package tests.onlylogger.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IssuePage {
    private static final SelenideElement issueComment = $(".js-comment-body");

    public IssuePage shouldHaveComment(String issueText) {
        issueComment.shouldHave(text(issueText));

        return this;
    }
}

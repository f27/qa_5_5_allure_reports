package tests.annotations.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IssuePage {
    private static final SelenideElement issueComment = $(".js-comment-body");

    @Step("Issue should have comment: {comment}")
    public IssuePage shouldHaveComment(String comment) {
        issueComment.shouldHave(text(comment));

        return this;
    }
}

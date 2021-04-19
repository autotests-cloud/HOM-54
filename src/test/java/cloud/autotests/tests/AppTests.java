package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("QA telegramm ecosystem looks like Stackoverflow online")
    void test() {

        step("step 1", () -> {
            // todo
        });

        step("step 2", () -> {
            // todo
        });

    }
}
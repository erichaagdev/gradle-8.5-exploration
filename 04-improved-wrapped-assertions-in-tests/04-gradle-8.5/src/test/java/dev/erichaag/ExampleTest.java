package dev.erichaag;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class ExampleTest {

    @Test
    public void wrappedAssertion() {
        try {
            Assertions.assertEquals("Expected text", "Actual text", "Assertion message");
        } catch (AssertionFailedError ex) {
            // Wrap the actual cause in another AssertionError
            throw new AssertionError("Additional message", ex);
            // Or alternatively in any exception, like RuntimeException
            // throw new RuntimeException(“Additional message”, ex);
        }
    }

}

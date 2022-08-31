import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestResultLoggerExtension implements TestWatcher {
    private static Logger logger = LoggerFactory.getLogger(TestResultLoggerExtension.class);

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        logger.error("Test failed for {} !!!", context.getDisplayName());
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        logger.info("Test completed successfully!");
    }
}
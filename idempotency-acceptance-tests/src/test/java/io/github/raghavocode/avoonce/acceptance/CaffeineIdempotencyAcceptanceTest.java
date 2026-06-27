package io.github.raghavocode.avoonce.acceptance;

import io.github.raghavocode.avoonce.acceptance.dummy.DummyApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DummyApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CaffeineIdempotencyAcceptanceTest extends BaseIdempotencyAcceptanceTest {
    // Tests are inherited from BaseIdempotencyAcceptanceTest
    // The default autoconfiguration will pick up Caffeine since it is on the classpath.
}

package programmerzamannow.belajarspringlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {

    @Test
    void testLog() {
        log.info("Belajar Java");
        log.info("Belajar Spring");
        log.info("Belajar Programmer Zaman now");
    }
}

package programmerzamannow.belajarspringlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class LoggingTest {

    @Test
    void testLog() {
        log.info("Belajar Java");
        log.info("Belajar Spring");
        log.info("Belajar Programmer Zaman now");
    }
}

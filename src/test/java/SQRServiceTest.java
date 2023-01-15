import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Numbers.csv")
    void calculateSQR(int expected, int minNumber, int maxNumber) {
        int actual = sqrService.calculateSQR(minNumber, maxNumber);
        assertEquals(expected, actual);
    }
}
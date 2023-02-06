import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    public void test() {
        List<String> words = List.of("zebra", "calice", "borboleta");

        Main main = new Main();

       List<String> orderedWords = main.order(words);

       Assertions.assertEquals(words, orderedWords);
    }
}

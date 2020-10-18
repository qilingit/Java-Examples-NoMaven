package java8.ImplementStream;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StreamTest {
    @Test
    public void testSteam() {
        List<Integer> actual =
                Stream.of("appel", "banana", "cnApple", "englandApple", "italyApple", "japanApple")
                .filter(s -> s.contains("n"))
                .limit(2)
                .map(String::length)
                .toList();
        assertThat(actual, is(Arrays.asList(6, 7)));
    }
}

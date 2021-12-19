package ru.mirea.task30.opt1;

import org.junit.Assert;
import org.junit.Test;
import ru.mirea.task24.opt1.Output;

import java.util.ArrayList;
import java.util.Arrays;

public class JUnitTest {
    @Test
    public void validate() {
        ArrayList<String> testData = new ArrayList<>(Arrays.asList("127.0.0.1", "abc.def.gha.bcd"));
        ArrayList<Boolean> expected = new ArrayList<>(Arrays.asList(true, false));
        ArrayList<Boolean> actual = new ArrayList<>();

        Output validator = new Output();
        boolean temp;
        for (String value : testData) {
            temp = validator.check_ipv4(value);
            actual.add(temp);
        }

        Assert.assertEquals(expected, actual);
    }
}

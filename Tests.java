package Exercise1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class Tests {

    @Test
    public void ShouldCalculateNumberOfRows()
    {
        //Arrange
        List<String> rows = new ArrayList<>();
        rows.add("Row1");
        rows.add("Row2");
        rows.add("Row3");

        //Act
        TextAndLineCounter textLineCounter = new  TextAndLineCounter();
        int actualResult = textLineCounter.CountRows(rows);

        int expected = 3;

        assertEquals(expected, actualResult);
    }

    @Test
    public void ShouldCountCharsInText()
    {
        //Arrange
        String inputText = "My text that i have written";

        //Act
        TextAndLineCounter textLineCounter = new TextAndLineCounter();
        int actualResult = textLineCounter.CountChars(inputText);

        //Assert
        int expected = 27;
        assertEquals(expected, actualResult);

    }

    @Test
    public void ShouldStopCountTextWhenStopAppears()
    {
        //Arrange
        String inputText = "some text, stop, some more text";

        //Act
        TextAndLineCounter textLineCounter = new TextAndLineCounter();
        int actualResult = textLineCounter.CountChars(inputText);

        //Assert
        int expected = 11;
        assertEquals(expected, actualResult);

    }

}

package Exercise1;
import java.util.List;

public class TextAndLineCounter {

    public int CountChars(String inputText) {

        int result;

        if(inputText.contains("stop"))
        {
            int stopStart = inputText.indexOf("stop");

            String textBeforeStop = inputText.substring(0,stopStart);

            return textBeforeStop.length();
        }

        result = inputText.length();

        return result;
    }

    public int CountRows(List<String> lines) {
        return lines.size();
    }
}

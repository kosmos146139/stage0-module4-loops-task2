package school.mjc.stage0.loops.task2;

import java.nio.charset.Charset;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phrase = new StringBuilder();
        for (char c : chars) {
            phrase.append(c);
        }
        System.out.print(phrase.toString());
    }
}

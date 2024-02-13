package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int zero = 0;
        int i = 0;
        while (i <= Math.abs(multiplyByAndToInclusive))
        {
            if (multiplyByAndToInclusive == 0) {break;}
            System.out.println(zero);
            zero += multiplyByAndToInclusive;
            i++;

        }
    }
}

package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int zero = 2;
        while (zero <= printToInclusive)
        {
            int i = 1;
            int isPrimary = 0;
            while (i <= printToInclusive)
            {
                if (zero % i == 0) {isPrimary++;}
                i++;
            }
            if(isPrimary == 2){System.out.println(zero);}
            zero++;
        }
    }
}

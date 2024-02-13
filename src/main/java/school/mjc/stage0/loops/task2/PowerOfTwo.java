package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int zero = 0;
        while (zero <= power){
            if (power < 0) {System.out.println("too much power");}
            System.out.println((int)Math.pow(2,zero));
            zero++;
        }
    }
}

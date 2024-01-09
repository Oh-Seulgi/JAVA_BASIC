package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] vlalues = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(vlalues));
        System.out.println("average=" + average(vlalues));
        System.out.println("min=" + min(vlalues));
        System.out.println("max=" + max(vlalues));
    }
}

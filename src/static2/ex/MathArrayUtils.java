package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        // private 인스턴스 생성을 막는다.
    }
    
    public static int sum(int[] vlalues) {
        int total = 0;
        for (int vlalue : vlalues) {
            total += vlalue;
        }
        return total;
    }

    public static double average(int[] vlalues) {
        return (double) sum(vlalues) / vlalues.length;
    }

    public static int min(int[] vlalues) {
        int minValue = vlalues[0];
        for (int value : vlalues) {
            if(value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] vlalues) {
        int maxValue = vlalues[0];
        for (int value : vlalues) {
            if(value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

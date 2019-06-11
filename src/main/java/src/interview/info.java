package src.interview;

import java.util.function.IntFunction;

/**
 * Created by morven on 2018/7/16.
 */
public class info {

    public static void main(String[] args) {
        // System.out.println(getMiddle("sss", "s3s"));
        //System.out.println(min(new String[]{"ccc", "bbb"}));

        String[] ss = minmax(String[]::new, "a", "b");
        System.out.println("args = [" + ss[0] + "]");
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static <T extends Comparable> T min(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T smaillest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (smaillest.compareTo(a[i]) > 0) {
                smaillest = a[i];
            }
        }
        return smaillest;
    }

//    public static <T extends Comparable> T[] minmax(T... a) {
//        Object[] mm = new Object[2];
//        return (T[]) mm;
//    }

    public static <T extends Comparable> T[] minmax(IntFunction<T[]> constr, T... a) {
        Object[] mm = constr.apply(2);
        mm[0] = a[0];
        return (T[]) mm;
    }
}

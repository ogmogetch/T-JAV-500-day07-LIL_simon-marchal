public class Duet {
    public static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("For integers:");
        Integer int1 = 5;
        Integer int2 = 10;
        System.out.println("Min: " + min(int1, int2));
        System.out.println("Max: " + max(int1, int2));

        System.out.println("\nFor strings:");
        String str1 = "apple";
        String str2 = "banana";
        System.out.println("Min: " + min(str1, str2));
        System.out.println("Max: " + max(str1, str2));
    }
}

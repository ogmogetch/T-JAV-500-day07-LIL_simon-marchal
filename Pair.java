public class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void display() {
        System.out.println("first: " + first + ", second: " + second);
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(10, "Hello");
        System.out.println("Pair 1 - First: " + pair1.getFirst() + ", Second: " + pair1.getSecond());
        pair1.display();

        Pair<java.lang.Character, Double> pair2 = new Pair<>('A', 3.14); // This line causes the issue
        System.out.println("Pair 2 - First: " + pair2.getFirst() + ", Second: " + pair2.getSecond());
        pair2.display();
    }
}

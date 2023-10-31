public class Solo<T> {
    private T value;

    public Solo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Solo<String> strSolo = new Solo<>("toto");
        String strValue = strSolo.getValue();
        System.out.println("String value: " + strValue);
        strSolo.setValue("tata");
        System.out.println("Updated string value: " + strSolo.getValue());

        Solo<Integer> intSolo = new Solo<>(Integer.valueOf(42));
        Integer intValue = intSolo.getValue();
        System.out.println("Integer value: " + intValue);
        intSolo.setValue(Integer.valueOf(1337));
        System.out.println("Updated integer value: " + intSolo.getValue());
    }
}

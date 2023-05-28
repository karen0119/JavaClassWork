package class26;

public class Entry {
   private  String key;
    private Double value;

    // constructor to initialize the fields
    public Entry(String key, Double value) {
        this.key = key;
        this.value = value;
    }

    // get method to get keys
    public String getKey() {
        return key;
    }

    // get method to get value
    public Double getValue() {
        return value;
    }

    @Override // toString method to print letters correctly
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}

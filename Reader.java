public class Reader {
    private String name;
    private String readerId;

    public Reader(String name, String readerId) {
        this.name = name;
        this.readerId = readerId;
    }

    public String getName() {
        return name;
    }

    public String getReaderId() {
        return readerId;
    }

    @Override
    public String toString() {
        return "Reader: " + name + " (ID: " + readerId + ")";
    }
}

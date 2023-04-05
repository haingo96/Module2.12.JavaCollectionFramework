package practice2;

public class Students {
    private String name;
    private int id;
    private String classes;

    public Students() {
    }

    public Students(String name, int id, String classes) {
        this.name = name;
        this.id = id;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

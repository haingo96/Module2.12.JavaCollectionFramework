package practice3;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private String classes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student() {
    }

    public Student(String name, int id, String classes) {
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
    @Override
    public int compareTo(Student o) {
        return this.classes.compareTo(o.classes);
    }
}

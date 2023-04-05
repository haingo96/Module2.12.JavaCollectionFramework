package exercise1;

public class Product {
    private String name;
    private int id;
    private String category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product() {
    }

    public Product(String name, int id, String category) {
        this.name = name;
        this.id = id;
        this.category = category;
    }
}

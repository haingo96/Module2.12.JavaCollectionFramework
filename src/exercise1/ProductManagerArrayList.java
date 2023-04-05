package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManagerArrayList {
    private List<Product> productArrayList = new ArrayList<>();

    public void add(Product p) {
        productArrayList.add(p);
    }

    public void add(int i, Product p) {
        productArrayList.add(i, p);
    }

    public Product remove() {
        Product temp = productArrayList.get(productArrayList.size() - 1);
        productArrayList.remove(productArrayList.size() - 1);
        return temp;
    }

    public Product remove(int i) {
        Product temp = productArrayList.get(i);
        productArrayList.remove(i);
        return temp;
    }

    public void edit(Product p, String newName, int newID, String newCategory) {
        p.setName(newName);
        p.setId(newID);
        p.setCategory(newCategory);
    }

    public void display() {
        System.out.println(productArrayList);
    }

    public Product findName(String searchName) {
        Product temp = null;

        for (var p : productArrayList) {
            if (p.getName().contains(searchName)) {
                temp = p;
            }
        }
        return temp;
    }

    public void sortByName() {
        Collections.sort(productArrayList, (a, b) -> a.getName().compareTo(b.getName()));
    }

    public void sortById() {
        Collections.sort(productArrayList, (a, b) -> a.getId() - b.getId());
    }

    public void sortByCategory() {
        Collections.sort(productArrayList, (a, b) -> a.getCategory().compareTo(b.getCategory()));
    }

    @Override
    public String toString() {
        return "ProductManagerArrayList{" +
                "productArrayList=" + productArrayList +
                '}';
    }
}

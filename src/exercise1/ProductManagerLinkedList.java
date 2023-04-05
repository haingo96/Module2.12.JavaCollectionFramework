package exercise1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManagerLinkedList {
    private List<Product> productLinkedList = new LinkedList<>();

    public void add(Product p) {
        productLinkedList.add(p);
    }

    public void add(int i, Product p) {
        productLinkedList.add(i, p);
    }

    public Product remove() {
        Product temp = productLinkedList.get(productLinkedList.size() - 1);
        productLinkedList.remove(productLinkedList.size() - 1);
        return temp;
    }

    public Product remove(int i) {
        Product temp = productLinkedList.get(i);
        productLinkedList.remove(i);
        return temp;
    }

    public void edit(Product p, String newName, int newID, String newCategory) {
        p.setName(newName);
        p.setId(newID);
        p.setCategory(newCategory);
    }

    public void display() {
        System.out.println(this.toString());
    }

    public Product findName(String searchName) {
        Product temp = null;

        for (var p : productLinkedList) {
            if (p.getName().toLowerCase().contains(searchName.toLowerCase())) {
                temp = p;
            }
        }
        return temp;
    }

    public void sortByName() {
        Collections.sort(productLinkedList, (a, b) -> a.getName().compareTo(b.getName()));
    }

    public void sortById() {
        Collections.sort(productLinkedList, (a, b) -> a.getId() - b.getId());
    }

    public void sortByCategory() {
        Collections.sort(productLinkedList, (a, b) -> a.getCategory().compareTo(b.getCategory()));
    }

    @Override
    public String toString() {
        String result = " ";
        for (var p : productLinkedList) {
            result += p.getName() + " ";
        }
        return "ProductManagerLinkedList{" +
                "productLinkedList=" + result +
                '}';
    }
}

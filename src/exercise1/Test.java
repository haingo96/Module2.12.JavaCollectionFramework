package exercise1;

public class Test {
    public static void main(String[] args) {
        Product pd1 = new Product("Book", 112, "Education");
        Product pd2 = new Product("Meat", 200, "Food");
        Product pd3 = new Product("Television", 1002, "Household");

        ProductManagerLinkedList productManager = new ProductManagerLinkedList();

        productManager.add(pd1);
        productManager.add(pd2);
        productManager.add(pd3);

        productManager.add(2, new Product("PC", 300, "Tech"));

//        productManager.remove(1);

        productManager.sortByName();
        productManager.sortByCategory();
        productManager.sortById();
        productManager.display();

        System.out.println(productManager.findName("book").getName());
    }
}

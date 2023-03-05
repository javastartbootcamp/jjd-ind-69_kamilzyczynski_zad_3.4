package pl.javastart.task;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    void showInfo() {
        System.out.println("Nazwa produktu: " + name);
        System.out.printf("Cena produktu: %.2fzł%n", price);
        System.out.println("Opis produktu: " + description);
        System.out.println("Kategoria produktu: " + category.name);
        System.out.println("Opis kategorii: " + category.description);
    }
}

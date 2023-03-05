package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Chemia", "Artykuły chemiczne");
        Product product1 = new Product("Żel Palmolive", 12.99, "Żel pod prysznic", category1);
        Product product2 = new Product("Mydło Nivea", 10.99, "Mydło w kostce", category1);

        Category category2 = new Category("Spożywcze", "Artykuły spożywcze");
        Product product3 = new Product("Coca-cola", 6.99, "Napój gazowany 2L", category2);

        Product product4 = new Product("Telewizor", 2666.99, "Telewizor LG 42 cale", null);

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();

        System.out.println("Nazwa produktu: " + product4.name);
        System.out.printf("Cena produktu: %.2fzł%n", product4.price);
        System.out.println("Opis produktu: " + product4.description);

        SpecialOffer specialOffer = new SpecialOffer(product2, "Obniżka o 20%, ważna przez 2 dni", 2,
                0.2);
        System.out.printf("%.2fzł", product2.price);

    }
}

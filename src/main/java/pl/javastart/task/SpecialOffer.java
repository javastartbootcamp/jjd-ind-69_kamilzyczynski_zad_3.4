package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String offerDescription;
    int time;
    double discount;

    public SpecialOffer(Product product, String offerDescription, int time, double discount) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.time = time;
        this.discount = discount;

        product.price = (1 - discount) * product.price;
    }
}

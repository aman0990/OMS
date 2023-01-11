package omsModel;

import javax.persistence.*;

@Entity
@Table()
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String Categories;
    private String Product;
    private double Price;
    private int Quantity;

    public OrderModel ( ) {
    }

    public OrderModel (Long id, String categories, String product, double price, int quantity) {
        this.id = id;
        Categories = categories;
        Product = product;
        Price = price;
        Quantity = quantity;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getCategories ( ) {
        return Categories;
    }

    public void setCategories (String categories) {
        Categories = categories;
    }

    public String getProduct ( ) {
        return Product;
    }

    public void setProduct (String product) {
        Product = product;
    }

    public double getPrice ( ) {
        return Price;
    }

    public void setPrice (double price) {
        Price = price;
    }

    public int getQuantity ( ) {
        return Quantity;
    }

    public void setQuantity (int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString ( ) {
        return "OrderModel{" +
                "id=" + id +
                ", Categories='" + Categories + '\'' +
                ", Product='" + Product + '\'' +
                ", Price=" + Price +
                ", Quantity=" + Quantity +
                '}';
    }
}

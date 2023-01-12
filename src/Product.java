import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private int quantity;



    public Product (String name, int price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Продукт - " + getName()+ ", цена - " + getPrice() + ", количество - " + getQuantity() + ".";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}

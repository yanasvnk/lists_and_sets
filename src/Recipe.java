import java.util.Objects;

public class Recipe {
    private String name;
    private ProductList productList;
    private int totalCoast;

    public Recipe(String name, ProductList productList, int totalCoast) {
        setName(name);
        setProductList(productList);
        setTotalCoast(totalCoast);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public int getTotalCoast() {
        return totalCoast;
    }

    public void setTotalCoast(int totalCoast) {
        this.totalCoast = totalCoast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

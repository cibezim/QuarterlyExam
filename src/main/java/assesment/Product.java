package assesment;

public abstract class Product {
    protected String getProductName;
    private String name;

    public Product(String name) {
     this.name = name;
    }

    public String getName() {
        return name;
    }
}

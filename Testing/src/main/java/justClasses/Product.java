package justClasses;

public class Product {

    private Integer id;
    private String productName;
    private Integer weight;

    public Product(Integer id, String productName, Integer weight) {
        this.id = id;
        this.productName = productName;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

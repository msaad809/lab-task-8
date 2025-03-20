public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("Electronics")) {
            return new Electronics();
        } else if (type.equalsIgnoreCase("Clothing")) {
            return new Clothing();
        } else if (type.equalsIgnoreCase("Books")) {
            return new Books();
        } else {
            throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}

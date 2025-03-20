import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product type (Electronics, Clothing, Books): ");
        String productType = scanner.nextLine();
        
        try {
            Product product = ProductFactory.createProduct(productType);
            product.display();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}

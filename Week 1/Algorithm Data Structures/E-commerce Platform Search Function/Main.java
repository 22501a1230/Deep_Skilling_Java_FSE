public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Personal Care"),
            new Product(103, "Smartphone", "Electronics"),
            new Product(104, "Book", "Education"),
            new Product(105, "Mouse", "Electronics")
        };

        String target = "Smartphone";

        // Linear Search Test
        Product foundLinear = SearchEngine.linearSearch(products, target);
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not Found"));

        // Binary Search requires sorting first
        SearchEngine.sortByName(products);

        Product foundBinary = SearchEngine.binarySearch(products, target);
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}

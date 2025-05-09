import java.util.ArrayList;
import java.util.HashMap;

class Model{
    private String[] products = {"Apple","Orange", "Banana", "Milk", "Coffee"};
    private int[] prices = {10,20,15,30,50};
    private HashMap<String,Integer> productMap = new HashMap<>();
    private ArrayList<String> cart = new ArrayList<>();
    private int productNumber = 0;
    private String visibleProduct = getVisibleProduct(productNumber);

    public void initializeHashMap(){
        for (int i = 0; i < 5; i++){
            productMap.put(products[i], prices[i]);
        }
    }

    public String getFirstProduct(){
        return getVisibleProduct(0);
    }

    public void addToCart(){
        cart.add(visibleProduct);
    }

    public int getNumProductsInCart(){
        return cart.size();
    }

    public String getVisibleProduct(int n){
        return products[n];
    }

    public String getNextProduct(){
        if (productNumber != products.length -1){
            productNumber++;
        }

        visibleProduct = getVisibleProduct(productNumber);
        return visibleProduct;
    }

    public String getPreviousProduct(){
        if (productNumber != 0){
            productNumber--;
        }
        
        visibleProduct = getVisibleProduct(productNumber);
        return visibleProduct;
    }

    public int getPrice(String product){
        return productMap.get(product);
    }
    
    public void pay(){
        int total = 0;

        for (String product : cart){
            int price = getPrice(product);
            total += price;
            System.out.println(product+": "+price+" kr");
        }
        

        System.out.println("Total: "+total+" kr");
        System.exit(0);
    }
}
import java.util.ArrayList;

public class Order {
    ArrayList<Product> cart = new ArrayList<>();

    public void addToCart(Product product) { // 장바구니에 상품 추가하는 메서드(ArrayList.add(E e))
        cart.add(product);
    }

    public void clearCart() {               // 장바구니의 모든 상품을 삭제하는 메서드(ArrayList.clear())
        cart.clear();
    }

    public double calculateTotal() {        // 장바구니 상품 가격 합계를 산출하는 메서드
        double total = 0;
        for (Product product : cart) {
            total += product.price;
        }
        return total;
    }
}
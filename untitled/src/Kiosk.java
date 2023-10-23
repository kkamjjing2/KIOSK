import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        Menu[] menus = {
                new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"),
                new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림"),
                new Menu("Drinks", "매장에서 직접 만드는 음료"),
                new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주")
        };

        Product[] products01 = {
                new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9),
                new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9),
                new Product("SmokeShack", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4),
                new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9),
                new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4),
        };

        Product[] products02 = {
                new Product("Anthracite Coffee shake", "로컬 로스팅 브랜드 앤트러사이트와 협업한 기간 한정 콜라보레이션 커피 쉐이크", 6.5),
                new Product("Classic Hand-Spun Shakes", "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크", 6.5),
                new Product("Floats", "부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료", 6.5),
                new Product("Cup & Cones", "매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림", 6.5),
        };

        Product[] products03 = {
                new Product("Raspberry Lemonade", "레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드", 5.5),
                new Product("Abita Root Beer", "청량감 있는 독특한 미국식 무알콜 탄산음료", 4.8),
                new Product("Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플", 3.6),
        };

        Product[] products04 = {
                new Product("RedHighball", "향긋한 유자향과 은은한 위스키향, 그리고 히비스커스의 달콤함이 잘 어우러진 하이볼", 4.5),
                new Product("Geumgang IPA", "은은한 단맛이 좋은 여운을 남기는 정통 미국식 IPA", 5.0),
                new Product("Hit-Lager", "라임과 소금을 사용해 시원하고 기분좋은 청량감의 멕시칸스타일 라거", 5.6),
        };

        while (true) {
            System.out.println();
            System.out.println("\"SHAKESHACK BURGER에 오신걸 환영합니다.\"");
            System.out.println("아래 메뉴판을 보고 상품을 골라 입력해주세요.\n");
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menus.length; i++) {
                System.out.println((i + 1) + ". " + menus[i].name + "\t\t|" + menus[i].description);
            }

            System.out.println();
            System.out.println("[ ORDER MENU ]");
            System.out.println("5. Order\t| 장바구니를 확인 후 주문합니다.");
            System.out.println("6. Cancel\t| 진행 중인 주문을 취소합니다.");

            System.out.print("화면에 보이는 숫자를 입력해주세요. : ");
            int number = scanner.nextInt();

            switch (number) {
                case 1 : productMenu(products01, order); // 버거 상품으로 이동 (products01)
                case 2 : productMenu(products02, order); // 아이스크림 상품으로 이동 (products02)
                case 3 : productMenu(products03, order); // 음료 상품으로 이동 (products05))
                case 4 : productMenu(products04, order); // 맥주 상품으로 이동 (products04)
                case 5 : orderScreen(order); // 주문 화면으로 이동
                case 6 :  // 취소 화면으로 이동
                default:
                    System.out.println("눈 똑바로 뜨고 선택하세요!!!!!!!!!!");
            }
        }
    }

    public static void productMenu(Product[] products, Order order) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\"SHAKESHACK BURGER에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보고 상품을 골라 입력해주세요.\n");

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i].name + "\t | W " + products[i].price + " | " + products[i].description);
            }

            System.out.println("\n 상품을 선택해주세요. (이전 화면 : 0)");
            int number = scanner.nextInt();

            if ( 0 < number && number <= products.length) { // 장바구니에 선택한 상품 추가
                addToCartConfirmation(products[number-1], order);
            }
            else if (number == 0) {
                break;
            }
            else {
                System.out.println("눈 똑바로 뜨고 선택하세요!!!!!!!!!!");
            }
        }
    }

    private static void addToCartConfirmation(Product product, Order order) { // 장바구니 추가 확인 후 추가 메서드
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"" +product.name + "\t | W " + product.price + " | " + product.description + "\"\n");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        int number = scanner.nextInt();

        if(number == 1) {
            order.addToCart(product);
            System.out.println(product.name + "(이)가 장바구니에 추가되었습니다!!!!!!\n");
        }
    }

    private static void orderScreen(Order order) { // 주문 화면 메서드
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("아래와 같이 주문하시겠습니까? \n [ Orders ]");
        cartList(order);
        order.calculateTotal();

        int number = scanner.nextInt();

        if (number == 1) { // 주문 완료 화면으로 이동
            completeOrder(order);
        } else if (number == 2) { // 메인 메뉴판으로 이동
        } else {
            System.out.println("눈 똑바로 뜨고 선택하세요!!!!!!!!!!");
        }
    }

    private static void completeOrder (Order order) { // 주문 완료 화면 출력
        System.out.println("주문이 완료되었습니다!");
        System.out.println("대기 번호는 [ " + Math.random()*200+1 + " ] 번 입니다.");
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");

    }
    private static void cartList (Order order) { // 장바구니 목록 출력
        for (Product product : order.cart) {
            System.out.println(product.name + " | W " + product.price + " | " + product.description);
        }
            System.out.println();
    }
}
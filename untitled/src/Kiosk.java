import java.sql.SQLOutput;
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
        }
    }
}
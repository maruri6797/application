package practice;

public class AppleB {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", 200));
//		System.out.println(appleBasket.get().getName());
//		appleBasket.replace(new Apple("紅玉"));
//		System.out.println(appleBasket.get().getName());
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", 300));
		
		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
	}
}

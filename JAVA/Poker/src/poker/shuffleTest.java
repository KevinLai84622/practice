package poker;

// 執行洗牌動作
public class shuffleTest {

	public static void main(String[] args) {
		Shuffle.initial();		// 產生一副新牌
		
		System.out.println("一副新牌的初始排列如下:");
		Shuffle.showCard();		// 顯示新牌的排列
		
		Shuffle.shuffle();		// 執行洗牌步驟
		System.out.println("\n洗牌後的排列如下");
		Shuffle.showCard();;
	}

}

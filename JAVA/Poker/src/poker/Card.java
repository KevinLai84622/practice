package poker;

// 定義撲克牌花色與數字
public class Card {
	private int suit;
	private char number;
	
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	public char getNumber() {
		return number;
	}
	public void setNumber(char number) {
		this.number = number;
	}
}

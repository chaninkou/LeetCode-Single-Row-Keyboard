package leetcode1165;

public class Main {
	public static void main(String[] args) {
		String keyboard = "abcdefghijklmnopqrstuvwxyz";
		
		String text = "abc";
		
		System.out.println("Keyboard: " + keyboard);
		
		System.out.println("Text: " + text);
		
		FindTotalTimeToTypeFunction solution = new FindTotalTimeToTypeFunction();
		
		System.out.println("Solution: " + solution.calculateTime(keyboard, text));
	}
}

package leetcode1165;

public class FindTotalTimeToTypeFunction {
	public int calculateTime(String keyboard, String word) {
		// Could have used a hashmap too but it will cost extra space
		// there are only 26 lowercase letters
		int[] countMap = new int[26];
		
		// Since the keyboard size is only 26, which is the input
		for(int i = 0; i < countMap.length; i++){
			countMap[keyboard.charAt(i) - 'a'] = i;
		}
		
		int totalTime = countMap[word.charAt(0) - 'a'];
		
		for(int j = 1; j < word.length(); j++){
			int current = countMap[word.charAt(j) - 'a'];
			int previous = countMap[word.charAt(j - 1) - 'a'];
			
			totalTime += Math.abs(current - previous);
		}
		
//        int totalTime = 0, position = 0;
//        
//        for(int i=0; i< word.length(); i++) {
//            totalTime +=  Math.abs(countMap[word.charAt(i) - 'a'] - position);
//            position = countMap[word.charAt(i) - 'a'];
//        }
		
		return totalTime;
	}
}

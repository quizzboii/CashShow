public class Algorithms {

	/**
	 * Stupid Testing Program
	 */
	public static void main(String[] args) {
		System.out.println(occuranceAlgorithmScore("222", "2"));
	}

	/**
	 * Basic scoring algorithm for how many occurrences the word shows up on the
	 * first 9 google headers
	 * 
	 * @param googleResult
	 *            The blob of search data you are looking in
	 * @param answerCandidate
	 *            The answer that you are checking the occurrence of
	 * @return Score for google occurrence test
	 */
	public static int occuranceAlgorithmScore(String googleResult, String answerCandidate) {
		int count = numberOfTimesContained(googleResult, answerCandidate);
		String [] splitAnswers = answerCandidate.split(" ");
		for(String o:splitAnswers) {
			count += numberOfTimesContained(googleResult, o);
		}
		
		
		
		return count;
	}
	
	public static int numberOfTimesContained(String totalText, String whatToFind) {
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {

			lastIndex = totalText.indexOf(whatToFind, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += whatToFind.length();
			}
		}
		return count;
	}



}
	
	
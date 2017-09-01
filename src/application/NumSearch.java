package application;

public class NumSearch {
	static int intListNoDups[]; 
	static int sortedIntList[]; 
	static Book bookListNoDups[];
	
	public static void main(String args[]) {
		int numOfIntsToGenerate = 300000;
		int count, newNum;
		long totalTimeForAryList=0, totalTimeForSortedAryList=0;
		long timeToAddOneNum;
		
		intListNoDups = new int[numOfIntsToGenerate+10];  /*  oversize slightly  */
		sortedIntList = new int[numOfIntsToGenerate+10];  /*  oversize slightly  */
		
		NumGenerator numGen = new NumGenerator(numOfIntsToGenerate*10);

		for (count=0; count < numOfIntsToGenerate; count++) {
			newNum = numGen.retrieveRandomNum();
			
			timeToAddOneNum = addToListNoDuplicates(newNum);
			totalTimeForAryList = totalTimeForAryList + timeToAddOneNum;
			
			timeToAddOneNum = addToSortedListNoDuplicates(newNum);
			totalTimeForSortedAryList = totalTimeForSortedAryList + timeToAddOneNum;
		}
		
		System.out.println("Time to add to array (no duplicates): " + totalTimeForAryList/1000000000 + " seconds");
		System.out.println("Time to add to a sorted array (no duplicates): " + totalTimeForSortedAryList/1000000000 + " seconds");
		
		System.out.println("\n\nTime to add to array (no duplicates): " + totalTimeForAryList/1000000 + " milli-seconds");
		System.out.println("Time to add to a sorted array (no duplicates): " + totalTimeForSortedAryList/1000000 + " milli-seconds");
		
	}
	
	/* Add an integer to "intListNoDups" if it is NOT already in the list.   In other words
	 * we don't want duplicates in the list.   intListNoDups is NOT sorted.
	 */
	public static long addToListNoDuplicates(int numToAdd) {
		long startTime = System.nanoTime();
		long endTime, timeInMethod;
		
		/* add code here to:
		 *      Determine if "numToAdd" is already in the array
		 *      If it is already in the array there is nothing to add (since we don't want duplicates)
		 *      If it is not in the array, then add it
		 */
		
		endTime   = System.nanoTime();
		timeInMethod = endTime - startTime;
		return timeInMethod;
	}
	
	/* Add an integer to a SORTED list (sortedIntList) with no duplicates.   Don't add the
	 * number to the list if it is already in the list.  Make sure the list 
	 * is still sorted after adding the number.   In other words the list should always be in
	 * a sorted state.   After every call to this method, the list should still be sorted.
	 * Perform the sort work yourself (in other words don't call some method that you have not
	 * written to do the sorting work).   A couple of ways to keep the list sorted will be 
	 * discussed in class.
	 */
	public static long addToSortedListNoDuplicates(int numToAdd) {
		long startTime = System.nanoTime();
		long endTime, timeInMethod;
		
		/* add code here to:
		 *      Determine if "numToAdd" is already in the list
		 *      If it is already in the list there is nothing to add (since we don't want duplicates)
		 *      If it is not in the list, then place it in the correct position so the list is STILL SORTED
		 */
		
		endTime   = System.nanoTime();
		timeInMethod = endTime - startTime;
		return timeInMethod;
	}
	
	/* Add a Book to "bookListNoDups" if it is NOT already in the list.   In other words
	 * we don't want duplicates in the list.   bookListNoDups is NOT sorted.  You can test this method
	 * by instantiating a few Book objects and then adding them to the list -- we won't use random 
	 * generation for this method or determine runtime.  But it sees if you can work with class objects
	 * and not just primitive types like "int".
	 */
	public static void addToBookListNoDuplicates(Book bookToAdd) {
		
		/* add code here to:
		 *      Determine if "bookToAdd" is already in the array
		 *      If it is already in the array there is nothing to add (since we don't want duplicates)
		 *      If it is not in the array, then add it
		 */
	}
}

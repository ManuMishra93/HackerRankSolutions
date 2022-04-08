package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompareTheTriplets {
	
	public static void main(String ...args) throws Exception {
		//For reading inputs from console.
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//For displaying output on console
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		//Reading from console and converting it in list using streams
		List<Integer> aList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		//Reading from console and converting it in list using streams
		List<Integer> bList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		//Function to find score
		compareTheTriplets (aList , bList);
		//closing the IO
		bufferedReader.close();
		bufferedWriter.close();
	}
	
	public static void compareTheTriplets(List<Integer> aList , List<Integer> bList) {
		//Comparing two list and finding minimum length
		int minLen = Math.min(aList.size(), bList.size());
		int aScore = 0 , bScore = 0;
		for (int i = 0 ; i < minLen ; i++) {
			//if element at index i in aList is greater than bList increase a score by 1.
			if (aList.get(i) > bList.get(i)) {
				aScore++;
			} 
			//if element at index i in bList is greater than aList increase b score by 1.
			else if (aList.get(i) < bList.get(i)) {
				bScore++;
			}
		}
		//printing score.
		System.out.println(aScore + " " + bScore);
	}

}

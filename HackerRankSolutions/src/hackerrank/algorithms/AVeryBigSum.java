package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AVeryBigSum {
	
	public static void main(String ...args) throws Exception {
		//For reading inputs from console.
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//For displaying output on console
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		//Reading total count of long values from console.
		int count = Integer.parseInt(bufferedReader.readLine().trim());
		//Reading from console and converting it in list using streams
		List<Long> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
				.collect(Collectors.toList());
		//Function to calculate sum
		aVeryBigSum (a);
		//closing the IO
		bufferedReader.close();
		bufferedWriter.close();
	}
	
	public static void aVeryBigSum (List<Long> list) {
		//Summing elements of list using stream
		Long sum = list.stream().mapToLong(Long::longValue).sum();
		System.out.println("Sum -> " + sum);
	}

}

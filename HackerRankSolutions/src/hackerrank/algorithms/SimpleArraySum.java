package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleArraySum {
	
	public static void main (String ...args) throws IOException {
		//Buffered Reader for input stream
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//Buffered Writer for output stream
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		//It will take the size of the array
		int arCount = Integer.parseInt(bufferedReader.readLine().trim());
		//It will create the list from the inputs received from console.
		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		int result = simpleArraySum(ar);
		//It will write the sum on the console.
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		//close
		bufferedReader.close();
		bufferedWriter.close();
	}
	
	public static int simpleArraySum (List<Integer> ar) {
		//It will provide sum of the list
		return ar.stream().mapToInt(Integer::intValue).sum();
	}

}

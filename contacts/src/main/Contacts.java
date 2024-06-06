package main;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Contacts {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Number of queries: ");
		int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<String>> queries = new ArrayList<>();

		IntStream.range(0, queriesRows).forEach(i -> {
			try {
				System.out.print("Action " + (i+1) + " : ");
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		List<Integer> result = Result.contacts(queries);

		System.out.println(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();

	}

}

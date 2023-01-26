package com.masai.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question2 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./test.txt");
		
		Files.lines(path).forEach(System.out::println);

	}

}

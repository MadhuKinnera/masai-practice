package com.masai.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question1 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(".");
		
		Files.list(path).forEach(System.out::println);

	}

}

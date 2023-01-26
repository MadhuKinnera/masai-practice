package com.masai.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Question3 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("./files");
		Files.createDirectory(path);
		
		Path path2 = Paths.get("./files/file.txt");
		
		Files.createFile(path2);
		
		List<String> data = List.of("Hey ","There ","Iam ","Using","STS");
		
		Files.write(path2, data);
		
		System.out.println("Done");

	}

}

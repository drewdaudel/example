package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class InterviewQuestion {
	public static void main(String[] args) throws FileNotFoundException{
		String word = "Success";
		FileReader file = new FileReader("C:\\adxregistrator.log");
		
	Scanner sc = new Scanner(file);
		while (sc.hasNextLine()){
		String line = sc.nextLine();
		if (line.indexOf(word) > -1 ) {
		System.out.println("SUP" + line);
		}
	}
	}
}

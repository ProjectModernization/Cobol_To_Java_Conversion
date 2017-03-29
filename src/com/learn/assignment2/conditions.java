package com.learn.assignment2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class conditions {
	String ch;

	public void checkChar(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		ch = scan.next().substring(0,1);
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher(ch);
		Pattern pattern1 = Pattern.compile(".*[qwrtyuplkjhgfdszxcvbnm]$");
		Pattern pattern2 = Pattern.compile(".*[aeiou]$");
		if(matcher.find()){
			System.out.println("The number "+ch+" is a Digit.");
		}
		Matcher matcher1 = pattern1.matcher(ch);
		if(matcher1.find()){

			System.out.println("The letter "+ch+" it is a Consonant.");
		}
		Matcher matcher2 = pattern2.matcher(ch);
		if(matcher2.find()){

			System.out.println("The letter "+ch+" it is a Vowel.");
		}
		else
		{
			System.out.println("Problems Found");
		}

	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}

}

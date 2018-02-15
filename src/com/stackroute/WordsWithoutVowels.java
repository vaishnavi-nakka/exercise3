package com.stackroute;

import java.io.*;

public class WordsWithoutVowels {

	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String str1 = "";
        
			while((str = br.readLine())!=null){
				for(int i =0;i<str.length();i++){
					if(str.toUpperCase().charAt(i)=='A'  ||str.toUpperCase().charAt(i)=='E'||str.toUpperCase().charAt(i)=='I'||str.toUpperCase().charAt(i)=='O'||str.toUpperCase().charAt(i)=='U'){
						
					}
					else{
						str1 = str1 + str1.charAt(i);
					}
				}
				System.out.println(str1);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

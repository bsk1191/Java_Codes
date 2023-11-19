package com.bsk.str;

public class VowelsConsonantsWhiteSpaces {
		static void Finding(String str) {
			int vowels=0, consonants=0, whitespaces=0;
			int length=str.length();
			str=str.toLowerCase();
			for(int i=0;i<length;i++) {
				char ch=str.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels++;
				}
				else if( ch>='a' && ch<='z')
					consonants++;
				else if(ch==' ')
					whitespaces++;
				
			}
			System.out.println(vowels);
			System.out.println(consonants);
			System.out.println(whitespaces);
		}
		public static void main(String[] args) {
			String str="Sai Kiran";
			Finding(str);
		}
}

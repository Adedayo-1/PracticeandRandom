package com.dayo.practices;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/*
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter Student's Grade"); int avg = scanner.nextInt();
		 * 
		 * scanner.close();
		 * 
		 * System.out.println("The student Grade is: ");
		 * 
		 * if (avg >= 86 && avg <= 100) { System.out.print("A"); } else if (avg >= 70 &&
		 * avg <= 85) { System.out.println("B"); } else if (avg >= 60 && avg <= 69) {
		 * System.out.println("C"); } else if (avg >= 50 && avg <= 59) {
		 * System.out.println("D"); } else if (avg >= 40 && avg <= 49) {
		 * System.out.println("E"); } else if (avg >= 0 && avg <= 39) {
		 * System.out.println("F"); }
		 * 
		 * 
		 * String[] studentNames = new String[3]; studentNames[0] = "June";
		 * studentNames[1] ="May"; studentNames[3] ="sept";
		 * 
		 * for (int i=0; i<studentNames.length;i++) { System.out.println("Student" +
		 * (i+1) + "is" + studentNames[i]); }
		 * 
		 * System.out.println("**************************************************"); int
		 * j=1; for(String student: studentNames) { System.out.println("Student" + (j++)
		 * + "is" + studentNames); }
		 * 
		 * int matRow =2; int matCol =3;
		 * 
		 * int[][] matA = new int[matRow][matCol];
		 * 
		 * int size = matA.length; System.out.println(size);
		 * 
		 * for(int row=0; row<size; row++) { System.out.println("Currrent row is " +
		 * row);
		 * 
		 * for(int col=0; col < matCol; col++) { System.out.println("row ="
		 * +row+" , col="+col); matA[row][col]= input.nextInt(); }
		 * 
		 * }
		 * 
		 * for(int row=0; row<size; row++) { System.out.println("|");
		 * 
		 * for(int col=0; col < matCol; col++) { System.out.println(matA[row][col] +
		 * "\t"); } System.out.println("|");
		 * 
		 * }
		 * 
		 * int sum=0; for(int row=0;row<size; row++) { int sumOfRow * =matA[row][col]; }
		 * System.out.println("Sum of row" + row +"="+sumOfRow);
		 * 
		 * sum+=sumOfRow;
		 * 
		 * } System.out.println("Sum of all =" + sum);
		 

		double avg = 0;
		double gpa = 0.0;
		int sum = 0;
		int row = 3;
		int col = 2;
		int sumofAll = 0;
		double sumofCrdt = 0;
		int[][] studentScore = new int[row][col];
		String subject = "";
		
		  //Entry of values
		 
		  for(int i=0; i < row; i++) { System.out.println("Current row is " + (1+i));
		  
		  for(int j=0; j < col; j++) { System.out.println("row="+ (i+1) + " ,col=" +
		  (j+1)); Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter value of row " + (i+1) + ", col " + (j+1));
		  studentScore[i][j] = input.nextInt();
		  
		 } } System.out.println("*************Header**********");
		  System.out.println("|Grade Point "+ " Credit Hours|"); for(int i=0; i < row;
		  i++) {
		  
		  System.out.println("|"+ studentScore[i][0] + "         " + studentScore[i][1]
		  +"|");
		  
		  sumofAll += studentScore[i][0] * studentScore[i][1]; sumofCrdt +=
		  studentScore[i][1]; gpa = sumofAll/sumofCrdt; }
		  System.out.println("Sum of grade hours =" + sumofAll );
		  System.out.println("Sum of credit hours =" + sumofCrdt );
		  System.out.println("The student's G.P.A is " + gpa);*/
		 //comment
/*
		for (int i = 0; i < row; i++) {

			Scanner scanner = new Scanner(System.in);
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter Subject " + (i + 1) + "'s code: ");
			subject = scanner1.nextLine().toUpperCase();
			System.out.println("Enter Student's Score");
			avg = scanner.nextDouble();
			if (avg >= 70 && avg <= 100) {
				studentScore[i][0] = 5;
			} else if (avg >= 60 && avg <= 69.99) {
				studentScore[i][0] = 4;
			} else if (avg >= 50 && avg <= 59.99) {
				studentScore[i][0] = 3;

			} else if (avg >= 40 && avg <= 49.99) {
				studentScore[i][0] = 2;
			} else if (avg >= 0 && avg <= 39.99) {
				studentScore[i][0] = 1;
			}

			for (int j = 1; j < col; j++) {
				System.out.println(subject + "'s credit hour is: ");
				Scanner input = new Scanner(System.in);
				studentScore[i][j] = input.nextInt();
			}

		}
		for (int i = 0; i < row; i++) {

			System.out.println("|" + studentScore[i][0] + "         " + studentScore[i][1] + "|");

			sumofAll += studentScore[i][0] * studentScore[i][1];
			sumofCrdt += studentScore[i][1];
		}
		gpa = sumofAll / sumofCrdt;

		System.out.println("Sum of grade hours =" + sumofAll);
		System.out.println("Sum of credit hours =" + sumofCrdt);
		System.out.println("The student's G.P.A is " + gpa);
*/
	
		
		
		
		
		
		}

	}



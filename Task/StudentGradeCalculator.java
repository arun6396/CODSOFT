package Task;

import java.util.Scanner;

public class StudentGradeCalculator {
	private static void student(int totalSubjects) {
		Scanner sc = new Scanner(System.in);
		int[] mark = new int[totalSubjects];
		int totalMark = 0;
		for (int i = 0; i < totalSubjects; i++) {
			System.out.print("Enter the  mark" + +(i + 1) + " out of 100 : ");
			mark[i] = sc.nextInt();
			totalMark += mark[i];
		}

		double averagePercentage = totalMark / totalSubjects;
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Total Marks : " + totalMark);
		System.out.println("Average Pecentage : " + averagePercentage + " %");
		if (averagePercentage > 90 && averagePercentage <= 100) {
			System.out.println("Grade : S ");
		}
		if (averagePercentage > 80 && averagePercentage <= 90) {
			System.out.println("Grade : A ");
		} else if (averagePercentage > 70 && averagePercentage <= 80) {
			System.out.println("Grade : B ");
		} else if (averagePercentage > 60 && averagePercentage <= 70) {
			System.out.println("Grade : C ");
		} else if (averagePercentage > 50 && averagePercentage <= 60) {
			System.out.println("Grade : D ");
		} else {
			System.out.println("Grade : E ");
		}

		System.out.println("-------------------------------------------------------------------------------------");

	}

	public static void main(String[] args) {
		int totalSubjects = 5;
		student(totalSubjects);
	}
}

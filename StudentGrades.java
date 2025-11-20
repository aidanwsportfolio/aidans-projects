import java.util.Scanner;

public class ScottProject1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int numStudents = input.nextInt();
		input.nextLine();
		
		//settle the count and score below as they're related
		int count = 1; 
		double score = -1;
		
		
		double highestScore = -1; // too low
		double lowestScore = 101; //too high
		String highestName = "";
		String lowestName = "";
	
		double sumSquares= 0.0;
		double sumScores = 0.0;
		
		String studentData = ""; //build the table
		String name = "";
		System.out.println("Enter student names and scores below");
		
		while (count <= numStudents) {
			System.out.println("\nEnter student name: ");
			name = input.nextLine();
			
			//confirm that the score is between 0 and 100
			while (true) {
			System.out.println("Enter score for " + name + " (0-100): ");
			score = input.nextDouble();	
			if (score >= 0 && score <= 100) {
				break; //valid, exit conditional loop
			}
			else {
				System.out.println(" Invalid Score! Please enter a number between 0 and 100.");
				}
			}
		input.nextLine();
		
		//define and assign the letter grades
		String grade;
		if (score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else if (score >= 60) {
			grade = "D";
		}
		else {
				grade = "F";
			}
		
			if (score > highestScore) {
			highestScore = score;
			highestName = name;
		}
		if (score < lowestScore) {
			lowestScore = score;
			lowestName = name;
		}
		sumScores += score; //find the sum of scores
		sumSquares += score * score; //find the sum of squares
		
		//add the student's row
		studentData += String.format("%-15s %-10.2f %-35s\n", name, score, grade);
		count++; //increase total count
	}
	//compute the rest of the stats
		
		double average = sumScores / numStudents; //find the mean scores
		double variance = (sumSquares / numStudents) - (average * average); //find the variance}
		double standardDeviation = Math.sqrt(variance);
		
		//print the report
		System.out.println("\nStudent Grade Report: "); //Print the grade report label
		System.out.println("--------------------------------------");
		System.out.printf("%-15s%-15s%-15s\n","Name", "Score","Grade"); //Print the name, score, and grade section
		System.out.println("--------------------------------------");
		System.out.print(studentData);
		System.out.println("--------------------------------------");
		System.out.printf("Highest Score: %.2f (%s)\n", highestScore, highestName);
		System.out.printf("Lowest Score: %.2f (%s)\n", lowestScore, lowestName);
		System.out.printf("Average Score: %.2f\n", average);
		System.out.printf("Standard Deviation:  %.4f\n", standardDeviation);
		
		
		// create the student search feature
		String searchName = "";
		
		System.out.println("\nStudent Search: Type a name or 'exit' to quit");
		while (true) {
		    System.out.println("Enter student name to search: ");
		    searchName = input.nextLine();

		    // stop the loop for 'exit'
		    if (searchName.equalsIgnoreCase("exit")) {
		        System.out.println("Exiting");
		        break;
		    }

		    boolean found = false; 

		    // read the entries with a scanner
		    Scanner dataScanner = new Scanner(studentData);
		    while (dataScanner.hasNextLine()) { // review all of the lines
		        String line = dataScanner.nextLine();

		        if (line.toLowerCase().indexOf(searchName.toLowerCase()) != -1) {
		            found = true;

		            // parse through the columns but at a fixed width ("%-15s %-10.2f %-35s\n", ...)
		            String outName  = line.length() >= 15 ? line.substring(0, 15).trim() : line.trim();
		            String outScore = "";
		            String outGrade = "";

		            if (line.length() >= 26) {
		                outScore = line.substring(16, 26).trim();
		            } else if (line.length() > 16) {
		                outScore = line.substring(16).trim();
		            }

		            if (line.length() > 27) {
		                outGrade = line.substring(27).trim();
		            }

		            System.out.println("Student: " + outName + ", Score: " + outScore + ", Grade: " + outGrade);
		        }
		    }
		    dataScanner.close(); //close the scanner

		    if (!found) { //if a student isn't found say they're not found
		        System.out.println("Student not found.");
		    }
		    
		}
		input.close();
		}
	}

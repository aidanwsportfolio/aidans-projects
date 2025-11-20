import java.util.Scanner;

public class EnhancedStudentGradeAnalyzer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many students will be entered
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // clear leftover newline

        // Get all student names and scores
        String[] names = enterNames(numStudents, input);
        double[] scores = enterScores(numStudents, input);

        // Calculate statistics
        double max = findMax(scores);
        double min = findMin(scores);
        double average = computeAverage(scores);
        double stdDev = computeStandardDeviation(scores, average);

        // Assign letter grades to each student
        char[] grades = assignLetterGrades(scores);

        // Show all student data in a table
        printStudentTable(names, scores, grades);

        // Show class statistics
        printStatistics(max, min, average, stdDev);

        // Allow professor to search students by name
        searchStudentLoop(names, scores, grades, input);

        input.close();
    }

    // Ask user to enter each student's name
    public static String[] enterNames(int count, Scanner input) {
        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = input.nextLine().trim();
        }
        return names;
    }

    // Ask user to enter each student's score (0–100)
    public static double[] enterScores(int count, Scanner input) {
        double[] scores = new double[count];

        for (int i = 0; i < count; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");

                if (input.hasNextDouble()) {
                    double score = input.nextDouble();

                    // Score must be between 0 and 100
                    if (score >= 0 && score <= 100) {
                        scores[i] = score;
                        break;
                    } else {
                        System.out.println("Invalid score. Please enter 0–100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next(); // clear wrong input
                }
            }
        }

        input.nextLine(); // clear leftover newline
        return scores;
    }

    // Find the highest score in the array
    public static double findMax(double[] scores) {
        double max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    // Find the lowest score in the array
    public static double findMin(double[] scores) {
        double min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    // Compute the average of all scores
    public static double computeAverage(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }

    // Compute the standard deviation
    public static double computeStandardDeviation(double[] scores, double average) {
        double sumSquares = 0;
        for (double s : scores) {
            sumSquares += s * s;
        }

        double meanSquares = sumSquares / scores.length;
        double variance = meanSquares - (average * average);

        // Prevent tiny negative values due to rounding
        if (variance < 0) {
            variance = 0;
        }

        return Math.sqrt(variance);
    }

    // Convert each score into a letter grade
    public static char[] assignLetterGrades(double[] scores) {
        char[] grades = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {
            double s = scores[i];

            if (s >= 90) {
                grades[i] = 'A';
            } else if (s >= 80) {
                grades[i] = 'B';
            } else if (s >= 70) {
                grades[i] = 'C';
            } else if (s >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        return grades;
    }

    // Print all student names, scores, and grades in a table
    public static void printStudentTable(String[] names, double[] scores, char[] grades) {
        System.out.println("\nStudent Grade Report:");
        System.out.println("----------------------");
        System.out.printf("%-10s %-10s %-10s%n", "Name", "Score", "Grade");
        System.out.println("------------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s %-10.2f %-10c%n", names[i], scores[i], grades[i]);
        }
    }

    // Print highest, lowest, average, and standard deviation
    public static void printStatistics(double max, double min, double average, double stdDev) {
        System.out.println("\nClass Statistics:");
        System.out.println("-----------------");
        System.out.printf("Highest Score: %.2f%n", max);
        System.out.printf("Lowest Score: %.2f%n", min);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Standard Deviation: %.2f%n", stdDev);
    }

    // Search for a student until the user types "exit"
    public static void searchStudentLoop(String[] names, double[] scores, char[] grades, Scanner input) {
        System.out.println("\nStudent Search (type 'exit' to quit)");

        while (true) {
            System.out.print("Enter student name to search: ");
            String query = input.nextLine().trim();

            // End search
            if (query.equalsIgnoreCase("exit")) {
                break;
            }

            // Try to find matching name
            int foundIndex = -1;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(query)) {
                    foundIndex = i;
                    break;
                }
            }

            // If found, show student info
            if (foundIndex != -1) {
                System.out.printf("Student found: %s, Score: %.2f, Grade: %c%n",
                        names[foundIndex], scores[foundIndex], grades[foundIndex]);
            } else {
                System.out.println("Student not found.");
            }
        }
    }
}

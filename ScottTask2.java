public class ScottTask2 {

    public static void main(String[] args) {

        // 8 students, 10 questions each (replace with the lab's exact values if needed)
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int numberOfStudents = answers.length;
        int numberOfQuestions = answers[0].length;

        int[][] results = new int[numberOfStudents][2]; // [studentIndex, correctCount]

        // Step 1: grade each student
        for (int student = 0; student < numberOfStudents; student++) {
            int correctCount = 0;

            for (int question = 0; question < numberOfQuestions; question++) {
                if (answers[student][question] == key[question]) {
                    correctCount++;
                }
            }

            results[student][0] = student;      // store student index
            results[student][1] = correctCount; // store score
        }

        // Step 2: sort results by score (ascending)
        for (int i = 0; i < numberOfStudents - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numberOfStudents; j++) {
                if (results[j][1] < results[minIndex][1]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int tempStudent = results[i][0];
                int tempScore = results[i][1];

                results[i][0] = results[minIndex][0];
                results[i][1] = results[minIndex][1];

                results[minIndex][0] = tempStudent;
                results[minIndex][1] = tempScore;
            }
        }

        // Step 3: display sorted results
        System.out.println("Results in increasing order of correct answers:");
        for (int i = 0; i < numberOfStudents; i++) {
        	System.out.println("Student " + results[i][0] + "'s score is " + results[i][1]);

        }
    }
}

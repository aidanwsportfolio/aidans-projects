public class RectangleAreaChecker {

    public static void main(String[] args) {
        int length = 10;
        int width = 5;
        int threshold = 50;

        // Calculate area
        int area = length * width; /* QUESTION 1: the variables visible at this point are
        length with a value of 10, width with a value of 5, and threshold with
        a value of 50. "args" also appears and it says that it has a value of String[0] (id=20).
        */
       /*QUESTION 2: The value of the area is correct. A length of 10 multiplied by the width
        * of 5 makes the area of the rectangle 50.
        */
        /*QUESTION 3: The value of isAboveThreshold appears as "true." It doesn't match my
         * expectations because the threshold is 50, and the area is 50, therefore it should
         * be AT the threshold, but not above it.
         */
        
        
        // Check if area is above the threshold
        boolean isAboveThreshold = area > threshold; /*QUESTION 4: the logical area was
        in area >= threshold, where the code should actually read "area > threshold",
        I removed the = sign by area and threshold for the boolean variable*/
        

        // Output results
        System.out.println("Area: " + area);
        if (isAboveThreshold) {
            System.out.println("Area is above the threshold.");
        } else {
            System.out.println("Area is below or equal to the threshold.");
        }
    }
}
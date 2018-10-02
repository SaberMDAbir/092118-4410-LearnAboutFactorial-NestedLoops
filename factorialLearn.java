/* 
MD Abir A. Choudhury
092118
nested loop - Display the factorials of integers between 1 and 10
*/

class factorialLearn {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) { 
            int factorial = i;
            for(int j = i - 1; j > 0; j--) {
                factorial *= j;
            }
            System.out.println("Factorial of " + i + " is " + factorial);
        }
    }
}
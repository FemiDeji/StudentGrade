import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        {
            //*(This program assumes that a student offers 9 subjects);

            int marks[] = new int[9];
            int i;
            float total = 0, avg;
            Scanner scanner = new Scanner(System.in);
            for (i = 0; i < 9; i++) {
                System.out.println("Enter Mark of subject" + (i + 1) + ":");
                marks[i] = scanner.nextInt();
                total = total + marks[i];
            }
            scanner.close();
            //(calculating average here);
            avg = total / 9;
            System.out.println("The student grade is");
            if (avg >= 70) {
                System.out.println("A");
            } else if (avg >= 65 & avg < 70) {
                System.out.println("B");
            } else if (avg >= 50 & avg < 65) {
                System.out.println("C");
            } else if (avg >= 45 & avg < 50) {
                System.out.println("D");
            } else if (avg >= 0 & avg < 45) {
                System.out.println("F");

            }
        }
    }
}


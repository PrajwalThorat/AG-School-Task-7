import java.util.Scanner;

public class StudentDetails {
    Student student;
    Marks mark;
    // Student[] names ;
    // Student[] rollNo ;
    // Marks[] marksOfMath ;
    // Marks[] marksOfScience ;
    // Marks[] marksOfLanguage ;
    // Marks[] marksOfEnglish ;
    // Marks[] marksOfSocial;

    // public void noOfStudent(int num){
    //     student = new Student[num];
    // }

    public void addDetails(){
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the Number Of Student");
        // int numberOfStudent =  scanner.nextInt();
        // names = new Student[numberOfStudent];
        // rollNo = new Student[numberOfStudent];
        // marksOfMath = new Marks[numberOfStudent];
        // marksOfScience = new Marks[numberOfStudent];
        // marksOfEnglish = new Marks[numberOfStudent];
        // marksOfLanguage = new Marks[numberOfStudent];
        // marksOfSocial = new Marks[numberOfStudent];

        // for(int i=0 ; i<numberOfStudent ; i++){
        // noOfStudent(numberOfStudent);
            System.out.println("Enter Student Details");
            System.out.print("Name : ");
            String studentName = scanner.next();
            System.out.print("Roll Number : ");
            String studentRollNumber = scanner.next();
            System.out.println("--Enter the Marks--");
            System.out.print("Math : ");
            int mathMarks = scanner.nextInt();
            System.out.print("Science : ");
            int scienceMarks = scanner.nextInt();
            System.out.print("English : ");
            int englishMarks = scanner.nextInt();
            System.out.print("Language : ");
            int languageMarks = scanner.nextInt();
            System.out.print("Social Studies : ");
            int socialStudiesMarks = scanner.nextInt();

            student = new Student(studentName, studentRollNumber);
            mark = new Marks(mathMarks, scienceMarks, englishMarks, languageMarks, socialStudiesMarks);

            // student.setName(studentName);
            // student.setRollNumber(studentRollNumber);
            // mark.setMath(mathMarks);
            // mark.setEnglish(englishMarks);
            // mark.setLanguage(languageMarks);
            // mark.setScience(scienceMarks);
            // mark.setSocialStudies(socialStudiesMarks);
            scanner.close();
        // }

    }
    public void ShowDetails(){
        student.display();
        mark.displayMarks();
        System.out.println("======================================");
        System.out.println("Total\t\t500\t\t"+mark.TotalMarks());
        System.out.println("Average : "+mark.AverageMarks());
    }
}

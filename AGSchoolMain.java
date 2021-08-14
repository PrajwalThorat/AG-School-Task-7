import java.util.Scanner;

public class AGSchoolMain {


    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the number of Student : ");
        // int numberOfStudent = scan.nextInt();
        // StudentDetails studentD = new StudentDetails();

        // for(int i=0 ; i<numberOfStudent ; i++){
        //     System.out.println("Enter "+(i+1)+" Student Details");
        //     studentD.studentDetails[i].addDetails();
        // }

        // for(StudentDetails details:studentDetails){
        //     details.ShowDetails();
        // }


        StudentDetails studentDetails = new StudentDetails();
        studentDetails.addDetails();
        studentDetails.ShowDetails();
    }
        
}

public class Student {
    private String name;
    private String rollNumber;

    

    public String getName() {
        return name;
    }

    public Student(String name, String rollNumber ) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void display(){
        System.out.println("Name : "+name+"\nRoll Number :"+rollNumber);
    }
}
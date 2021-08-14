public class Marks {
    private int math;
    private int science;
    private int english;
    private int language;
    private int socialStudies;

    public Marks(){

    }

    public Marks(int math, int science, int english, int language, int socialStudies) {
        this.math = math;
        this.science = science;
        this.english = english;
        this.language = language;
        this.socialStudies = socialStudies;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getScience() {
        return science;
    }
    public void setScience(int science) {
        this.science = science;
    }
    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public int getLanguage() {
        return language;
    }
    public void setLanguage(int language) {
        this.language = language;
    }
    public int getSocialStudies() {
        return socialStudies;
    }
    public void setSocialStudies(int socialStudies) {
        this.socialStudies = socialStudies;
    }

    public void displayMarks(){
        System.out.println("Math\t\t100\t\t"+getMath());
        System.out.println("Science\t\t100\t\t"+getScience());
        System.out.println("Language\t100\t\t"+getLanguage());
        System.out.println("English\t\t100\t\t"+getEnglish());
        System.out.println("Social Studies\t100\t\t"+getSocialStudies());
    }

    public int TotalMarks(){
        return getEnglish()+getLanguage()+getMath()+getScience()+getSocialStudies();
    }

    public double AverageMarks(){
        return TotalMarks()/5;
    }
}

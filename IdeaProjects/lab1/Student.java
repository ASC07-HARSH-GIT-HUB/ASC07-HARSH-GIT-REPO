package lab1;

public class Student {
    private int studentId;
    private String studentName;
    private String city;
    private int marks1, marks2, marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    public void setStudentId(int id) { studentId = id; }
    public int getStudentId() { return studentId; }

    public void setStudentName(String name) { studentName = name; }
    public String getStudentName() { return studentName; }

    public void setCity(String c) { city = c; }
    public String getCity() { return city; }

    public void setMarks1(int m) { marks1 = m; }
    public int getMarks1() { return marks1; }

    public void setMarks2(int m) { marks2 = m; }
    public int getMarks2() { return marks2; }

    public void setMarks3(int m) { marks3 = m; }
    public int getMarks3() { return marks3; }

    public void setFeePerMonth(float fee) { feePerMonth = fee; }
    public float getFeePerMonth() { return feePerMonth; }

    public void setIsEligibleForScholarship(boolean e) { isEligibleForScholarship = e; }
    public boolean getIsEligibleForScholarship() { return isEligibleForScholarship; }

    public float getAnnualFee() {
        return feePerMonth * 12;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    public String getResult() {
        return (marks1 > 60 && marks2 > 60 && marks3 > 60) ? "pass" : "fail";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setStudentName("Harsh");
        s1.setCity("Bengaluru");
        s1.setMarks1(80);
        s1.setMarks2(90);
        s1.setMarks3(70);
        s1.setFeePerMonth(500);
        s1.setIsEligibleForScholarship(true);
        System.out.println(s1.getAnnualFee());
        System.out.println(s1.getTotalMarks());
        System.out.println(s1.getAverage());
        System.out.println(s1.getResult());
    }
}

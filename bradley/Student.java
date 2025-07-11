package bradley;

public class Student {
    String firstname;
    String lastname;
    int age;
    String gender;
    String idnumber;
    double fees;

    public Student() {
    }

    public Student(String firstname, String lastname, int age, String genger, String idnumber, double fees) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = genger;
        this.idnumber = idnumber;
        this.fees = fees;
    }

    public String getfirstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public int getage() {
        return age;
    }

    public String getgender() {
        return gender;
    }

    public String getidnumber() {
        return idnumber;
    }

    public double getfees() {
        return fees;
    }

    public String toString() {
        return getfirstname() + "\t" +
                getlastname() + "\t" +
                getage() + "\t" +
                getgender() + "\t" +
                getidnumber() + "\t" +
                getfees();

    }
}

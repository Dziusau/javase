public class Student {
    String name;
    String surname;
    String email;
    String form;
    int marksForSeptember[][];

    @Override
    public String toString() {
        return "Name :" + name + "\nSurname : " + surname + "\nEmail : " + email +"\nForm : " + form + "\nMarks for the September : " + marksForSeptember;
    }
}

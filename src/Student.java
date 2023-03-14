public class Student {
    String name ;
    String surname;
    int age ;
    String dateOfBirth;
    public Student(String name, String surname , int age , String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth =dateOfBirth;
        if (age > -10) {
            this.age = age;
        }
    }


    @Override
    public String toString() {
        return "Student: \n" +
                "name: " + name + "\n" +
                "surname: " + surname + "\n" +
                "age=" + age +"\n"+
                "dateOfBirth:  " + dateOfBirth + "\n";
    }
}

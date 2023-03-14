public class Course {
    String name;
    String namber;
    String teachersName ;
    String startDate;
    public Course (String name, String namber ,String teachersName ,String startDate){
        this.name = name;
        this.namber = namber;
        this.teachersName =teachersName ;
        this.startDate =startDate;
    }



    @Override
    public String toString() {
        return "Course: \n" +
                "name: " + name +"\n" +
                "namber: " + namber + "\n" +
                "teachersName: " + teachersName + "\n" +
                "startDate: " + startDate + "\n" ;
    }
}

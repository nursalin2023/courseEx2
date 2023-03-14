public class Main {
    public static void main(String[] args) {
        Course course = new Course( "it.kg" , " 0 555 500 555" , "Azamat Muratov","01,02,2023");
        System.out.println(course);
        Student student = new Student( "nurdolot" ,"mamasabirov", 16 , "19,02,2007");
        Student student1 = new Student( "nurgazi" , " xusanov" ,19 , "14,04,2005");
        Student student2 = new Student( "nurbol" , " malikov" ,-12 , "14,04,2005");
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
    }
}
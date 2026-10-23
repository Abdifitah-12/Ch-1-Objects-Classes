public class Course {
    String code;
    String name;
    int credit;
    String instructor;

    //constructor
    Course(String cCode, String cName,int cCredit, String cInstructor)
    {
        code = cCode; name = cName; credit = cCredit; instructor = cInstructor;
    }

    void printCourse(){
        System.out.println(code + " " + name + "  " + credit + " " + instructor);
    }

}

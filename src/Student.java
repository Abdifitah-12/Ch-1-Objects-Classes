public class Student {
    //data
    int Id;
    String Name;
    String Major;

    //constructor
    Student(int sId, String sName, String sMajor)
    {
        Id = sId; Name = sName; Major = sMajor;
    }
    void printInfo(){
        System.out.println(Id + " - " + Name + "  " + Major );
    }
}


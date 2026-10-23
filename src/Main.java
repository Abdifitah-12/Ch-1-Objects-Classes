//student class MAIN
void main() {
    Student first = new Student(1000, "salah", "CA");
    Student second = new Student(2000, "abdifitah", "CNS");

    //object name . method name (printing)
    first.printInfo();
    second.printInfo();

    //object name . class name (accessing)
    second.Major = " MD"; // change only abdifitah major

    second.printInfo();
}


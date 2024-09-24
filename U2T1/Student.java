package U2T1;
public class Student {
    private String name;
    private int age;
    private String school;

    public Student(String studentName, int studentAge, String studentSchool){
        name = studentName;
        age = studentAge;
        school = studentSchool;
    }

    public void printStudentInfo(){
        System.out.println("Hello my name is " + name + " and I am " + age + " years old. ");
        if (age>18){
            System.out.println("I attend the college " + school);
        } else if ((age<18) && (age>14)){
            System.out.println("I attend the high school " + school);
        }else {
            System.out.println("I attend the public school " + school);
        }
    }
}

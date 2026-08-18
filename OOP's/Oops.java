public class Oops {
static class Student {
    String name;
    int age;
    String sub;
    int roll;
    Student(){
        System.out.println("constructor was called ");
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
        
    }

    Student(String sub){
        this.sub = sub;
    }

    Student(int roll){
        this.roll = roll;
    }
}
    public static void main(String[] darshan){
        Student s1 =new Student();
        Student  s2 = new Student("darshan",21);
        Student s3 = new Student("maths");
        Student s4 = new Student(393);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println("subject name is :"+ s3.sub);
        System.out.println("student roll num is :"+ s4.roll);
    }
  }


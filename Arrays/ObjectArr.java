public class ObjectArr {

    static class Student 
    {
        int rollno;
        String name;
        int marks;
    }
    public static void main(String[] args) 
    {

        // Create an instance of ObjectArr to access the non-static inner class
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Amit";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Shanaya";
        s2.marks = 82;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Alia";
        s3.marks = 87;

        //create an array of Student objects
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;   
        students[2] = s3;

        //print the details of each student using a for loop
        for (int i = 0; i < students.length; i++) 
        {
            System.out.println(students[i].rollno + ". " + students[i].name + " : " + students[i].marks);
        }

        System.out.println("-----------"); //adding space between the 2 outputs
        
        //print the details of each student using an enhanced for loop
        for (Student stud : students) 
        {
            System.out.println(stud.rollno + ". " + stud.name + " : " + stud.marks);
        }
        
    }
}

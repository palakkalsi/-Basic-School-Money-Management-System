import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Siddharth = new Teacher(1,"Siddharath Shekhar",1500);
        Teacher Ruchi = new Teacher(2,"Ruchi Dua",2000);
        Teacher Mukesh = new Teacher(3,"Mukesh Pal", 1600);

        List<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(Siddharth);
        teachersList.add(Ruchi);
        teachersList.add(Mukesh);

        Student Sasha = new Student(1,"Sasha Singh",4);
        Student Rakshit = new Student(2,"Rakshit Vasudev",12);
        Student Rani = new Student(3,"Rani Khan", 5);

        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(Sasha);
        studentsList.add(Rakshit);
        studentsList.add(Rani);

        School RSHS = new School(teachersList,studentsList);


        Sasha.payFees(5000);
        Rakshit.payFees(6000);
        System.out.println(RSHS.getTotalMoneyEarned());

        System.out.println("---Making RSHS pay Salary---");
        Siddharth.receiveSalary(Siddharth.getSalary());
        System.out.println("RSHS has spent for salary to " + Siddharth.getName() + " and now has " + RSHS.getTotalMoneyEarned());

        Ruchi.receiveSalary(Ruchi.getSalary());
        System.out.println("RSHS has spent for salary to " + Ruchi.getName() + " and now has " + RSHS.getTotalMoneyEarned());
        System.out.println(Ruchi);
        System.out.println(Rakshit);




    }
}

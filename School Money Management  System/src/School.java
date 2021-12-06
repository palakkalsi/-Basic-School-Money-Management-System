import java.util.List;

/**
 * The school can have many teachers and many students.
 * Implements teachers and students using an ArrayList.
 */

public class School {

  private List<Teacher> teachers;
  private List<Student> students;
  private static int totalMoneyEarned;
  private static int totalMoneySpent;

    /**
     * New school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher - The teacher to be added.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds student to the school
     * @param student - The student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
      * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds money to the total money earned by the school.
     * @param moneyEarned - money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return total money earned by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money spent by the school, which is the salary
     * given by the school to its teachers.
     * @param moneySpent the money spent by the school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
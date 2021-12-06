public class Teacher {

    /**
     * This class is responsible for keeping track of teacher's id, name and the salary.
     */

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object
      * @param id - Id for the teacher
     * @param name - Name of the teacher
     * @param salary - Salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
      * @return ID of the teacher
     */
   public int getId() {
        return id;
   }

    /**
     *
     * @return name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     * Set the salary
     * @return salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     *
     * @param salary - Changed salary of the teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salary.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher name: " + name + "\nTotal salary earned so far: " + salaryEarned;
    }
}

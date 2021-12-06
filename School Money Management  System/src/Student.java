/*
*  This class is responsible for keeping track of student's ID, Name,
*  Grade, fees paid and total fees.
*/

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /** To create a new student object by initializing its values
     * Fees for every student is $30,000 per year.
     * Fees paid initially is 0.
     * @param id - id of the student - Unique
     * @param name - Name of the student
     * @param grade - Grade in which student is
     */

    public Student(int id,String name,int grade){
      this.feesPaid = 0;
      this.feesTotal = 30_000;
      this.id = id;
      this.name = name;
      this.grade = grade;
    }

    //Not going to alter student's name or ID - SetName/SetId method is not required

    /**
     * Used to update student's grade
     * @param grade - new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to the feesPaid field
     * Add the fees to the fess paid.
     * The school is going to receive the funds.
     * @param fees- fees that the student pays.
     */
    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }


    /**
     *
     * @return Id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\nTotal fees paid so far: " + feesPaid;
    }
}

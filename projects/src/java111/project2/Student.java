/**
* Project 1 Part 1  - Student class file
* Contains blueprint for a student
*
* @author Jared Wesolaski
*/
public class Student {
    /**
    * @param studentName The student's name
    * @param studentID The student's id number - defaults to 9999999
    * @param totalCreditHours The student's total credit hours - defaults to 36
    * @param totalGradePoints The student's total number of grade points - defaults to 100
    */
    private String studentName;
    private int studentID = 9999999;
    private int totalCreditHours = 36;
    private int totalGradePoints = 100;

	/**
	* Returns value of studentName
	* @return studentName
	*/
	public String getStudentName() {
		return studentName;
	}

	/**
	* Sets new value of studentName
	* @param studentName
	*/
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	* Returns value of studentID
	* @return studentID
	*/
	public int getStudentID() {
		return studentID;
	}

	/**
	* Sets new value of studentID
	* @param studentID
	*/
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	/**
	* Returns value of totalCreditHours
	* @return totalCreditHours
	*/
	public int getTotalCreditHours() {
		return totalCreditHours;
	}

	/**
	* Sets new value of totalCreditHours
	* @param totalCreditHours
	*/
	public void setTotalCreditHours(int totalCreditHours) {
		this.totalCreditHours = totalCreditHours;
	}

	/**
	* Returns value of totalGradePoints
	* @return totalGradePoints
	*/
	public int getTotalGradePoints() {
		return totalGradePoints;
	}

	/**
	* Sets new value of totalGradePoints
	* @param totalGradePoints
	*/
	public void setTotalGradePoints(int totalGradePoints) {
		this.totalGradePoints = totalGradePoints;
	}

    /**
    * Method to display the student's gpa using formula: gpa = totalGradePoints / totalCreditHours
    */
    public void displayGPA() {
        System.out.println("Student GPA: " + (getTotalGradePoints() / getTotalCreditHours() ) );
    }
}

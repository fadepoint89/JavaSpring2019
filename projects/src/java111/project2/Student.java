/** Student class that contains all the information for students and pulling their
 *  their information as well as calculating their GPA. 
 *
 *  @author Jared Wesolaski
 */
public class Student {

    /** private String to hold the student's name */
    private String studentName;

        /** return student's name
         *  @return studentName
         */
        public String getStudentName() {
            return studentName;
        }

        /** set student's name
         *  @param newStudentName
         */
        public void setStudentName(String newStudentName) {
            studentName = newStudentName;
        }


    /** private int to hold student's id
     *  (defaults to 9999999)
     */
    private int studentID = 9999999;

        /** return student's id
         *  @return studentID
         */
        public int getStudentID() {
            return studentID;
        }

        /** set student's ID
         * @param newStudentID
         */
        public void setStudentID(int newStudentID) {
            studentID = newStudentID;
        }

    /** private int to hold the student's total credit hours
     *  (defaults to 36)
     */
    private int studentHours = 36;

        /** return student's hours
         *  @return studentHours
         */
        public int getStudentHours() {
            return studentHours;
        }

        /** set student's hours
         *  @param newStudentHours
         */
        public void setStudentHours(int newStudentHours) {
            studentHours = newStudentHours;
        }

    /** private int to hold the student's total number of grade points
     *  (defaults to 100)
     */
    private int studentGradePoints = 100;

        /** return student's grade points
         *  @return studentGradePoints
         */
        public int getStudentGradePoints() {
            return studentGradePoints;
        }

        /** set student's grade points
         *  @param newStudentGradePoints
         */
        public void setStudentGradePoints(int newStudentGradePoints) {
            studentGradePoints = newStudentGradePoints;
        }

    public double calculateGPA() {
        // gpa = grade points / credit hours
        return (double) getStudentGradePoints() / getStudentHours();
    }

    public void display() {
        // Display student's information and calculated GPA
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student Hours: " + getStudentHours());
        System.out.println("studentGradePoints: " + getStudentGradePoints());
        System.out.println("Student GPA: " + calculateGPA());
        System.out.println("");
    }
}

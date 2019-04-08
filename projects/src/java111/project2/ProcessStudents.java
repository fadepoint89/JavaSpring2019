/**
* Class file containing the information and methods to process students
*
* @author Jared Wesolaski
*/
public class ProcessStudents {

    //Create a private instance variable that is a reference to an array of Students.
    Student[] listOfStudents;

    public void createStudents() {
        /** Create an array of three Student object references and assign the
         *  array to the instance variable reference.
         */
        listOfStudents = new Student[3];

        // Instantiate three Student objects and assign them to the elements of the array.
        listOfStudents[0] = new Student();
        listOfStudents[1] = new Student();
        listOfStudents[2] = new Student();

        // First student to have default values but set the name
        listOfStudents[0].setStudentName("Brian Armstrong");

        // Assign values to the second student
        listOfStudents[1].setStudentName("James Calgrove");
        listOfStudents[1].setStudentID(9999888);
        listOfStudents[1].setStudentHours(40);
        listOfStudents[1].setStudentGradePoints(98);

        // Assign values to the third student
        listOfStudents[2].setStudentName("Jessica Smith");
        listOfStudents[2].setStudentID(9999777);
        listOfStudents[2].setStudentHours(30);
        listOfStudents[2].setStudentGradePoints(88);

    }

    public void displayStudents() {
        // Loop through the list of students and display information on them
        for (int counter = 0; counter < listOfStudents.length; counter++) {
            listOfStudents[counter].display();
        }

    }

    // This method will call the two other methods in the class:
    public void runStudentProcessing() {
        //Call the createStudents() method first.
        createStudents();
        //Call the displayStudents() method second.
        displayStudents();
    }

}

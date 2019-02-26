public class EmployeeFactoryTestDrive {

    public static void main(String[] args) {
        EmployeeFactory program = new EmployeeFactory();

        program.setup();
        System.out.println("==While Loop==");
        program.runWhile();
        System.out.println("");
        System.out.println("==For Loop==");
        program.runFor();
    }
}

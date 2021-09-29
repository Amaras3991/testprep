package conditionals;

public class ConditionalsMain {
    public static void main(String[] args) {
        ConditionalExercises exercises = new ConditionalExercises();

        int operand1 = (int) (Math.random() * 10);
        int operand2 = (int) (Math.random() * 10);
        // String operation = "add";
        String operation;
        if (args.length > 0) {
            operation = args[0];
        } else {
            operation = "add";
        }


        double result = exercises.calculator(operand1, operand2, operation);
        System.out.println("Result is: " + result);
        System.out.println();

        int number = (int) (Math.random() * 100);
        exercises.printNumberDescription(number);
    }
}

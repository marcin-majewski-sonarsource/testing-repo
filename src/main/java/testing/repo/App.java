/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testing.repo;

public class App {

    public static final String STATIC_VARIABLE_TEST = "Hello `world1.";
    public static final String NEXT_STATIC_VARIABLE = "TEsssST TEST";

    public String getGreeting() {
        return STATIC_VARIABLE_TEST;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getGreeting());
        System.out.println(NEXT_STATIC_VARIABLE);
    }
}

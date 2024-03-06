import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in C");
        float tempc = input.nextInt();
        float tempf = (tempc * 9/5) + 32;
        System.out.println("the temperature in f is:"+ tempf);
    }
}
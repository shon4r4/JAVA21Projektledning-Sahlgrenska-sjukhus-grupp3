import java.util.Scanner;

public class Avdelning {

    String fac_name;
    void add_faci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("facility:-");
        fac_name = input.nextLine();
    }
    void show_faci()
    {
        System.out.println(fac_name);
    }
}





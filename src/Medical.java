import java.util.Scanner;

public class Medical {

    String med_namn, med_tillv, exp_date;
    int med_kostn, antal;
    void new_medi()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("namn:-");
        med_namn = input.nextLine();
        System.out.print("tillverkare:-");
        med_tillv = input.nextLine();
        System.out.print("utgångsdatum:-");
        exp_date = input.nextLine();
        System.out.print("kostnad:-");
        med_kostn = input.nextInt();
        System.out.print("antal:-");
        antal = input.nextInt();
    }
    void find_medi()
    {
        System.out.println(med_namn + "  \t" + med_tillv + "    \t" + exp_date + "     \t" + med_kostn);
    }
}












import java.util.Scanner;

public class Staff {


    String sid, snamn, betec, kön;
    int lön;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("namn:-");
        snamn = input.nextLine();
        System.out.print("beteckning:-");
        betec = input.nextLine();
        System.out.print("kön:-");
        kön = input.nextLine();
        System.out.print("lön:-");
        lön = input.nextInt();
    }
    void staff_info()
    {
        System.out.println(sid + "\t" + snamn + "\t" + kön + "\t" + lön);
    }
}















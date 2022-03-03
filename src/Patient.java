import java.util.Scanner;

public class Patient {



    String pid, pnamn, sjukdom, kön, inläggning;
    int åldern;
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("namn:-");
        pnamn = input.nextLine();
        System.out.print("sjukdom:-");
        sjukdom = input.nextLine();
        System.out.print("kön:-");
        kön = input.nextLine();
        System.out.print("inläggning:-");
        inläggning = input.nextLine();
        System.out.print("åldern:-");
        åldern = input.nextInt();
    }
    void patient_info()
    {
        System.out.println(pid + "\t" + pnamn + " \t" + sjukdom + "     \t" + kön + "      \t" + inläggning + "\t" + åldern);
    }
}









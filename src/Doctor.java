import java.util.Scanner;

public class Doctor {

    String did, dname, specilist, appoint, doc_qual;
    int droom;
    void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("namn:-");
        dname = input.nextLine();
        System.out.print("specialisering:-");
        specilist = input.nextLine();
        System.out.print("arbetstid:-");
        appoint = input.nextLine();
        System.out.print("kvalifikation:-");
        doc_qual = input.nextLine();
        System.out.print("rum nr.:-");
        droom = input.nextInt();
    }
    void doctor_info()
    {
        System.out.println(did + "\t" + dname + " \t" + specilist + " \t" + appoint + " \t" + doc_qual + " \t" + droom);
    }
}




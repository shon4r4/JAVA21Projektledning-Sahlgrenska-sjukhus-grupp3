import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        String months[] = {
                "Januari",
                "Februari",
                "Mars",
                "Apr",
                "Maj",
                "Juni",
                "Juli",
                "Augusti",
                "September",
                "Oktober",
                "November",
                "December"
        };

        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Välkomen till Salgrenska Sjukhuset***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        Doctor[] d = new Doctor[25];
        Patient[] p = new Patient[100];
        Lab[] l = new Lab[20];
        Avdelning[] f = new Avdelning[20];
        Medical[] m = new Medical[100];
        Staff[] pr = new Staff[100];
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new Doctor();
        for (i = 0; i < 100; i++)
            p[i] = new Patient();
        for (i = 0; i < 20; i++)
            l[i] = new Lab();
        for (i = 0; i < 20; i++)
            f[i] = new Avdelning();
        for (i = 0; i < 100; i++)
            m[i] = new Medical();
        for (i = 0; i < 100; i++)
            pr[i] = new Staff();

        d[0].did = "21";
        d[0].dname = "Lars Andersson";
        d[0].specilist = "Virolog";
        d[0].appoint = "8-20PM";
        d[0].doc_qual = "MD";
        d[0].droom = 17;
        d[1].did = "32";
        d[1].dname = "Dusan Mirkovic";
        d[1].specilist = "Kardiolog";
        d[1].appoint = "8-16PM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;
        d[2].did = "17";
        d[2].dname = "Stina Lind";
        d[2].specilist = "Kirurg";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "MBBS";
        d[2].droom = 8;
        d[3].did = "33";
        d[3].dname = "Stig Larsson";
        d[3].specilist = "Hematolog";
        d[3].appoint = "8-4PM";
        d[3].doc_qual = "MD";
        d[3].droom = 40;

        p[0].pid = "12";
        p[0].pnamn = "Kalle Anka";
        p[0].sjukdom = "Cancer";
        p[0].kön = "Manlig";
        p[0].inläggning = "y";
        p[0].åldern = 30;
        p[1].pid = "13";
        p[1].pnamn = "Joakim von Anka";
        p[1].sjukdom = "Stroke";
        p[1].kön = "Manlig";
        p[1].inläggning = "y";
        p[1].åldern = 23;
        p[2].pid = "14";
        p[2].pnamn = "Janne Långben";
        p[2].sjukdom = "Försämrad allmäntillstånd";
        p[2].kön = "Manlig";
        p[2].inläggning = "y";
        p[2].åldern = 45;
        p[3].pid = "15";
        p[3].pnamn = "Svarte Petter";
        p[3].sjukdom = "Diabetes";
        p[3].kön = "Manlig";
        p[3].inläggning = "y";
        p[3].åldern = 25;

        m[0].med_namn = "Corex";
        m[0].med_tillv = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_kostn = 55;
        m[0].antal = 8;
        m[1].med_namn = "Nytra";
        m[1].med_tillv = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_kostn = 500;
        m[1].antal = 5;
        m[2].med_namn = "Brufa";
        m[2].med_tillv = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_kostn = 50;
        m[2].antal = 56;
        m[3].med_namn = "Pride";
        m[3].med_tillv = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_kostn = 1100;
        m[3].antal = 100;

        l[0].facility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].facility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].facility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].facility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].fac_name = "Ambulance";
        f[1].fac_name = "Admit Facility ";
        f[2].fac_name = "Canteen";
        f[3].fac_name = "Emergency";

        pr[0].sid = "2";
        pr[0].snamn = "Lasse Kvist";
        pr[0].betec = "Hantverkare";
        pr[0].kön = "Manlig";
        pr[0].lön = 25000;
        pr[1].sid = "3";
        pr[1].snamn = "Maja Nilsson";
        pr[1].betec = "Sjuksköterska";
        pr[1].kön = "Kvinlig";
        pr[1].lön = 35000;
        pr[2].sid = "5";
        pr[2].snamn = "Mohammed";
        pr[2].betec = "Local Vårdare";
        pr[2].kön = "Manlig";
        pr[2].lön = 20000;
        pr[3].sid = "76";
        pr[3].snamn = "Felicia Lund";
        pr[3].betec = "Sjuksköterska";
        pr[3].kön = "Kvinlig";
        pr[3].lön = 27000;

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Läkarna  2. Patienter  3.Mediciner  4.laboratorium  5. Avdelningar  6. Personal ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **LÄKARE SEKTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                d[count1].new_doctor();count1++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("  id \t   Namn\t   Specialisering \t   Arbetstid \t   Kvalifikation \t   Rum Nr.");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count1; j++)
                                {
                                    d[j].doctor_info();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SEKTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                p[count2].new_patient();count2++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Namn \t Sjukdom \t Kön \t Inläggning \t Åldern");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count2; j++) {
                                    p[j].patient_info();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3:
                {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINSK SEKTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                m[count3].new_medi();count3++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Namn \t Tillverkare \t Utgångsdatum \t Kostnad");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count3; j++) {
                                    m[j].find_medi();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4:
                {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **LABB SEKTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1)
                    {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                l[count4].new_faci();count4++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Facilities\t\t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count4; j++) {
                                    l[j].faci_list();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }
                case 5:
                {
                    s5 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          **AVDELNINGAR**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s5 == 1)
                    {
                        System.out.println("1.Add New Facility\n2.Existing Facilities List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                f[count5].add_faci();count5++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Hospital  Facility are:");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count5; j++) {
                                    f[j].show_faci();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                }
                case 6:
                {
                    s6 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **PERSONAL**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s6 == 1)
                    {
                        String a = "nurse", b = "worker", c = "security";
                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                pr[count6].new_staff();count6++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Id \t Namn \t Kön \t Lön");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++)
                                {
                                    if (a.equals(pr[j].betec))
                                        pr[j].staff_info();
                                }
                                break;
                            }
                            case 3:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Id \t Namn \t Kön \t Lön");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++)
                                {
                                    if (b.equals(pr[j].betec))
                                        pr[j].staff_info();
                                }
                                break;
                            }
                            case 4:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Id \t Namn \t Kön \t Lön");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++)
                                {
                                    if (c.equals(pr[j].betec))
                                        pr[j].staff_info();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
                default:
                {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}







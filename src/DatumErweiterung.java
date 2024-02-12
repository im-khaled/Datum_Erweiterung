import java.util.Scanner;

public class DatumErweiterung {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jahr, monat, tag, stunde, minute, add,summe; 

        jahr = sc.nextInt();
        monat = sc.nextInt();
        tag = sc.nextInt();
        stunde = sc.nextInt();
        minute = sc.nextInt();
        add = sc.nextInt();
        summe = (minute+add);
        if (!(1600 <= jahr) || !(jahr <= 3000)) {
        	
        	System.out.println("Jahreszahl ist Ungueltig!");
        	System.exit(1);
        	        	
        }
        if (!(1 <= monat) || !(monat <= 12)) {
        	
        	System.out.println("Monatszahl ist Ungueltig!");
        	System.exit(1);
        	        	
        }
        if (!(1 <= tag) || !(tag <= 31)) {
        	
        	System.out.println("Tageszahl ist Ungueltig!");
        	System.exit(1);
        	        	
        }
        if (!(0 <= stunde) || !(stunde <= 23)) {
        	
        	System.out.println("Stundenzahl ist Ungueltig!");
        	System.exit(1);
        	        	
        }
        if (!(0 <= minute) || !(minute <= 59)) {
        	
        	System.out.println("Minutenzahl ist Ungueltig!");
        	System.exit(1);
        	        	
        }
        if (!(0 <= add) || !(add <= 40000)) {
        	
        	System.out.println("Addierende Zahl ist Ungueltig!");
        	System.exit(1);
        	        	
        }
                   
         if (summe <60)
            minute = (minute + add);

              	
         if (summe >= 60) {
            minute = summe % 60;
            stunde = stunde + (summe/60);
            
        }
        if (stunde > 23)
        {
        	tag = tag + (stunde/24);
        	stunde = stunde % 24;
            
        
        }  
        
        switch (monat)
        {
            case 1:
            		if (tag > 31)
            		{
            			monat = monat + (tag/31);	
            			tag = tag % 31;
                
            		}
            		break;
            case 2:
            		if (tag > 28)
            		{
            			monat = monat + (tag/28);	
            			tag = tag % 28;
                
            		}
            		break;
            case 3:
            		if (tag > 31)
            		{
            			monat = monat + (tag/31);	
            			tag = tag % 31;
            		}
            		break;
            case 4:
            		if (tag > 30)
            		{
            			monat = monat + (tag/30);	
            			tag = tag % 30;
            		}
            		break;
            case 5:
            		if (tag > 31)
            		{
            			monat = monat + (tag/31);	
            			tag = tag % 31;
            		}
            		break;
            case 6:
            		if (tag > 30)
            		{
            			monat = monat + (tag/30);	
            			tag = tag % 30;
            		}
            		break;
            case 7:
            		if (tag > 31)
            		{
            			monat = monat + (tag/31);	
            			tag = tag % 31;
            		}
            		break;
            case 8:
            		if (tag > 31)
            		{
            			monat = monat + (tag/31);	
            			tag = tag % 31;
            		}
        		break;
            case 9:
            		if (tag > 30)
            		{
            			monat = monat + (tag/30);	
            			tag = tag % 30;
            		}
            		break;
            case 10:
            		if (tag > 31)
            		{
            		monat = monat + (tag/31);	
        			tag = tag % 31;
                    
            		}
            		break;
            case 11:
            		if (tag > 30)
            		{
            			monat = monat + (tag/30);	
            			tag = tag % 30;
            		}
            		break;
            case 12:
                	if (tag > 31)
                	{
                		monat = monat + (tag/31);	
            			tag = tag % 31;
                	}
                	break;
        }
        if (monat > 12)
        {
        	jahr = jahr + (monat/12);	
			monat = monat % 12;
        }
        sc.close();
        System.out.println(jahr + " " + monat + " " + tag + " " + stunde + " " + minute);
    }

}

import java.util.Scanner;


public class PatikaDevCinZodyagı {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the BirthYear :");
        int year=scan.nextInt();
        
        if(year%12==0){
            System.out.println("Cin Zodyagı Burcunuz Maymun");
        }
        else if(year%12==1){
            System.out.println("Cin Zodyagı Burcunuz Horoz");
        }
        else if(year%12==2){
            System.out.println("Cin Zodyagı Burcunuz Köpek");
        }
        else if(year%12==3){
            System.out.println("Cin Zodyagı Burcunuz Domuz");
        }
        else if(year%12==4){
            System.out.println("Cin Zodyagı Burcunuz Fare");
        }
        else if(year%12==5){
            System.out.println("Cin Zodyagı Burcunuz Öküz");
        }
        else if(year%12==6){
            System.out.println("Cin Zodyagı Burcunuz Kaplan");
        }
        else if(year%12==7){
            System.out.println("Cin Zodyagı Burcunuz Tavşan");
        }
        else if(year%12==8){
            System.out.println("Cin Zodyagı Burcunuz Ejderha");
        }
        else if(year%12==9){
            System.out.println("Cin Zodyagı Burcunuz Yılan");
        }
        else if(year%12==10){
            System.out.println("Cin Zodyagı Burcunuz At");
        }
        else if(year%12==11){
            System.out.println("Cin Zodyagı Burcunuz Koyun");
        }
        else {
            
        }
        
        
    }
}

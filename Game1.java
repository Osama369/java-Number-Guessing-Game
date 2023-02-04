import java.util.*;

//import javax.naming.ldap.Rdn;
public class Game1 {
      
    // using rnadom class to create rndom numbers 
   
    // funda is that k if player guess number is matched with any number of the given from random number 
    // range its return true otherwise fasle
    
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
         Random rnd= new Random();
        int rnadomNumbers= rnd.nextInt(10);
     // this is random numbers 
       
         int guess;

         do{
              
            System.out.println("guess your numbe");
            guess= input.nextInt();
                if (guess==rnadomNumbers) {
                      
                    System.out.println("won");
                }
                else
                System.out.println("try again");
                System.out.println("lucky number is :"+rnadomNumbers);
         }while(guess!=rnadomNumbers);
      
         

    }
}

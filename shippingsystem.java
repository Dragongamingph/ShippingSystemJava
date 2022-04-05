////////////////////////////////
// SHIPPING SYSTEM in JAVA    //
// WRITTER : Rafael Rodriguez //
////////////////////////////////
/////////////////////////////////////////
// Leader : Kyzzle Zyann Abalayan      //
// Members : Rafael Rodriguez          //
//           Kobie adorza              //
//           Cha Agarano               //
//           Justin Go                 //
//           Ian Curt Pascual          //
//           Camille Pugado            //       
//           Cade Palamos              //
//           Mark Christian Patagoc    //
//           Charice Pearl Fortes      //
/////////////////////////////////////////

// import a java package
import java.util.*;
import java.util.Scanner;

public class shippingsystem {
  // heres the data types and variable that we need in our system.
  public static Scanner input = new Scanner(System.in);
  public static double weight, courierCharge, distance ;
  public static String name, name2, city, address, yn;
  
  // again method for the loop of the program
  // if the user press Y it will automaticaly execute the extra() and title() method to make the another shipping history.if the user press N the system will closed it self.
  // here's the example >
  public static void again(){
      System.out.print("\nDo you want to ship again? [Y/N] : ");
      yn = input.next();
      if (yn.equalsIgnoreCase("Y")){
          title();
          extra();
      }
      else if(yn.equalsIgnoreCase("N")){
          System.out.println("Thankyou for using our system");
          System.exit(0);
      }
      else{
          System.out.println("Type Y or N only");
          again();
      }
  }
  
  // extra method, the used of this method is to get the information about the user like Name , City , Adress etc.
  // and if the user keep it blank any of the following input or forms.it will display an error. so the user need to fillup all those.
  // and if the user fill up all those form it will automaticaly go to the main function.. 
  
  public static void extra(){
    System.out.println(" Before we proceed you need to fillup this form\n");
    System.out.print("Enter your name : ");
    name = input.nextLine();
    System.out.print("Enter the reciever name : ");
    name2 = input.nextLine();
    System.out.print("City : ");
    city = input.nextLine();
    System.out.print("Full address : ");
    address = input.nextLine();
    
    if (name.equals("") && name2.equals(name2) && city.equals(city) && address.equals(address)){
      System.out.println("missing name");
      extra();
    }
    else if (name.equals(name) && name2.equals("") && city.equals(city) && address.equals(address)){
      System.out.println("missing reciever name");
      extra();
    }
    else if (name.equals(name) && name2.equals(name2) && city.equals("") && address.equals(address)){
      System.out.println("missing city");
      extra();
    }
    else if (name.equals(name) && name2.equals(name2) && city.equals(city) && address.equals("")){
      System.out.println("missing address");
      extra();
    }
    else if (name.equals("") && name2.equals("") && city.equals("") && address.equals("")){
      System.out.println("fillup the form");
      extra();
    }
    else{
        function(); // execute the main function
    }
    
  }
  
   // here's the main title of the program
  public static void title(){
  
    System.out.println("\n   ##    #  #    ###    ##   ##     ###   ###    ##  ");
    System.out.println(" #       #  #     #     #  # #  #    #   #   #  #    ");
    System.out.println("   #     # ##     #     ##   ##      #   #   #  #  #  ");
    System.out.println("     #   #  #     #     #    #       #   #   #  #   #  ");
    System.out.println("  ##     #  #    ###    #    #      ###  #   #  # #  ");
    System.out.println("         ——————————————————————————————");
    System.out.println("     •     S    Y    S    T    E    M    •");  
    System.out.println("         ——————————————————————————————\n");
  }
 
   // MAIN FUNCTION OF THE PROGRAM
   // in this function you need also provide the KG of the parcel or package and the distance KM .to calculate the Courier Charges or Shipping Fees.
   
  public static void function(){
    System.out.print("Enter the weight of the package/parcel ( kg ) : ");
    weight = input.nextDouble();
    System.out.print("Enter the Distance ( km ) : ");
    distance = input.nextDouble();
    if ( weight <= 5){
      courierCharge = 6;
    }
    else{
       weight = weight - 5;
       courierCharge = (double)(6 + (weight*1.2));
    }
    if(distance<=6)
         courierCharge = courierCharge + (double)4.2;
      else
      {
         distance = distance - 6;
         courierCharge = courierCharge + ((double)(4.2 + (distance*1.4)));
      }
      System.out.println("\nThe Courier Charge is : PHP " + courierCharge);
      again(); // execute again method after the courier charge Displayed.
  }
  
  public static void main(String[] args) {
   // execute the title and extra method
   title(); 
   extra();
  }
}

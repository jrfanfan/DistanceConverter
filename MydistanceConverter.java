// import the Scanner class 
import java.util.Scanner; 

// Create a class to convert Kilometers to Miles.
class KmToMiles {
  private Double kilometers;
  protected Double miles;

  public void  setKilometers( Double newKilometers) {
    this.kilometers = newKilometers;
  }
  
  public Double getMiles() {
    return kilometers * 0.62137119;
  }  
}
// Create a class that inherit the class KmToMiles that converts Miles to kilometers.
class MilesToKm extends KmToMiles {

  public void setMiles(Double newMiles) {
    this.miles = newMiles;
  }

  public Double getKilometers() {
    return miles * 1.6093;
  }


}
public class MydistanceConverter {
  
  static void display() {
    // Create a Scanner object
    Scanner ObjInput = new Scanner(System.in);  
    // Create a KmToMile object
    KmToMiles ObjKmToMiles = new KmToMiles();  
    // Create a MilesToKm object
    MilesToKm ObjMilesToKm = new MilesToKm(); 
    // Explain how does a choice between "Km" and "Miles".
    String choiceToCon = "\nEnter the choice of conversion (Either \'Km\' to Miles or \'Miles\' to Kilometers):";
    System.out.println(choiceToCon);
    String inputString;
    //The user input choice.
    inputString = ObjInput.nextLine();
    // Use the switch statement.
    switch(inputString) {
      case "Km" :
        System.out.println("Enter the Kilometers to convert in Miles please!:");
        Double kilometers;
        kilometers = ObjInput.nextDouble();
        // Use the object to call the public method from the class Km to Miles to Set the value of the kilometers variable.
        ObjKmToMiles.setKilometers(kilometers);
        // Create a double variable to store the getMiles from the class Km to Miles
        Double result = ObjKmToMiles.getMiles();
        // Output the result.
        System.out.println("Therefore, " + kilometers + " kilometers to miles is " + result + ".\n");
        break;
      case "Miles":
        System.out.println("Enter the Miles to convert in Kilometers please!:");
        Double miles;
        miles = ObjInput.nextDouble();
        // Use the object to call the public method setMiles from the class Miles to Kilometers to Set the value of the miles variable.
        ObjMilesToKm.setMiles(miles);
         // Create a double results variable to store the getMiles from the class Miles to Kilometers.
        Double results = ObjMilesToKm.getKilometers();
        // Output the result.
        System.out.println("Therefore, " + miles + " miles to kilometers is " + results + ".\n"); 
        break;
      default:
        System.out.println("oops!");
    }
  }
  
  public static void main(String[] args) {
    //Create a object for the user input
    final Scanner ObjScanner = new Scanner(System.in);
    // Output explain
    String head = "\nThe task is to convert kilometers to miles\n \rand vice versa according to the choice given by the user."; 
    System.out.println(head);
    // Call the method
    display();
    // Create a bool variable to controle the while loop.
    Boolean x = true;
    // Create a while loop.
    while(x == true) {      
      System.out.println("Do you want to continue (yes\\no).");
      //User input
      String repeat;
      repeat = ObjScanner.nextLine();
      // A switch to control the repeat
      switch(repeat) {
        case "yes":
          display();
          break;
        case "no":
          System.out.println("Thank you for taking the time to use it.");
          x = false;    
      }    
    }  
  } 
}
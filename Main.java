import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int userNum = 1;
    int userBase;
    Scanner input = new Scanner(System.in);
    
    

    
    while(userNum != 0)//while the user does not input 0, the code will repeatedly ask for a new number 
      {
        System.out.println("\n");//Starts each iteration of the num as 

        System.out.print("Please enter a number in base 10 (0 to quit): ");
        userNum = input.nextInt();

        while(userNum < 0)
          {
            System.out.print("Your inputted number is invalid. Please input a new one: ");
            userNum = input.nextInt();
          }
        if(userNum == 0)
        {
          break;
        }
        
        System.out.print("Please enter a base (2-16) (in case you forgot to quit previously enter 0 here to quit): ");
        userBase = input.nextInt();
        
        while(userBase < 2 || userBase > 16)
        {
          System.out.print("Your inputted base is invalid. Please input a new one: ");
          userBase = input.nextInt();
        }
    
        if(userBase == 0)
        {
          break;
        }

        System.out.println("The number converted to given base is: " + changeBase(userNum, userBase));
        
      }

    
  }

  public static String changeBase(int iNum, int iBase) {

    if(iNum / iBase == 0)
    {
      return Integer.toHexString(iNum % iBase).toUpperCase();
    }
    else
    {
      return changeBase(iNum / iBase, iBase) + Integer.toHexString(iNum % iBase).toUpperCase(); 
    }
    
    
  }
}



/*

*/
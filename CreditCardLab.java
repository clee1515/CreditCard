//Connor Lee 
//Sort of different from my psudocode. I got help from others because my first method was too confusing.  
public class CreditCardLab
{
  public boolean verify(String num)
  {
    int oddNumTotal = 0;
    int evenNumTotal = 0;
    int cardNumTotal = 0;
    
    for (int odd = num.length()-1; odd >= 0; odd -=2)//This for loop makes a substring of the numbers in every odd element within the array, starting with the last number.
    {//Collects the numbers from every other element. 
      int oddNum = Integer.parseInt(num.substring( odd, odd + 1));//This parse changes the substring into an int 
      oddNumTotal += oddNum;
    }
    
    for (int even = num.length()-2; even >= 0; even -=2)//Starts on the second to last number this time. Takes the even elements in the index.
    {
      int firstStep = Integer.parseInt(num.substring( even, even + 1));
      int secondStep = firstStep * 2;//Multiplies firstStep by 2
      int evenNum = 0;
      if (secondStep >= 10)//If the value of secondStep is greater or equal to 10, evenNum will be secondStep modulus divided by 10 plus 1.
      { 
        evenNum = 1 + secondStep % 10;
      }
      else evenNum = secondStep;//If value of second step isnt greater than 10, evenNum will take its value. 
      evenNumTotal += evenNum;
    }
    cardNumTotal = oddNumTotal + evenNumTotal;//The cardNumTotal wil become oddNumTotal plus evenNumTotal
    if (cardNumTotal % 10 == 0)
    {
      return true; //If cardNumTotal divided by modulus 10 is zero, it returns true. 
    }
    else 
    {
      return false;//If not, it returns false. 
    }
    private String[] Diners = {"36", "38", "301", "302", "303", "304", "305"};
    
    public int findType(String num)
    {
      
      if (num.substring(0, 2).equals("51") ||
          num.substring(0, 2).equals("52") ||
          num.substring(0, 2).equals("53") ||
          num.substring(0, 2).equals("54") ||
          num.substring(0, 2).equals("55"))
        return 1;//If the first two numbers are 51-55, they are a validatated credit card. Returns 1 for Mastercard
      
      else if (num.substring(0, 1).equals("4"))
        return 2;//If the first number is a 4, it is a validated credit card. Returns 2 for Visa
      
      else if (num.substring(0, 2).equals("34") ||
               num.substring(0, 2).equals("37"))
        return 3;//If first 2 numbers are 34 or 37, it is a validated credit card. Returns 3 for American Express
      
      else if (num.substring(0, 4).equals("6011"))
        return 4;//If first 4 numbers are 6011, it is a validated credit card. Returns 4 for Discover. 
      
      else if (num.substring(0,2).equals("36") || 
               num.substring(0,2).equals("38")) 
        return 5;//If first 2 numbers are 36 or 38, it is a validated credit card. Returns 5 for Carte Blanch/Diners
      
      else 
        return 0
    }
  }
}



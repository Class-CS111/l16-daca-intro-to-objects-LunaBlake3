/********************************************
*	DEVELOPER:	Blake Luna-Beltran
*	LAST MODIFIED:	20240408
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
 

    DACArecipient test1 = new DACArecipient();
    DACArecipient test2 = new DACArecipient();

 
    test1.setSurname("Luna");
    test1.setGivenName("Blake");
    test1.setCountryOfOrigin("USA");
    test1.setUscisNumber("12-3-456");
    test1.setBirthday(123456);
    test1.setValidFromDate(234567);
    test1.setExpirationDate(345678);
    test1.setSex('M');

    test2.setAll("Mendez", "Javier", "56-3-445", 
    "Venezuela", 2451564, 3956753, 3956840, 'M');

    System.out.println("-----------------------------------------------------------");
    
    System.out.println("Test surname = " + test1.getSurname());
    System.out.println("Test given name = " + test1.getGivenName());
    System.out.println("Test uscis number = " + test1.getUscisNumber());
    System.out.println("Test country of origin = " + test1.getCountryOfOrigin());
    System.out.println("Test birthday = " + test1.getBirthday());
    System.out.println("Test valid Date = " + test1.getValidFromDate());
    System.out.println("Test expiration date = " + test1.getExpirationDate());
    System.out.println("Test sex = " + test1.getSex());
    
    System.out.println("-----------------------------------------------------------");
    
    System.out.println("Test surname = " + test2.getSurname());
    System.out.println("Test given name = " + test2.getGivenName());
    System.out.println("Test uscis number = " + test2.getUscisNumber());
    System.out.println("Test country of origin = " + test2.getCountryOfOrigin());
    System.out.println("Test birthday = " + test2.getBirthday());
    System.out.println("Test valid Date = " + test2.getValidFromDate());
    System.out.println("Test expiration date = " + test2.getExpirationDate());
    System.out.println("Test sex = " + test2.getSex());

    System.out.println("-----------------------------------------------------------");
    
  }
}
/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * @author Blake Luna-Beltran
 *
 *	@version 1.0
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
DACA Recipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate: int
- sex: char
-----------------------------------------
+ getSurname() : String
+ getGivenName() :String
+ getUscisNumber() : String
+ getCountryOfOrigin() :String
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char

+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrign : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void

+ setAll( surname : String, givenName : String, uscisNumber : String,
 countryOfOrigin : String,  birthday : int, validFromDate : int,
  expirationDate: int, sex: char) : void

-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	
	public String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday, validFromDate, expirationDate;
	private char sex;

	/***** ACCESSORS *****/
	
	public String getSurname(){
		return this.surname;
	}
	public String getGivenName(){
		return this.givenName;
	}
	public String getUscisNumber(){
		return this.uscisNumber;
	}
	public String getCountryOfOrigin(){
		return this.countryOfOrigin;
	}
	public int getBirthday(){
		return this.birthday;
	}
	public int getValidFromDate(){
		return this.validFromDate;
	}
	public int getExpirationDate(){
		return this.expirationDate;
	}
	public char getSex(){
		return this.sex;
	}
	
	/***** MUTATORS *****/
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.
	/*
	 * sets surname to parameter value of calling object
	 * 
	 * @param surname String representhing last name, assume it exists and is valid
	 */

	public void setSurname(String surname){
		this.surname = surname;
	}
	/*
	 * sets given name to parameter value of calling object
	 * 
	 * @param givenName String representhing first name, assume it exists and is valid
	 */
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}
	/*
	 * sets uscis # to parameter value of calling object
	 * 
	 * @param uscisNumber String representhing uscis #, assume it exists and is valid
	 */
	public void setUscisNumber(String uscisNumber){
		this.uscisNumber = uscisNumber;
	}
	/*
	 * sets country of origin to parameter value of calling object
	 * 
	 * @param countryOfOrigin String representhing country of origin, assume it exists and is valid
	 */
	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	/*
	 * sets birthday to parameter value of calling object
	 * 
	 * @param birthday int representhing birthday, assume it exists and is valid
	 */
	public void setBirthday(int birthday){
		this.birthday = birthday;
	}
	/*
	 * sets valid date to parameter value of calling object
	 * 
	 * @param validFromDate int representhing valid date, assume it exists and is valid
	 */
	public void setValidFromDate(int validFromDate){
		this.validFromDate = validFromDate;
	}
	/*
	 * sets expiration date to parameter value of calling object
	 * 
	 * @param expirationDate int representhing expiration date, assume it exists and is valid
	 */
	public void setExpirationDate(int expirationDate){
		this.expirationDate = expirationDate;
	}
	/*
	 * sets sex to parameter value of calling object
	 * 
	 * @param sex char representhing sex, assume it exists and is valid
	 */
	public void setSex(char sex){
		this.sex = sex;
	}

	//+ setAll( surname : String, givenName : String, uscisNumber : String,
 	// countryOfOrigin : String,  birthday : int, validFromDate : int,
  	// expirationDate: int, sex: char) : void
	/**
	 * 
	 * @param surname String representhing surname, assume it exists and is valid
	 * @param giveName String representhing given name, assume it exists and is valid
	 * @param uscisNumber String representhing uscis #, assume it exists and is valid
	 * @param countryOfOrigin String representhing country of origin, assume it exists and is valid
	 * @param birthday int representhing birthday, assume it exists and is valid
	 * @param validFromDate int representhing valid  date, assume it exists and is valid
	 * @param expirationDate int representhing expiration date, assume it exists and is valid
	 * @param sex char representhing sex, assume it exists and is valid
	 */
	public void setAll(String surname, String giveName, String uscisNumber, String countryOfOrigin,
	 int birthday, int validFromDate, int expirationDate, char sex){
		this.setSurname(surname);
		this.setGivenName(giveName);
		this.setUscisNumber(uscisNumber);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setBirthday(birthday);
		this.setValidFromDate(validFromDate);
		this.setExpirationDate(expirationDate);
		this.setSex(sex);
	}


}
// public class PersonAddress {

// 	public String getFirstName()
// public String getLastName()
// public String getEmailAddress()
// public String getPhoneNumber()
// public void updateEmail(String newEmail)
// public void updatePhone(String newPhone)
// public boolean equal(PersonAddress otherPerson)

// b)
// public String getFirstName()
// Precondition: none.
// Postcondition: The first name was returned.

// public String getLastName()
// Precondition: none.
// Postcondition: The last name was returned.

// public String getEmailAddress()
// Precondition: none.
// Postcondition: The email address was returned.

// public String getPhoneNumber()
// Precondition: none.
// Postcondition: The phone number was returned.


// public void updateEmail(String newEmail)
// Precondition: none.
// Postcondition: The email address was changed to newEmail.


// public void updatePhone(String newPhone)
// Precondition: none.
// Postcondition: The phone number was changed to newPhone.

// public boolean equal(PersonAddress otherPerson)
// Precondition: otherPerson is not null.
// Postcondition: True was returned if the first and last names match
public class PersonAddress {
     
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	
	public void initialize(String fName, String lName, String email, String phone) {
			firstName = fName;
			lastName = lName;
			emailAddress = email;
			phoneNumber = phone;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getEmailAddress(){
		return emailAddress;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setEmail(String newEmail){
			emailAddress = newEmail;
	}
	
	public void setPhone(String newPhone){
			phoneNumber = newPhone;
	}
	
	public boolean equal(PersonAddress otherPerson){
			return lastName.equals(otherPerson.lastName) &&
							firstName.equals(otherPerson.firstName);
	}
	
	
  /**
    * @param args the command line arguments
  */
  public static void main(String[] args) {
        
    PersonAddress person1 = new PersonAddress();
    PersonAddress person2 = new PersonAddress();
    PersonAddress person3 = new PersonAddress();
    person1.initialize("Samuel", "Tumdedo", "stumdedo@icloud.com", "855-3490");
    person2.initialize("Jane", "Ford", "jford@yahoo.com", "568-5546");
    person3.initialize("Mulat", "Ayana", "mayana@gmail.com", "577-9421");
        
    System.out.println("Access the attributes or behaviors of person 1.");
    System.out.println(" NAME: " + person1.getFirstName()
    + " " + person1.getLastName()
    + " EMAIL: " + person1.getEmailAddress()
    + " PHONE: " + person1.getPhoneNumber() );
    System.out.println();
        
    System.out.println("person 1 should be equal to person 2");
    System.out.println(person1.equal(person2));
    System.out.println();
        
    System.out.println("person 2 should not be equal to person 3");
    System.out.println(person2.equal(person3));
    System.out.println();
        
    System.out.println("Update the email of person 1 to \"gmail@icloud.com\"");
    person1.setEmail("gmail@icloud.com");
    System.out.println("Update the phone of person 1 to \"589-1321\"");
    person1.setPhone("589-1321");
    System.out.println(" NAME: " + person1.getFirstName()
    + " " + person1.getLastName()
    + " EMAIL: " + person1.getEmailAddress()
    + " PHONE: " + person1.getPhoneNumber());
    System.out.println();
  }

	
}

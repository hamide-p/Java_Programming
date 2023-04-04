package java_selfpractice.day18_practices;

public class Contact {

    /*
    Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
     */


    public String name;

    public String email;
    public int phoneNumber;


    public void setInfo(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void call() {
        System.out.println("Calling " + name + " now");
        return;
    }
 ;


    public void sendMessage() {
        System.out.println("sending message to " + phoneNumber + " now");
        return;
    }


        public void sendEmail () {
            System.out.println("sending email to " + email + " now");
            return;
        }


    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

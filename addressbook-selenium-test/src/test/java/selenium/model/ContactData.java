package selenium.model;

public class ContactData {
    private String firstName;
    private String lastName;


//    public ContactData(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    public ContactData withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactData withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}


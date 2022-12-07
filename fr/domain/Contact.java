package efrei.fr.domain;


import java.io.Serializable;

public class Contact implements Serializable {
    private String contactCellPhoneNumber;
    private String contactEmail;
    private String contactHomeNumber;

    private Contact(Builder builder){
        this.contactCellPhoneNumber = builder.contactCellPhoneNumber;
        this.contactEmail = builder.contactEmail;
        this.contactHomeNumber = builder.contactHomeNumber;
    }

    public Contact(String contactCellPhoneNumber, String contactEmail, String contactHomeNumber) {
        this.contactCellPhoneNumber = contactCellPhoneNumber;
        this.contactEmail = contactEmail;
        this.contactHomeNumber = contactHomeNumber;
    }

    public Contact(String contactCellPhoneNumber) {
        this.contactCellPhoneNumber = contactCellPhoneNumber;
    }

    public Contact(String contactCellPhoneNumber, String contactEmail) {
        this.contactCellPhoneNumber = contactCellPhoneNumber;
        this.contactEmail = contactEmail;
    }


    public String getContactCellPhoneNumber() {
        return contactCellPhoneNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactHomeNumber() {
        return contactHomeNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactCellPhoneNumber='" + contactCellPhoneNumber + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactHomeNumber='" + contactHomeNumber + '\'' +
                '}' +"\n";
    }


    public static class Builder{
        private String contactCellPhoneNumber;
        private String contactEmail;
        private String contactHomeNumber;

        public Builder setContactCellPhoneNumber(String contactCellPhoneNumber) {
            this.contactCellPhoneNumber = contactCellPhoneNumber;
            return this;
        }

        public Builder setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public Builder setContactHomeNumber(String contactHomeNumber) {
            this.contactHomeNumber = contactHomeNumber;
            return this;
        }


        public Contact build(){
            return new Contact(this);
        }
    }
}

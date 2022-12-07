package efrei.fr.domain;


import java.io.Serializable;
public class Address implements Serializable {

    private String addressStreet;
    private String addressPostal;

    private Address(Builder builder){
        this.addressStreet = builder.addressStreet;
        this.addressPostal = builder.addressPostal;
    }

    private Address(String addressStreet, String addressPostal){
        this.addressStreet = addressStreet;
        this.addressPostal = addressPostal;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressPostal() {
        return addressPostal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressStreet='" + addressStreet + '\'' +
                ", addressPostal='" + addressPostal + '\'' +
                '}' + "\n";
    }


    public static class Builder{
        private String addressStreet;
        private String addressPostal;

        public Builder setaddressStreet(String addressStreet){
            this.addressStreet = addressStreet;
            return this;
        }

        public Builder setaddressPostal(String addressPostal){
            this.addressPostal = addressPostal;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}

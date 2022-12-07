package efrei.fr.domain;

public class Identities {

    private String identitiesType;
    private String identitiesValue;

    private Identities(Builder builder){
        this.identitiesType = builder.identitiesType;
        this.identitiesValue = builder.identitiesValue;
    }

    public Identities(String identitiesType, String identitiesValue) {
        this.identitiesType = identitiesType;
        this.identitiesValue = identitiesValue;
    }

    public String getIdentitiesType() {
        return identitiesType;
    }

    public String getIdentitiesValue() {
        return identitiesValue;
    }


    @Override
    public String toString() {
        return "Identities{" +
                "identitiesType='" + identitiesType + '\'' +
                ", identitiesValue='" + identitiesValue + '\'' +
                '}';
    }

    public static class Builder{
        private String identitiesType;
        private String identitiesValue;

        public Builder setIdentitiesType(String identitiesType) {
            this.identitiesType = identitiesType;
            return this;
        }

        public Builder setIdentitiesValue(String identitiesValue) {
            this.identitiesValue = identitiesValue;
            return this;
        }

        public Identities build(){
            return new Identities(this);
        }


    }
}

package efrei.fr.domain;

import java.io.Serializable;

public class Gender implements Serializable
{
    private String id;
    private String description;

    private Gender()
    {
    }

    private Gender(Builder builder)
    {
        this.id = builder.id;
        this.description = builder.description;
    }


    public String getId()
    {
        return id;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}' + "\n";
    }

    public static class Builder
    {
        private String id;
        private String description;

        public Builder setId(String id)
        {
            this.id = id;
            return this;
        }

        public Builder setDescription(String description)
        {
            this.description = description;
            return this;
        }
        public Builder copy(Gender gender)
        {
            this.id = gender.id;
            this.description=gender.description;
            return this;
        }

        public Gender build()
        {
            return new Gender(this);
        }
    }
}

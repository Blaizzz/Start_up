package efrei.fr.domain;

import java.io.Serializable;

public class Position implements Serializable
{
    private String positionid;
    private String positionStatus;
    private String description;

    private Position(Builder builder)
    {
        this.positionid = builder.positionid;
        this.positionStatus = builder.positionStatus;
        this.description = builder.description;
    }

    private Position()
    {
    }



    public String getPositionid() {
        return positionid;
    }

    public String getPositionStatus() {
        return positionStatus;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Position{" +
                ", positionStatus='" + positionStatus + '\'' +
                ", description='" + description + '\'' +
                '}' + "\n";
    }


    public static class Builder
    {
        private String positionid;
        private String positionStatus;
        private String description;

        public Builder setPositionid(String positionid) {
            this.positionid = positionid;
            return this;
        }

        public Builder setPositionStatus(String positionStatus) {
            this.positionStatus = positionStatus;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Position position)
        {
            this.positionid = position.positionid;
            this.description=position.description;
            this.positionStatus=position.positionStatus;
            return this;
        }

        public Position build()
        {
            return new Position(this);
        }


    }
}


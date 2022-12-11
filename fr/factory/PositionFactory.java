package efrei.fr.factory;

import efrei.fr.domain.Position;
import efrei.fr.util.Helper;

public class PositionFactory {

            public static Position createPosition(String description)
        {
            String id = Helper.generateId();

            if (Helper.isNullOrEmpty(description))
            {
                return null;
            }
            Position position = new Position.Builder().setPositionid(id).setDescription(description).setPositionStatus("CLOSED").build();
            return position;
        }
    }


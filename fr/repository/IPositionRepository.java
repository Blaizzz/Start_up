package efrei.fr.repository;

import efrei.fr.domain.Position;

import java.util.*;

public interface IPositionRepository extends IRepository<Position,String>
{
    // create,read,update,delete

    public List<Position> getAll();

}

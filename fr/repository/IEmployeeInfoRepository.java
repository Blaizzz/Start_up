package efrei.fr.repository;

import efrei.fr.domain.EmployeeInfo;

import java.util.*;

public interface IEmployeeInfoRepository extends IRepository<EmployeeInfo,String>
{
    // create,read,update,delete

    public List<EmployeeInfo> getAll();

}

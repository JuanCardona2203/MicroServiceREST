package ProjectUsersMicroservice.MicroserviceREST.services;
import ProjectUsersMicroservice.MicroserviceREST.model.data.User;
import java.util.List;

public interface IUserService {
    User create(User user );

    User findById(String id );

    List<User> all();

    void deleteById( String id );

    User update( User user, String userId );

}

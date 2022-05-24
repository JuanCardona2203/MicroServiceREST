package ProjectUsersMicroservice.MicroserviceREST.services;

import ProjectUsersMicroservice.MicroserviceREST.model.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ImplUserService implements IUserService {
    private final HashMap<String, User> userHashMap = new HashMap<>();

    @Override
    public User create(User objUser){
        userHashMap.put(objUser.getId(),objUser);
        return objUser;
    }

    @Override
    public User findById(String id) {
        User objUser = userHashMap.get(id);
        return objUser;
    }

    @Override
    public List<User> all() {
        List<User> list = new ArrayList<>(userHashMap.values());
        return list;
    }

    @Override
    public void deleteById(String id){
        userHashMap.remove(id);
    }

    @Override
    public User update(User objUser, String userId){
        userHashMap.put(userId,objUser);
        return objUser;
    }
}

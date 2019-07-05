package bootwildfly;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import generators.UsersGenerator;
import model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("users")
    public String getUsers() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        User[] users = UsersGenerator.genrateUsers();

        String response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);

        return response;
    }

}

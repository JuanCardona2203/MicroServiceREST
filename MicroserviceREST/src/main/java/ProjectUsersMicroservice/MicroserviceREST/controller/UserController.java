package ProjectUsersMicroservice.MicroserviceREST.controller;

import ProjectUsersMicroservice.MicroserviceREST.controller.dto.UserDto;
import ProjectUsersMicroservice.MicroserviceREST.model.data.User;
import ProjectUsersMicroservice.MicroserviceREST.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController
{
    private final IUserService userService;

    public UserController(@Autowired IUserService userService )
    {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> all()
    {
        return new ResponseEntity<>(userService.all(), HttpStatus.OK);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById(@PathVariable String id )
    {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto )
    {
        return new ResponseEntity<>(userService.create(new User(userDto)), HttpStatus.OK);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id )
    {
        return new ResponseEntity<>(userService.update(new User(userDto), id), HttpStatus.OK);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        userService.deleteById(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}

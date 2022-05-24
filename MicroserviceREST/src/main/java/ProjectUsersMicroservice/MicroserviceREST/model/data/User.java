package ProjectUsersMicroservice.MicroserviceREST.model.data;

import ProjectUsersMicroservice.MicroserviceREST.controller.dto.UserDto;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private String createdAt;

    public User(String name, String email, String lastName) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = LocalDateTime.now ().toString();
    }

    public User(UserDto objUserDto) {
        this(objUserDto.getName(), objUserDto.getEmail(), objUserDto.getLastName());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

}

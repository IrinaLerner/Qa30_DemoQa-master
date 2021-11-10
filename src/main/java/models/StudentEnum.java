package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder
@ToString

public class StudentEnum {
    String firstName;
    String lastName;
    String email;
    String gender;
    String mobile;
    String dateOfBirth;
    String subjects;
    //String hobbies;
    //Hobby hobby;
    List<Hobby> hobbies;
    String currentAddress;
    String state;
    String city;
}

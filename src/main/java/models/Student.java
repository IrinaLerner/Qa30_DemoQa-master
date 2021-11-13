package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString

public class Student {

   String firstName;
   String lastName;
   String email;
   String gender;
   String mobile;
   String dateOfBirth;
   String subject;
   String hobbies;
   String currentAddress;
   String state;
   String city;
}

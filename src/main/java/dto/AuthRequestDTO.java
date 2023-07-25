package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder

public class AuthRequestDTO {

//      "username": "string",
//      "password": "Q3+SU{OIj7w}>=yO"

    String username;
    String password;

}

package dto;

import lombok.*;


@Setter
@Getter
@ToString
@Builder
public class ContactDTO {

//    {
//        "id": "string",
//            "name": "string",
//            "lastName": "string",
//            "email": "string",
//            "phone": "2095187951",
//            "address": "string",
//            "description": "string"
//    }

    String id;
    String name;
    String lastName;
    String email;
    String phone;
    String address;
    String description;
}

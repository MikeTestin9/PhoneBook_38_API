package dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@Builder
public class ContactListDTO {

    List<ContactDTO> contacts;


}

package dto;
import lombok.*;


@Setter
@Getter
@ToString
@Builder


public class ErrorDTO {

//    "timestamp": "2023-07-25T16:08:01.600Z",
//            "status": 0,
//            "error": "string",
//            "message": {},
//            "path": "string"

    int status;
    String error;
    String message;


}

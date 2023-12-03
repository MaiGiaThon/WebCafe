package WebCafe.Ultils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUltils {

    private CafeUltils(){

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<>("{\"message\": \"" + responseMessage + "\"}", httpStatus);
    }

}

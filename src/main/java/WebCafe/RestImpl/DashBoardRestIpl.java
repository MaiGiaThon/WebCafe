package WebCafe.RestImpl;

import WebCafe.Rest.DashBoardRest;
import WebCafe.Service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DashBoardRestIpl implements DashBoardRest {

    @Autowired
    DashBoardService dashBoardService;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        try{

        }catch (Exception exception){
            exception.printStackTrace();
        }
        return dashBoardService.getCount();
    }
}

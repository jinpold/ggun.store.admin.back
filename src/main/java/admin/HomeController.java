package admin;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home(){
        String date =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        return "안녕하세요!!!" +" "+ date;
    }

}

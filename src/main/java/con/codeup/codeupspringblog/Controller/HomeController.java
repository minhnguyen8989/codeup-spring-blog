package con.codeup.codeupspringblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "This is Landing Page!";
    }
}

@Controller
public class MathController {
    @GetMapping ("/add")
    @ResponseBody
    public int add {
        return ;
    }
}

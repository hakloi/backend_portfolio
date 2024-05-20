package hakloi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExitController {
    @GetMapping("/exit")
    public String exit(){
        return "second/exit";
    }
}

package hakloi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebPageController {
    @GetMapping("/web")
    public String webPage(){
        return "/local/web";
    }

    @GetMapping("/mystic")
    public String mystic(){
        return "/local/mystic";
    }
}

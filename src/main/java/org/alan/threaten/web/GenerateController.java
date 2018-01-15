package org.alan.threaten.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/generate")
public class GenerateController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "generate";
    }
}

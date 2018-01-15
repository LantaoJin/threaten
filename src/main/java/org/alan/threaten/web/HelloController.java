package org.alan.threaten.web;

import org.alan.threaten.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("msg", "SpringBoot Ajax 示例");

        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {

        return "home";
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    @ResponseBody
    public List<User> data() {
        List<User> list = new ArrayList<User>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i + 1);
            user.setName("springboot" + i);
            user.setSex("male");
            user.setAge(i + 1);
            user.setRole("developer");

            list.add(user);
        }

        return list;
    }
    
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show() {
        return "signature";
    }

    @RequestMapping(value = "/signature", method = RequestMethod.POST)
    public void signature(@RequestBody Map<String, Object> reqMap) {
        for (Map.Entry<String, Object> entry : reqMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
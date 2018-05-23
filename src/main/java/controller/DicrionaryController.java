package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/home/")
public class DicrionaryController {

    @RequestMapping("")
    public String loadIndex(){
        return "index";
    }
    @RequestMapping(value = "dicrionary",method = RequestMethod.GET)
    public String translate(
            @RequestParam(value = "keyword",required = false) String key,
            ModelMap modelMap
            ){


        Map<String,String> maps = new HashMap<>();
        maps.put("hello","xin chao");
        maps.put("goodbye","tam biet");
        maps.put("morning","buoi sang");
        if (maps.containsKey(key)){
            modelMap.addAttribute("result",maps.get(key));
        }else{
            modelMap.addAttribute("message","no found");
        }
        return "index";
    }
}

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Translate {
    @GetMapping
    public String home(){
        return "home";
    }
    @PostMapping String translate(@RequestParam String word, Model model){
//        model.addAttribute("word", word);
        Map<String ,String > hashMap=new HashMap<String, String>();
        hashMap.put("1","one");
        hashMap.put("2", "two");
        hashMap.put("3", "three");
        hashMap.put("4", "four");
        for (String word1:hashMap.keySet())
              {
            
        }
        return "translate";
    }
}

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.CaculatorService;
import service.impl.CaculatorServiceImpl;

@Controller
public class CaculatorController {
    @Autowired
    private CaculatorService caculatorService ;
    @GetMapping("/")
    public String showCaculator(){return "caculator";}
    @PostMapping("/addition")
    public String additonCaculator(@RequestParam double number1, @RequestParam double number2, @RequestParam Double result, RedirectAttributes redirectAttributes){
        result=number1+number2;
        redirectAttributes.addFlashAttribute("result", result);
        return "caculator";
    }
    @PostMapping("/subtraction")
    public String subtractionCaculator(@RequestParam double number1, @RequestParam double number2, @RequestParam Double result, RedirectAttributes redirectAttributes){
        result=number1-number2;
        redirectAttributes.addFlashAttribute("result", result);
        return "caculator";
    }
    @PostMapping("/multiplication")
    public String multiplicationCaculator(@RequestParam double number1, @RequestParam double number2, @RequestParam Double result, RedirectAttributes redirectAttributes){
        result=number1*number2;
        redirectAttributes.addFlashAttribute("result", result);
        return "caculator";
    }
    @PostMapping("/division")
    public String divisionCaculator(@RequestParam double number1, @RequestParam double number2, @RequestParam Double result, RedirectAttributes redirectAttributes){
        String message="";
        if(number2==0){
            message="Mẫu số phải khác 0";
            redirectAttributes.addFlashAttribute("message", message);
            return "caculator";
        }else {
        result=number1/number2;
        redirectAttributes.addFlashAttribute("result", result);
        return "caculator";
    }
    }

}

package com.example.lr1_web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Web_Controller {
     /*@GetMapping("/")
    @ResponseBody
    public String team(Model model){
        return"teamPage";
    }
   public String hello(){
        return "Hello world!";
    }*/

    @RequestMapping("/team")
    public String teamPage(Model model){
        return"teamPage";
    }

    @RequestMapping("/myPage1")
    public String DariaShnyrkova(Model model){
        return"DariaShnyrkovaPage";
    }

    @RequestMapping("/myPage2")
    public String DariaOvcharenko(Model model){
        return"DariaOvcharenkoPage";
    }
}

package com.codingdojo.hoppersreceipt.samuel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hopperscontroller {
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Gigachad";
        String itemName = "Bronze Greataxe";
        double price = 17.99;
        String description = "Bronze axe large enough for two men, or one gigachad";
        String vendor = "All the little things";
        
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
    
}

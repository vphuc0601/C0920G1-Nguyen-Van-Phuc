package com.example.demo.controller;

import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerService;
import com.example.demo.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerTypeService customerTypeService;
    @GetMapping({"","/"})
    public String goHome(){
        return "home";
    }
    @GetMapping("customer")
    public String getAllCustomer(@PageableDefault(size = 4) Pageable pageable,
                                 @RequestParam Optional<String> searchNameCustomer,
                                 Model model,
                                 RedirectAttributes redirectAttributes) {
        String stringAfterCheck = "";
        if (!searchNameCustomer.isPresent()) {
            model.addAttribute("customerList", customerService.findAll(pageable));
        } else {
            stringAfterCheck = searchNameCustomer.get();
            model.addAttribute("customerList", customerService.searchCustomer(stringAfterCheck, pageable));
        }
        model.addAttribute("stringAfterCheck", stringAfterCheck);
        return "customer/list";
    }
    @GetMapping("customer/create")
    public String showCreateCustomer(Model model){
        model.addAttribute("customerType", customerTypeService.findAll());
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }
    @PostMapping("customer/create")
    public String createCustomer(@ModelAttribute Customer customer,RedirectAttributes redirectAttributes, Model model){
        customerService.save(customer);
        return "redirect:/customer";
    }
}

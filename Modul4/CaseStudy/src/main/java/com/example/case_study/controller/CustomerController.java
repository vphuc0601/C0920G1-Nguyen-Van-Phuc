package com.example.case_study.controller;

import com.example.case_study.entities.Customer;
import com.example.case_study.services.CustomerService;
import com.example.case_study.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private CustomerTypeService customerTypeService;
    @GetMapping({"","/"})
    public ModelAndView getListCustomer(@PageableDefault(value = 4) Pageable pageable){
//       new ModelAndView("customer/list","customerType", customerTypeService.findAll());
        return new ModelAndView("customer/list", "customerList",customerService.findAll(pageable));
    }
    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping(value = "/create")
    public String createCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("successMsg", "Create Customer: "+customer.getCustomerName() +" success!");
        return "redirect:/";
    }

    @GetMapping(value = "/edit/{id}")
    public String showEditPage(@PathVariable Long id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "customer/edit";
    }

    @PostMapping(value = "/edit")
    public String editCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("successMsg", "Update Customer: "+customer.getCustomerName() +" success!");
        return "redirect:/";
    }

    @GetMapping("/search")
    public ModelAndView searchByText(@RequestParam String inputSearch, @PageableDefault(value = 5)Pageable pageable){
        return new ModelAndView("customer/list", "customertList", customerService.findByInputText(inputSearch, pageable));
    }
}

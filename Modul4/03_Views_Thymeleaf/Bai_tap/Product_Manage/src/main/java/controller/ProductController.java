package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.ProductService;
import service.impl.ProductServiceImpl;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService=new ProductServiceImpl();
    @GetMapping("/")
    public String index(Model model) {
        List productsList = productService.finAll();
        model.addAttribute("products", productsList);
        return "/index";
    }
    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/product/save")
    public String save(Product product) {
        product.setId((int)(Math.random() * 10000));
        productService.save(product);
        return "redirect:/";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.finById(id));
        return "/edit";
    }
    @PostMapping("/product/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.finById(id));
        return "/delete";
    }

    @PostMapping("/product/delete")
    public String delete(Product customer, RedirectAttributes redirect) {
        productService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed product success!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.finById(id));
        return "/view";
    }
}

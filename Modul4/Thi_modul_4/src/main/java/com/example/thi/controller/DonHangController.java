package com.example.thi.controller;


import com.example.thi.entities.DonHang;
import com.example.thi.entities.LoaiSanPham;
import com.example.thi.services.DonHangService;
import com.example.thi.services.LoaiSanPhamService;
import com.example.thi.services.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;
@Controller
public class DonHangController {
    @Autowired
    private DonHangService donHangService;
    @Autowired
    private LoaiSanPhamService loaiSanPhamService;
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping({"","/"})
    public String getAllContract(@PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> searchNameDonHang,
                                 Model model, RedirectAttributes redirectAttributes){
        String stringAfterCheck = "";
        if (!searchNameDonHang.isPresent()){
            model.addAttribute("sanpham", sanPhamService.findAll() );
            model.addAttribute("loaiSanPhamList", loaiSanPhamService.findAll());
            model.addAttribute("donhangList", donHangService.findAll());
        } else {
            stringAfterCheck = searchNameDonHang.get();
            model.addAttribute("donhangList", donHangService.search(stringAfterCheck, pageable));
        }
        model.addAttribute("stringAfterCheck", stringAfterCheck);
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String formEdit(@PathVariable Integer id, Model model) {
        model.addAttribute("loaisanphamList", loaiSanPhamService.findAll());
        model.addAttribute("sanphamList", sanPhamService.findAll());
        model.addAttribute("donhang", donHangService.findById(id));
        return "/edit";
    }

    @PostMapping("/updateDonHang")
    public String updateContract(@ModelAttribute DonHang donHang) {
        donHangService.save(donHang);
        return "redirect:/";
    }
}

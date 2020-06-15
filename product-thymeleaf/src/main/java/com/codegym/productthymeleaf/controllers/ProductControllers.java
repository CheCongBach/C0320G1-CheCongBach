package com.codegym.productthymeleaf.controllers;

import com.codegym.productthymeleaf.models.Product;
import com.codegym.productthymeleaf.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductControllers {
    @Autowired
    ProductServices productServices;

    @GetMapping("/")
    public ModelAndView getHomeProduct() {
        return new ModelAndView("product/index","products",productServices.getAllProduct());
    }

    @GetMapping("/product/delete/{id}")
    public ModelAndView deleteProduct(@PathVariable Integer id) {
        return new ModelAndView("product/delete","product",productServices.getProductById(id));
    }

    @GetMapping("product/delete")
    public String delete(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productServices.deleteProductById(product.getId());
        redirectAttributes.addFlashAttribute("message","Xóa thành công");
        return "redirect:/";
    }

    @GetMapping("/product/edit/{id}")
    public ModelAndView getEditProduct(@PathVariable Integer id) {
        return new ModelAndView("product/edit","product", productServices.getProductById(id));
    }

    @PostMapping("/product/edit")
    public String editProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Cập nhật thành công!!!");
        productServices.updateProduct(product.getId(), product);
        return "redirect:/";
    }

    @GetMapping("product/create")
    public ModelAndView createNewProduct() {
        return new ModelAndView("product/create","product",new Product());
    }

    @PostMapping("product/save")
    public String saveNewProduct(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int)(Math.random() * 10000));
        productServices.saveProduct(product);
        redirectAttributes.addFlashAttribute("message","Thêm mới sản phẩm thành công!!!");
        return "redirect:/";
    }
}

package com.uca.capas.tarea4.controller;

import com.uca.capas.tarea4.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ProductController {
    @RequestMapping("/producto")
    public ModelAndView product() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("productos");
        mav.addObject("product", new Product());

        return mav;
    }

    @RequestMapping("/procesar")
    public ModelAndView procesar(@Valid @ModelAttribute Product product, BindingResult br) {
        ModelAndView mav = new ModelAndView();

        if(br.hasErrors()) {
            mav.setViewName("productos");
        } else {
            mav.addObject("code", product.getCodigo());
            mav.addObject("name", product.getNombre());
            mav.addObject("brand", product.getMarca());
            mav.addObject("stock", product.getExistencia());
            mav.addObject("date", product.getFecha());
            mav.setViewName("resultado");
        }
        return mav;
    }


}

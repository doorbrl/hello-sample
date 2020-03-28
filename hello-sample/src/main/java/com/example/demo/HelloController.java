package com.example.demo;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {

	@Autowired
	protected MessageSource messageSource;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
    	model.addAttribute("url", messageSource.getMessage("URL", null, Locale.JAPAN));
//    	model.addAttribute("message", "ここを押す");
        return "index";  //表示するHTMLファイルの名前（拡張子不要）を指定
    }
}

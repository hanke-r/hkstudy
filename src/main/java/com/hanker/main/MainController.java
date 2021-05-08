package com.hanker.main;

import com.hanker.account.CurrentUser;
import com.hanker.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(@CurrentUser Account account, Model model){
        if(account != null){
            model.addAttribute(account);
        }

        return "index";
    }

    @GetMapping("/login")
    public String login(@CurrentUser Account account){

        if(account != null){
            return "redirect:/";
        }

        return "login";
    }
}

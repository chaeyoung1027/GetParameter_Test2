package kr.hs.study.GetParameter_Test2.controller;

import kr.hs.study.GetParameter_Test2.dto.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class testController {
    @GetMapping("/login")
    public String test1(){
        return "form";
    }

    //HttpServletRequest
//    @PostMapping("/login")
//    public String test2(HttpServletRequest hp){
//        String id = hp.getParameter("user_id");
//        String password = hp.getParameter("user_pass");
//
//        System.out.println("id : "+id);
//        System.out.println("password : "+password);
//
//        return "result";
//    }

    //WebRequest
//    @PostMapping("login")
//    public String test3(WebRequest wr){
//        String id = wr.getParameter("user_id");
//        String password = wr.getParameter("user_pass");
//
//        System.out.println("id : "+id);
//        System.out.println("password : "+password);
//
//        return "result";
//    }

//    // RequestParam
//    @PostMapping("login")
//    public String test4(@RequestParam("user_id") String id, @RequestParam("user_pass") String password){
//
//        System.out.println("id : "+id);
//        System.out.println("password : "+password);
//
//        return "result";
//    }

    //5. ModelAttribute
    @PostMapping("login")
    public String test5(@ModelAttribute login dto){
        System.out.println("id : "+dto.getUser_id());
        System.out.println("password : "+dto.getUser_pass());

        return "result";
    }

}

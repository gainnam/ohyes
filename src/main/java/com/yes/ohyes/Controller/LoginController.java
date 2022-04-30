package com.yes.ohyes.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//form전송, Requestparam excersize
@Controller
public class LoginController {
    /*login 페이지*/
    private Logger logger = LoggerFactory.getLogger(LoginController.class);
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }에서 아래 껄로 변경. action. value값 받아오게
    @RequestMapping("/login")
    public String login(@RequestParam(value = "id", required = false, defaultValue = "guest") String id,
                        @RequestParam(value = "pwd", required = false, defaultValue = "") String pwd, Model model) {
        logger.info("id ->" + id);
        logger.info("pwd ->" + pwd);

//        if(id != null && pwd != null) {
//            model.addAttribute("id", id);
//            model.addAttribute("pwd", pwd);
//            model.addAttribute("msg", "로그인이 처리되었습니다.");
//        }
        if(!id.equals("guest") && pwd.length() > 0) {
        model.addAttribute("msg", "로그인이 처리되었습니다.");
        } else {
            model.addAttribute("msg", "아이디나 패스워드가 제대로 입력되지 않았습니다.");
        }

        model.addAttribute("id", id);
        model.addAttribute("pwd", pwd);

        return "login";
    }


    /*
    로그인을 처리하는 메소드
     *@param id
     * @param model
     * @return
     */
//    @GetMapping("login/action")
//    public String loginAction(@RequestParam("id") String id, @RequestParam("pwd") String pwd, Model model) {
//        model.addAttribute("id", id);
//        model.addAttribute("pwd", pwd);
//
//        logger.info("id->" + id);
//        logger.info("pwd->" + pwd);
//
//        return "login";
//    }


}

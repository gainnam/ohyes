package com.yes.ohyes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

    @GetMapping("/board")
    public String board() {
        return "board/boardMain";
    }
}

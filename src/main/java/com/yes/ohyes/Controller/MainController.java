package com.yes.ohyes.Controller;

import com.yes.ohyes.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@AllArgsConstructor

public class MainController {
    private BoardService boardService;

    @GetMapping("/")
    public String main() {
        return "main";
    }

    }

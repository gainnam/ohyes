package com.yes.ohyes.Controller;

import com.yes.ohyes.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/board")
@AllArgsConstructor
@Controller
public class boardController {
    private BoardService boardService;

    @GetMapping("/main")
    public String boardMain() {
        return "board/board";
    }

    @GetMapping("/detail")
    public String board() {
        return "board/boardMain";
    }
   /* @GetMapping("/boardList")
    @ResponseBody
    public List<Board> boardList() {
        return boardService.getBoard();
    }*/
}

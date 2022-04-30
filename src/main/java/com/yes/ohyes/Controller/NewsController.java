package com.yes.ohyes.Controller;

import com.yes.ohyes.domain.entity.NewsVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//springboot로 api 출력 controller
//@ResponseBody는 결과적으로 객체의 내용을 Rest 구조로 주고 받을 수 있게끔 json 형태(키, 값 구조일 경우)로 변환

@RestController
public class NewsController {
    //@Controller로 선언하고 public
    //public @ResponseBody NewsVO show() {...로 해도 동일
    @GetMapping("/news")
    public NewsVO show() {
        NewsVO vo = new NewsVO();
        vo.setTitle("남가인 주말에 놀러가는 걸로 알려져...");
        vo.setContent("공방에 가서 팔찌를 만들다고 합니다..."
        + "스테인레스스틸 팔찌라고 합니다." + "혜화동이라고 합니다" +
                "만들고 예뻤으면 좋겠다");
        vo.setCategory("DAILY");

        return vo;
    }

    @GetMapping("/mapNews")
    public Map<String, Object> mapShow() {
        Map<String, Object> map = new HashMap<>();
        map.put("title", "일어나자마자 오예스 먹고있는 남가인");
        map.put("content", "사실 자기 전에도 먹었다고 전해져,,," + "살이 찔 것 같다고 합니다" +
                "그래도 계속 먹을 거야");
        map.put("category", "DAILY");

        return map;
    }

}

package org.zerock.guestbook.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.guestbook.dto.Member;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberController {
private Map<String, Member> userMap;
//@PostConstruct
//    public void init() {
//    userMap = new HashMap<>();
//    userMap.put("1", new Member("1", "홍박사"));
//    userMap.put("1", new Member("2", "홍박사2"));
//    userMap.put("1", new Member("3", "홍박사3"));
//    userMap.put("1", new Member("4", "홍박사4"));
//    userMap.put("1", new Member("5", "홍박사5"));
//
//
//}
}

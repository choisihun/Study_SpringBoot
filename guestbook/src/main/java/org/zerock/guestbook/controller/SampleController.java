package org.zerock.guestbook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.zerock.guestbook.dto.SampleDTO;

@RestController
@Slf4j
@RequestMapping
public class SampleController {
    @GetMapping("")
    public void ex01() {
        log.info(".........01");
    }
    @GetMapping("/ex02")
    public void ex02() {
        log.info(".........02");
    }
    @GetMapping("/ex03/?")
    public void ex03(){
        log.info(".............ex03" );
    }
    @GetMapping("/ex04/*")
    public void ex04(){
        log.info(".............ex04" );
    }
    @GetMapping("/ex05/**")
    public void ex05(){
        log.info(".............ex05" );
    }
    @GetMapping("/ex06/{id}/{name}")
    public void ex06(
            @PathVariable("id") String id,
            @PathVariable("name") String name
    ){
        log.info(".............ex06 id : {}, name : {}", id, name);
    }
    @GetMapping("/ex07")
    public void ex07(
            @RequestParam("name") String name,
            @RequestParam(
                    value = "age",
                    required = false,
                    defaultValue = "20"
            ) int age
    ) {
        log.info(".............ex07 id : {}, name : {}", name, age);
    }

    //sample/ex08?name=kim&age=20
    @GetMapping("/ex08")
    public void ex08(SampleDTO sampleDTO) {
        log.info("........08:{}", sampleDTO);

    }

    @PostMapping("/ex09")
    public void ex09(@RequestBody SampleDTO sampleDTO) {
        {
            log.info(".............ex09 {}", sampleDTO);
        }
    }

//    @PutMapping("/ex10")
//
//    public ResponseEntity<SampleDTO> ex10(@RequestBody SampleDTO sampleDTO) {
//ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(sampleDTO);
//return  ResponseEntity<SampleDTO>;
//    }





}

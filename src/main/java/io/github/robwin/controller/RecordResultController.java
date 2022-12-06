package io.github.robwin.controller;

import io.github.robwin.service.ResultService;
import io.github.robwin.service.Service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping(value = "/result")
public class RecordResultController {
    private final ResultService resultService;

    public RecordResultController(@Qualifier("resultService")ResultService resultService){
        this.resultService = resultService;
    }

    @GetMapping("failure")
    public int failure(){
        return resultService.failure();
    }

    @GetMapping("success")
    public int success(){
        return resultService.success();
    }

    @GetMapping("exception")
    public int exception(){
        return resultService.exception();
    }
}
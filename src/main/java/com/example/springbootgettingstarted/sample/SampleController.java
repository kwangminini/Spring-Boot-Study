package com.example.springbootgettingstarted.sample;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.methodOn;


@Controller
public class SampleController{
    @Autowired
    private SampleService sampleService;
    private Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","keesun");
        return "hello";
    }

    @GetMapping("/exception")
    public String exception(){
        throw new SampleException();
    }
    @GetMapping("/htmlUnitTest")
    public @ResponseBody RepresentationModel<Hello> htmlUnitTest(){
        Hello hello = new Hello();
        hello.setPrefix("Hey,");
        hello.setName("Keesun");
        Link link = linkTo(methodOn(SampleController.class).htmlUnitTest()).withSelfRel();
        RepresentationModel<Hello> helloRepresentationModel = new RepresentationModel<Hello>();
        helloRepresentationModel.add(link);

        return helloRepresentationModel;

    }
    @ExceptionHandler(SampleException.class)
    public @ResponseBody AppErr sampleError(SampleException e){
        AppErr appErr = new AppErr();
        appErr.setMessage("error.app.key");
        appErr.setReason("IDK IDK IDK");
        return appErr;
    }
}

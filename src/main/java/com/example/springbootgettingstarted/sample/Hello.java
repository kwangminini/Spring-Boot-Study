package com.example.springbootgettingstarted.sample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Setter
@ToString
public class Hello extends RepresentationModel<Hello> {
    private String prefix;
    private String name;

}

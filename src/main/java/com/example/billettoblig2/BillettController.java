package com.example.billettoblig2;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {
    public final List<Kinobillett> kinobilett= new ArrayList<>();

}

package com.example.billettoblig2;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {
    public final List<Kinobillett>kinobillett = new ArrayList<>();

    @PostMapping
    public void lagre(Kinobillett billett) {
        kinobillett.add(billett);
    }

    public List<Kinobillett> hentAlle() {
        return kinobillett;
    }
}

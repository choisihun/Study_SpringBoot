package org.zerock.guestbook.sample;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.PrimitiveIterator;

@Component
@ToString
//@AllArgsConstructor
public class Guest {
    private Chef chef;
    private Guest guest;

    @Autowired
    public Guest(Chef chef, Guest guest) {
        this.chef = chef;
        this.guest = guest;
    }
}

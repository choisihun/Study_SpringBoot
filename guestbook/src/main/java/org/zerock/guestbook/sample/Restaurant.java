package org.zerock.guestbook.sample;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
//@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private  Chef chef;
    private  Guest guest;
}

package io.gauee.numismatist.items;

import io.gauee.numismatist.items.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ItemsController {

    @RequestMapping(path = "/items", method = RequestMethod.GET)
    public List<Item> items() {
        return List.of(new Item()
                .withId(UUID.randomUUID().toString())
                .withName("dummy-item"));
    }
}

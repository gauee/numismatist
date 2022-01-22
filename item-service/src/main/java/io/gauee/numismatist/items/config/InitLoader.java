package io.gauee.numismatist.items.config;

import io.gauee.numismatist.items.model.Item;
import io.gauee.numismatist.items.model.ItemType;
import io.gauee.numismatist.items.repos.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.UUID;

@Component
public class InitLoader {

    @Autowired
    private ItemRepository itemRepository;


    @PostConstruct
    public void loadDummyItems() {
        itemRepository.saveAll(Arrays.asList(
                new Item().withId(UUID.randomUUID().toString()).withName("dummy-" + ((int) (Math.random() * 100)))
                        .withType(ItemType.Banknote).withNominal(100),
                new Item().withId(UUID.randomUUID().toString()).withName("dummy-" + ((int) (Math.random() * 100)))
                        .withType(ItemType.Alloy).withNominal(10)
        ));
    }

}

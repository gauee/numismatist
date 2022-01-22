package io.gauee.numismatist.items.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alloy {
    @Id
    long id;
    AlloyType type;
    int quantity;
}

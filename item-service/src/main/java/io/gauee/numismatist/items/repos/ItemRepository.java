package io.gauee.numismatist.items.repos;

import io.gauee.numismatist.items.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item,String> {
}

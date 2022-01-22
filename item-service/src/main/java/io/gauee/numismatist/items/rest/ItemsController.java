package io.gauee.numismatist.items.rest;

import io.gauee.numismatist.items.model.Item;
import io.gauee.numismatist.items.repos.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Item>> getPage() {
        return ResponseEntity.ok(itemRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getOne(@PathVariable String id) {
        Optional<Item> item = itemRepository.findById(id);
        return item.isPresent() ? ResponseEntity.ok(item.get()) : (ResponseEntity<Item>) ResponseEntity.notFound();
    }

    @PutMapping("")
    public ResponseEntity<Item> update(@RequestBody Item updated) {
        return ResponseEntity.ok(itemRepository.save(updated));
    }

    @PostMapping("")
    public ResponseEntity<Item> create(@RequestBody Item created) {
        return ResponseEntity.ok(itemRepository.save(created));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        itemRepository.deleteById(id);
        return ResponseEntity.ok("Ok");
    }
}

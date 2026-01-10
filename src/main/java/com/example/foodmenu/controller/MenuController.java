package com.example.foodmenu.controller;

import com.example.foodmenu.entity.MenuItem;
import com.example.foodmenu.repository.MenuItemRepository;
import com.example.foodmenu.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "http://localhost:4200") // allows Angular frontend to call this
public class MenuController {

    private final MenuItemRepository menuRepo;

    public MenuController(MenuItemRepository menuRepo) {
        this.menuRepo = menuRepo;
    }

    // GET all menu items
    @GetMapping
    public List<MenuItem> getAllMenu() {
        return menuRepo.findAll();
    }

    // POST new menu item
    @PostMapping
    public MenuItem createMenu(@RequestBody MenuItem menuItem) {
        return menuRepo.save(menuItem);
    }

    // PUT existing menu item
    @PutMapping("/{id}")
    public MenuItem update(@PathVariable Long id, @RequestBody MenuItem menuItem){
        MenuItem existing = menuRepo.findById(id).orElseThrow();
        existing.setName(menuItem.getName());
        existing.setDescription(menuItem.getDescription());
        existing.setPrice(menuItem.getPrice());
        existing.setCategory(menuItem.getCategory());
        existing.setAvailable(menuItem.getAvailable());
        return menuRepo.save(existing);
    }

    // GET byID menu item
    @GetMapping("/{id}")
    public MenuItem getMenuItem(@PathVariable Long id){
        return menuRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Menu not found with id " + id));
    }

    // DELETE byID menu item
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        menuRepo.deleteById(id);
    }
}

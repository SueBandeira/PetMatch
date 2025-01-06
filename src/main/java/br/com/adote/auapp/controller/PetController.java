package br.com.adote.auapp.controller;

import br.com.adote.auapp.model.Pet;
import br.com.adote.auapp.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {
  private final PetService petService;

  public PetController(PetService petService) {
    this.petService = petService;
  }

  @GetMapping
  public List<Pet> buscarTodosPets() {
    return petService.buscarTodosPets();
  }

  @PostMapping
  public Pet createPet(@RequestBody Pet pet) {
    return petService.salvarPet (pet);
  }
}

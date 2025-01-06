package br.com.adote.auapp.service;

import br.com.adote.auapp.model.Pet;
import br.com.adote.auapp.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

  private final PetRepository petRepository;

  public PetService(PetRepository petRepository) {
    this.petRepository = petRepository;
  }

  public List<Pet> buscarTodosPets () {
    return petRepository.findAll();
  }

  public Pet salvarPet (Pet pet) {
    return petRepository.save(pet);
  }

}

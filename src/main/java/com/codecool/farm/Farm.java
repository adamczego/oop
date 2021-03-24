package com.codecool.farm;

import java.util.List;
import java.util.stream.Collectors;

import com.codecool.farm.animal.Animal;



class Farm {

    List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        animals.forEach(Animal::feed);
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        return animals.stream()
        .map(animal -> "There is a " + animal.getSize() + " sized " + animal.getClass().getSimpleName().toLowerCase() + " in the farm.")
        .collect(Collectors.toList());

    }


    public List<Animal> getAnimals() {
        return animals;
    }
}

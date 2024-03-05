package dev.gaurav.repo;

import dev.gaurav.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface LaptopRepo extends JpaRepository<Laptop,Integer> {
}

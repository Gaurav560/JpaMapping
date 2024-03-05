package dev.gaurav;

import dev.gaurav.model.Laptop;
import dev.gaurav.model.Student;
import dev.gaurav.repo.StudentRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JpaMappingsApplication implements CommandLineRunner{
@Autowired
    private StudentRepo studentRepo;

    public static void main(String[] args) {
        SpringApplication.run(JpaMappingsApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        //ONE TO ONE RELATIONSHIP

//        Laptop laptop=new Laptop();
//        laptop.setBrand("Dell");
//        laptop.setModelNumber("1234");
//
//        Student student=new Student();
//        student.setStudentName("Gaurav");
//
//        student.setAbout("Engineer");
//        laptop.setStudent(student);
//        student.setLaptop(laptop);
//      Student saveStudent=studentRepo.save(student);

//        Student student=studentRepo.findById(1).get();
//       Laptop laptop= student.getLaptop();
//        System.out.println(laptop.getLaptopId());
//        System.out.println(laptop.getStudent().getStudentName());
//        System.out.println(laptop.getModelNumber());
//        System.out.println(laptop.getBrand());


    }
}

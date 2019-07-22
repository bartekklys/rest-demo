package pl.bartekk.restdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class Controller {

    @GetMapping("/getHeroes")
    public List<Hero> getHeroes() {
        System.out.println("GET");
        return Arrays.asList(
                new Hero(1, "AA"),
                new Hero(2, "BB"),
                new Hero(3, "CC"),
                new Hero(4, "DD"),
                new Hero(5, "EE"),
                new Hero(6, "FF"),
                new Hero(7, "GG"),
                new Hero(8, "HH"),
                new Hero(9, "II"),
                new Hero(10, "JJ"));
    }
}

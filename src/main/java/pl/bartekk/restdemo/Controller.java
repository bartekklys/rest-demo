package pl.bartekk.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/getHeroes")
    public List<Hero> getHeroes() {
        return Arrays.asList(new Hero(1, "Bartek"), new Hero(2, "Pawel"));
    }
}

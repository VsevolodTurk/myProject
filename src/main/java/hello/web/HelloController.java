package hello.web;

import entity.Car;
import entity.TestEntity;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping(value = "/get_entity", method = RequestMethod.GET)
    @ResponseBody
    public TestEntity sendEntity(){
       return new TestEntity("Seva",34, new Car("MBP", "rojo"));
    }

    @RequestMapping(value = "/set_entity", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public TestEntity getEntity(@RequestBody TestEntity testEntity){
        return testEntity;
    }
}

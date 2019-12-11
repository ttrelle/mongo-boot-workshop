package mongoboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mongoboot.domain.PointOfInterest;
import mongoboot.repo.PointOfInterestRepository;

@RestController
public class DemoController {

    @Autowired
    PointOfInterestRepository repo;

    @RequestMapping("/hello")
    public PointOfInterest hello() {
        PointOfInterest poi = repo.findById(1)
                                  .get();

        return poi;
    }

}

package net.javayum.training.config.property.ws.rest.spring;

import net.javayum.training.config.property.Property;
import net.javayum.training.config.property.ws.PropertyImplDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config/property/resource")
public class PropertyWebServiceImplRestController {

    @RequestMapping(value = "/{propertyName}", method = RequestMethod.GET)
    Property getProperty(@PathVariable String propertyName) {

        String propertyValue = "some value";
        return new PropertyImplDTO(propertyName, propertyValue);
    }

}

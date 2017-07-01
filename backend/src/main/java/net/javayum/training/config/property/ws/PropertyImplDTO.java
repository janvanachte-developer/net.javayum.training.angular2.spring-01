package net.javayum.training.config.property.ws;

import net.javayum.training.config.property.Property;

public class PropertyImplDTO implements Property {

    private final String name;
    private final String value;


    public PropertyImplDTO(String propertyName, String propertyValue) {
        this.name = propertyName;
        this.value = propertyValue;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }
}

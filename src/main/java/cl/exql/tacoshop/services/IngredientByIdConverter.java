package cl.exql.tacoshop.services;

import cl.exql.tacoshop.models.Ingredient;
import org.springframework.core.convert.converter.Converter;

public class IngredientByIdConverter implements Converter<String, Ingredient> {
    @Override
    public Ingredient convert(String source) {
        return null;
    }
}

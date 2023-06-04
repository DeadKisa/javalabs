package ru.gbjava.kinozen.validators;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.gbjava.kinozen.dto.ContentDto;
import ru.gbjava.kinozen.dto.UserDto;



@Service
@RequiredArgsConstructor
public class ContentValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ContentDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ContentDto contentDto = ((ContentDto) target);
        if (contentDto.getName().length() < 3 || contentDto.getName().length() > 30)  {
            errors.rejectValue("name", "Error", "Имя не корректного размера");
        }
    }


}

package bean;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("Coordy")
public class ValidatorY implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if (o == null) throw new ValidatorException(new FacesMessage("Введите значение координаты Y"));
        try {
            Double y = Double.parseDouble(String.valueOf(o));
            if (y >= 5 || y <= -3)
                throw new ValidatorException(new FacesMessage("Координата лежите в интервале от -3 до 5 "));
        } catch (NumberFormatException exception) {
            new ValidatorException(new FacesMessage("Координата должна быть числом"));
        }
    }
}

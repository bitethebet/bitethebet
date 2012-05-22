/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bitethebet.editor;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 *
 * @author Toma
 */
public class DatePropertyEditor extends PropertyEditorSupport {

    String[] formats = {"yyyy-MM-dd"};
    Date defaultDate = new Date(0L);

    @Override
    public void setAsText(String textValue) {
        if (textValue == null) {
            setValue(defaultDate);
            return;
        }
        Date retDate = defaultDate;
        try {
            retDate = DateUtils.parseDate(textValue, formats);
        } catch (ParseException e) {
            log.error("Cannot parse " + textValue + " as date.", e);
        }
        setValue(retDate);
    }
}

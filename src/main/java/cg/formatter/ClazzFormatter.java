package cg.formatter;

import cg.model.clazz;
import cg.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.util.Locale;

public class ClazzFormatter implements Formatter<clazz> {
    private final IClazzService iClazzService;
    @Autowired
    public ClazzFormatter(IClazzService iClazzService){
        this.iClazzService = iClazzService;
    }

    @Override
    public clazz parse(String text, Locale locale){
        return iClazzService.findById(Long.parseLong(text)).get();
    }

    @Override
    public String print(clazz object, Locale locale) {
        return null;
    }
}

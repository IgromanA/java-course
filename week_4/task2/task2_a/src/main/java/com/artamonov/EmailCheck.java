package com.artamonov;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    private final String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

    public boolean isValid(String email) {
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);
        return m.matches();
    }
}

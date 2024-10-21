package com.artamonov;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckerURL {

    private static final String IPv6_PATTERN = "^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";
    
    private final Pattern pattern;

    public CheckerURL() {
        pattern = Pattern.compile(IPv6_PATTERN);
    }

    public boolean  check(String ipv6Address) {
        Matcher matcher = pattern.matcher(ipv6Address);
        return matcher.matches();
    }
}

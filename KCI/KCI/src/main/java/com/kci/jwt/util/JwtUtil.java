package com.kci.jwt.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class JwtUtil {

    private static final String SECRET_KEY = "KOOL_PROGRAMMA";

    public String getUserNameFromToken(String token){
       return getClameFromtoken(token, Claims::getSubject);

    }

    private <T> T getClameFromtoken(String token, Function<Claims, T> claimResolver){
        final Claims claims = getAllClaimsFromToken(token);
        return claimResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token){
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

}

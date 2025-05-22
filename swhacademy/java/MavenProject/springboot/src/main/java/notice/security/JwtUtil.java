package notice.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {
  private static final String SECRET = "PAY9UM_SECRET_KEY_JWT_";
  private static final long EXPIRATION = 86400000;

  public static String generateToken(String name) {
    System.out.println("(JwtUtil) Create Token");
    return Jwts.builder()
            .setSubject(name)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
            .signWith(SignatureAlgorithm.HS512, SECRET)
            .compact();
  }

  public static String validateToken(String token) {
    System.out.println("(JwtUtil) Validate Token");
    try {
      return Jwts.parser()
              .setSigningKey(SECRET)
              .parseClaimsJws(token)
              .getBody()
              .getSubject();
    } catch (Exception e) {
      return null;
    }
  }
}

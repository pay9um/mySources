package notice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**") // 모든 경로에 대해
            .allowedOrigins("http://localhost:5173") // 허용할 프론트엔드 주소 (예: Vue 기본 주소)
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 허용 HTTP 메서드
            .allowedHeaders("*") // 모든 헤더 허용
            .allowCredentials(true); // 쿠키 등 인증 정보 허용
  }
}

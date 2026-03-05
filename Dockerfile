# 1. 자바 17
FROM amazoncorretto:17-alpine-jdk

# 2. 빌드된 JAR 파일을 이미지 내부의 app.jar로 복사 (이게 바로 젠킨스가 해줄 그 CP!)
COPY build/libs/*.jar app.jar

# 3. 컨테이너가 켜지면 자바 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]


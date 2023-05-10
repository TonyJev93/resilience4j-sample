# Resilience4j

## 특징

- modular : resilience4j 내 필요한 모듈만 선택하여 사용 가능
    - Circuit Breaker
    - RateLimiter
    - TimeLimiter
    - Retry
    - Bulkhead
    - Cache
- lightweight : Vavr외에 다른 외부 종속성을 가지지 않음.(가볍다는 것이 의존성 개수가 적다는 것을 의미) -> 응용 프로그램 또는 라이브러리에 적용하기 더욱 용이
- easy to use : 데코레이터, 고차 함수(함수를 변수로 사용 또는 함수를 반환, 즉 함수를 다루는 함수), 함수형 인터페이스, 람다 표현식, 메서드 참조를 기반으로 하여 어떤 함수든 개선하고 강화 가능

## 사용 상황

- 일시적 오류가 발생하는 경우 사용
    - 일시적 오류란? - 한번 또는 예측 불가능한 간격으로 발생하는 오류
        - 예시
            - 네트워크 연결 손실
            - 요청 타임아웃
            - 서비스 일시 사용 불가
            - DB 커넥션, 쓰레드 풀 등 리소스 사용 불가능 상태

## 동작 원리

- AOP
- Spring Proxy
    - Dynamic Proxy - 자바 리플렉션 이용하여 인터페이스를 구현하는 프록시 객체를 동적으로 생성
    - CGLIB - 바이트 코드 조작 기술을 사용. 클래스의 서브 클래스를 생성하고 프록시 객체를 이 서브 클래스의 인스턴듦로 만듦
- Spring Annotation

# 참고

- [Retry pattern with resilience4j and Spring boot
  ](https://medium.com/@maniar.othmane/retry-pattern-with-resilience4j-and-spring-boot-cfeaa90458d)
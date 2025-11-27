# SpringBoot CocomoAppServer
Spring Boot 냉장고 관리 앱 api server


## Project Info
개발된 냉장고 관리 어플리케이션의 서버를 담당합니다.


## Dev Duration
- 2024-04-15~2024-06-09


## Dev env
- __JDK__ : 17
- __Framework__ : SpringBoot 3.2.4
- __DB__ : MySQL 8.0
- __Build Tool__ : Gradle

## 리팩토링(2025-11-26~)

### 1. 프로젝트 JDK 17 LTS 버전에서 21 LTS 마이그레이션

더 긴 지원기간을 확보하기 위한 Java 21 버전으로 업그레이드

### 2. Rest API 설계 규칙 준수

기존 API 네이밍 규칙에 어긋나는 부분을 설계 원칙에 맞게 변경

- ex:  GET  /foods/list/{id} → GET /api/food/{id}
- ex: POST /ref/create → POST /api/ref

### 3. 레시피 조회 요청 Redis 캐싱을 이용하여 성능 개선

기존의 항상 DB를 조회하던 레시피 조회 기능을 캐싱을 활용하여 기능 개선

### 4. 불필요한 @Transactional 제거

각 Service 계층에서 단일 Select 조회 쿼리의 트랜잭션 제거

### 5. ResponseEntity<ApiResponse<T>> 공통 응답 객체로 응답 형식을 통일:

ApiResponse(int status, String message, T data) 객체를 이용해 응답 형식 통일화

### 6. Global Exception Hander 예외처리

커스텀 예외 객체를 생성하여 상황에 맞는 예외를 처리하여 서버 내부 오류 메시지 노출을 최소화
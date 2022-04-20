## @EventListener

사용 이유?  
의존성이 강한 로직들의 레이어를 분리할 수 있다. 예를 들어 A 서비스의 a 비즈니스 로직을 실행 할 때   
B 서비스의 b 추가 로직을 같이 실행해야 하는 경우   
A 서비스에 B 서비스를 주입시켜 a 로직 안에 b 로직을 녹이는 경우가 많다.

이렇게 점점 강해지는 결합을 이벤트 핸들러라는 레이어로 분리한 뒤   
다시 핸들링 하는 느슨한 결합 형태로 만들 수 있다.

A 서비스의 a 로직 실행 -> 이벤트 발행 -> B 서비스의 b 로직 실행  
이렇게 되면 A 서비스는 B 서비스의 변경사항과 관련없이 수정이 필요없게 된다.

### EventListener에서 데이터 변경 작업을 수행할 경우

- 이벤트 리스너에서 @Transactional(propagation = Propagation.REQUIRES_NEW)를 설정
    - 만약 이벤트 리스너에서 트랜잭셔널을 걸고 추가로 디비 insert update delete를 진행할 경우 오류 없이 실행되었는데도 불구하고 저장되지 않는다.

    - @TransactionalEventListener에 어떤 설정을 해도 퍼블리셔의 트랜잭션 안에서 동작한다.  
      그리고 추가 커밋은 허용하지 않는다.  
      따라서 추가 설정이 들어가지 않으면 리스너에서 데이터 변경 작업을 할 수 없다.

    - 데이터 변경 작업이 필요할 경우 이벤트 리스너에서  
      @Transactional(propagation = Propagation.REQUIRES_NEW)를 설정해야 한다.  
      - 해당 설정은 새로운 트랜잭션을 시작하겠다는 설정이다.  
      - 그러면 퍼블리셔의 커밋을 보장하고, 이벤트 리스너에서도 새로운 트랜잭션 안에서 데이터 변경 작업을 진행할 수 있다.

### @TransactionalEventListener

트랜잭션의 상황에 따라 이벤트 리스너 사용 가능

- 이벤트리스너 대신에 트랜잭셔널 이벤트 리스너를 달아주면 됨

```text
AFTER_COMMIT (기본값) - 트랜잭션이 성공적으로 마무리(commit)됬을 때 이벤트 실행

AFTER_ROLLBACK – 트랜잭션이 rollback 됬을 때 이벤트 실행

AFTER_COMPLETION – 트랜잭션이 마무리 됬을 때(commit or rollback) 이벤트 실행

BEFORE_COMMIT - 트랜잭션의 커밋 전에 이벤트 실행
```
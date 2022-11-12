# kotlin-practices

## 코틀린 기초

### [Hello, World!](src/basics/HelloWorld.kt)

> 고전 예제인 Hello, World를 사용하여 프로그램을 실행해보자.
> 함수를 선언할때 **fun**을 사용하고, 파라미터의 이름 뒤에 타입을 지정한다. (변수도 마찬가지다.)
> 또한 함수를 최상위 수준에 정의할 수 있고, 배열을 일반적인 클래스와 같이 취급한다.

### [함수](src/basics/Function.kt)

> 함수 선언은 **fun** 키워드로 시작한다. 다음에는 함수 이름이 오고 그 뒤에 괄호와 함께 파라미터 목록이 온다.
> 함수의 반환 타입은 파라미터 목록의 닫는 **괄호 다음**에 오는데. (이 부분이 자바와 다르다.) 괄호와 반환 타입을 콜론으로 구분해야 한다.
> 코틀린의 if는 **statement**가 아니라 **expression**이다! 또한 함수는 블록이 본문인 함수(중괄호로 둘러쌓인)와 식이 본문인 함수(등호와 식으로 이루어 진)로 나누어진다. 식이 본문인 함수는 결과 타입을 컴파일러가 자동으로 추론할 수 있다. (이런 타입을 정해주는 기능을 타입 추론이라고 한다.)
 
### [변수](src/basics/Variables.kt)

> 코틀린에서는 타입 지정을 생략하는 경우가 흔하다. 타입으로 변수 선언을 시작하면 타입을 생략할 경우 식과 변수 선언을 구분할 수 없다. 그런 이유로 코틀린에서는 키워드로 변수 선언을 시작하는 대신 변수 이름 뒤에 타입을 명시하거나 생략하게 허용한다.
> 변경 가능한 변수(var)와 변경 불가능한 변수(val)가 존재한다. 자바의 final 변수이며, 항상 한번만 초기화가 가능하다. 기본적으로는 모든 변수를 val로 선언하고, 나중에 꼭 필요할 때에만 var로 변경하라. var로 선언한 변수도 최초 시점에 타입은 고정되어 다른 타입의 변수를 할당할 수 없다.

### [문자열 템플릿](src/basics/StringTemplates.kt)

> 예제와 같이 name이라는 변수를 선언하고 그 다음줄에 있는 문자열 리터럴 안에서 그 변수를 사용했다. 여러 스크립트 언어와 비슷하게 코틀린에서도 변수를 문자열 안에 사용할 수 있다. 문자열 리터럴의 필요한 곳에 변수를 넣되 변수 앞에 $를 추가해야 한다.

### [클래스와 프로퍼티](src/basics/Clazz.kt)

> 코틀린은 자바에 비해 간단한 코드로 클래스와 관련 있는 모든 작업을 수행할 수 있다. 코틀린은 필드 대입 로직을 적은 코드로 작성할 수 있는 방법을 지원한다. **값 객체**라고 불르는 간결하게 기술할 수 있는 구문을 제공한다. (java record) 클래스라는 개념은 데이터를 캡슐화 하고 캡슐화한 데이터를 다루는 코드를 하나의 주체 아래에 가두는 것이다.
> 클라이언트가 그 데이터에 접근하는 통로로 쓸 수 있는 접근자 메서드를 보통 제공한다. 자바에서는 필드와 접근자를 묶어서 프로퍼티라고 부른다. 코틀린은 프로퍼티를 언어 기본 기능으로 제공한다. val로 선언한 프로퍼티는 읽기 전용이며, var로 선언한 프로퍼티는 변경 가능하다.

### [커스텀 접근자](src/basics/CustomAccessor.kt)

> 프로퍼티를 하나 생성하고 get(), set()을 구현하는 것으로 커스텀 접근자를 생성할 수 있다. 파라미터가 없는 방식이나 커스텀 게터를 정의하는 방식 중 성능상 차이는 없다. 오로지 가독성 뿐이다. 일반적으로 클래스의 특성을 정의하고 싶다면 프로퍼티로 그 특성을 정의해야 한다.

### [디렉터리와 패키지](src/basics/Package.kt)

> 패키지 개념은 대체로 자바와 비슷하다. 다른 패키지의 정의한 선언을 사용하려면 임포트를 통해 선언을 불러와야 한다. 파일의 맨 앞에 와야한다. 코틀린에서는 함수 임포트와 클래스 임포트에 차이가 없다. 패키지 이름 뒤에 * 임포트를 사용하면 패키지 안에 있는 모든 클래스 뿐 아니라 함수나 프로퍼티까지 모두 불러온다.
> 또한 코틀린은 패키지를 어떤 소스에 위치시키든 관계 없다. (하지만 자바와 같은 방식으로 따라가자.)

### [선택 표현과 처리(enum과 when)](src/basics/EnumWithWhen.kt)

> enum은 자바 선언보다 코틀린 선언에 더 많은 키워드를 써야 하는 흔지 않은 예다. 코틀린에서는 enum class를 사용하지만 자바는 enum을 사용한다. 코틀린에서 enum은 **소프트 키워드**라고 불리는 존재다.
> enum은 class 앞에 있을 때는 특별한 의미를 지니지만 다른 곳에서는 그냥 이름에도 사용할 수 있다. 하지만 class는 키워드다. 따라서 클래스는 이름으로 사용할 수 없다. <br/>
> when은 자바의 switch와 대응된다. 차이점으로는 **statement**가 아니라 **expression**이다. 그러므로 식이 본문인 함수에 곧바로 사용할 수 있다. break가 존재하지 않으며 콤마를 통해 여러 조건을 하나의 분기로 보낼 수 있다.
> when은 임의의 객체와도 함께 사용할 수 있다. 분기 조건에 임의의 객체를 허용한다. when식은 인자 값과 매칭되는 조건 값을 찾을 때까지 각 분기를 검사한다. 동등성을 주로 사용해서 검사한다.
> 또한, 인자 없이 when을 사용할 수 있다. 코드는 약간 읽기 어려워 지지만, 성능을 더 향상시키기 위해 비용을 감수하는 경우도 있다.

### [스마트 캐스트](src/basics/SmartCast.kt)

> 코틀린에서는 is를 사용해 변수 타입을 검사한다. 자바에서는 변수 타입을 확인한 후 명시적으로 변수 타입을 캐스팅 해야한다.(최신 버전의 자바에서는 지원하는 문법이 생겼다.) 코틀린에서는 프로그래머 대신 컴파일러가 캐스팅을 해준다. 이를 **스마트 캐스트** 라고 부른다.
> 스마트 캐스트는 값의 타입을 검사한 다음에 그 **값이 바뀔 수 없는 경우**에만 작동한다. 프로퍼티는 반드시 val이어야 하며, 커스텀 접근자를 사용한 것이어도 안된다. 원하는 타입으로 명시적으로 캐스팅 하려면 **as** 키워드를 사용한다.
> 또한 분기에 복잡한 동작이 들어가 있을 경우에는 **블록으로 만들고, 마지막 문장이 블록 전체의 결과**가 된다.
 
### [반복문(While)](src/basics/While.kt)

> 코틀린의 while loop는 자바와 동일하다. do-while 형태와 while 형태가 존재한다. 두 루프의 문법은 자바와 다르지 않다.

### [수에 대한 반복(for)](src/basics/IteratingOverNumbers.kt)

> 코틀린에는 자바에 for 구문에 해당하는 요소가 없다. 이런것을 대신하기 위해 코틀린에서는 범위를 사용한다. 범위는 기본적으로 두 값으로 이루어진 구간이다. 보통은 그 두 값은 정수 등의 숫자의 값이며, .. 연산자로 시작 값과 끝 값을 연결해 범위를 만든다. 
> 코틀린의 범위는 양 끝을 포함하는 구간이다. 이는 **두 번째 값이 항상 범위에 포함**된다. (range(0..10) -> 10이 포함) 두 번째 값이 범위에 포함되지 않게 하려면 **until** 함수를 사용하라. **downTo**를 사용하면 역방향 수열을 만들 수 있고. **step**를 사용하여 증가 값을 바꿀 수 있다.
> 또한, 숫자 뿐 아니라 문자도 적용할 수 있다. **for(c in 'A'..'F')** 형태로 사용이 가능하다.

### [맵에 대한 반복(for)](src/basics/IteratingOverMaps.kt)

> 맵은 **for((key, value) in map)** 의 형태로 반복할 수 있다. 원소를 풀어서 두 변수에 저장한다. 또한 get, put을 사용하는 대신 map[key] = value 형태로도 값을 가져오거나 설정할 수 있다.
> 또한, 이러한 **구조 분해 문법**을 맵이 아닌 컬렉션에서도 사용할 수 있다. 원소의 현재 인덱스를 유지하면서 컬렉션을 이터레이션할 수 있다. 인덱스를 저장하기 위한 변수를 따로 만들 필요가 전혀 없다.
 
### [in으로 컬렉션이나 범위의 원소를 검사하기](src/basics/UsingInCollectionRangeCheck.kt)

> **in** 연산자를 사용해 어떤 값이 범위에 속하는지 검사할 수 있다. 반대로 **!in**을 사용하면 어떤 값이 범위에 속하지 않는지 검사할 수 있다. 또한 in 연산자는 when 식에서 사용할 수 있다.
> 범위는 문자에만 국한되지 않고, 비교가 가능한 클래스(_java.lang.Comparable 인터페이스를 구현한 클래스_)라면 범위를 만들 수 있다. 

### [코틀린의 예외 처리(try, catch, finally)](src/basics/Exceptions.kt)

> 함수를 정상적으로 종료할 수도 있지만, 예외를 발생할 수 잇다. 함수를 호출하는 쪽에서는 그 예외를 잡아 처리할 수 있다. 기본 예외 처리 구문은 자바와 비슷하다, new keyword를 붙일 필요가 없다는 것만 다르다.
> 자바와 마찬가지로 예외를 처리하려면 try와 catch, finally 절을 함께 사용한다. 자바 코드와 큰 차이점은 throws 절이 없다는 것이다. 자바에서는 체크 예외를 명시적으로 처리해야 하지만, **코틀린은 체크 예외와 언체크 예외를 구별하지 않는다**.

### [코틀린의 예외 처리(Try를 식으로 사용하기)](src/basics/TryAsAnExpression.kt)

> 코틀린의 try 구문은 if나 when과 같이 **expression**이다. 따라서 try 값을 변수에 대입할 수 있다. if와 달리 try의 본문을 반드시 중괄호로 둘러싸야 한다. 다른 문장과 마찬가지로 try의 본문도 내부에 여러 문장이 있으면 마지막 식의 값이 전체 결과 값이다.

## 함수 정의와 호출

### [코틀린에서 컬렉션 만들기](src/functions/CreatingCollections.kt)

> 코틀린은 자신만의 컬렉션 기능을 제공하지 않는다. 표준 자바 컬렉션을 활용해 자바 코드와 상호작용 하기 훨씬 쉽게 만들었다. 단, 코틀린에서는 자바보다 더 많은 기능을 사용할 수 있다.
 
### [함수를 구현하기 쉽게 만들기(인자 이름 붙이기, 디폴트 값 지정하기)](src/functions/MakingFunctionEasierToCall.kt)

> 코틀린은 변수 이름 혼동과 무분별한 오버로딩을 막기 위해 함수 사용 시 인자 이름을 포함해서 사용하거나, 디폴트 값 지정이 가능하다. 자바에서는 인자로 지정한 각 문자열이 어떤 역할을 하는지 구분이 힘들다. 
> 또한, 자바는 일부 클래스에서 오버로딩한 메서드가 너무 많아진다는 문제가 있다. 이런 오버로딩 메서드들은 하위 호환성을 유지하거나 API 사용자에게 편의를 더하는 등 여러가지 이유로 만들어진다. 하지만 중복은 중복이다.
> 코틀린에서는 파라미터의 디폴트 값을 지정할 수 있으므로 이런 오버로딩 중 상당수를 피할 수 있다.

### [정적인 유틸리티 클래스를 없애기](src/functions/RidOfStaticUtilityClasses.kt)

> 자바는 모든 코드를 클래스의 메서드로 작성해야 한다. 하지만 실전에서는 어느 한 클래스에 포함시키기 어려운 코드가 종종 생긴다. 그 결과 다양한 정적 메서드를 모아두는 역할만 담당하고 특별한 상태나 인스턴스가 없는 클래스가 생겨난다.
> 코틀린에서는 이러한 무의미한 클래스가 필요 없다. 대신 함수를 직접 소스파일의 최상위 수준, 모든 다른 클래스 밖에 위치시키면 된다. 그런 함수들은 다른 패키지에서 그 함수를 사용하고 싶을 때 그 함수가 정의된 패키지만 임포트 하면 된다.
> 또, 함수와 마찬가지로 프로퍼티도 파일의 최상위 수준에 놓을 수 있다. 어떤 데이터를 클래스 밖에 위치시켜야 하는 경우는 흔하지 않지만, 가끔 유용할 때가 있다.

### [코틀린의 확장 함수](src/functions/ExtensionFunctions.kt)

> 기존 자바 API를 재작성 하지 않고도 코틀린이 제공하는 여러 기능을 사용 할 수 있다면 좋지 않을까? 바로 확장 함수가 그러한 역할을 해줄 수 있다.
> 어떤 클래스의 메서드인 것 처럼 호출할 수 있지만 그 밖에 선언된 함수를 의미한다. 확장 함수 내부에서는 일반 메서드의 본문처럼 **this** 키워드를 바로 사용할 수 있다. 
> 하지만 확장 함수를 정의했다고 해서 바로 모든 소스코드에서 사용할 수 있는 것은 아니다. 이름이 충돌나는 경우가 있기 때문이다. 그래서 코틀린에서는 클래스를 임포트 할때와 동일하게 개별 함수를 임포트 할 수 있도록 지원한다.

### [확장 함수로 유틸리티 함수 정의해보기](src/functions/UtilityFunctionAsExtensions.kt)

> 확장 함수는 단지 정적 메서드 호출에 대한 문법적인 편의를 제공한다. 그래서 클래스가 아닌 더 구체적인 타입을 수신 객체 타입으로 지정할 수 있다.
 
### [확장 함수의 오버라이드](src/functions/NoOverridingForExtensionFunctions.kt)

> 코틀린의 오버라이드도 일반적인 객체지향의 메서드 오버라이드와 같다.
> 하지만, 확장 함수는 오버라이드 할 수 없다. 확장 함수는 클래스의 일부가 아니다. 확장 함수는 클래스의 밖에 선언된다. 이름과 파라미터가 완전히 같은 확장 함수를 기반 클래스와 하위 클래스에 대해 정의해도,
> 실제로는 확장 함수를 호출할 때 수신 객체로 지정한 변수의 정적 타입에 의해 어떤 확장 함수가 호출될지 결정된다. 확장 함수를 첫 번째 인자가 수신 객체인 정적 자바 메서드로 컴파일 한다는 사실을 기억하자.
 
### [확장 프로퍼티](src/functions/ExtensionProperties.kt)

> 확장 프로퍼티를 사용하면 기존 클래스 객체에 대한 프로퍼티 형식의 구문으로 사용할 수 있는 API를 추가할 수 있다.
> 프로퍼티라는 이름으로 불리기는 하지만, 상태를 저장할 적절한 방법이 없기 때문에 실제로 확장 프로퍼티는 아무런 상태도 가질 수 없다.
> 하지만 프로퍼티 문법으로 더 짧게 코드를 작성할 수 있어서 편한 경우가 있다.

### [자바 컬렉션 API 확장](src/functions/ExtendingTheJavaCollectionsAPI.kt)

> 코틀린은 자바와 같은 클래스를 사용하지만 더 확장된 API를 제공한다. last, maxOrNull 등은 모두 확장 함수다. 코틀린 표준 라이브러리는 수많은 확장 함수를 포함한다. 

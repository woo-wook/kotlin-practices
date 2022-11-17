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

### [가변 인자 함수](src/functions/Varargs.kt)

> 리스트를 생성하는 함수인 **listOf**는 원하는 만큼 원소를 전달할 수 있다.  
> 라이브러리에서 해당 함수의 정의를 보면 **fun listOf<T>(vararg values: T): List<T> {...}** 형태와 같다.  
> 자바의 가변길이 인자인 **...** 문법과 같다고 생각하면 된다.  
> 또한 이미 배열에 들어있는 원소를 가변 길이 인자로 넘길 때도 코틀린과 자바 구문이 다르다.
> 자바에서는 배열을 그냥 넘기면 되지만, 코틀린에서는 배열을 명시적으로 풀어서 각 원소의 인자로 전달되게 해주는 **스프레드 연산자**를 사용해야 한다.

### [값의 쌍 다루기(중위 호출과 구조 분해 선언)](src/functions/WorkingWithPairs.kt)

> 이전에 맵에서 사용했던 **to** 라는 키워드는 코틀린 키워드가 아니다. 이 코드는 **중위 호출** 이라는 특별한 방식을 통해 일반 메서드를 호출한것이다! 중위 호출시에는 수신 객채와 유일한 메서드 인자 사이에 메서드 이름을 넣는다.(이때 객체, 메서드 이름, 인자 사이에는 공백이 필요하다.)
> 인자가 하나뿐인 일반 메서드나 확장 함수에 중위 호출을 사용할 수 있다. 함수를 중위 호출에 사용하게 허용하고 싶으면 **infix** 변경자를 함수 앞에 추가해야 한다. to 함수는 Pair라는 코틀린 표준 라이버러리 클래스를 반환한다.
> 이름대로 두 원소로 이뤄진 순서 쌍을 표현한다. Pair의 내용으로 두 변수를 즉시 초기화 할 수 있다. 이런 기능을 **구조 분해 선언**이라고 한다.

### [문자열 나누기](src/functions/SplittingStrings.kt)

> 자바의 String.split 메서드를 잘 알고 있을 것이다. 자바 split의 문제점은 **.** 으로 문자열을 분리할 수 없다. 구분 문자열은 실제로는 정규식이기 때문이다.
> 따라서 마침표(.)는 모든 문자를 나타내는 정규식으로 해석된다. 코틀린에서는 자바의 split 대신에 여러 가지 다른 조합의 파라미터를 받는 split 확장 함수를 지원하고, 혼동을 야기하는 메서드를 감춘다.
> 정규식을 받는 함수는 Regex타입의 값을 받는다. 따라서 코틀린에서는 split에 전달하는 값의 타입에  따라 정규식이나 일반 텍스트 중 어느 것으로 문자열을 분리하는지 쉽게 알 수 있다.
> 정규식 문법은 자바와 같다.
 
### [정규식과 3중 따옴표로 묶은 문자열](src/functions/TripleQuotedStrings.kt)

> 코틀린은 확장 함수를 통해 정규식을 사용하지 않고 보다 편하게 소스를 작성할 수 있다. 정규식은 강력하기는 하지만, 나중에 알아보기 힘들 때가 많다.
> 정규식이 필요할 때는 코틀린에서 제공하는 라이브러리를 사용하는게 편하다. 또한 정규식을 작성할 때 3중 따옴표 문자열을 사용할 수 있는데. 역슬래시를 포함한 어떠한 문자도 이스케이프 할 필요가 없다.
> 3중 따옴표 문자열은 문자열 이스케이프를 피하기 위해서만 사용하지 않고, 줄 바꿈을 표현하는 아무 문자열이나 그대로 들어간다. 특히 테스트 시 매우 유용하게 사용한다.

### [로컬 함수와 확장](src/functions/LocalFunctionsAndExtentions.kt)

> 좋은 코드란 중복이 없는 코드다. 코틀린에서는 함수에서 추출한 함수를 원 함수 내부에 중첩시킬 수 있다.
> 이렇게 하면 부가적인 비용을 들이지 않고도 깔끔하게 코드를 조작할 수 있다. 로컬 함수는 **자신이 속한 바깥 함수의 모든 파라미터와 변수를 사용할 수 있다**.
> 코드를 확장 함수로 뽑아내는 기법은 매우 유용하다. User는 라이브러리에 있는 클래스가 아니라 내 코드지만, 이 경우 검증 로직은 여기서만 사용하고 다른 곳 에서 쓰이지 않는 기능이기 때문에 포함시키고 싶지 않다.
> 하지만, 중첩된 함수의 깊이가 깊어지면 코드가 읽기 어려워지므로 주의해야 한다.

## 클래스, 객체, 인터페이스

### [코틀린 인터페이스](src/objects/KotlinInterface.kt)

> 코틀린 인터페이스는 자바 8 인터페이스와 비슷하다. 인터페이스 안에 추상 메서드 뿐 아니라 구현이 있는 메서드도 정의할 수 있다(java default keyword). 다만 인터페이스에는 아무런 상태도 들어갈 수 없다.
> 코틀린에서 클래스 **class**로 정의하지만, 인터페이스는 **interface**를 사용한다.
> 자바에서는 extends와 implements 키워드를 사용하지만, 클래스 이름 뒤에 콜론(:)을 붙이고 인터페이스와 클래스 이름을 적는 것으로 모두 처리한다. 자바와 마찬가지로 상속은 하나만 가능하다.
> override 키워드는 상위에 있는 프로퍼티나 메서드를 오버라이드 한다는 표시다. 인터페이스도 디폴트 메서드 구현을 제공할 수 있다. 특별하게 키워드를 붙여줘야 하는 java 8과 다르게 코틀린에서는 그냥 사용하면 된다.
> 한 클래스에서 두 인터페이스를 구현할 때 디폴트 구현이 들어있는 똑같은 메서드가 존재하면, 어느쪽 메서드도 선택되지 않는다. 반드시 구현을 대체할 오버라이드 메서드를 직접 제공해야 한다.

### [open, final, abstract](src/objects/FinalByDefault.kt)

> 자바에서는 final을 통해 명시적으로 상속을 금지하는 모든 클래스를 다른 클래스가 상속할 수 있다. 이렇게 상속이 가능하면 편리하지만 문제가 생기는 경우도 많다.
> **취약한 기반 클래스** 라는 문제는 하위 클래스가 기반 클래스에 대해 가졌던 가정이 기반 클래스를 변경하므로써 깨져버린 경우에 생긴다. 어떤 클래스가 자신을 상속하는 방법에 대해 정확한 규칙을 제공하지 않는다면 다른 방식으로 오버라이드 할 수 있다.
> 이렇게 기반 클래스를 변경하는 경우 하위 클래스 동작이 예기치 않게 바뀔 수 있는 문제에서 기반 클래스는 취약하다.
> 코틀린은 **기본적으로 final**이다. 어떤 클래스의 상속을 허용하려면 클래스 앞에 open 변경자를 붙여야 한다.
> 오버라이드 한 메서드의 구현을 하위 클래스에서 오버라이드를 금지하려면 final을 앞에 명시해야 한다.
> 또 이렇게 클래스의 기본적인 상태를 final로 사용하면서, 다양한 상태에서 스마트 캐스트가 가능하다. 스마트 캐스트는 타입 검사 뒤 변경 될 수 없는 경우에만 적용이 가능한데, 이 경우에 final이 아니라면 사용이 불가능하다.

### [가시성 변경자](src/objects/VisibilityModifiers.kt)

> 코틀린의 가시성 변경자는 자바와 비슷하다. 하지만 기본 가시성 변경자는 **public** 이다. 또한 자바의 기본 가시성인 패키지는 코틀린에 없다. 
> 패키지 전용 가시성에 대한으로 코틀린에는 **internal** 이라는 새로운 가시성 변경자를 도입했다. (모듈 내부에서만 사용 가능)
> 다른 차이는 코틀린에서는 최상위 선언에 대해 private 가시성을 허용한다. 비공개 가시성인 최상위 선언은 파일 내부에서만 사용이 가능하다.
> 또한 코틀린은 public 함수에서 그보다 가시성이 낮은 타입을 참조하지 못하게 한다. 이런 규칙은 어떤 함수를 호출하거나 확장할 때 필요한 모든 타입에 접근을 보장한다.
> 또한, 자바는 같은 패키지 안에서 protected 멤버에 접근이 가능하지만, 코틀린은 불가능하다.

### [내부 클래스와 중첩된 클래스](src/objects/InnerAndNestedClasses.kt)

> 자바처럼 코틀린도 클래스 안에 다른 클래스를 만들 수 있다. 도우미 클래스를 캡슐화 하거나 그 코드를 가까운 곳에 두고 싶을 때 유용하다.
> 자바와의 차이는 코틀린은 명시적으로 요청하지 않는 한 바깥쪽 인스턴스에 접근 권한이 없다. (선언하지 않으면 java의 static class다!)
> 코틀린에서 내부 클래스를 만들고 싶다면, **inner class**로 선언해야 한다.

### [봉인된 클래스](src/objects/SealedClasses.kt)

> when 식에서 클래스를 is로 비교했을 때 else 분기를 항상 넣어줘야 한다. 반환할 만한 의미있는 값이 없는 경우 예외를 던지는데. 이렇게 되면 하위 클래스를 추가하더라도 컴파일러가 when이 모든 경우를 처리하는지 검사할 수 없다.
> 코틀린은 이런 문제에 대한 해법으로 **sealed** class를 제공한다. 상위 클래스에 키워를 붙이면, 그 상위 클래스를 상속한 하위 클래스 정의를 제한할 수 있다.
> default 분기를 사용하지 않으면 나중에 새로운 하위 클래스를 추가해도 when식이 컴파일 되지 않는다. 따라서 when 식을 고쳐야 한다는 사실을 쉽게 알 수 있다.

### [주 생성자와 초기화 블록](src/objects/PrimaryConstructorAndInitBlock.kt)

> 자바에서는 생성자를 하나 이상 선언할 수 있다. 코틀린도 비슷하지만 하나 다른 점은 주 생성자와 부 생성자를 구분한다. 또한 코틀린에서는 초기화 블록을 통해 초기화 로직을 추가할 수 있다.
> 클래스의 모든 선언은 보통 중괄호 사이에 들어간다, 하지만 코틀린에서는 중괄호 없이 괄호 사이에 val 선언만 존재할 수 있다. 클래스 이름 뒤에 오는 괄호로 둘러 쌓인 코드를 **주 생성자**라고 한다.
> 클래스에 기반 클래스가 있다면 주 생성자에서 기반 클래스의 생성자를 호출해야 한다. 기반 클래스 뒤에 괄호를 치고 생성자 인자를 넘긴다. 이 규칙으로 인해 기반 클래스의 이름 뒤에는 꼭 빈 괄호가 들어간다.
> 반면 인터페이스는 생성자가 없기에 아무 괄호도 없다.

### [부 생성자](src/objects/SecondaryConstructor.kt)

> 일반적으로 코틀린에서는 생성자가 여럿 있는 경우가 매우 적다. 디폴트 파라미터 값과 이름 붙은 인자 문법을 통해 대부분이 해결 가능하다.
> 그래도 생성자가 여럿 필요 한 경우가 가끔 있다. 이럴 때 **construct(parameter...): super() { }** 형태로 생성자를 추가로 선언할 수 있다.
> 또한 자바와 마찬가지로 생성자에서 **this()**를 호출해 본인의 다른 생성자도 호출할 수 있다.

### [인터페이스에 선언 된 프로퍼티 구현](src/objects/ImplementingProperty.kt)

> 코틀린에서는 인터페이스에 추상 프로퍼티를 선언할 수 있다. 이는 해당 인터페이스가 해당 값을 얻을 수 있는 방법을 제공해야 한다는 뜻이다.
> custom getter로 생성하게 되면, 항상 값을 얻기 위해 데이터를 조회하고, 프로퍼티 초기화 식을 사용하면 최초에 한번 조회하여 데이터를 저장해둔다.

### [게터와 세터에서 뒷받침하는 필드에 접근](src/objects/AccessingGetterOrSetter.kt)

> 어떤 값을 저장하되 그 값을 변경하거나 읽을 때 마다 정해진 로직을 실행하는 유형의 프로퍼티를 만들어보자.
> 코틀린에서는 프로퍼티의 값을 바꿀때 **adresss = "new Value"** 처럼 필드 설정 구문을 사용한다. 이러한 구문은 내부적으로 setter를 호출한다.

### [접근자의 가시성 변경](src/objects/ChangeAccessorVisibility.kt)

> 접근자의 가시성은 기본적으로 프로퍼티의 가시성과 같다. 하지만 원한다면 가시성 변경자를 추가해 접근자의 가시성을 변경할 수 있다.

### [모든 클래스가 정의해야 하는 메서드](src/objects/UniversalObjectMethods.kt)

> 모든 클래스는 **toString()**, **equals()**, **hashCode()** 를 구현해야 한다. 기본적으로 구현은 되어 있지만, 요구사항을 만족하기 위해 추가로 오버라이드하는 경우가 종종 있다.
>  **equals()**, **hashCode()** 는 항상 같이 구현해야 한다. (example set)

### [데이터 클래스](src/objects/DataClass.kt)

> 어떤 클래스가 데이터를 저장하는 역할만 수행한다면, **toString()**, **equals()**, **hashCode()** 를 반드시 오버라이드 해야한다. 코틀린은 더 편리하게 이런 메서드를 컴파일러가 자동으로 만들어주는 **data class** 를 제공한다.
> **equals** 와 **hashCode** 는 주 생성자에 나열 된 모든 프로퍼티를 고려해서 만들어 진다. 이때 주 생성자 밖에 정의된 프로퍼티는 고려의 대상이 아니란 사실에 유의하자.
> 데이터 클래스의 프로퍼티가 반드시 val일 필요는 없다. 원한다면 var 프로퍼티를 사용해도 된다. 하지만 모든 데이터 클래스를 읽기 전용으로 만들고 코틀린 컴파일러에서 제공하는 편의 메서드인 **copy()** 를 사용하자.

### [클래스 위임(by keyword)](src/objects/ClassDelegation.kt)

> 종종 상속을 허용하지 않는 클래스에 새로운 동작을 추가해야 할 때가 있다. 이럴때 사용하는 일반적인 방법이 **데코레이터 패턴**이다. 이 패턴의 핵심은 상속을 허용하지 않는 클래스 대신 사용할 수 있는 클래스를 만들되 기존 클래스와 같은 인터페이스를 데코레이터가 제공하게 만들고,
> 기존 클래스를 데코레이터 내부에 필드로 유지하는 것이다. 이런 접근 방법의 단점은 준비 코드가 많이 필요하다는 점이다. 코틀린은 이러한 기능을 **by** 키워드를 통해 구현을 다른 객체에 위임중이라는 사실을 명시할 수 있다. 메서드 중 일부의 동작을 변경하고 싶을 때는 메서드를 오버라이드 하면 컴파일러가 생성한 메서드 대신 오버라이드한 메서드가 쓰인다.

### [객체 선언(싱글턴을 쉽게 만들기)](src/objects/ObjectDeclarations.kt)

> 객체지향 시스템을 설계하다 보면 인스턴스가 하나만 필요한 클래스가 유용한 경우가 많다. 자바는 보통 싱글턴 패턴을 통해 이를 구현한다.
> 코틀린은 객체 선언 기능을 언어에서 기본 지원한다. 객체 선언은 object로 시작된다. 일반적인 클래스와 비슷하지만, 생성자를 선언할 수 없다. 일반 인스턴스와 달리 싱글턴 객체는 선언문이 있는 위치에서 즉시 만들어진다.
> 객체 선언에 사용한 이름 위에 마침표를 붙이면 객체에 속한 메서드나 프로퍼티에 바로 접근할 수 있다. 특히 특정 인터페이스를 구현해야 하는데, 그 구현 내부에 다른 상태가 필요하지 않은 경우에 매우 유용하다.

### [동반 객체](src/objects/CompanionObjects.kt)

> 코틀린 클래스 안에는 정적인 멤버가 없다. 코틀린은 java static keyword를 제공하지 않는다. 대신 코틀린에서는 패키지 수준의 최상위 함수와 객체 선언을 활용한다.
> 대부분의 경우 최상위 함수를 활용하는 편을 권장한다. 하지만 최상위 함수는 private 멤버에 접근할 수 없다. 그래서 클래스의 인스턴스와 관계 없이 호출해야 하지만, 클래스 내부 정보에 접근해야 하는 함수가 필요할 때는 클래스에 중첩 된 객체 선언의 내부 함수로 정의해야 한다.
> 클래스 안에 정의된 객체 중 하나에 **companion**이라는 특별한 표시를 붙이면, 그 클래스의 동반 객체로 만들 수 있다. 이렇게 하면 자바의 정적 메서드 호출과 필드 사용 구문과 같아진다.
> 대표적으로 부 생성자를 팩토리 메서드로 대신 할 때를 들 수 있다.

### [동반 객체를 일반 객체처럼 사용](src/objects/CompanionObjectsAsRegularObjects.kt)

> 동반 객체는 클래스 안에 정의 된 일반 객체다. 따라서 동반 객체에 이름을 붙이거나, 인터페이스를 상속하거나, 확장 함수와 프로퍼티를 정의할 수 있다.
> 대부분의 경우에는 클래스 이름을 통해 동반 객체에 접근할 수 있으므로 객체의 이름을 지을 필요가 없다. (짓지 않으면 자동으로 Companion이 된다.)
> 또한, 동반객체도 확장할 수 있다.

### [객체 식](src/objects/ObjectExpressions.kt)

> object 키워드는 싱글턴과 같은 객체를 정의할때만 사용하지 않는다. **무명 객체**를 정의할때도 object 키워드를 사용한다. 무명 객체는 자바의 무명 내부 클래스를 대신한다.
> 변수에도 무명 객체를 대입할 수 있다. 그 식이 포함된 함수에도 접근이 가능하다.

## 람다로 프로그래밍

### [코드 블록을 함수 인자로 넘기기](src/lambdas/BlocksOfCodeAsMethodParameters.kt)

> 이벤트가 발생하면 이 핸들러를 실행하자는 생각을 코드로 표현하기 위해 일련의 동작을 변수에 저장하거나 함수에 넘겨야 하는 경우가 자주 있다. 자바에서는 무명 내부 클래스를 통해 이런 목적을 달성했다. 이와 달리 함수형 프로그래밍에서는 함수를 값처럼 다루는 접근 방법을 택하므로써 이 문제를 해결한다.
> 람다 식을 사용하면 코드가 더욱 간결해진다. 함수를 선언할 필요가 없어 코드 블록을 직접 함수의 인자로 전달할 수 있다.
 
### [람다와 컬렉션](src/lambdas/LambdasAndCollections.kt)

> 컬렉션을 다룰 떄 수행하는 대부분의 작업은 몇 가지 일반적인 패턴에 속한다. 따라서 그런 패턴은 라이브러리 안에 있어야 한다. 하지만 람다가 없다면 컬렉션을 편리하게 처리할 수 있는 좋은 라이브러리를 제공하기 힘들다.
> 람다가 없다면 루프를 써서 최댓값과 최솟값을 구할것이다. 코틀린에서는 라이브러리 함수로 쉽게 구할 수 있다.
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

### [람다식의 문법](src/lambdas/SyntaxForLambda.kt)

> 람다는 여기저기 전달할 수 있는 동작의 모음이다. 람다를 따로 선언해서 변수에 저장할 수 있다.
> 하지만 함수에 인자로 넘기면서 바로 람다를 정의하는 경우가 대부분이다. 람다는 항상 중괄호 사이에 존재하고, 파라미터와 본문으로 구분된다.
> 코틀린의 람다는 컴파일러가 유추할 수 있는 인자 타입은 굳이 적을 필요가 없고, 인자가 하나 뿐인 경우 굳이 인자를 붙이지 않아도 된다(it으로 사용 가능)
> 코틀린에는 함수 호출 시 맨 뒤에 있는 인자가 람다 식이라면, 그 람다를 괄호 밖으로 빼낼 수 있다는 문법 관습이 있다. 본문이 한줄 이상인 경우 본문에 맨 마지막에 있는 식이 람다의 결과 값이 된다.

### [현재 영역에 있는 변수에 접근](src/lambdas/AccessingVariablesInScope.kt)

> 자바 메서드 안에서 무명 내부 클래스를 정의할 떄 메서드의 로컬 변수를 무명 내부 클래스에서 사용할 수 있다. 람다 안에서도 같은 일을 할 수 있다.
> 람다를 함수 안에서 정의하면 함수의 파라미터 뿐 아니라 람다 정의의 앞에 선언된 로컬 변수까지 람다에서 모두 사용할 수 있다.
> 자바와 다른 점 중 중요한 한 가지는 코틀린 람다 안에서는 파이널 변수가 아닌 변수에 접근할 수 있다는 점이다. 또한 람다 안에서 바깥의 변수를 변경해도 된다.
> 람다 안에서 사용하는 외부 변수를 **람다가 포획한 변수** 라고 부르는데, 포획한 변수가 있는 람다를 저장해서 함수가 끝난 뒤에 실행해도 람다의 본문 코드는 여전히 포획한 변수를 읽거나 쓸 수 있다.

### [멤버 참조](src/lambdas/MemberReferences.kt)

> 넘기려는 코드가 이미 함수로 선언 된 경우에는 함수를 호출하는 람다를 만들어도 되지만, 함수를 직접 넘길 수 있다. 코틀린에서는 자바 8과 마찬가지로 함수를 값으로 바꿀 수 있다. 이때 이중 콜론(::)을 사용한다. 
> ::를 사용하는 식을 **멤버 참조** 라고 부른다. 멤버 참조는 프로퍼티나 메소드를 단 하나만 호출하는 함수 값을 만들어준다.

### [filter와 map](src/lambdas/FilterAndMap.kt)

> 필터와 맵은 컬렉션을 활용할 때 기반이 되는 함수다. filter 함수는 컬렉션을 이터레이션 하면서 주어진 람다에 각 원소를 넘겨서 람다가 true를 반환하는 원소만 모은다.
> map 함수는 주어진 람다를 컬렉션의 각 원소에 적용한 결과를 모아서 새 컬렉션을 만든다.

### [All, Any, Count, Find](src/lambdas/AllAnyCountFind.kt)

> 컬렉션에 대해 자주 수행하는 연산으로 컬렉션의 모든 원소가 어떤 조건을 만족하는지 판단하는 연산이 있다. 코틀린에서는 **all**과 **any**가 이런 연산이다.
> **count** 함수는 조건을 만족하는 원소의 개수를 반환하며, **find** 함수는 조건을 만족하는 첫 번째 원소를 반환한다.
> count() 함수와 filter() 후 size를 가져오는 경우에는 무조건 count() 함수를 사용하자, filter().size를 하게 되면 모든 원소가 들어가는 중간 컬렉션이 생겨 효율성이 떨어진다.

### [GroupBy(리스트를 여러 그룹으로 이뤄진 맵으로 변경하기)](src/lambdas/GroupBy.kt)

> 컬렉션의 모든 원소를 어떤 특성에 따라 여러 그룹으로 나누고 싶다고 하자. 예를 들어 사람을 나이에 따라 분류해보자. 특성을 파라미터로 전달하면 자동으로 구분해주는 함수가 있다면 편리 할 것이다. groupBy 함수가 그런 역할을 한다.

### [flatMap과 flatten](src/lambdas/FlatMapAndFlatten.kt)

> **flatMap** 함수는 인자로 주어진 람다를 컬렉션의 모든 객체에 적용하고 람다를 적용한 결과 얻어지는 여러 리스트를 한 리스트로 한데 모은다.
> 특별히 변환할 내용이 없다면 **flatten** 함수를 사용해 데이터를 펼치기만 하면 된다.

### [지연 계산(lazy) 컬렉션 연산(Sequence)](src/lambdas/FlatMapAndFlatten.kt)

> 앞에서 나온 컬렉션 함수는 결과를 즉시 생성한다. 이는 컬렉션 함수를 연계할수록 중간 결과를 임시 컬렉션에 담는다. 하지만 **시퀀스**를 사용하면 중간 컬렉션을 사용하지 않고 컬렉션 연산을 연쇄할 수 있다.
> 원소가 많은 경우에는 성능이 눈에 띄게 좋아진다. 코틀린의 Sequence interface는 단지 한번에 하나씩 열거되는 원소의 시퀀스만 표현한다. iterator 메서드를 통해 시퀀스로 부터 값을 얻어낸다.
> 시퀀스의 원소는 **필요할 때 계산을**시작한다. 따라서 중간 처리 과정이 없다.
> 시퀀스는 **중간 연산**과 **최종 연산**으로 나뉜다. 중간 연산은 다른 시퀀스를 반환하고, 최종 연산은 결과를 반환한다. 시퀀스의 수행 순서는 각 원소에 대해 수행을 한번씩 하지만, 시퀀스의 결과는 원소별로 체이닝 되어있는 모든 중간 연산을 실행한 후 다음 원소로 넘어간다,.
> 결과가 먼저 얻어지는 경우 그 이후에 대해서는 변환을 하지 않는다. 단, filter와 map 처럼 먼저 수행했을 때 차후 연산을 실행하지 않을 소지가 있는 경우에는 순서를 잘 신경써서 작성해야 한다.
> 이를 활용하여 시퀀스를 만들어 사용하게 되면 불필요한 연산이 매우 줄어든다.

### [자바 메서드에 람다를 인자로 전달](src/lambdas/PassingLambdaJavaMethod.kt)

> 코틀린과 자바 사이에서도 람다를 사용해도 문제가 없다. 이전 자바에서는 메서드에 인자로 넘기기 위해 무명 클래스 인스턴스를 만들어야 했다. 코틀린에서는 무명 클래스 대신 람다를 넘길 수 있다. 이러한 코드가 가능한 이유는 추상 메서드가 단 하나만 있기 때문이다. 
> 그러한 인터페이스를 함수형 인터페이스 또는 SAM 인터페이스라고 한다. 무명 객체를 넘겨도 되지만, 무명 객체는 새로운 객체가 매번 생성되는 반면에, 람다는 정의가 들어있는 함수 변수에 접근하지 않는 람다에 대응하는 무명 객체를 메서드를 호출할 때 마다 반복하여 사용한다.
> 주변 변수를 포획한다면 매번 다른 인스턴스를 만들어준다. 대부분 이렇게 자동으로 만들어진다.

### [람다를 함수형 인터페이스로 명시적 변경(SAM)](src/lambdas/SAM.kt)

> SAM 생성자는 람다를 함수형 인터페이스의 인스턴스로 변환할 수 있게 컴파일러가 자동으로 생성한 함수다. 컴파일러가 자동으로 무명 클래스로 바꾸지 못하는 경우 SAM 생성자를 사용할 수 있다.
> SAM 생성자의 이름은 사용하려는 함수형 인터페이스의 이름과 같다. 그 함수형 인터페이스의 유일한 추상 메서드에 사용할 람다만들 인자로 받아서 함수형 인터페이스를 구현하는 클래스의 인스턴스를 반환한다.

### [수신 객체 지정 람다(with와 apply)](src/lambdas/WithAndApply.kt)

> 어떤 객체의 이름을 반복하지 않고도 그 객체에 다양한 연산을 수행할 수 있다면 좋을 것이다. 다양한 언어가 그러한 기능을 제공한다. 코틀린에서는 with라는 라이브러리 함수를 통해 제공한다.
> **apply**는 거의 with와 같지만, 차이는 자신에게 전달 된 객체를 반환한다. apply는 확장 함수로 정의되어 있다. 수신 객체가 전달받은 람다의 수신 객체가 된다.

## 코틀린 타입 시스템

### [널이 될 수 있는 타입](src/typesystem/NullableTypes.kt)

> 코틀린과 자바의 중요한 차이는 코틀린 타입 시스템이 널이 될 수 있는 타입을 명시적으로 지원한다는 점이다. 널이 될 수 있는 타입은 프로그램 안의 프로퍼티나 변수에 null을 허용하게 하는 방법이다. 어떤 변수가 널이 될 수 있다면 그 변수에 대해 메서드를 호출하면 
> NullPointException이 발생할 수 있으므로 안전하지 않다. 코틀린은 그런 메서드 호출을 금지하므로써 많은 오류를 방지한다. 코틀린은 널을 인자로 받을 수 있는가를 판별하여 함수를 작성하면, 인자로 넘길 수 없으며, 넘기게 되면 컴파일 시 오류가 발생한다.
> 함수가 널을 받을 수 있게 하려면 타입 이름 뒤에 **물음표(?)**를 명시해야 한다. 어떤 타입이든 이름 뒤에 물음표를 붙이면 그 타입의 변수나 프로퍼티에 null을 저장할 수 있다.
> 널이 가능한 변수가 있다면 그에 대해 수행할 수 있는 연산이 제한된다. 예를들어 변수.메서드()를 직접 호출할 수 없다. 이것을 하기 위해서는 null과 비교해야한다. null과 비교한 이후에는 컴파일러가 그 사실을 기억하고 null이 아닌 영영게서는 해당 값을 사용할 수 있다.

### 타입의 의미

> 타입은 분류로 어떤 값들이 가능한지와 그 타입에 대해 수행할 수 있는 연산의 종류를 결정한다. 자바에서 String 타입의 변수에는 String, null 두 가지 종류의 값이 들어갈 수 있다.
> 이 두 종류의 값은 완전히 다르다. (심지어 instanceOf 연산자도 String이 아니라고 반응한다.) 이는 자바의 타입 시스템이 널을 제대로 다루지 못한다는 뜻이다. 코틀린은 널이 될 수 있는 타입은 이런 문제에 종합적인 해답을 제공한다. 
> 널이 가능한 타입과 불가능한 타입을 구분하면 각 탕비에 대해 어떤 연산이 가능할 지 명확히 이해할 수 있다.

### [안전한 호출 연산자(?.)](src/typesystem/SafeCallOperator.kt)

> 코틀린의 제공하는 가장 유용한 도구 중 하나가 안전한 호출 연산자인 **?.** 이다. null 검사와 메서드 호출을 한번의 연산으로 수행한다. 호출하려는 값이 널이 아니라면 ?.은 일반 메서드 호출처럼 작동하고, 호출하는 값이 널이면 호출은 무시되고 널을 반환한다.
> 안전한 호출의 결과 타입도 널이 될 수 있는 타입이라는 사실을 유의해야 한다. 메서드 호출 뿐 아니라 프로퍼티를 읽거나 쓸때도 안전한 호출을 사용할 수 있다.

### [엘비스 연산자(?:)](src/typesystem/ElvisOperator.kt)

> 코틀린은 null 대신 사용할 디폴트 값을 지정할 때 편리하게 사용할 수 있는 연산자를 제공한다. 그 연산자를 **엘비스 연산자** 라고 한다.
> 이 연산자는 이항 연산자로 좌항을 계산한 값이 널인지 검사한다. 좌항 값이 널이 아니면 좌항 값을 결과로 하고 널이면 우항 값을 결과로 한다.
> 코틀린에서는 return이나 throw등의 연산도 식이다. 따라서 엘비스 연산자의 우항에 넣을 수 있다. 이런 패턴은 함수의 전제 조건을 검사하는 경우 특히 유용하다.

### [안전한 캐스트(as?)](src/typesystem/SafeCasts.kt)

> 자바 타입 캐스트와 마찬가지로 대상 값을 as로 지정한 타입을 바꿀 수 없으면 **ClassCastException**이 발생한다. 물론 as를 사용할 때 미리 is를 통해 변환 가능한 타입인지 검사할 수 있다. 하지만 코틀린은 더 안전하고 간단한 해법을 제공한다.
> **as?** 연산자는 어떤 값을 지정한 타입으로 캐스팅한다. 대상 타입으로 반환할 수 없으면 null을 반환한다. 안전한 캐스트를 사용할 때 일반적인 패턴은 캐스트를 수행한 후에 엘비스 연산자를 사용하는 것이다.
> 이러한 패턴을 사용하면 파라미터로 받은 값이 원하는 타입인지 쉽게 검사하고 캐스트 할 수 있고, 타입이 맞지 않으면 쉽게 false를 반환할 수 있다.

### [널 아님 단언(!!)](src/typesystem/NotNullAssertions.kt)

> **널 아님 단언**은 코틀린에서 널이 될 수 있는 타입을 다룰때 사용할 수 있는 도구 중에서 가장 단순하면서도 무딘 도구다. 어떤 값이든 널이 될 수 없는 타입으로 강제로 변경할 수 있다. 실제 널에 !!를 사용하면 NPE가 발생한다.
> 코틀린의 NPE는 단언문이 존재하는 곳에서 발생한다. 나는 이값이 널이 아님을 알고 있고 예외가 발생해도 감수한다는 의미로 사용한다. 어떤 값이 널인지 검사한 다음에 다른 함수를 호출한다고 해도 컴파일러는 안전하게 사용 가능한지 인식할 수 없다. 이럴때 널 아님 단언을 사용한다.
> 코틀린 설계자들은 널 아님 단언보다 더 나은 방법을 찾아보라는 의도를 가지고 있다.

### [let 함수](src/typesystem/LetFunction.kt)

> let 함수를 사용하면 널이 될 수 있는 식을 더 쉽게 다룰 수 있다. 안전한 호출 연산자와 함께 사용하면 원하는 식을 평가해 결과가 널인지 검사한 다음에 그 결과를 변수에 넣는 작업을 간단한 식을 사용해 한번에 처리할 수 있다.

### [나중에 초기화할 프로퍼티](src/typesystem/LateInitProperties.kt)

> 객체를 일단 생성 한 다음에 나중에 초기화 하는 프레임워크가 많다. 코틀린은 클래스 안의 널이 될 수 없는 프로퍼티 생성자 안에서 초기화 하지 않고 특별한 메서드에서 초기화 할 수 없다.
> 초기화 값을 제공할 수 없으면 널이 될 수 있는 타입을 사용할 수 밖에 없다. 이를 해결하기 위해 코틀린에서는 **lateinit** keyword를 지원한다. 나중에 초기화 하는 프로퍼티는 항상 var 여야한다.
> 그 프로퍼티를 초기화 하기 전에 접근하면 lateinit property 예외가 발생한다.

### [널이 될 수 있는 타입 확장](src/typesystem/ExtensionsOnNullableTypes.kt)

> 널이 될 수 있는 타입에 대한 확장 함수를 정의하면 null 값을 다루는 강력한 도구로 활용할 수 있다. 어떤 메서드를 호출하기 전에 수신객체 역할을 하는 변수가 널이 될 수 없다고 보정하는 대신, 직접 변수에 대해 메서드를 호출해도 확장 함수인 메서드가 널을 처리해준다.
> 이런 처리는 확장함수에서만 가능하다. 일반 멤버 호출은 객체 인스턴스를 통해 디스패치 되므로, 인스턴스가 널인지 여부를 검사하지 않는다. 실제로 String? 타입의 수신 객체에 호출할 수 있는 **isNullOrEmpty**나 **isNullOrBlank** 메서드가 있다.
> 안전한 호출 없이도 널이 될 수 있는 수신 객체 타입에 선언된 확장 함수를 호출할 수 있다.

### [타입 파라미터의 널 가능성](src/typesystem/NullabilityOfTypeParameters.kt)

> 코틀린은 함수나 클래스의 모든 타입 파라미터는 기본적으로 널이 될 수 없다. 널이 될 수 있는 타입을 포함하는 어떤 타입이라도 타입 파라미터를 대신할 수 없다.
> 따라서 타입 파라미터 T를 클래스나 함수 안에서 타입 이름으로 사용하면 이름 끝에 물음표가 없더라도 T가 널이 될 수 있는 타입이다. 타입 파라미터가 널이 아님을 확실히 하려면 타입 상한을 지정해야 한다.

### [널 가능성과 자바](src/typesystem/NullabilityAndJava.kt)

> 코틀린은 자바 상호 운용성을 자랑스럽게 강조하는 언어다. 자바 타입 시스템은 널 가능성을 지원하지 않는다. 그렇다면 어떻게 해야할까?
> 첫번째는 자바 코드에도 애노테이션으로 표시 된 널 가능성 정보가 있다. 이런 정보가 코드에 있으면 코틀린도 그 정보를 확용한다. 이러한 널 가능성 애노테이션이 없으면 자바의 타입은 코틀린의 플랫폼 타입이 된다.
> 플랫폼 타입은 코틀린이 널 관련 정보를 알 수 없는 타입을 말한다. 그 타입을 널이 될 수 있는 타입으로 처리해도 되고, 아니어도 된다. 이는 자바와 마찬가지로 수행에 대한 모든 연산의 책임은 나에게 있다는 뜻이다.
> 코틀린은 공개 가시성인 코틀린 함수의 널이 아닌 타입인 파라미터와 수신 객체에 대한 널 검사를 추가해준다. 따라서 공개 가시성 함수에 널 값을 사용하면 즉시 예외가 발생한다. 
> 플랫폼 타입은 직접 선언할 수 없다. 또한 코틀린에서는 자바 메서드를 오버라이드 할 때 그 메서드에 파라미터와 반환 타입을 어떠한 방식으로 선언할 지 결정해야 한다.

### [원시 타입(Int, Boolean 등)](src/typesystem/PrimitiveTypes.kt)

> 코틀린은 원시 타입과 래퍼 타입을 구분하지 않는다. 반대로 자바는 원시 타입과 래퍼 타입을 구분한다. 래퍼 타입은 원시 타입의 값을 더 효율적으로 저장하고 여기 저기 전달할 수 있다. 하지만 그런 값에 대해 메서드를 호출하거나 컬렉션에 담을 수 없다.
> 필요한 경우 래퍼 타입을 사용한다. 코틀린은 구분하지 않아서 더욱 편리하다. 더 나아가서 코틀린은 숫자 타입 등 원시 타입에 대해 메서드를 호출 할 수 있다. 코틀린은 그들을 항상 객체로 표현하지 않고 가능한 한 가장 효율적인 방식으로 컴파일 된다.
> 이런 컴파일이 불가능 한 경우는 컬렉션과 같은 제네릭을 사용할 때 이다. 반대로 자바 원시 타입도 결코 널이 될 수 없으므로 널이 될 수 없는 타입으로 취급된다.

### [널이 될 수 있는 원시 타입(Int?, Boolean? 등)](src/typesystem/NullablePrimitiveTypes.kt)

> null 참조를 자바의 참조 타입의 변수에만 대입할 수 있기 때문에 널이 될 수 있는 코틀린 타입은 자바 원시 타입으로 표현할 수 없다. 따라서 코틀린에서 널이 될 수 있는 원시 타입을 사용하면 그 타입은 자바의 래퍼 타입으로 컴파일된다.

### [숫자 변환](src/typesystem/NumberConversions.kt)

> 코틀린과 자바의 큰 차이점은 숫자를 변환하는 방식이다. 한 타입의 숫자를 코틀린은 다른 타입의 숫자로 자동 변환하지 않는다. 코틀린은 원시타입에 대한 변환 함수를 제공한다. 그런 변환 함수의 이름은 **toChar(), toShort(), toByte()** 와 같다.
> 양방향 변환 함수가 모드 제공된다. 더 표현 범위가 좁은 타입으로 값을 변환하면 일부 잘라낸다. 코드에서 동시에 여러 숫자 타입을 사용하려면 각 변수를 명시적으로 변환해야 한다. 추가로 산술 연산자는 적당한 타입의 값을 받아들일 수 있게 이미 오버로드 되어 있다.

### [최상위 타입(Any, Any?)](src/typesystem/RootTypes.kt)

> 자바에서 Object가 클래스 계층의 최상위 타입이듯 코틀린에서는 Any 타입으 모든 널이 될 수 없는 타입의 조상 타입이다. 자바에서는 참조 타입만이 Object를 타입 계층에 포함되지만, 코틀린에서는 원시 타입도 모든 타입의 조상 타입으로 Any를 가진다.
> Any?는 널을 포함하는 모든 값을 대입할 수 있는 최상위 타입이다. 자바 메서드에서 Object를 인자로 받거나 반환하면 코틀린은 Any 타입으로 그 타입을 취급한다.(더 정확히는 플랫폼 타입인 Any!를 사용한다.)

### [코틀린의 Void(Unit)](src/typesystem/KotlinVoid.kt)

> 코틀린 Unit 타입은 자바의 void와 같은 기능을 한다. 관심을 가질 만한 내용을 전혀 반환하지 않는 함수의 반환 타입으로 Unit을 사용할 수 있다.
> 이는 반환 타입을 명시하지 않고 블록이 본문인 함수가 기본으로 가지게 되는 반환 타입이다. Unit 타입에 속한 값은 단 하나 뿐이며, 이름도 Unit이다. 
> 예를 들어, 제네릭에서 특정 필드를 반환 할 필요가 없을때 Unit로 지정하면 return을 생략할 수 있다. 자바에서는 Void 객체를 사용할 수 있지만 그래도 return null을 표기해야 한다.

### [이 함수는 결코 정상적으로 끝나지 않는다(Nothing)](src/typesystem/NothingType.kt)

> 코틀린에는 결코 성공적으로 값을 돌려주는 일이 없으므로 '반환 값'이라는 개념 자체가 의미 없는 함수가 일부 존재한다. 예를 들어 테스트 라이브러리는 fail이라는 함수를 제공하는 경우가 많다. 다른 예로 무한 루프를 도는 함수도 Nothing 값을 반환한다.
> 코틀린에서는 이러한 경우를 표현하기 위해 Nothing이라는 특별한 반환 타입이 있다. Nothing은 아무 값도 포함하지 않는다. Nothing을 반환하는 함수를 사용하면, 그 함수가 결코 정상 종료 되지 않음을 알고 그 함수를 호출하는 코드를 분석 시 사용한다.
> 예를 들어 엘비스 연산자의 우항에 사용하여 전제 조건을 검사할 수 있다.

### [널 가능성과 컬렉션](src/typesystem/NullabilityAndCollections.kt)

> 컬렉션 안에 널 값을 넣을 수 있는지 여부는 어떤 값이 널이 될 수 있는지 여부와 마찬가지로 중요하다. 어떤 변수 타입의 널 가능성과 타입 파라미터로 쓰이는 타입의 널 가능성을 잘 인지해야 한다. List<Int?>는 null element를 등록이 가능하고, 
> List<Int?>?는 List 자체가 null이 가능한 것을 의미한다.

### [읽기 전용과 변경 가능한 컬렉션](src/typesystem/MutableCollections.kt)

> 코틀린 컬렉션과 자바 컬렉션을 나누는 가장 중요한 특성 하나는 코틀린에서는 컬렉션 안의 데이터에 접근하는 인터페이스와 컬렉션 안에 데이터를 변경하는 인터페이스를 분리했다는 점이다.
> 코틀린 컬렉션의 기초적인 인터페이스인 kotlin.collections.Collection 원소를 추가하거나 삭제하는 메서드가 없다. 컬렉션의 데이터를 수정하려면 kotlin.collections.MutableCollection을 사용해야 한다.
> 코드에서 가능하면 항상 읽기 전용 인터페이스를 사용하자. 변경 할 필요가 있을때에만 변경 가능한 버전을 사용하라. 이 두개를 구분 한 이유는 프로그램에서 어떤 일이 벌어지는지 더 쉽게 이해하기 위함이다.
> 읽기 전용 클래스는 항상 thread-safe 하지 않다는 점을 명심하자. 다중 스레드 환경에서 데이털르 다루는 경우 그 데이터를 적절히 동기화 하거나 동시 접근을 허용하는 데이터 구조를 활용해야 한다.

### [코틀린 컬렉션과 자바](src/typesystem/KotlinCollectionsAndJava.kt)

> 모든 코틀린 컬렉션은 그에 상응하는 자바 컬렉션 인터페이스의 인스턴스다. 따라서 코틀린과 자바를 오갈 때 아무 변환도 필요 없다. 하지만 코틀린은 모든 자바 컬렉션 인터페이스 마다 읽기 전용과 변경 가능한 두가지 표현을 제공한다.
> 자바 메서드를 호출할 때 컬렉션을 인자로 넘기게 된다면, 직접 컬렉션을 넘기면 된다. 하지만 이런 성질로 인해 자바에서는 읽기 전용과 일반 컬렉션을 구분하지 않으므로 문제가 생긴다. 
> 이러할 때 올바른 타입을 사용할 책임은 오롯이 프로그래머의 책임이다.

### [컬렉션을 플랫폼 타입으로 다루기](src/typesystem/CollectionsAsPlatformTypes.kt)

> 플랫폼 타입의 경우 코틀린에서는 널 관련 정보가 없기에 널이 될 수 있는 타입, 될 수 없는 타입 어느쪽으로든 사용할 수 있도록 허용한다. 마찬가지로 자바쪽에서 선언한 컬렉션 타입의 변수를 코틀린에서는 플랫폼 타입으로 본다.
> 따라서 코틀린은 읽기 전용 컬렉션, 변경 가능한 컬렉션 어느 쪽으로든 다룰 수 있다. 보통은 원하는 동작이 수행 될 가능성이 높아 실제 문제가 되지는 않는다.
> 하지만 컬렉션 타입이 시그니처에 들어간 자바 메서드 구현을 오버라이드 하려는 경우 문제가 된다. 플랫폼 타입에서 널 가능성을 다룰 때 처럼 오버라이드 하려는 메서드의 자바 컬렉션 타입을 어떻게 표현할지 결정해야 한다.

### [객체의 배열과 원시 타입의 배열](src/typesystem/ArraysOfObjectsAndPrimitiveTypes.kt)

> 코틀린의 배열은 타입 파라미터를 받는 클래스다. 배열의 원소 타입은 바로 그 타입 파라미터에 의해 정해진다. 코틀린에서는 배열을 인자로 받는 자바 함수를 호출하거나 vararg 파라미터를 받는 코틀린 함수 호출을 위해 자주 배열을 만든다.
> 하지만 이때 데이터가 이미 컬렉션이 들어 있다면 컬렉션을 배열로 변환해야 한다. 다른 제네릭 타입 처럼 배열 타입의 인자도 항상 객체 타입이 된다. 코틀린은 원시 타입의 배열이 필요하다면 그런 타입을 위한 특별한 배열 클래스를 사용해야 한다.
> **IntArray, ByteArray** 등의 원시 타입 배열을 제공한다. 이 모든 타입은 자바 원시 타입 배열인 **int[], byte[]** 등으로 컴파일된다. 
> 코틀린 표준 라이브러리는 배열 기본 연산에 더해 컬렉션에서 사용할 수 있는 모든 확장 함수를 배열에도 제공한다.

## 연산자 오버로딩과 기타 관례

### [이항 산술 연산자 오버로딩](src/conventions/OverloadingBinaryArithmeticOperators.kt)

> 코틀린에서도 어떤 언어 기능이 사용자 작성 함수와 연결되는 경우가 몇가지 있다. 자바와 같이 어떤 타입과 연관된다기 보다는, 특정 함수 이름과 연관된다.
> 예를 들면 어떤 클래스 안에 plus라는 이름의 특별한 메서드를 정의하면, 그 클래스의 인스턴스에 대해 + 연산자를 사용할 수 있다. 이런 식으로 언어 기능과 미리 정해진 이름의 함수를 연결해주는 기법을 관례라고 부른다.
> 연산자를 오버로딩 하는 함수 앞에는 꼭 **operator**가 있어야 한다. 어떤 함수가 관례를 따르는 함수임을 명확히 할 수 있다. 직접 정의한 함수를 통해 구현하더라도 연산자 우선 순위는 언제나 표준 숫자 타입에 대한 연산자 우선 순위와 같다.
> *, /, % 우선순위가 같고, 이 셋의 우선 순위는 +, - 보다 높다. 연산자를 정의할때는 두 피연산자가 같은 타입일 필요는 없다. 

### [복합 대입 연산자 오버로딩](src/conventions/OverloadingCompoundAssignmentOperators.kt)

> plus와 같은 연산자를 오버로딩하면 코틀린은 + 연산자 뿐 아니라 그와 관련있는 연산자인 +=도 함께 지원한다. +=, -= 등의 연산자는 **복합 대입**연산자라고 불린다.
> 경우에따라 += 연산이 참조를 다른 참조로 바꾸기 보다 원래 객체의 내부 상태를 변경하게 만들고 싶을 때가 있다. 단, 어떤 클래스가 plus와 plusAssign을 모두 정의하고 컴파일을 양쪽 모두 할 수 있다면 오류가 발생한다.
> 되도록 동시에 정의하지 말자. 

### [단항 연산자 오버로딩](src/conventions/OverloadingUnaryOperators.kt)

> 단항 연산자를 오버로딩 하는 절차도 이항 연산자와 마찬가지다. 미리 정해진 이름의 함수를 선언하면서 operator로 표시하면 된다.

### [동등성 연산자 오버로딩(equals)](src/conventions/EqualityOperators.kt)

> 코틀린에서는 산술연산자와 마찬가지로 원시 타입 뿐 아니라 모든 객체에 대해 비교 연산을 수행할 수 있다. 코틀린은 동등성을 == 연산자 호출을 equals 메서드 호출로 컴파일한다. != 연산자를 호출하는 식 또한 equals 호출로 컴파일된다. 
> 코틀린은 널이 아닌 경우에만 호출하기에 NPE를 방지한다. data class는 이를 대신 생성해주는 역할을 수행한다. equals는 Any의 메서드이므로 override가 필요하다. 따라서 operator를 붙이지 않는다.

### [순서 연산자(compareTo)](src/conventions/OrderingOperators.kt)

> 자바에서 정렬이나 최댓값, 최솟값 등 비교해야하는 알고리즘에 사용할 클래스는 Comparable 인터페이스를 구현한다. 자바는 이를 짧게 표현할 방법을 지원하지 않는다. 코틀린도 같은 인터페이를 지원하고, compareTo 메서드를 호출하는 관례를 제공한다.
> 따라서 비교 연산자(>, <, <=, >=)는 compareTo 호출로 컴파일된다. compareTo가 반환하는 값은 Int다. p1 < p2는 p1.compareTo(p2) < 0과 같다. 코틀린은 표준 라이브러리의 compareValuesBy 함수를 통해 compareTo를 쉽고 간결하게 정의할 수 있다.
> 두 객체와 여러 비교 함수를 인자로 받는다. 두 객체가 같지 않으면 그 결과 값을 반환하고, 두 객체가 같다는 결과가 나오면 비교 함수를 통해 값을 비교한다.

### [인덱스로 원소에 접근](src/conventions/AccessingElementsByIndex.kt)

> 컬렉션을 다룰 때 가장 많이 쓰는 연산은 인덱스를 사용해 원소를 읽거나, 쓰거나, 검사하는 연산이다. 이 모든 연산을 연산자 구문으로 사용할 수 있다.
> 코틀린에서는 맵의 원소에 접근할 때나 자바에서 배열 원소에 접근할 때 모두 각괄호를 사용한다는 사실을 알고 있다. 코틀린에서는 인덱스 연산자도 관례를 따른다. 인덱스 연산자를 사용해 원소를 읽는 연산은 **get** 연산자 메서드로 변환된다.
> 메서드의 파라미터로 다른 타입도 사용이 가능하다. 또한 여러 파라미터를 사용하는 get을 정의할 수 있다. set은 마지막 파라미터가 대입문의 우항에 들어가고, 나머지는 인덱스 연산자에 들어간다.

### [in 관례](src/conventions/InConvention.kt)

> in은 객체가 컬렉션에 들어있는지 검사한다. 그런 경우 대응하는 함수는 contains 이다. in의 우항에 있는 객체는 contains 메서드의 수신 객체가 되고, 좌항이 있는 객체는 contains 메서드의 인자로 전달된다.

### [rangeTo 관례](src/conventions/RangeToConvention.kt)

> 범위를 만들려면 .. 구문을 사용해야 한다. 예를 들어 1..10은 1부터 10까지 모든 수가 들어있는 범위를 가리킨다. .. 연산자는 rangeTo 함수를 간략하게 표현하는 방법이다.

### [for 루프를 위한 iterator 관례](src/conventions/IteratorConventionForTheForLoop.kt)

> 코틀린의 for 루프는 범위 검사와 똑같이 in 연산자를 사용한다. 하지만 이 경우 in 의미가 다르다. list.iterator()를 호출해서 이터레이터를 얻은 다음, 그 이터레이터에 대해 hasNext, next 호출을 반복하는 식으로 변환된다.
> 하지만 코틀린은 이 또한 관례이므로 확장 함수로 정의할 수 있다. 이런 성질로 인해 일반 자바 문자열에 대한 for 루프가 가능하다.

### [구조 분해 선언과 component 함수](src/conventions/DestructuringDeclarationsAndComponentFunctions.kt)

> 구조 분해를 사용하면 복합적인 값을 분해해서 여러 변수를 한꺼번에 초기화 할 수 있다. 구조 분해 선언은 일반 변수 선언과 비슷해보인다. 하지만 좌변에 여러 변수를 괄호로 묶었다는 점이 다르다.
> 구조 분해 선언의 각 변수를 초기화 하기 위해 **componentN** 이라는 함수를 호출한다. data class의 주 생성자에 있는 프로퍼티에 대해서는 자동으로 해당 함수를 만들어준다. 배열이나 컬렉션에도 componentN 함수가 존재한다.
> 코틀린의 표준 라이브러리는 맨 앞의 다섯 원소에 대한 componentN을 제공한다. 또한 함수 본문 내의 선언문 뿐 아니라 변수 선언이 들어갈 수 있는 장소라면 어디든 구조 분해 선언을 사용할 수 있다. 예를 들어 루프 안에서도 구조 분해 선언을 사용할 수 있다.

### [위임 프로퍼티](src/conventions/DelegatedProperties.kt)

> 위임 프로퍼티를 사용하면 값을 뒷받침 하는 필드에 단순히 저장하는 것보다 더 복잡한 방식으로 작동하는 프로퍼티를 쉽게 구현할 수 있다.
> 또한 그 과정에서 접근자 로직을 매번 재구현 할 필요도 없다. 예를 들어 프로퍼티는 위임을 사용해 자신의 값을 필드가 아니라 데이터베이스나 브라우저, 맵 등에 저장할 수 있다.
> 위임 프로퍼티의 일반적인 문법은 **var p: Type by Delegate()** 와 같다. 이것은 접근자 로직을 다른 객체에게 위임한다. 컴파일러는 숨겨진 도우미 프로퍼티를 만들고 그 프로퍼티를 위임 객체의 인스턴스로 초기화한다.
> 프로퍼티 위임 관례를  따르는 Delegate 클래스는 getValue와 setValue 메서드를 제공해야 한다. 관례를 사용하는 다른 경우와 마찬가지로 멤버 메서드이거나 확장함수 일 수 있다.
> 일반 프로퍼티처럼 보이지만, 실제로는 Delegate의 위임 프로퍼티에 있는 메서드를 호출한다.

### [위임 프로퍼티 사용(by lazy()를 사용한 프로퍼티 초기화 지연)](src/conventions/LazyInitializationAndByLazy.kt)

> 지연 초기화는 객체의 일부분을 초기화하지 않고 남겨뒀다가, 실제로 그 부분의 값이 필요한 경우 초기화 할 때 흔히 쓰이는 패턴이다. 초기화 과정에 자원을 많이 사용하거나 객체를 사용할 때마다 꼭 초기화 하지 않아도 되는 프로퍼티에 지연 초기화 패턴을 사용할 수 있다.
> 보통 **뒷받침 하는 프로퍼티**라는 기법을 사용해서, private 프로퍼티를 만들어 값을 넣어두고, 그 변수를 읽는 방식으로 제공한다. 하지만 이 구현은 thread-safe 하지도 않고, 언제나 제대로 작동한다고 말할 수 없다. 코틀린은 위임 프로퍼티를 통해 더 나은 해법을 제공한다.

### [위임 프로퍼티 구현](src/conventions/ImplementingDelegatedProperties.kt)

> 어떤 객체의 프로퍼티가 바뀔 때 마다 리스너에게 변경 통지를 보내고 싶다. 이런 기능이 유용할 때가 많다. 예를 들어 화면의 ui가 자동으로 바뀌는 경우다. 자바에서는 PropertyChangeSupport와 PropertyChangeEvent를 사용해서 통지를 처리한다.
> 이러한 방식의 처리를 위임 프로퍼티를 사용하면 보다 간단하게 구현할 수 있다. 

### 위임 프로퍼티 컴파일 규칙

> 컴파일러는 클래스의 인스턴스를 감춰진 프로퍼티에 저장하며, 그 감춰진 프로퍼티를 &lt;Delegate&gt;라고 부른다. 그 이후 컴파일러는 모든 프로퍼티 접근자 안에 getValue와 setValue를 호출하는 코드를 생성해준다.
> 이 매커니즘은 단순하지만 흥미로운 활용 법이 많다. 프로퍼티를 저장할 장소를 바꿀 수 있고, 프로퍼티를 읽거나 쓸때 벌어질 일을 변경할 수도 있다.

### [프로퍼티 값을 맵에 저장](src/conventions/StoringPropertyValuesInAMap.kt)

> 자신의 프로퍼티를 동적으로 정의할 수 있는 객체를 만들 때 위임 프로퍼티를 활용하는 경우가 자주 있다. 그런 객체를 **확장 가능한 객체**라고 부르기도 한다. 예를 들어 연락처 관리 시스템에서 연락처 별로 임의의 정보를 저장할 수 있도록 허용하는 경우가 있다.
> 코틀린에서는 위임 프로퍼티를 보다 쉽게 사용할 수 있도록 표준 라리브러리에서 Map, MutableMap 인터페이스에 대해 setValue, getValue를 제공한다.

### 프레임워크에서 위임 프로퍼티 활용

> 객체 프로퍼티를 저장하거나 변경하는 방법을 바꿀 수 있으면 프레임워크를 개발할때 유용하다.  
 
## 고차 함수: 파라미터와 반환 값으로 람다를 사용하기

### [함수 타입](src/higherfunction/FunctionTypes.kt)

> 람다를 인자로 받거나 반환하는 함수인 고차 함수를 만들 수 있다. 고차 함수로 코드 중복을 없애고 더 나은 추상화를 구축할 수 있다.
> 코틀린은 타입 추론으로 변수 타입을 지정하지 않아도 람다를 변수에 대입할 수 있다. 함수 타입을 선언할 때는 반드시 반환 타입을 명시해야 한다.

### [인자로 받은 함수 호출](src/higherfunction/CallingFunctionsPassedAsArguments.kt)

> 인자로 받은 함수를 호출하는 구문은 일반 함수를 호출하는 구문과 같다.  

### [자바에서 코틀린 함수 사용](src/javatype/CallingProcessTheAnswer.java)

> 함수 타입은 일반 인터페이스로 바뀐다. 즉 함수 타입의 변수는 FunctionN 인터페이스를 구현하는 객체를 저장한다. 각 인터페이스에는 invoke 메서드 정의가 하나 들어있다.
> 이 메서드를 실행하면 함수를 실행할 수 있다. 이렇게 되어 함수 타입을 사용하는 코틀린 함수를 자바에서도 쉽게 호출할 수 있다.

### [디폴트 값을 지정한 함수 타입 파라미터나 널이 될 수 있는 함수 타입 파라미터](src/higherfunction/DefaultAndNullValuesForParametersWithFunctionTypes.kt)

> 파라미터를 함수 타입으로 선언할 때도 디폴트 값을 정할 수 있다. 매번 기본 동작으로도 충분한 대부분의 경우 함수 호출을 불편하게 만든다는 문제가 있어 이러한 디폴트 전략을 지원한다.
> 디폴트 값을 선언할 때 특별한 구문이 필요하지 않다. 다른 디폴트 파라미터와 마찬가지로 사용하면 된다. 

### [함수를 함수에서 반환](src/higherfunction/ReturningFunctionsFromFunctions.kt)

> 함수가 함수를 반환할 필요가 있는 경우보다는 함수가 함수를 인자로 받아야 할 필요가 있는 경우가 훨씬 더 많다. 하지만 함수를 반환하는 함수도 여전히 유용하다. 
> 예를 들어 배송비 계산 프로그램을 생각해보자. 자신이 선택한 배송 수단에 따라서 배송비 계산하는 방법이 달라질 수 있다.

### [람다를 활용한 중복 제거](src/higherfunction/RemovingDuplicationThroughLambdas.kt)

> 함수 타입과 람다 식은 재활용하기 좋은 코드를 만들 때 쓸 수 있는 훌륭한 도구다. 아주 복잡하게 구조를 만들어야 하는 코드도 람다를 활용하면 간결하고 쉽게 제거할 수 있다.

### [인라이닝이 작동하는 방식](src/higherfunction/HowInliningWorks.kt)

> 코틀린에서 람다를 함수 인자로 넘기는 구문이 if나 for와 같은 일반 문장과 비슷하다는 사실을 알 수 있다. 하지만 람다를 사용한 코드의 성능은 어떨까? 겉 보기에는 일반 문장과 같지만 훨씬 느리게 작동하지 않을까?
> 람다가 변수를 포획하면 람다가 생성되는 시점 마다 새로운 무명 클래스 객체가 생긴다는 사실을 알고 있다. 따라서 람다를 사용하는 방식은 똑같은 작업을 하는 일반 함수를 구현하는 방법도다 덜 효율적이다.
> 그렇다면, 컴파일러가 자바의 일반 명령문 만큼 효율적은 코드를 생성하게 할 수 없을까? 코틀린 컴파일러에서는 가능하다. **inline** 변경자를 붙이면 컴파일러는 그 함수를 호출하는 모든 문장을 함수 본문에 해당하는 바이트코드로 바꿔치기 해준다.
> 어떤 함수를 inline으로 선언하면 그 함수의 본문이 인라인된다. 다른 말로 하면 함수를 호출하는 코드를 함수를 호출하는 바이트코드 대신 함수 본문을 번역한 바이트코드로 컴파일한다. 
> 함수의 본문 뿐 아니라 전달된 람다가 있다면 람다의 본문도 함께 인라이닝 된다. 인라인 함수를 호출하면서 람다를 넘기는 대신 함수 타입의 변수를 넘길 수 있다. 이런 경우에는 본문은 인라이닝 되지 않고 함수만 인라이닝 된다.

### [인라인 함수의 한계](src/higherfunction/RestrictionsOnInlineFunctions.kt)

> 인라이닝 하는 방식으로 인해 람다를 사용하는 모든 함수를 인라이닝 할 수 없다. 함수가 인라이닝 될 때 그 함수에 인자로 전달 된 람다 식의 본문은 결과 코드에 직접 들어갈 수 있다.
> 하지만 이렇게 람다가 본문에 직접 펼쳐지기 때문에 함수가 파라미터로 전달받은 람다를 호출한다면. 그 호출을 쉽게 람다 본문으로 바꿀 수 있다. 하지만 파라미터로 받은 람다를 다른 변수에 저장하고 나중에 그것을 사용한다면, 람다를 표현하는 객체가 어딘가에는 존재해야 하기 때문에 인라이닝 할 수 없다.
> 둘 이상의 람다를 인자로 받는 함수에서 일부 람다만 인라이닝 하고 싶을 때도 있다. 예를 들어 어떤 람다에 너무 많은 코드가 들어가거나, 인라이닝을 하면 안되는 코드가 들어갈 가능성이 있다면 인라이닝 하면 안된다.
> 이러한 파라미터를 noinline 변경자를 파라미터 앞에 붙여서 인라이닝을 금지할 수 있다.

### [컬렉션 연산 인라이닝](src/higherfunction/InliningCollectionOperations.kt)

> 코틀린 표준 라이브러리의 컬렉션 함수는 대부분 람다를 인자로 받는다. 표준 라이브러리를 사용하지 않고 이런 연산을 직접 구현한다면 더 효율적이지 않을까?
> 코틀린의 filter 함수는 인라인 함수다. 따라서 filter 함수의 바이트 코드는 그 함수에 전달 된 람다 본문의 바이트코드와 함께 filter 호출 위치에 들어간다. 
> 그 결과 직접 연산을 구현하는 것과 filter를 사용한 것의 바이트 코드는 거의 차이가 없다. 만약 인라인 함수를 연쇄해서 사용하면, 두 함수의 본문은 인라이닝 되며 추가 객체나 클래스 생성은 없다. 
> 하지만 map, filter를 연쇄해서 사용하면 걸러낸 결과를 저장하는 중간 리스트를 만든다. 처리할 원소가 많아지면 중간 리스트를 사용하는 부가 비용이 커진다. **asSequence**를 통해 리스트 대신 시퀀스를 사용하면 중간 리스트로 인한 비용이 줄어든다.
> 이때 각 중간 시퀀스는 람다를 필드에 저장하는 객체로 표현되며, 최종 연산은 중간 시퀀스에 있는 여러 람다를 연쇄 호출한다. 따라서 앞 절에서 설명한 대로 시퀀스는 람다를 인라인하지 않는다.

### 함수를 인라인으로 선언해야 하는 경우

> 인라인 키워드의 이점을 배우고 나면 여기저기에서 사용하고 싶어질 것이다. 하지만 이는 좋은 생각이 아니다. 인라인 키워드를 사용해도 람다를 인자로 받는 함수만 성능이 좋아질 가능성이 높다. 
> 일반 함수 호출의 경우 JVM은 이미 강력하게 인라이닝을 지원한다. 코드 실행을 분석하여 가장 이익이 되는 방향으로 인라이닝 한다. 이런 과정은 바이트코드를 실제 기계어로 번역하는 과정(JIT)에서 일어난다.
> 이런 JVM의 최적화를 사용한다면, 바이트코드에서는 각 함수 구현이 정확히 한 번만 있으면 되고, 그 함수를 호출하는 부분에서 따로 함수 코드를 중복할 필요가 없다. 
> 반면 코틀린의 인라인 함수는 바이트코드에서 각 함수 호출 지점을 함수 본문으로 대체하기 때문에 코드 중복이 생긴다. 게다가 함수를 직접 호출하면 스택 트레이스가 더 깔끔해진다.
> 반면 람다를 인자로 받는 함수를 인라이닝하면 이익이 더 많다. 없앨 수 있는 부가 비용이 상당하다. 함수 호출 비용을 줄일 수 있을 뿐 아니라 객체를 만들 필요도 없어진다.
> 하지만 인라인 변경자를 함수에 붙일 때는 코드 크기에 주의를 기울여야 한다. 인라이닝 함수가 큰 경우 함수의 본문에 해당하는 바이트코드를 모든 호출 지점에 복사해 넣고 나면 바이트코드가 전체적으로 아주 커질 수 있다.

### [자원 관리를 위해 인라인된 람다 사용](src/higherfunction/UsingInlinedLambdasForResourceManagement.kt)

> 람다로 중복을 없앨 수 있는 일반적인 패턴 중 한가지는 어떤 작업을 하기 전에 자원을 획득하고 작업을 마친 후 자원을 해제하는 자원 관리다. 여기서 **자원**은 파일, 락, DB 트랜잭션 등 여러 다른 대상을 가리킬 수 있다. 
> 보통 사용하는 방법은 try - finally 구문을 사용해서 처리한다. 코틀린에는 좀 더 코틀린다운 API를 통해 같은 기능을 제공하는 withLock이라는 함수가 있다. 자바 7 부터는 try - with - resource 구문이 생겼다. 
> 코틀린은 함수타입의 값을 파라미터로 받는 함수를 통해 아주 매끄럽게 이를 처리할 수 있다. 코틀린은 그러므로 언어 구성 요소로 제공하지는 않는다. 대신 같은 기능을 제공하는 **use**라는 함수가 코틀린 표준 라이브러리에 포함되어 있다.

### [람다 안의 return 문](src/higherfunction/ReturnStatementsInLambdas.kt)

> 루프와 같은 명령헌 코드를 람다로 바꾸기 시작한 사람은 곧 return 문제에 부딪칠 것이다. 루프의 중간에 있는 return 문은 이해하기가 쉽다. 하지만 그 루프를 filter와 같은 람다를 호출하는 함수로 바꾸고 인자 안에서 return을 사용하면 어떻게 될까?
> 람다 안에서 return을 사용하면 람다로부터만 반환되는게 아니라 그 람다를 호출하는 함수가 실행을 끝내고 반환한다. 이렇게 자신을 둘러싸고 있는 블록보다 더 바깥에 있는 블록을 반환하게 만드는 return문을 **넌 로컬** return이라 부른다.
> 이렇게 return이 바깥쪽 함수를 반환시킬 수 있는 때는 람다를 인자로 받는 함수가 인라인 함수인 경우뿐이다. 인라이닝 되지 않는 함수에 return을 사용할 수 없다.

### [람다로부터의 반환(레이블을 사용한 리턴)](src/higherfunction/ReturningFromLambdas.kt)

> 람다 식에서도 로컬 Return을 사용할 수 있다. 로컬 return은 break와 같은 역할을 한다. 람다의 실행을 끝내고 람다를 호출했던 코드의 실행을 이어간다. 로컬 return과 넌로컬 return을 구분하기 위해 **레이블**을 사용해야 한다.
> 람다에 레이블을 붙여서 사용하는 대신 인자로 받는 인라인 함수의 이름을 return 뒤에 레이블로 사용해도 된다. 하지만 레이블을 명시하면 함수 이름을 레이블로 사용할 수 없다.

### [무명 함수(기본적으로 로컬 return)](src/higherfunction/AnonymousFunctions.kt)

> 무명 함수는 코드 블록을 함수에 넘길 때 사용할 수 있는 다른 방법이다. 일반 함수와 비슷해 보이지만, 함수 이름이나 파라미터 타입을 생략할 수 있다.
> 무명함수도 일반 함수와 같은 반환 타입 지정 규칙을 따른다. 무명 함수 안에서 레이블이 붙지 않은 return 식은 무명 함수 자체를 반환 시킬 뿐 다른 함수를 반환시키지 않는다.

## 제네릭스

코틀린에서 제네릭 클래스와 함수를 선언하고 사용하는 개념은 자바와 비슷하다. 이번 장에서는 제네릭스를 깊게 다루면서 **실체화 된 타입 파라미터**나 **선언 지점 변성**등의 새로운 내용을 설명한다.
실체화 된 타입 파라미터를 사용하면 인라인 함수 호출에서 타입 인자로 쓰인 구체적인 타입을 실행 시점에 알 수 있다. 선언 지점 변성을 사용하면 베이스 타입은 같지만 타입 인자가 다른 두 제네릭 타입이 있을 때 상위 - 하위 관계를 지정할 수 있다.
제네릭스를 사용하면 타입 파라미터를 받는 타입을 정의할 수 있다. 제네릭 타입의 인스턴스를 만드려면 타입 파라미터를 구체적인 타입 인자로 치환해야 한다.

### [제네릭 함수와 프로퍼티](src/generics/GenericFunctionsAndProperties.kt)

> 리스트를 다루는 함수를 작성한다면, 특정 타입 뿐만 아니라 모든 리스트를 다룰 수 있는 함수를 원할 것 이다. 이럴 때 제네릭 함수를 작성해야 한다. 제네릭 함수를 만들면 리스트를 호출할 때 타입 인자를 명시적으로 지정해야 하지만,
> 컴파일러가 대부분 타입 인자를 추론할 수 있으므로 그럴 필요가 없다. 람다 파라미터에 의해 만들어진 변수 it의 타입은 제네릭일 경우 제네릭 타입이다.

### [제네릭 클래스 선언](src/generics/DeclaringGenericClasses.kt)

> 자바와 마찬가지로 코틀린에서도 클래스를 제네릭하게 만들 수 있다. 

### [타입 파라미터 제약](src/generics/TypeParameterConstraints.kt)

> 타입 파라미터 제약은 클래스나 함수에 사용할 수 있는 타입 인자를 제한하는 기능이다. 예를 들어 리스트의 속한 모든 원소의 합을 구하는 sum 함수를 생각해보자. Int나 Double에 함수를 적용할 수 있지만, String에는 적용할 수 없다. 
> 이런 경우 어떤 타입을 제네릭 타입의 타입 파라미터에 대한 상한으로 지정하면, 그 제네릭 타입을 인스턴스화 할 때 사용하는 타입 인자는 반드시 그 상한 타입이거나, 그 상한 타입의 하위 타입이어야 한다.

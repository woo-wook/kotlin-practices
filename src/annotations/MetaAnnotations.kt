package annotations

@Target(AnnotationTarget.PROPERTY) // 프로퍼티에만 사용 가능
annotation class Proxy


// @Proxy 클래스에 사용이 불가!
class ProxyFactory(
    @Proxy val proxy: String
)
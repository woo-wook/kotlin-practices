package annotations

data class AnnotationTargets(
    @get:Deprecated("get 사용시 주의하세요.")
    var folder: String = "/Users/ryu/dev"
);

fun main() {
    val annotationTargets = AnnotationTargets()
    annotationTargets.folder = "/Users/ryu/dev"


    println(annotationTargets.folder) // deprecated
}
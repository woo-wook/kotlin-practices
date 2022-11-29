package typesystem

import javatype.DataParser
import javatype.FileContentProcessor
import java.io.File

class FileIndexer: FileContentProcessor {
    override fun processContents(path: File, binaryContents: ByteArray?, textContents: List<String>?) { }
}

class PersonParser: DataParser<Person> {
    override fun parseData(input: String, output: MutableList<Person>, errors: MutableList<String?>) { }
}
package 功能包

import java.io.File
import java.nio.charset.Charset

fun 获取当前目录的文件地址(文件名:String?):String {
    val 当前路径 = File(".").absolutePath
    return 当前路径
}

fun getFileContent(filename: String): String {
    val f = File(filename)
    return f.readText(Charset.forName("UTF-8"))
}

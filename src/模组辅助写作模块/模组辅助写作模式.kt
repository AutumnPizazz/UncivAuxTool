package 模组辅助写作模块

import java.lang.Exception
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun 模组辅助写作模式() {
    println("您已进入模组辅助写作模式,请按提示输入参数")
    print("请输入文件路径,或输入\"退出\"或\"tviu\"或\"goback\"以返回开始菜单:")
    var 文件路径_未检验:String
    var 文件路径:Path

    while(true) {
        文件路径_未检验 = readLine() ?: "地址为空"
        if(文件路径_未检验 == "tviu" || 文件路径_未检验 == "退出"|| 文件路径_未检验 == "goback") return
        try {
            文件路径 = Paths.get(文件路径_未检验)
            if (!Files.exists(文件路径) || !Files.isRegularFile(文件路径)) {
                print("文件路径错误!请重新输入:")
                continue
            }
        } catch (x: Exception){
            print("文件路径错误!请重新输入:")
            continue
        }
        try {
//            Files.lines(文件路径, StandardCharsets.UTF_8).forEach { println(it) }
//            println("恭喜你到达世界尽头,前面的区域以后再来探索吧!")
            读取本地模组文件()
            break
        } catch (x: Exception) {
            print("目标文件无法读取!请重新输入:")
            continue
        } catch (x: Error) {
            print("目标文件无法读取!请重新输入:")
            continue
        }
    }
}
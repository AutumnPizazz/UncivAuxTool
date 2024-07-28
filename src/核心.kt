import 伤害计算模块.伤害计算模式
import 模组辅助写作模块.模组辅助写作模式

fun main() {
    println("这里是SpringPizazz练手的Kotlin简单程序,现在有两个功能:计算Unciv的伤害和辅助写作Unciv的模组")
    开始使用()
}

fun 开始使用() {
    var 模式选择:String?
    while (true){
        print("输入1以进入伤害计算模式;输入2以进入模组辅助写作模式:")
        模式选择 = readln()
        when (模式选择) {
            "1" -> { 伤害计算模式() ; continue }
            "2" -> { 模组辅助写作模式() ; continue }
            else -> { println("输入有误!") ; continue }
        }
    }
}
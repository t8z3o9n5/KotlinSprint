package lessons_1

fun main() {
    val numberOfOrders: Int = 75
    val thankMessage: String = """ 
        Спасибо за покупку!
        Мы будем рады увидеть Вас снова.
        """

    println("Значение переменной с количеством заказов: $numberOfOrders")
    println("Значение переменной с благодарностью: $thankMessage")

    var numberOfEmployees = 2000
//    println("Количество работников интернет-магазина: $numberOfEmployees")

    numberOfEmployees = 1999
    println("После увольнения одного работника кол-во работников интернет-магазинастало: $numberOfEmployees")
}
fun main() {
    introduction("Juliet",21)
    dispense(14)

    var diana = Human("Diana",28,63)
    diana.eat(1)
    diana.speak("Hello there")

    comparison(5,2)


    game("Rock","Scissor")
}
fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old")
}
fun dispense(age:Int){
    if (age < 6){
        println("Glass of mil")
    }
    else if (age in 7..14){
        println("Bottle of fanta")
    }
    else{
        println("Cocacola")
    }
}
//fun longNames(names:Array<String>):Int{
//    for (name in names){
//        if (name.length>4){
//            var named = 0
//            named+=name
//        }
//    }
//}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech:String){
        println("$speech")
    }
}
fun comparison(num1:Int,num2:Int): Boolean {
    return num1 >num2
}

fun game(choice1:String,choice2:String){
   var r = "Rock"
    var p = "Paper"
    var s = "Scissors"
    if (choice1 === choice2){
        println("Its a draw")
    }
    else{
        if (choice1===r && choice2 ===p && choice2 === r || choice1===s && choice2===p){
            println("Player1 wins")
        }
        else{
            println("Player2 wins")
        }
    }
}
fun naming(names:Array<String>{
    var namelist = mutableListOf<String>()
    for( name in names) {
        return namelist.add(name)
    }
}
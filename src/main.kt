import java.util.*

fun main() {
    introduction("Juliet",21)
    dispense(14)
    longNames(arrayOf("Julie","Brinah","Simo","Beth","Anabel"))
    var diana = Human("Diana",28,63)
    println(diana.weight)
    diana.eat(1)
    diana.speak("Hello there")
    diana.birthday()
    comparison(5,2)
    game("Rock","Scissor")
    println(Arrays.toString(naming("Juliet","Salma","Mildred","Benin","Nimo")))
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
fun longNames(names:Array<String>):Int{
    var count = 0
    for (name in names){
        if (name.length>4){
            count ++
        }
    }
    return count
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday(){
        age++
    }
}
fun comparison(num1:Int,num2:Int): Boolean {
    return num1 >num2
}

fun game(choice1:String,choice2:String){
    val r = "Rock"
    val p = "Paper"
    val s = "Scissors"
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
fun naming(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String>{

  return arrayOf(name1,name2,name3,name4,name5)
}





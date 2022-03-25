fun main(){
    var man=Human("Jamie",34,76.4)
    man.eat(4)
    println(man.weight)
    man.speak("Jamie is satisfied")
    man.birthday()

    var woman=Human("Emily",25,65.4)
    woman.eat(3)
    println(woman.weight)
    woman.speak("I love myself")
    woman.birthday()
    var  student=user("Respah","Wakhungu","nafularespah@gmail.com","0745645342",4232)
    println(student.email)
    println(student.lastName)
}

class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food ")
    }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday(){
        age+=1
        println(age)

    }
}

data class user(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:Any)


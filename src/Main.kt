//Classes and Objects
/*
class Person constructor(firstName: String = "John", lastName: String = "Doe") {

    // Initializer Block
    init {
    println("Initialized a new Person object with " + "firstName = $firstName and lastName = $lastName")
    }
}

fun main(){
    // Initializer Block
    var firstPerson = Person("Laura", "Pavani")
    var secondPerson = Person()
    var thirdPerson = Person(lastName = "Peterson")
}


// Scope with shadowing
fun main(){
    myFunction( 5)
}
// this a is a parameter:
fun myFunction(a: Int){
    // this a is a variable:
    var a = a
    println("a is $a")
}
// or
var b = 3
fun main(){
    myFunction( 5)
}
// this a is a parameter:
fun myFunction(a: Int){
    // this a is a variable:
    var b = a
    println("b is $b")
}

// Members of Classes
fun main(){
    // Initializer Block
    // Creating instances of classes
    var firstPerson = Person("Laura", "Pavani",43)
    firstPerson.stateHobby()
    println("firstPerson is ${firstPerson.age} years old")
    var secondPerson = Person()
    secondPerson.hobby = "Play video games"
    secondPerson.stateHobby()
    println("secondPerson is ${secondPerson.age} years old")
    var thirdPerson = Person(lastName = "Peterson")
    thirdPerson.hobby = "Skateboarding"
    thirdPerson.stateHobby()
    thirdPerson.age = 35
    println("thirdPerson is ${thirdPerson.age} years old")
    var fourthPerson = Person(firstName = "Monica", lastName = "Azevedo", age = 4)
    fourthPerson.hobby = "dancing ballet"
    fourthPerson.stateHobby()
    println("fourthPerson is ${fourthPerson.age} years old")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe") {
    // Member Variables - Properties
    var age : Int? = null
    var hobby : String = "watch Eduflix"
    var personOne : String? = null

    // Initializer Block
    init {
        this.personOne = firstName +" "+ lastName
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
        this.age = age
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName and age $age")
    }

    // Member functions - Methods
    fun stateHobby(){
        println("$personOne's hobby is $hobby")
    }
*/
// Lateinit, setters and getters
fun main() {
    var myCar = Car()
    myCar.owner
    println("The owner of the car is ${myCar.owner}")
    println("Brand is: ${myCar.myBrand}")
    myCar.maxSpeed = 240
    println("MaxSpeed is ${myCar.maxSpeed}")
    //myCar.myModel = "M1" -> it's going to bring an error because the setter is private however, you can print the line
    println("The car model is ${myCar.myModel}")
}

class Car(){
    lateinit var owner : String

    val myBrand: String = "bmw"
        // Custom getter
        get() {
            return field.toUpperCase()
        }
    var maxSpeed: Int = 250
        //get() = field //Field is a backing field which helps you to refer to properties inside of getter methods
                        // this is required because if you use the properties direct inside the getter or setter than you
                        // run into a recursive call which will generate a stack overflow
        set(value){ //Value is the value that is given to the variable when you sett it
            field = if (value > 0) value
            else
                throw IllegalArgumentException("MaxSpeed cannot be less than 0")
        }
    var myModel : String = "M5"
        private set

    init {
        this.owner = "Frank"
        this.myModel = "M3"
    }
}



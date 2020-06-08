/*Primary Constructor
open class Employee(name: String, age: Int) {
    init{
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}
class CEO( name: String, age: Int, salary: Double): Employee(name,age) {
    init {
        println("Salary per annum is $salary crore rupees")
    }
}
fun main(args: Array<String>) {
    CEO("Sunder Pichai", 42, 450.00)
}*/


/*//Secondary Constructor
open class Employee {
    constructor(name: String,age: Int){
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}
// derived class
class CEO : Employee{
    constructor( name: String,age: Int, salary: Double): super(name,age) {
        println("Salary per annum is $salary million dollars")
    }
}
fun main(args: Array<String>) {
    CEO("Satya Nadela", 48, 250.00)
}*/

/*Overriding methods
open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}

fun main(args: Array<String>) {
    val circle = Circle()
    circle.fill()
}*/


/*Overriding properties*/
/*interface Shape {
        val vertexCount: Int
    }

    class Rectangle(override val vertexCount: Int = 4) : Shape

    class Polygon : Shape {
        override var vertexCount: Int = 0
    }

    fun main(args: Array<String>) {
        val polygon = Polygon()
        polygon.vertexCount
}*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    salutation("Nancy")
    var result= remainder(20,8)
    println(result)
    var total=sum(7,8,10,12)
    println(total)
    interest("I am an actor.")
}

fun  salutation(name: String){
    var result="Hello ${name}"
    println(result)
}
fun remainder(num1:Int, num2:Int,) :Int{
    var result=num1 % num2
    return(result)

}
fun sum(x:Int, w:Int, y:Int, z:Int) :Int{
    var total= x + w + y + z
    return (total)


}
fun interest(fact:String){
    var result="I am an actor."
    println(result)

}
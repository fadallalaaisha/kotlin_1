fun main() {
    school()
    parameter("Aisha",22)
    laptop("tutu")
    condition()

}
fun school(){
    var school="AkiraChix"
    print(school[0])
    print(school[2])
    println(school[3])
}
fun parameter(name:String, age:Int){
    println("Hi,my is $name, and I am $age years old")

}
fun laptop(text:String) {
    var length =text.length
    println(length)
}
fun condition() {
    val name = "Aisha Fadallala"
    if (name == "Aisha Fadallala")
    {
        print("that's me")
    }
    else{
        println("I donnot know who are you")
    }
}

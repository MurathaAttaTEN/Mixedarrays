fun main(){
    var x=arrofInts(arrayOf(20,30,40,50,50))
    println(x)
    var f=mixedtypes(arrayOf("ibrahim",20,10.5,"school",35.5))
    println(f)
    var y = func(arrayOf('a','b','c','d','e','f','i','j','o','m','u'))
    println(y)

}

fun arrofInts(aoi:Array<Int>):Int{
    var num = 1
    aoi.forEach { number->
        num*=number
    }
    return num
}
fun mixedtypes(mixed:Array<Any>):Double{
    var numz = 0.0
    mixed.forEach { num->
        if ( num is Double|| num is Int|| num is Float){
            numz+=num.toString().toDouble()
    }
    }
    return numz

}
    fun func(v:Array<Char>):Int {
        var vowels = 0
        v.forEach { number ->
            if (number == 'a' || number == 'e' || number == 'i' || number == 'o' || number == 'u') {
                ++vowels
            }
        }
        return vowels

    }











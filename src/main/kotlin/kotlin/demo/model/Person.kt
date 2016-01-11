package kotlin.demo.model

open class Person(var name: String, var age: Int = 20, var college: String?) {

    var email: String = ""

    constructor(name: String, age: Int, college: String?, email: String) : this(name, age, college) {
        this.email = email}

    /**
     * @return true if age is greater or equal to 18
     */
    open fun isEligibleToVote(): Boolean {return age >= 18}

    val isEligibleToVote = if(age > 18) "Yes" else "No"

    /**
     * @return true  If age falls in the range if 13-19
     */
    fun Person.isTeenager(): Boolean {return age in 13..19}


    fun isOctogenarian(): Boolean = age in 80 .. 89

    val typeOfPerson = when(age){
        0 -> "New born"
        in 1..12 -> "Child"
        in 13..19 -> "Teenager"
        else -> "Adult"
    }

}


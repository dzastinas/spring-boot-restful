package web.demo.model

class Employee(name: String, age: Int, college: String?, var company: String) : Person(name, age, college) {

    override fun isEligibleToVote(): Boolean {
        return true
    }


}
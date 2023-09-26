package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1= Question(
            1,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "America","Europe",
            1

        )
        questionList.add(que1)

        val que2= Question(
            2,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola","Austria",
            "Australia","Armerica",
            3

        )
        questionList.add(que2)

        val que3= Question(
            2,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus","Belize",
            "Brunei","Brazil",
            4

        )
        questionList.add(que3)

        val que4= Question(
            2,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas","Belgium",
            "Barbados","Belize",
            2

        )
        questionList.add(que4)

        val que5= Question(
            2,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon","France",
            "Fiji","Finland",
            3

        )
        questionList.add(que5)

        val que6= Question(
            2,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany","Georgia",
            "Greece","none of this",
            1

        )
        questionList.add(que6)

        val que7= Question(
            2,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica","Egypt",
            "Denmark","Ethiopia",
            3

        )
        questionList.add(que7)

        val que8= Question(
            2,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland","Iran",
            "Hungary","India",
            4

        )
        questionList.add(que8)

        val que9= Question(
            2,"What country does this Flag Belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand","Jorden",
            "Sudan","Palestine",
            1

        )
        questionList.add(que9)

        return questionList
    }
}

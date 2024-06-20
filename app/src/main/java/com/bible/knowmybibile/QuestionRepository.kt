package com.bible.knowmybibile


object QuestionRepository {
    val easyQuestions = listOf(
        Question("Who was the first man?", listOf("Adam", "Eve", "Moses", "Abraham"), "Adam"),
        Question("Who built the ark?", listOf("Noah", "Abraham", "Moses", "Jacob"), "Noah") ,
        Question("Who was the first woman?",
            listOf("Eve", "Sarah", "Rebekah", "Rachel"),
            "Eve"
        ),
        Question(
            "Which animal did Jesus ride into Jerusalem?",
            listOf("Donkey", "Horse", "Camel", "Elephant"),
            "Donkey"
        ),
        Question(
            "Who was the youngest son of Jacob?",
            listOf("Benjamin", "Joseph", "Reuben", "Simeon"),
            "Benjamin"
        ),
        Question(
            "What was the name of the mountain where Moses received the Ten Commandments?",
            listOf("Mount Sinai", "Mount Zion", "Mount Olympus", "Mount Everest"),
            "Mount Sinai"
        ),
        Question(
            "Who was the king who built the temple in Jerusalem?",
            listOf("David", "Solomon", "Saul", "Absalom"),
            "Solomon"
        ),
        Question(
            "Which prophet was swallowed by a whale?",
            listOf("Jonah", "Isaiah", "Ezekiel", "Daniel"),
            "Jonah"
        ),
        Question("Who was Jesus' mother?", listOf("Mary", "Elizabeth", "Sarah", "Hannah"), "Mary")
                ,
        Question(
            "What was the name of the river where Jesus was baptized?",
            listOf("Jordan", "Nile", "Euphrates", "Tigris"),
            "Jordan"
        ),
        Question(
            "Who was the apostle who denied Jesus three times?",
            listOf("Peter", "John", "Matthew", "Thomas"),
            "Peter"
        ),
        Question(
            "What was the name of the garden where Jesus prayed before he was betrayed?",
            listOf("Gethsemane", "Eden", "Paradise", "Bethany"),
            "Gethsemane"
        ),
        Question(
            "Who was the king who tried to kill Jesus as a baby?",
            listOf("Herod", "Pontius Pilate", "Caesar", "Saul"),
            "Herod"
        ),
        Question(
            "What was the name of the disciple who was a tax collector?",
            listOf("Matthew", "Simon", "Andrew", "Thomas"),
            "Matthew"
        ),
        Question(
            "Who was the prophet who was fed by ravens?",
            listOf("Elijah", "Elisha", "Isaiah", "Jeremiah"),
            "Elijah"
        ),
        Question(
            "What was the name of the mountain where Jesus gave the Sermon on the Mount?",
            listOf("Mount Beatitudes", "Mount Sinai", "Mount Zion", "Mount of Olives"),
            "Mount Beatitudes"
        )
        // Add more easy questions
    )
    val mediumQuestions = listOf(
        Question("Who led the Israelites out of Egypt?", listOf("Moses", "Aaron", "Joshua", "David"), "Moses"),
        // Add more medium questions
    )
    val hardQuestions = listOf(
        Question("What is the longest book in the Bible?", listOf("Psalms", "Genesis", "Isaiah", "Jeremiah"), "Psalms"),
        // Add more hard questions
    )
}

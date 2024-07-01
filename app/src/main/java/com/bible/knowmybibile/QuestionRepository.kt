package com.bible.knowmybibile


object QuestionRepository {
    val easyQuestions = listOf(

        Question(
            "Who was the first man?",
            listOf("Adam", "Eve", "Moses", "Abraham").shuffled(),
            "Adam"
        ),
        Question(
            "Who built the ark?",
            listOf("Noah", "Moses", "David", "Solomon").shuffled(),
            "Noah"
        ),
        Question(
            "Who was thrown into the lion's den?",
            listOf("Daniel", "David", "Samson", "Jonah").shuffled(),
            "Daniel"
        ),
        Question(
            "Who parted the Red Sea?",
            listOf("Moses", "Joshua", "Elijah", "Elisha").shuffled(),
            "Moses"
        ),
        Question(
            "Who was the mother of Jesus?",
            listOf("Mary", "Elizabeth", "Martha", "Sarah").shuffled(),
            "Mary"
        ),
        Question(
            "Who killed Goliath?",
            listOf("David", "Saul", "Jonathan", "Samson").shuffled(),
            "David"
        ),
        Question(
            "Who was swallowed by a great fish?",
            listOf("Jonah", "Noah", "Elijah", "Moses").shuffled(),
            "Jonah"
        ),
        Question(
            "Who led the Israelites into the Promised Land?",
            listOf("Joshua", "Moses", "Aaron", "Caleb").shuffled(),
            "Joshua"
        ),
        Question(
            "Who was the strongest man in the Bible?",
            listOf("Samson", "David", "Solomon", "Saul").shuffled(),
            "Samson"
        ),
        Question(
            "Who was turned into a pillar of salt?",
            listOf("Lot's wife", "Lot", "Job", "Abraham's wife").shuffled(),
            "Lot's wife"
        )    ,
        Question("Who was the first man?", listOf("Adam", "Eve", "Moses", "Abraham"), "Adam"),

        Question("Who built the ark?", listOf("Noah", "Abraham", "Moses", "Jacob"), "Noah") ,
        Question("Who was the first woman?",
            listOf("Eve", "Sarah", "Rebekah", "Rachel").shuffled(),
            "Eve"
                ),
        Question(
            "Which animal did Jesus ride into Jerusalem?",
            listOf("Donkey", "Horse", "Camel", "Elephant").shuffled(),
            "Donkey"
        ),
        Question(
            "Who was the youngest son of Jacob?",
            listOf("Benjamin", "Joseph", "Reuben", "Simeon").shuffled(),
            "Benjamin"
        ),
        Question(
            "What was the name of the mountain where Moses received the Ten Commandments?",
            listOf("Mount Sinai", "Mount Zion", "Mount Olympus", "Mount Everest").shuffled(),
            "Mount Sinai"
        ),
        Question(
            "Who was the king who built the temple in Jerusalem?",
            listOf("David", "Solomon", "Saul", "Absalom").shuffled(),
            "Solomon"
        ),
        Question(
            "Which prophet was swallowed by a whale?",
            listOf("Jonah", "Isaiah", "Ezekiel", "Daniel").shuffled(),
            "Jonah"
        ),
        Question("Who was Jesus' mother?", listOf("Mary", "Elizabeth", "Sarah", "Hannah").shuffled(), "Mary")
                ,
        Question(
            "What was the name of the river where Jesus was baptized?",
            listOf("Jordan", "Nile", "Euphrates", "Tigris").shuffled(),
            "Jordan"
        ),
        Question(
            "Who was the apostle who denied Jesus three times?",
            listOf("Peter", "John", "Matthew", "Thomas").shuffled(),
            "Peter"
        ),
        Question(
            "What was the name of the garden where Jesus prayed before he was betrayed?",
            listOf("Gethsemane", "Eden", "Paradise", "Bethany").shuffled(),
            "Gethsemane"
        ),
        Question(
            "Who was the king who tried to kill Jesus as a baby?",
            listOf("Herod", "Pontius Pilate", "Caesar", "Saul").shuffled(),
            "Herod"
        ),
        Question(
            "What was the name of the disciple who was a tax collector?",
            listOf("Matthew", "Simon", "Andrew", "Thomas").shuffled(),
            "Matthew"
        ),
        Question(
            "Who was the prophet who was fed by ravens?",
            listOf("Elijah", "Elisha", "Isaiah", "Jeremiah").shuffled(),
            "Elijah"
        ),
        Question(
            "What was the name of the mountain where Jesus gave the Sermon on the Mount?",
            listOf("Mount Beatitudes", "Mount Sinai", "Mount Zion", "Mount of Olives").shuffled(),
            "Mount Beatitudes"
        )
       // Adding more questions
    )
    val mediumQuestions = listOf(
        Question("Who led the Israelites out of Egypt?", listOf("Moses", "Aaron", "Joshua", "David"), "Moses"),
        Question(
            "Who interpreted King Nebuchadnezzar's dream?",
            listOf("Daniel", "Joseph", "Samuel", "Isaiah").shuffled(),
            "Daniel"
        ),
        Question(
            "Which apostle betrayed Jesus?",
            listOf("Judas Iscariot", "Peter", "John", "Andrew").shuffled(),
            "Judas Iscariot"
        ),
        Question(
            "What was the first miracle Jesus performed?",
            listOf("Turning water into wine", "Healing the blind man", "Walking on water", "Feeding 5000 people").shuffled(),
            "Turning water into wine"
        ),
        Question(
            "Who was the wife of King Ahab?",
            listOf("Jezebel", "Esther", "Ruth", "Bathsheba").shuffled(),
            "Jezebel"
        ),
        Question(
            "Which book comes after the four Gospels in the New Testament?",
            listOf("Acts", "Romans", "Hebrews", "James").shuffled(),
            "Acts"
        ),
        Question(
            "Who was the Roman governor who sentenced Jesus to be crucified?",
            listOf("Pontius Pilate", "Herod", "Caesar", "Felix").shuffled(),
            "Pontius Pilate"
        ),
        Question(
            "Who was known as the 'weeping prophet'?",
            listOf("Jeremiah", "Isaiah", "Ezekiel", "Daniel").shuffled(),
            "Jeremiah"
        ),
        Question(
            "What was the name of Abraham's first son?",
            listOf("Ishmael", "Isaac", "Jacob", "Esau").shuffled(),
            "Ishmael"
        ),
        Question(
            "Which Old Testament prophet was swallowed by a great fish?",
            listOf("Jonah", "Elijah", "Elisha", "Moses").shuffled(),
            "Jonah"
        ),
        Question(
            "Which king had a feast using vessels from the Jerusalem temple?",
            listOf("Belshazzar", "Nebuchadnezzar", "Darius", "Cyrus").shuffled(),
            "Belshazzar"
        ),
        Question(
            "Who was the mother of Samuel?",
            listOf("Hannah", "Rachel", "Leah", "Deborah").shuffled(),
            "Hannah"
        ),
        Question(
            "Which book of the Bible is known for its love poetry?",
            listOf("Song of Solomon", "Psalms", "Proverbs", "Ecclesiastes").shuffled(),
            "Song of Solomon"
        ),
        Question(
            "What did King Solomon ask God for?",
            listOf("Wisdom", "Wealth", "Power", "Long life").shuffled(),
            "Wisdom"
        ),
        Question(
            "Who succeeded Moses as the leader of Israel?",
            listOf("Joshua", "Caleb", "Aaron", "Gideon").shuffled(),
            "Joshua"
        ),
        Question(
            "Who was the father of King David?",
            listOf("Jesse", "Saul", "Solomon", "Jonathan").shuffled(),
            "Jesse"
        ),
        Question(
            "Who was the first king of Israel?",
            listOf("Saul", "David", "Solomon", "Rehoboam").shuffled(),
            "Saul"
        ),
        Question(
            "Who led the Israelites in the Battle of Jericho?",
            listOf("Joshua", "Moses", "Aaron", "Caleb").shuffled(),
            "Joshua"
        ),
        Question(
            "Who was thrown into the fiery furnace?",
            listOf("Shadrach, Meshach, and Abednego", "Daniel", "Elijah", "Elisha").shuffled(),
            "Shadrach, Meshach, and Abednego"
        ),
        Question(
            "Who was the first martyr of the Christian faith?",
            listOf("Stephen", "Peter", "Paul", "James").shuffled(),
            "Stephen"
        ),
        Question(
            "Which prophet confronted King David about his sin with Bathsheba?",
            listOf("Nathan", "Samuel", "Gad", "Elijah").shuffled(),
            "Nathan"
        ),
        Question(
            "Who was the father of John the Baptist?",
            listOf("Zechariah", "Joseph", "Simon", "James").shuffled(),
            "Zechariah"
        ),
        Question(
            "Who was the last judge of Israel?",
            listOf("Samuel", "Gideon", "Deborah", "Samson").shuffled(),
            "Samuel"
        ),
        Question(
            "Which book of the Bible tells the story of the Israelites' exodus from Egypt?",
            listOf("Exodus", "Genesis", "Leviticus", "Numbers").shuffled(),
            "Exodus"
        ),
        Question(
            "Who was the cupbearer to King Artaxerxes and later rebuilt the walls of Jerusalem?",
            listOf("Nehemiah", "Ezra", "Mordecai", "Daniel").shuffled(),
            "Nehemiah"
        ),
        Question(
            "Which prophet was taken up to heaven in a whirlwind?",
            listOf("Elijah", "Elisha", "Isaiah", "Jeremiah").shuffled(),
            "Elijah"
        ),
        Question(
            "Who was Jacob's favorite son?",
            listOf("Joseph", "Benjamin", "Reuben", "Judah").shuffled(),
            "Joseph"
        ),
        Question(
            "Which book is known for the story of Balaam and his donkey?",
            listOf("Numbers", "Deuteronomy", "Joshua", "Judges").shuffled(),
            "Numbers"
        ),
    )
    val hardQuestions = listOf(
        Question("What is the longest book in the Bible?", listOf("Psalms", "Genesis", "Isaiah", "Jeremiah"), "Psalms"),
        Question(
            "Who was the king of Salem to whom Abraham gave a tenth of everything?",
            listOf("Melchizedek", "Abimelech", "Ahasuerus", "Artaxerxes").shuffled(),
            "Melchizedek"
        ),
        Question(
            "Which prophet saw a vision of a valley of dry bones?",
            listOf("Ezekiel", "Jeremiah", "Isaiah", "Daniel").shuffled(),
            "Ezekiel"
        ),
        Question(
            "Who was the first high priest of Israel?",
            listOf("Aaron", "Levi", "Moses", "Joshua").shuffled(),
            "Aaron"
        ),
        Question(
            "What was the name of Moses' wife?",
            listOf("Zipporah", "Miriam", "Leah", "Rachel").shuffled(),
            "Zipporah"
        ),
        Question(
            "Who wrote the majority of the New Testament letters?",
            listOf("Paul", "Peter", "John", "James").shuffled(),
            "Paul"
        ),
        Question(
            "Who was the father of King Solomon?",
            listOf("David", "Saul", "Rehoboam", "Josiah").shuffled(),
            "David"
        ),
        Question(
            "Which judge made a vow to God that resulted in sacrificing his daughter?",
            listOf("Jephthah", "Samson", "Gideon", "Ehud").shuffled(),
            "Jephthah"
        ),
        Question(
            "What was the name of the place where Jesus was crucified?",
            listOf("Golgotha", "Gethsemane", "Bethany", "Bethlehem").shuffled(),
            "Golgotha"
        ),
        Question(
            "Which New Testament book is focused on the end times and the return of Christ?",
            listOf("Revelation", "1 Thessalonians", "2 Peter", "Jude").shuffled(),
            "Revelation"
        ),
        Question(
            "Who led a rebellion against Moses and Aaron, and was swallowed by the earth?",
            listOf("Korah", "Dathan", "Abiram", "On").shuffled(),
            "Korah"
        ),
        Question(
            "Who was the left-handed judge who killed King Eglon of Moab?",
            listOf("Ehud", "Shamgar", "Barak", "Gideon").shuffled(),
            "Ehud"
        ),
        Question(
            "Which Old Testament book is a series of love poems between a bride and groom?",
            listOf("Song of Solomon", "Psalms", "Proverbs", "Ecclesiastes").shuffled(),
            "Song of Solomon"
        ),
        Question(
            "Who was the last king of Judah before the Babylonian captivity?",
            listOf("Zedekiah", "Jehoiakim", "Jehoiachin", "Josiah").shuffled(),
            "Zedekiah"
        ),
        Question(
            "Which prophet confronted Ahab and Jezebel about their sins?",
            listOf("Elijah", "Elisha", "Micaiah", "Obadiah").shuffled(),
            "Elijah"
        ),
        Question(
            "Who was the scribe and priest who led a group of exiles back to Israel?",
            listOf("Ezra", "Nehemiah", "Zerubbabel", "Joshua").shuffled(),
            "Ezra"
        ),
        Question(
            "Which Old Testament book tells the story of a Jewish woman who becomes queen of Persia?",
            listOf("Esther", "Ruth", "Judith", "Tobit").shuffled(),
            "Esther"
        ),
        Question(
            "Which king asked for and was given 15 more years of life by God?",
            listOf("Hezekiah", "Josiah", "Manasseh", "Amaziah").shuffled(),
            "Hezekiah"
        ),
        Question(
            "Who was the prophet that took over the ministry of Elijah?",
            listOf("Elisha", "Isaiah", "Jeremiah", "Jonah").shuffled(),
            "Elisha"
        ),
        Question(
            "What was the original language of most of the Old Testament?",
            listOf("Hebrew", "Greek", "Aramaic", "Latin").shuffled(),
            "Hebrew"
        ),
        Question(
            "Which king had a dream about a large statue made of various materials?",
            listOf("Nebuchadnezzar", "Belshazzar", "Darius", "Cyrus").shuffled(),
            "Nebuchadnezzar"
        ),
        Question(
            "Which two individuals were taken to heaven without dying?",
            listOf("Enoch and Elijah", "Moses and Elijah", "David and Solomon", "Joshua and Caleb").shuffled(),
            "Enoch and Elijah"
        ),
        Question(
            "Who was the prophet that married a prostitute as a symbol of Israel's unfaithfulness to God?",
            listOf("Hosea", "Amos", "Joel", "Micah").shuffled(),
            "Hosea"
        ),
        Question(
            "What was the profession of Matthew before he followed Jesus?",
            listOf("Tax collector", "Fisherman", "Carpenter", "Shepherd").shuffled(),
            "Tax collector"
        ),
        Question(
            "Which king had a feast and saw a hand writing on the wall?",
            listOf("Belshazzar", "Nebuchadnezzar", "Darius", "Ahasuerus").shuffled(),
            "Belshazzar"
        ),
        Question(
            "Who was the first Christian martyr?",
            listOf("Stephen", "James", "Peter", "Paul").shuffled(),
            "Stephen"
        ),
        Question(
            "Which Old Testament book is written in the form of a dialogue between Job and his friends?",
            listOf("Job", "Psalms", "Proverbs", "Ecclesiastes").shuffled(),
            "Job"
        ),
    )
}

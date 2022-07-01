package com.example.vaporwaveappdemo

fun getConnections(number : Int) : HashMap<Int, String> {

    val connections = when (number) {
        1-> hashMapOf(
            2 to "More electronic, but simpler and without vocals.",
            5 to "More electronic, but keep the vocals.",
            4 to "Keep the guitars.",
            3 to "Too electronic? Take a step back to rock."
            )

        2-> hashMapOf(
            6 to "More ambient. Minimalist. Darker.",
            7 to "Frantic drums, more complex.",
            8 to "Something that feels more “natural”.",
            1 to "Less electronic, more rock."
        )

        // To be updated
        3-> hashMapOf(
            1 to "Back."
        )

        // To be updated
        4-> hashMapOf(
            1 to "Back."
        )

        // To be updated
        5-> hashMapOf(
            1 to "Back."
        )

        6-> hashMapOf(
            2 to "More upbeat, less sparse.",
            9 to "Not as minimal, but just as mysterious and dark."
        )

        7-> hashMapOf(
            2 to "Less frantic drums, simpler.",
            10 to "More modern and eclectic."
        )

        8-> hashMapOf(
            2 to "Something that feels more “electric”.",
            9 to "Like this, but darker. More mysterious."
        )

        9-> hashMapOf(
            6 to "Sparser, but just as mysterious and dark.",
            8 to "Like this, but happier."
        )

        10-> hashMapOf(
            7 to "More traditional but just as surreal.",
            12 to "Less wonky and strange."
        )

        11-> hashMapOf(
            12 to "More strange and glitchy",
            13 to "More like this!"
        )

        12-> hashMapOf(
            10 to "More wonky and strange",
            11 to "More traditional, less glitchy"
        )

        13-> hashMapOf(
            12 to "More strange and glitchy",
            11 to "More like this!"
        )

        else -> hashMapOf()
    }

    return connections
}
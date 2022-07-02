package com.example.vaporwaveappdemo

import androidx.compose.ui.state.ToggleableState

fun getConnections(number : Int) : HashMap<Int, Pair<Int,String>> {

    val connections = when (number) {
        1-> hashMapOf(
            1 to Pair(3, "Too electronic? Take a step back to rock."),
            2 to Pair(2, "More electronic, but simpler and without vocals."),
            3 to Pair(5, "More electronic, but keep the vocals."),
            4 to Pair(4, "You like it, but you're not ready to lose guitars yet."),
            )

        2-> hashMapOf(
            1 to Pair(6, "More ambient. Minimalist. Darker."),
            2 to Pair(7, "Frantic drums, more complex."),
            3 to Pair(8, "Something that feels more “natural”."),
            4 to Pair(1, "Less electronic, more rock.")
        )

        // To be updated
        3-> hashMapOf(
            1 to Pair(1, "Back.")
        )

        // To be updated
        4-> hashMapOf(
            1 to Pair(16, "You like this and are ready to dive deeper into electronic."),
            2 to Pair(18, "More lush and \"natural\"."),
            3 to Pair(23, "Similar to this, but a bit more electronic."),
            4 to Pair(1, "More electronic-rock fusions."),
        )

        // To be updated
        5-> hashMapOf(
            1 to Pair(4, "This is too weird!"),
            2 to Pair(12, "Remove the vocals and focus it."),
            3 to Pair(1, "More rock influence."),
        )

        6-> hashMapOf(
            1 to Pair(2, "More upbeat, less sparse."),
            2 to Pair(9, "Not as minimal, but just as mysterious and dark.")
        )

        7-> hashMapOf(
            1 to Pair(10, "More modern and eclectic."),
            2 to Pair(2, "Less frantic drums, simpler."),
        )

        8-> hashMapOf(
            1 to Pair(9, "Like this, but darker. More mysterious."),
            2 to Pair(2, "Something that feels more “electric”."),
            3 to Pair(12, "Tighter beats.")

        )

        9-> hashMapOf(
            1 to Pair(6, "Sparser, but just as mysterious and dark."),
            2 to Pair(8, "Like this, but happier.")
        )

        10-> hashMapOf(
            1 to Pair(7, "More traditional but just as surreal."),
            2 to Pair(12, "Less wonky and strange.")
        )

        11-> hashMapOf(
            1 to Pair(12, "More strange and glitchy."),
            2 to Pair(18, "Similarly lush and organic."),
            3 to Pair(20, "Turn it into a party!"),
            4 to Pair(13, "More like this!")
        )

        12-> hashMapOf(
            1 to Pair(10, "More wonky and strange"),
            2 to Pair(11, "More traditional hip hop, less glitchy"),
            3 to Pair(8, "You like the beats. What if they were more spaced out?"),
            4 to Pair(14, "Keep the beats, and make it dark and operatic.")
        )

        13-> hashMapOf(
            1 to Pair(12, "More strange and glitchy"),
            2 to Pair(11, "More like this!")
        )

        14-> hashMapOf(
            1 to Pair(16, "Drop the samples, keep the beat and dark atmosphere."),
            2 to Pair(15, "Similar atmosphere, but chunkier and more industrial beats."),
            3 to Pair(21, "Much happier, with more sampling."),
            4 to Pair(12, "More hip hop"),
        )

        15-> hashMapOf(
            1 to Pair(17, "More trip hop."),
            2 to Pair(14, "Similar atmosphere, but quicker beats and add samples.")
        )

        16-> hashMapOf(
            1 to Pair(14, "Keep the beats and dark atmosphere, and add samples."),
            2 to Pair(15, "Similar atmosphere, but chunkier and more industrial beats.")
        )

        17-> hashMapOf(
            1 to Pair(15, "More trip hop")
        )

        18-> hashMapOf(
            1 to Pair(11, "Similarly lush and organic"),
            2 to Pair(19, "Chill it out!")
        )

        19-> hashMapOf(
            1 to Pair(8, "Want something that sounds like an educational film from the eighties?")
        )

        20-> hashMapOf(
            1 to Pair(21, "You like the sampling. Here is a plunderphonics classic!")
        )

        21-> hashMapOf(
            1 to Pair(14, "Darker. Sadder. Samples are more messed up."),
            2 to Pair(22, "More sampling with more of a hip-hop vibe.")
        )

        22-> hashMapOf(
            1 to Pair(13, "More instrumental hip hop.")
        )

        23-> hashMapOf(
            1 to Pair(16, "More of a vocal focus."),
            2 to Pair(24, "Less busy and less melodious.")
        )

        24-> hashMapOf(
            1 to Pair(25, "More traditional techno music."),
            2 to Pair(22, "More busy and melodious.")
        )

        25-> hashMapOf(
            1 to Pair(26, "More like this."),
            2 to Pair(28, "Did you like \"Halcyon + On + ON?\"")
        )

        26-> hashMapOf(
            1 to Pair(25, "More like this."),
            2 to Pair(27, "Even more.")
        )

        27-> hashMapOf(
            1 to Pair(28, "Feel ready for ambient music?"),
            2 to Pair(29, "Similar vibe but more crazy.")
        )

        28-> hashMapOf(
            1 to Pair(30, "Even more ambient.")
        )

        29-> hashMapOf(

        )

        29-> hashMapOf(

        )

        else -> hashMapOf()
    }

    return connections
}
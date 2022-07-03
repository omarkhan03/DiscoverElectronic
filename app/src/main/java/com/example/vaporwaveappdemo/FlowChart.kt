package com.example.vaporwaveappdemo

import androidx.compose.ui.state.ToggleableState

fun getConnections(number : Int) : HashMap<Int, Pair<Int,String>> {

    val connections = when (number) {
        1-> hashMapOf(
            1 to Pair(2, "More electronic, but simpler and without vocals."),
            2 to Pair(5, "More electronic, but keep the vocals."),
            3 to Pair(4, "You like it, but you're not ready to lose guitars yet."),
            4 to Pair(3, "Too electronic? Take a step back to another rock album."),
            )

        2-> hashMapOf(
            1 to Pair(6, "More ambient. Minimalist. Darker."),
            2 to Pair(7, "Frantic drums, more complex."),
            3 to Pair(8, "Something that feels more “natural”."),
            4 to Pair(1, "Less electronic, more rock (back to Kid A)")
        )

        3-> hashMapOf(
            1 to Pair(40, "You like the buildups. Let's try some electronic music that does that."),
            2 to Pair(38, "You like the song structure and scale."),
            3 to Pair(39, "Like this, but way more minimal."),
            4 to Pair(1, "Not my thing. Back to Kid A.")
        )

        4-> hashMapOf(
            1 to Pair(16, "You like this and are ready to dive deeper into electronic."),
            2 to Pair(18, "More lush and \"natural\"."),
            3 to Pair(23, "Similar to this, but a bit more electronic."),
            4 to Pair(1, "More electronic-rock fusions."),
        )

        5-> hashMapOf(
            1 to Pair(4, "This is too weird!"),
            2 to Pair(12, "Remove the vocals and focus it."),
            3 to Pair(1, "More rock influence."),
        )

        6-> hashMapOf(
            1 to Pair(30, "Here is some more sparse ambient like this."),
            2 to Pair(9, "Not as minimal, but just as mysterious and dark."),
            3 to Pair(32, "Like the sound of track 3? Here is some ethereal stuff."),
            4 to Pair(2, "More upbeat, less sparse."),
        )

        7-> hashMapOf(
            1 to Pair(34, "You like the complex beats. Let's get even wilder"),
            2 to Pair(10, "More modern and eclectic."),
            3 to Pair(2, "Less frantic drums, simpler."),
            4 to Pair(36, "You don't like the drums, but the rest of it is good.")
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
            2 to Pair(12, "Less wonky and strange."),
            3 to Pair(29, "You want this, but in a jungle.")
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
            1 to Pair(21, "You like the sampling. Here is a plunderphonics classic!"),
            2 to Pair(11, "Not my thing. Back to Metaphorical Music."),
        )

        21-> hashMapOf(
            1 to Pair(14, "Darker. Sadder. Samples are more messed up."),
            2 to Pair(22, "More sampling with more of a hip-hop vibe."),
            3 to Pair(54, "Slower samples, stranger.")
        )

        22-> hashMapOf(
            1 to Pair(13, "More instrumental hip hop."),
            2 to Pair(21, "Back to Since I Left You."),
            3 to Pair(24, "Back to Alcachofa."),
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
            2 to Pair(28, "Did you like \"Halcyon + On + ON?\""),
            3 to Pair(47, "More minimal, more ambient too."),
            4 to Pair(24, "Less melody, more subtle.")
        )

        26-> hashMapOf(
            1 to Pair(25, "More like this."),
            2 to Pair(27, "Even more."),
            3 to Pair(51, "Feeling shpongled? More psychedelic.")
        )

        27-> hashMapOf(
            1 to Pair(28, "Feel ready for ambient music?"),
            2 to Pair(29, "Similar vibe but more crazy.")
        )

        28-> hashMapOf(
            1 to Pair(30, "Even more ambient."),
        )

        29-> hashMapOf(
            1 to Pair(10, "You want this, but in a spaceship."),
            2 to Pair(34, "You liked the strange vocals and the drums.")
        )

        30-> hashMapOf(
            1 to Pair(31, "Even more minimal and ambient."),
            2 to Pair(32, "More ethereal and spacey."),
            3 to Pair(6, "Similarly sparse ambient music, but darker."),
            4 to Pair(47, "Like this, but techno.")
        )

        31-> hashMapOf(
            1 to Pair(6, "Similarly sparse ambient music, but darker."),
            2 to Pair(32, "More ethereal and spacey.")
        )

        32-> hashMapOf(
            1 to Pair(33, "Even more ethereal and hazy. You will feel like an astronaut."),
        )

        33-> hashMapOf(
            1 to Pair(32, "Similar to this, albeit less hazy."),
            2 to Pair(45, "Just as ethereal and otherworldly as this, but more mechanical."),
        )

        34-> hashMapOf(
            1 to Pair(44, "Those drums. 10 times louder and crazier.")
        )

        35-> hashMapOf(
            1 to Pair(26, "Less ambient")
        )

        36-> hashMapOf(
            1 to Pair(35, "Want a steady beat?"),
            2 to Pair(28, "More ambient stuff."),
            3 to Pair(37, "More drums."),
            4 to Pair(41, "Just like this.")
        )

        37-> hashMapOf(
            1 to Pair(7, "More like this."),
            2 to Pair(36, "Less drums.")
        )

        38-> hashMapOf(
            1 to Pair(37, "You like the drums."),
            2 to Pair(45, "You like the glitch. Let's check out some glitch pop.")
        )

        39-> hashMapOf(
            1 to Pair(42, "More electronic influence."),
            2 to Pair(41, "This, but fully electronic.")
        )

        40-> hashMapOf(
            1 to Pair(41, "Quieter."),
        )

        41-> hashMapOf(
            1 to Pair(43, "This style of synths, but shorter songs and carelessly happy."),
            2 to Pair(36, "Just like this."),
            3 to Pair(28, "More ambient stuff.")
        )

        42-> hashMapOf(
            1 to Pair(41, "Fully electronic now.")
        )

        43-> hashMapOf(
            1 to Pair(43, "This style of synths, but shorter songs and carelessly happy.")
        )

        44-> hashMapOf(
            1 to Pair(38, "You like the orchestral samples, but calm down the drums."),
            2 to Pair(34, "Back to room(s)")
        )

        45-> hashMapOf(
            1 to Pair(46, "Less glitch, but a similar ethereal vibe."),
            2 to Pair(33, "You liked the hazy and ethereal parts.")
        )

        46-> hashMapOf(
            1 to Pair(2, "Similar to this. More minimal."),
            2 to Pair(45, "Back to Velocity : Design : Comfort.")
        )

        47-> hashMapOf(
            1 to Pair(48, "You like the piano, but not the heavier parts."),
            2 to Pair(49, "You like the heavier parts (like collider)")
        )

        48-> hashMapOf(
            1 to Pair(32, "Some more nice ambient stuff."),
            2 to Pair(47, "Back to immunity.")
        )

        49-> hashMapOf(
            1 to Pair(50, "Dirtier."),
            2 to Pair(51, "Feeling shpongled? More tribal."),
            3 to Pair(52, "A big collection of careless, fun music to dance to.")
        )

        50-> hashMapOf(
            1 to Pair(49, "Back to Discovery."),
        )

        51-> hashMapOf(
            1 to Pair(53, "More focus on fast, hard hitting drums."),
            3 to Pair(52, "A big collection of careless, fun music to dance to.")
        )

        52-> hashMapOf(
            1 to Pair(53, "Feeling shpongled? Back to Shpongle."),
            3 to Pair(36, "Back to Timeless.")
        )

        53-> hashMapOf(
            1 to Pair(52, "Wanna feel like you're exploring a frozen wasteland?"),
        )

        54-> hashMapOf(
            1 to Pair(55, "Like this but glitchier."),
            2 to Pair(57, "More rhythmic and sounds like Windows OS."),
            3 to Pair(21, "Back to Since I Left You"),
        )

        55-> hashMapOf(
            1 to Pair(56, "More energetic, danceable and poppy."),
            2 to Pair(54, "Back to Floral Shoppe.")
        )

        56-> hashMapOf(
            1 to Pair(49, "You want more energetic, danceable music."),
            2 to Pair(55, "Back to I'll Try Living Like This."),
        )

        57-> hashMapOf(
            1 to Pair(13, "Similarly hip hop influenced."),
            1 to Pair(54, "Back to Floral Shoppe"),
        )

        else -> hashMapOf(
            1 to Pair(6, "An error has occurred with the flowchart. Click to see the developer's favourite album.")
        )
    }

    return connections
}
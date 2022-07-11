package com.example.vaporwaveappdemo

import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

/**
 * Contains information about the Album object.
 */
class Album(val number: Int, sp: SharedPreferences) {

    /*
    Assigns to the value a list of strings containing album information based on the album number.
     */
    val details = when (number) {
        1 -> listOf(
            "Kid A", "Radiohead", R.drawable.album1.toString(),
            "https://rateyourmusic.com/release/album/radiohead/kid-a/",
            "NUnXxh5U25Y", "6GjwtEZcfenmOf6l18N7T7"
        )
        2 -> listOf(
            "Selected Ambient Works 85-92", "Aphex Twin", R.drawable.album2.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/selected-ambient-works-85-92/",
            "Xw5AiRVqfqk", "7aNclGRxTysfh6z0d8671k"
        )
        3 -> listOf(
            "Lift Your Skinny Fists", "Godspeed you Black Emperor", R.drawable.album3.toString(),
            "https://rateyourmusic.com/release/album/godspeed-you-black-emperor/lift-yr-skinny-fists-like-antennas-to-heaven/",
            "PZwQeZh6rP0", "2rT82YYlV9UoxBYLIezkRq"
        )
        4 -> listOf(
            "Psychic", "Darkside", R.drawable.album4.toString(),
            "https://rateyourmusic.com/release/album/darkside/psychic/",
            "d8NaWT0WvEE", "2Q7l5NR9ZY8gfkkTtBnlBt"
        )
        5 -> listOf(
            "Silent Shout", "The Knife", R.drawable.album5.toString(),
            "https://rateyourmusic.com/release/album/the-knife/silent-shout/",
            "fTXgWu8I3-g", "6rdNbdV3T4muFFFSjGdOj9?"
        )
        6 -> listOf(
            "Selected Ambient Works Volume II", "Aphex Twin", R.drawable.album6.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/selected-ambient-works-volume-ii/",
            "-57Ti2i_yhU", "17vHPMmoxN5B8cdhCDeMTe"
        )
        7 -> listOf(
            "Drukqs", "Aphex Twin", R.drawable.album7.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/drukqs/",
            "htUalPYmIxk", "1maoQPAmw44bbkNOxKlwsx"
        )
        8 -> listOf(
            "Music Has the Right to Children", "Boards of Canada", R.drawable.album8.toString(),
            "https://rateyourmusic.com/release/album/boards-of-canada/music-has-the-right-to-children/",
            "yJj24t6nOn4", "1vWnB0hYmluskQuzxwo25a"
        )
        9 -> listOf(
            "Geogaddi", "Boards of Canada", R.drawable.album9.toString(),
            "https://rateyourmusic.com/release/album/boards-of-canada/geogaddi/",
            "vDkHR80rNtw", "7Lou3RDk6NswmbzBMhro24"
        )
        11 -> listOf(
            "Metaphorical Music", "Nujabes", R.drawable.album11.toString(),
            "https://rateyourmusic.com/release/album/nujabes/metaphorical-music/",
            "7xZY8VJHqU4", "5FrjDW96mCYw9ECc74c637"
        )
        10 -> listOf(
            "Cosmogramma", "Flying Lotus", R.drawable.album10.toString(),
            "https://rateyourmusic.com/release/album/flying-lotus/cosmogramma/",
            "lmMwJeLMWkA", "5c7XChrHxYaqykCZLaGM5f"
        )
        12 -> listOf(
            "Midnight Menu", "TOKiMONSTA", R.drawable.album12.toString(),
            "https://rateyourmusic.com/release/album/tokimonsta/midnight-menu/",
            "gxq21pJMjrM", "4X82sfwbHWa8KFz5Ik1tRX"
        )
        13 -> listOf(
            "Modal Soul", "Nujabes", R.drawable.album13.toString(),
            "https://rateyourmusic.com/release/album/nujabes/modal-soul/",
            "8iP3J8jFYdM", "6nVACH6a27eOWiumAJhDWS"
        )

        14 -> listOf(
            "Untrue", "Burial", R.drawable.album14.toString(),
            "https://rateyourmusic.com/release/album/burial/untrue/",
            "8k_f2QK77ew", "1CI5OW60s9W41YLI80Jjdr"
        )
        15 -> listOf(
            "Mezzanine", "Massive Attack", R.drawable.album15.toString(),
            "https://rateyourmusic.com/release/album/massive-attack/mezzanine/",
            "66A_3uwuZ_I", "49MNmJhZQewjt06rpwp6QR"
        )
        16 -> listOf(
            "James Blake", "James Blake", R.drawable.album16.toString(),
            "https://rateyourmusic.com/release/album/james-blake/james-blake/",
            "KJZ13SyRXhU", "0qY6lBQSi8IMJjHYDPdAqX"
        )
        17 -> listOf(
            "Dummy", "Portishead", R.drawable.album17.toString(),
            "https://rateyourmusic.com/release/album/portishead/dummy/",
            "slDNOtOQ8oA", "3539EbNgIdEDGBKkUf4wno"
        )
        18 -> listOf(
            "Black Sands", "Bonobo", R.drawable.album18.toString(),
            "https://rateyourmusic.com/release/album/bonobo/black-sands/",
            "0wdJNhhe9WA", "5m1RkwKeU7MV0Ni6PH2lPy"
        )
        19 -> listOf(
            "Dive", "Tycho", R.drawable.album19.toString(),
            "https://rateyourmusic.com/release/album/tycho/dive/",
            "Z6ih1aKeETk", "4CBUbnGFz2iKFJjYqRIwst"
        )
        20 -> listOf(
            "Feed The Animals", "Girl Talk", R.drawable.album20.toString(),
            "https://rateyourmusic.com/release/album/girl-talk/feed-the-animals/",
            "vU62x2PnSO4", "1B5Lwt0D1ZetRreaCBYobP"
        )
        21 -> listOf(
            "Since I Left You", "The Avalanches", R.drawable.album21.toString(),
            "https://rateyourmusic.com/release/album/the-avalanches/since-i-left-you/",
            "TyOfYE5cqNk", "0YtYaaO0aipyeQl0xhAWTO"
        )
        22 -> listOf(
            "Endtroducing...", "DJ Shadow", R.drawable.album22.toString(),
            "https://rateyourmusic.com/release/album/dj-shadow/endtroducing/",
            "IiTE-Eyx18A", "4wvqGLk1HThPA0b5lzRK2l"
        )
        23 -> listOf(
            "Space is Only Noise", "Nicolas Jarr", R.drawable.album23.toString(),
            "https://rateyourmusic.com/release/album/nicolas-jaar/space-is-only-noise/",
            "m4krz1cTmmU", "0tUJcqDuXHNkaPKLN0lQhT"
        )
        24 -> listOf(
            "Alcachofa", "Ricardo Villalobos", R.drawable.album24.toString(),
            "https://rateyourmusic.com/release/album/ricardo-villalobos/alcachofa/",
            "w82WpAd1xsU", "null"
        )
        25 -> listOf(
            "Brown Album", "Orbital", R.drawable.album25.toString(),
            "https://rateyourmusic.com/release/album/orbital/orbital-brown-album/",
            "SCVWulhp2No", "1JYyYFJSYrXMHLe7Dz1B3W"
        )
        26 -> listOf(
            "Accelerator", "The Future Sound of London", R.drawable.album26.toString(),
            "https://rateyourmusic.com/release/album/the_future_sound_of_london/accelerator/",
            "8pwHvkf2Cg8", "5QJgGoswsej4o1KwXpfYCZ"
        )

        27 -> listOf(
            "Lifeforms", "The Future Sound of London", R.drawable.album27.toString(),
            "https://rateyourmusic.com/release/album/the_future_sound_of_london/lifeforms/",
            "VFawaE5-oAg", "0UcHfoo7KMso767JwePBMh"
        )
        28 -> listOf(
            "76:14", "Global Communication", R.drawable.album28.toString(),
            "https://rateyourmusic.com/release/album/global-communication/76_14/",
            "YJqoQP5zjgo", "4y0wXNP3t9rUv1y58Peuj1"
        )
        29 -> listOf(
            "Galaxy Garden", "Lone", R.drawable.album29.toString(),
            "https://rateyourmusic.com/release/album/lone/galaxy-garden/",
            "snJXiDY1BfI", "01G2vIEEdYxsXZyi4NzwyJ"
        )
        30 -> listOf(
            "Ambient 2: The Plateaux of Mirror", "Brian Eno", R.drawable.album30.toString(),
            "https://rateyourmusic.com/release/album/harold-budd-brian-eno/ambient-2-the-plateaux-of-mirror/",
            "cOWJq88uAiQ", "5ma9r5NFV0poevmydI2qgO"
        )
        31 -> listOf(
            "Ambient 1: Music for Airports", "Brian Eno", R.drawable.album31.toString(),
            "https://rateyourmusic.com/release/album/brian-eno/ambient-1-music-for-airports/",
            "vNwYtllyt3Q", "063f8Ej8rLVTz9KkjQKEMa"
        )
        32 -> listOf(
            "Apollo: Atmospheres & Soundtracks", "Brian Eno", R.drawable.album32.toString(),
            "https://rateyourmusic.com/release/album/brian-eno-with-daniel-lanois-and-roger-eno/apollo-atmospheres-and-soundtracks/",
            "dcWwtQmAt7E", "1Km58i317Pm5bQR3wPHKcO"
        )
        33 -> listOf(
            "Alien Observer", "Grouper", R.drawable.album33.toString(),
            "https://rateyourmusic.com/release/album/grouper/a-i-a-alien-observer/",
            "dgPJKm3oxlc", "4Z1BFX1oBckY8bhGEWMYmi"
        )
        34 -> listOf(
            "Room(s)", "Machinedrum", R.drawable.album34.toString(),
            "https://rateyourmusic.com/release/album/machinedrum/room_s/",
            "hrmJajFsAMk", "3LfxDGTUeXSFp9XDAUKobu"
        )
        35 -> listOf(
            "The Orb's Adventures Beyond the Ultraworld", "The Orb", R.drawable.album35.toString(),
            "https://rateyourmusic.com/release/album/orb/the-orbs-adventures-beyond-the-ultraworld/",
            "jVuv7dHg5Cw", "null"
        )
        36 -> listOf(
            "Timewind", "Klaus Schulze", R.drawable.album36.toString(),
            "https://rateyourmusic.com/release/album/klaus-schulze/timewind/",
            "qBn0Jnf7_3M", "0QG1Ty8ld4wVl8YcPFOgUT"
        )
        37 -> listOf(
            "Amber", "Autechre", R.drawable.album37.toString(),
            "https://rateyourmusic.com/release/album/autechre/amber/",
            "azZBpUq7u0I", "7EfhvG3RwdhzXrFlkDVxg4"
        )
        38 -> listOf(
            "Program Music I", "Kashiwa Daisuke", R.drawable.album38.toString(),
            "https://rateyourmusic.com/release/album/kashiwa-daisuke/program-music-i/",
            "YeT0t1C_y20", "6Wx8t8cw8kF1P3USoiP32h"
        )
        39 -> listOf(
            "Neu!", "Neu!", R.drawable.album39.toString(),
            "https://rateyourmusic.com/release/album/neu_/neu__f6/",
            "vQCTTvUqhOQ", "77JnRHSaaS8D6JZQ4EIKu8"
        )

        40 -> listOf(
            "Tarot Sport", "Fuck Buttons", R.drawable.album40.toString(),
            "https://rateyourmusic.com/release/album/fuck-buttons/tarot-sport/",
            "rKd7WQSk-1Y", "7tilRUU7WANATJdxhMO3p8"
        )
        41 -> listOf(
            "Phaedra", "Tangerine Dream", R.drawable.album41.toString(),
            "https://rateyourmusic.com/release/album/tangerine-dream/phaedra/",
            "HIQ0dd7B_FU", "6wugThEUTAa6BdI2hsqm5n"
        )
        42 -> listOf(
            "e2-e4", "Manuel Gottsching", R.drawable.album42.toString(),
            "https://rateyourmusic.com/release/album/manuel-gottsching/e2-e4/",
            "ys0HyevZpQg", "64UtnfSDLV1OLvhyqfmO8o"
        )
        43 -> listOf(
            "Mother Earth's Plantasia", "Mort Garson", R.drawable.album43.toString(),
            "https://rateyourmusic.com/release/album/mort-garson/mother-earths-plantasia/",
            "l0vrsO3_HpU", "0NJRPgK15C8qoLuQv1hChv"
        )
        44 -> listOf(
            "Rossz Csillag Allat Szuletett", "Venetian Snares", R.drawable.album44.toString(),
            "https://rateyourmusic.com/release/album/venetian-snares/rossz-csillag-alatt-szuletett/",
            "H28YlOrnTaA", "5ZfRZFsE3rZOOad7zv8fCt"
        )
        45 -> listOf(
            "Velocity : Design : Comfort", "Sweet Trip", R.drawable.album45.toString(),
            "https://rateyourmusic.com/release/album/sweet-trip/velocity-design-comfort/",
            "fZlNt05dCX8", "0eUUQ4rly8Q8PyJPWLgde2"
        )
        46 -> listOf(
            "Halica", "Sweet Trip", R.drawable.album46.toString(),
            "https://rateyourmusic.com/release/album/sweet-trip/halica-bliss-out-v_11/",
            "D67KmSrrxmU", "7LSR2qgqiWZnmTt92WOGXq"
        )
        47 -> listOf(
            "Immunity", "John Hopkins", R.drawable.album47.toString(),
            "https://rateyourmusic.com/release/album/jon-hopkins/immunity/",
            "_V1DIa76SLM", "1rxWlYQcH945S3jpIMYR35"
        )
        48 -> listOf(
            "Eingya", "Helios", R.drawable.album48.toString(),
            "https://rateyourmusic.com/release/album/helios/eingya/",
            "Bj0IMRxUFUo", "1OF3AnbSDa1ZSEFE7lukTb"
        )
        49 -> listOf(
            "Discovery", "Daft Punk", R.drawable.album49.toString(),
            "https://rateyourmusic.com/release/album/daft-punk/discovery/",
            "FGBhQbmPwH8", "2noRn2Aes5aoNVsU6iWThc"
        )
        50 -> listOf(
            "Cross", "Justice", R.drawable.album50.toString(),
            "https://rateyourmusic.com/release/album/justice/%E2%80%A0/",
            "jb7cTUwPG-A", "4GGazqHvuKwxBjWLFaJkDL"
        )
        51 -> listOf(
            "Are You Shpongled?", "Shpongle", R.drawable.album51.toString(),
            "https://rateyourmusic.com/release/album/shpongle/are-you-shpongled/",
            "J2WP-55FLNk", "7fAOqI4aJxx5oTeCMLPONf"
        )
        52 -> listOf(
            "Northern Exposure", "Sasha and John Digweed", R.drawable.album52.toString(),
            "https://rateyourmusic.com/release/djmix/sasha-and-john-digweed/northern-exposure/",
            "aaY3spCDdpY", "null"
        )

        53 -> listOf(
            "Timeless", "Goldie", R.drawable.album53.toString(),
            "https://rateyourmusic.com/release/album/goldie/timeless/",
            "dhV9VbxV3Rw", "67HPieOqDZ6G7WOM09Egbk"
        )
        54 -> listOf(
            "Floral Shoppe", "Macintosh Plus", R.drawable.album54.toString(),
            "https://rateyourmusic.com/release/album/macintosh-plus/floral-shoppe/",
            "cCq0P509UL4", "null"
        )
        55 -> listOf(
            "I'll Try Living Like This",
            "death's dynamic shroud.wmv",
            R.drawable.album55.toString(),
            "https://rateyourmusic.com/release/album/deaths-dynamic-shroud_wmv/ill-try-living-like-this/",
            "25YqRRvl9gk",
            "1BVQ0iqg1mFg3Q48OLlwOT"
        )
        56 -> listOf(
            "Faith In Persona", "death's dynamic shroud.wmv", R.drawable.album56.toString(),
            "https://rateyourmusic.com/release/album/deaths-dynamic-shroud_wmv/faith-in-persona-1/",
            "YMiPrlTJIbQ", "1HBuWe94Z8qMTj2IvgfO4B"
        )
        57 -> listOf(
            "Blank Banshee 0", "Blank Banshee", R.drawable.album57.toString(),
            "https://rateyourmusic.com/release/album/blank-banshee/blank-banshee-0/",
            "8oBbJg_PqbU", "5AcOa8jiTLbwlBaIIbCjYn"
        )
        58 -> listOf(
            "...I Care Because You Do", "Aphex Twin", R.drawable.album58.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/_i-care-because-you-do/",
            "NJesxnyCMbU", "0VG7XLJ8gSynEQDVnpHNNU"
        )
        59 -> listOf(
            "Seikan Seikou", "t e l e p a t h", R.drawable.album59.toString(),
            "https://rateyourmusic.com/release/album/t-e-l-e-p-a-t-h-%E3%83%86%E3%83%AC%E3%83%91%E3%82%B7%E3%83%BC%E8%83%BD%E5%8A%9B%E8%80%85/%E6%98%9F%E9%96%93%E6%80%A7%E4%BA%A4-seikan-seikou/",
            "6KU8Iv2QV6k", "null"
        )
        60 -> listOf(
            "Cyper Palace", "ICYTWAT", R.drawable.album60.toString(),
            "https://rateyourmusic.com/release/album/icytwat/cyber-palace.p/",
            "psrKKAuvVcM", "null"
        )
        61 -> listOf(
            "Blank Banshee 1", "Blank Banshee", R.drawable.album61.toString(),
            "https://rateyourmusic.com/release/album/blank-banshee/blank-banshee-1/",
            "ojmk5tSj0sE", "0YmiMuYsAUuP8hluFNrsYs"
        )


        else -> {
            listOf("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")
        }
    }

    val name = details[0]
    val artist = details[1]
    val art = details[2].toInt()

    val rym = details[3]
    val yt = details[4]
    val spotify = details[5]

    val editListened = sp.edit()
    val listened = mutableStateOf(sp.getBoolean(number.toString(), false))
}
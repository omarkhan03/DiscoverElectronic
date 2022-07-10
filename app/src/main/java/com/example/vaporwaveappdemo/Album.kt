package com.example.vaporwaveappdemo

import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class Album(val number: Int, sp: SharedPreferences) {

    val details = when ( number ) {
        1-> listOf("Kid A", "Radiohead", R.drawable.album1.toString(),
            "https://rateyourmusic.com/release/album/radiohead/kid-a/",
            "NUnXxh5U25Y")
        2-> listOf("Selected Ambient Works 85-92", "Aphex Twin", R.drawable.album2.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/selected-ambient-works-85-92/",
            "Xw5AiRVqfqk")
        3-> listOf("Lift Your Skinny Fists", "Godspeed you Black Emperor", R.drawable.album3.toString(),
            "https://rateyourmusic.com/release/album/godspeed-you-black-emperor/lift-yr-skinny-fists-like-antennas-to-heaven/",
            "PZwQeZh6rP0")
        4-> listOf("Psychic", "Darkside", R.drawable.album4.toString(),
            "https://rateyourmusic.com/release/album/darkside/psychic/",
            "d8NaWT0WvEE")
        5-> listOf("Silent Shout", "The Knife", R.drawable.album5.toString(),
            "https://rateyourmusic.com/release/album/the-knife/silent-shout/",
            "fTXgWu8I3-g")
        6-> listOf("Selected Ambient Works Volume II", "Aphex Twin", R.drawable.album6.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/selected-ambient-works-volume-ii/",
            "-57Ti2i_yhU")
        7-> listOf("Drukqs", "Aphex Twin", R.drawable.album7.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/drukqs/",
            "htUalPYmIxk")
        8-> listOf("Music Has the Right to Children", "Boards of Canada", R.drawable.album8.toString(),
            "https://rateyourmusic.com/release/album/boards-of-canada/music-has-the-right-to-children/",
            "yJj24t6nOn4")
        9-> listOf("Geogaddi", "Boards of Canada", R.drawable.album9.toString(),
            "https://rateyourmusic.com/release/album/boards-of-canada/geogaddi/",
            "vDkHR80rNtw")
        11-> listOf("Metaphorical Music", "Nujabes", R.drawable.album11.toString(),
            "https://rateyourmusic.com/release/album/nujabes/metaphorical-music/",
            "7xZY8VJHqU4")
        10-> listOf("Cosmogramma", "Flying Lotus", R.drawable.album10.toString(),
            "https://rateyourmusic.com/release/album/flying-lotus/cosmogramma/",
            "lmMwJeLMWkA")
        12-> listOf("Midnight Menu", "TOKiMONSTA", R.drawable.album12.toString(),
            "https://rateyourmusic.com/release/album/tokimonsta/midnight-menu/",
            "gxq21pJMjrM")
        13-> listOf("Modal Soul", "Nujabes", R.drawable.album13.toString(),
            "https://rateyourmusic.com/release/album/nujabes/modal-soul/",
            "8iP3J8jFYdM")

        14-> listOf("Untrue", "Burial", R.drawable.album14.toString(),
            "https://rateyourmusic.com/release/album/burial/untrue/",
            "8k_f2QK77ew")
        15-> listOf("Mezzanine", "Massive Attack", R.drawable.album15.toString(),
            "https://rateyourmusic.com/release/album/massive-attack/mezzanine/",
            "66A_3uwuZ_I")
        16-> listOf("James Blake", "James Blake", R.drawable.album16.toString(),
            "https://rateyourmusic.com/release/album/james-blake/james-blake/",
            "KJZ13SyRXhU")
        17-> listOf("Dummy", "Portishead", R.drawable.album17.toString(),
            "https://rateyourmusic.com/release/album/portishead/dummy/",
            "slDNOtOQ8oA")
        18-> listOf("Black Sands", "Bonobo", R.drawable.album18.toString(),
            "https://rateyourmusic.com/release/album/bonobo/black-sands/",
            "0wdJNhhe9WA")
        19-> listOf("Dive", "Tycho", R.drawable.album19.toString(),
            "https://rateyourmusic.com/release/album/tycho/dive/",
            "Z6ih1aKeETk")
        20-> listOf("Feed The Animals", "Girl Talk", R.drawable.album20.toString(),
            "https://rateyourmusic.com/release/album/girl-talk/feed-the-animals/",
            "vU62x2PnSO4")
        21-> listOf("Since I Left You", "The Avalanches", R.drawable.album21.toString(),
            "https://rateyourmusic.com/release/album/the-avalanches/since-i-left-you/",
            "TyOfYE5cqNk")
        22-> listOf("Endtroducing", "DJ Shadow", R.drawable.album22.toString(),
            "https://rateyourmusic.com/release/album/dj-shadow/endtroducing/",
            "IiTE-Eyx18A")
        23-> listOf("Space is Only Noise", "Nicolas Jarr", R.drawable.album23.toString(),
            "https://rateyourmusic.com/release/album/nicolas-jaar/space-is-only-noise/",
            "m4krz1cTmmU")
        24-> listOf("Alcachofa", "Villalobos", R.drawable.album24.toString(),
            "https://rateyourmusic.com/release/album/ricardo-villalobos/alcachofa/",
            "w82WpAd1xsU")
        25-> listOf("Brown Album", "Orbital", R.drawable.album25.toString(),
            "https://rateyourmusic.com/release/album/orbital/orbital-brown-album/",
            "SCVWulhp2No")
        26-> listOf("Accelerator", "The Future Sound of London", R.drawable.album26.toString(),
            "https://rateyourmusic.com/release/album/the_future_sound_of_london/accelerator/",
            "8pwHvkf2Cg8")

        27-> listOf("Lifeforms", "The Future Sound of London", R.drawable.album27.toString(),
            "https://rateyourmusic.com/release/album/the_future_sound_of_london/lifeforms/",
            "VFawaE5-oAg")
        28-> listOf("76:14", "Global Communication", R.drawable.album28.toString(),
            "https://rateyourmusic.com/release/album/global-communication/76_14/",
            "YJqoQP5zjgo")
        29-> listOf("Galaxy Garden", "Lone", R.drawable.album29.toString(),
            "https://rateyourmusic.com/release/album/lone/galaxy-garden/",
            "snJXiDY1BfI")
        30-> listOf("Ambient 2: The Plateaux of Mirror", "Brian Eno", R.drawable.album30.toString(),
            "https://rateyourmusic.com/release/album/harold-budd-brian-eno/ambient-2-the-plateaux-of-mirror/",
            "cOWJq88uAiQ")
        31-> listOf("Ambient 1: Music for Airports", "Brian Eno", R.drawable.album31.toString(),
            "https://rateyourmusic.com/release/album/brian-eno/ambient-1-music-for-airports/",
            "vNwYtllyt3Q")
        32-> listOf("Apollo: Atmospheres & Soundtracks", "Brian Eno", R.drawable.album32.toString(),
            "https://rateyourmusic.com/release/album/brian-eno-with-daniel-lanois-and-roger-eno/apollo-atmospheres-and-soundtracks/",
            "dcWwtQmAt7E")
        33-> listOf("Alien Observer", "Grouper", R.drawable.album33.toString(),
            "https://rateyourmusic.com/release/album/grouper/a-i-a-alien-observer/",
            "dgPJKm3oxlc")
        34-> listOf("Room(s)", "Machinedrum", R.drawable.album34.toString(),
            "https://rateyourmusic.com/release/album/machinedrum/room_s/",
            "hrmJajFsAMk")
        35-> listOf("The Orb's Adventures Beyond the Ultraworld", "The Orb", R.drawable.album35.toString(),
            "https://rateyourmusic.com/release/album/orb/the-orbs-adventures-beyond-the-ultraworld/",
            "jVuv7dHg5Cw")
        36-> listOf("Timewind", "Klaus Schulze", R.drawable.album36.toString(),
            "https://rateyourmusic.com/release/album/klaus-schulze/timewind/",
            "qBn0Jnf7_3M")
        37-> listOf("Amber", "Autechre", R.drawable.album37.toString(),
            "https://rateyourmusic.com/release/album/autechre/amber/",
            "azZBpUq7u0I")
        38-> listOf("Program Music", "Kashiwa Daisuke", R.drawable.album38.toString(),
            "https://rateyourmusic.com/release/album/kashiwa-daisuke/program-music-i/",
            "YeT0t1C_y20")
        39-> listOf("Neu!", "Neu!", R.drawable.album39.toString(),
            "https://rateyourmusic.com/release/album/neu_/neu__f6/",
            "vQCTTvUqhOQ")

        40-> listOf("Tarot Sport", "Fuck Buttons", R.drawable.album40.toString(),
            "https://rateyourmusic.com/release/album/fuck-buttons/tarot-sport/",
            "rKd7WQSk-1Y")
        41-> listOf("Phaedra", "Tangerine Dream", R.drawable.album41.toString(),
            "https://rateyourmusic.com/release/album/tangerine-dream/phaedra/",
            "HIQ0dd7B_FU")
        42-> listOf("e2-e4", "Manuel Gottsching", R.drawable.album42.toString(),
            "https://rateyourmusic.com/release/album/manuel-gottsching/e2-e4/",
            "ys0HyevZpQg")
        43-> listOf("Mother Earth's Plantasia", "Mort Garson", R.drawable.album43.toString(),
            "https://rateyourmusic.com/release/album/mort-garson/mother-earths-plantasia/",
            "l0vrsO3_HpU")
        44-> listOf("Rossz Csillag Allat Szuletett", "Venetian Snares", R.drawable.album44.toString(),
            "https://rateyourmusic.com/release/album/venetian-snares/rossz-csillag-alatt-szuletett/",
            "H28YlOrnTaA")
        45-> listOf("Velocity : Design : Comfort", "Sweet Trip", R.drawable.album45.toString(),
            "https://rateyourmusic.com/release/album/sweet-trip/velocity-design-comfort/",
            "fZlNt05dCX8")
        46-> listOf("Halica", "Sweet Trip", R.drawable.album46.toString(),
            "https://rateyourmusic.com/release/album/sweet-trip/halica-bliss-out-v_11/",
            "D67KmSrrxmU")
        47-> listOf("Immunity", "John Hopkins", R.drawable.album47.toString(),
            "https://rateyourmusic.com/release/album/jon-hopkins/immunity/",
            "_V1DIa76SLM")
        48-> listOf("Eingya", "Helios", R.drawable.album48.toString(),
            "https://rateyourmusic.com/release/album/helios/eingya/",
            "Bj0IMRxUFUo")
        49-> listOf("Discovery", "Daft Punk", R.drawable.album49.toString(),
            "https://rateyourmusic.com/release/album/daft-punk/discovery/",
            "FGBhQbmPwH8")
        50-> listOf("Cross", "Justice", R.drawable.album50.toString(),
            "https://rateyourmusic.com/release/album/justice/%E2%80%A0/",
            "jb7cTUwPG-A")
        51-> listOf("Are You Shpongled?", "Shpongle", R.drawable.album51.toString(),
            "https://rateyourmusic.com/release/album/shpongle/are-you-shpongled/",
            "J2WP-55FLNk")
        52-> listOf("Northern Exposure", "Sasha and John Digweed", R.drawable.album52.toString(),
            "https://rateyourmusic.com/release/djmix/sasha-and-john-digweed/northern-exposure/",
            "aaY3spCDdpY")

        53-> listOf("Timeless", "Goldie", R.drawable.album53.toString(),
            "https://rateyourmusic.com/release/album/goldie/timeless/",
            "dhV9VbxV3Rw")
        54-> listOf("Floral Shoppe", "Macintosh Plus", R.drawable.album54.toString(),
            "https://rateyourmusic.com/release/album/macintosh-plus/floral-shoppe/",
            "cCq0P509UL4")
        55-> listOf("I'll Try Living Like This", "death's dynamic shroud.wmv", R.drawable.album55.toString(),
            "https://rateyourmusic.com/release/album/deaths-dynamic-shroud_wmv/ill-try-living-like-this/",
            "25YqRRvl9gk")
        56-> listOf("Faith In Persona", "death's dynamic shroud.wmv", R.drawable.album56.toString(),
            "https://rateyourmusic.com/release/album/deaths-dynamic-shroud_wmv/faith-in-persona-1/",
            "YMiPrlTJIbQ")
        57-> listOf("Blank Banshee 0", "Blank Banshee", R.drawable.album57.toString(),
            "https://rateyourmusic.com/release/album/blank-banshee/blank-banshee-0/",
            "8oBbJg_PqbU")
        58-> listOf("...I Care Because You Do", "Aphex Twin", R.drawable.album58.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/_i-care-because-you-do/",
            "NJesxnyCMbU")
        59-> listOf("Seikan Seikou", "t e l e p a t h", R.drawable.album59.toString(),
            "https://rateyourmusic.com/release/album/t-e-l-e-p-a-t-h-%E3%83%86%E3%83%AC%E3%83%91%E3%82%B7%E3%83%BC%E8%83%BD%E5%8A%9B%E8%80%85/%E6%98%9F%E9%96%93%E6%80%A7%E4%BA%A4-seikan-seikou/",
            "6KU8Iv2QV6k")
        60-> listOf("Cyper Palace", "ICYTWAT", R.drawable.album60.toString(),
            "https://rateyourmusic.com/release/album/icytwat/cyber-palace.p/",
            "psrKKAuvVcM")
        61-> listOf("Blank Banshee 1", "Blank Banshee", R.drawable.album61.toString(),
            "https://rateyourmusic.com/release/album/blank-banshee/blank-banshee-1/",
            "ojmk5tSj0sE")


        else -> {listOf("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")}
    }

    /*
    fun openYoutubeLink(youtubeID: String) {
        val intentApp = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$youtubeID"))
        val intentBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=$youtubeID"))
        try {
            this.startActivity(intentApp)
        } catch (ex: ActivityNotFoundException) {
            this.startActivity(intentBrowser)
        }
    }

     */

    val name = details[0]
    val artist = details[1]
    val art = details[2].toInt()

    val rym = details[3]
    val yt = details[4]
    val spotify = "0YmiMuYsAUuP8hluFNrsYs" /* details[5] */

    val editListened = sp.edit()
    val listened = mutableStateOf(sp.getBoolean(number.toString(), false))
}
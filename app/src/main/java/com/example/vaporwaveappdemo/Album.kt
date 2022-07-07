package com.example.vaporwaveappdemo

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class Album(number : Int) {

    val details = when ( number ) {
        1-> listOf("Kid A", "Radiohead", R.drawable.album1.toString(),
            "https://rateyourmusic.com/release/album/radiohead/kid-a/")
        2-> listOf("Selected Ambient Works 85-92", "Aphex Twin", R.drawable.album2.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/selected-ambient-works-85-92/")
        3-> listOf("Lift Your Skinny Fists", "Godspeed you Black Emperor", R.drawable.album3.toString(),
            "https://rateyourmusic.com/release/album/godspeed-you-black-emperor/lift-yr-skinny-fists-like-antennas-to-heaven/")
        4-> listOf("Psychic", "Darkside", R.drawable.album4.toString(),
            "https://rateyourmusic.com/release/album/darkside/psychic/")
        5-> listOf("Silent Shout", "The Knife", R.drawable.album5.toString(),
            "https://rateyourmusic.com/release/album/the-knife/silent-shout/")
        6-> listOf("Selected Ambient Works Volume II", "Aphex Twin", R.drawable.album6.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/selected-ambient-works-volume-ii/")
        7-> listOf("Drukqs", "Aphex Twin", R.drawable.album7.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/drukqs/")
        8-> listOf("Music Has the Right to Children", "Boards of Canada", R.drawable.album8.toString(),
            "https://rateyourmusic.com/release/album/boards-of-canada/music-has-the-right-to-children/")
        9-> listOf("Geogaddi", "Boards of Canada", R.drawable.album9.toString(),
            "https://rateyourmusic.com/release/album/boards-of-canada/geogaddi/")
        11-> listOf("Metaphorical Music", "Nujabes", R.drawable.album11.toString(),
            "https://rateyourmusic.com/release/album/nujabes/metaphorical-music/")
        10-> listOf("Cosmogramma", "Flying Lotus", R.drawable.album10.toString(),
            "https://rateyourmusic.com/release/album/flying-lotus/cosmogramma/")
        12-> listOf("Midnight Menu", "TOKiMONSTA", R.drawable.album12.toString(),
            "https://rateyourmusic.com/release/album/tokimonsta/midnight-menu/")
        13-> listOf("Modal Soul", "Nujabes", R.drawable.album13.toString(),
            "https://rateyourmusic.com/release/album/nujabes/modal-soul/")

        14-> listOf("Untrue", "Burial", R.drawable.album14.toString(),
            "https://rateyourmusic.com/release/album/burial/untrue/")
        15-> listOf("Mezzanine", "Massive Attack", R.drawable.album15.toString(),
            "https://rateyourmusic.com/release/album/massive-attack/mezzanine/")
        16-> listOf("James Blake", "James Blake", R.drawable.album16.toString(),
            "https://rateyourmusic.com/release/album/james-blake/james-blake/")
        17-> listOf("Dummy", "Portishead", R.drawable.album17.toString(),
            "https://rateyourmusic.com/release/album/portishead/dummy/")
        18-> listOf("Black Sands", "Bonobo", R.drawable.album18.toString(),
            "https://rateyourmusic.com/release/album/bonobo/black-sands/")
        19-> listOf("Dive", "Tycho", R.drawable.album19.toString(),
            "https://rateyourmusic.com/release/album/tycho/dive/")
        20-> listOf("Feed The Animals", "Girl Talk", R.drawable.album20.toString(),
            "https://rateyourmusic.com/release/album/girl-talk/feed-the-animals/")
        21-> listOf("Since I Left You", "The Avalanches", R.drawable.album21.toString(),
            "https://rateyourmusic.com/release/album/the-avalanches/since-i-left-you/")
        22-> listOf("Endtroducing", "DJ Shadow", R.drawable.album22.toString(),
            "https://rateyourmusic.com/release/album/dj-shadow/endtroducing/")
        23-> listOf("Space is Only Noise", "Nicolas Jarr", R.drawable.album23.toString(),
            "https://rateyourmusic.com/release/album/nicolas-jaar/space-is-only-noise/")
        24-> listOf("Alcachofa", "Villalobos", R.drawable.album24.toString(),
            "https://rateyourmusic.com/release/album/ricardo-villalobos/alcachofa/")
        25-> listOf("Brown Album", "Orbital", R.drawable.album25.toString(),
            "https://rateyourmusic.com/release/album/orbital/orbital-brown-album/")
        26-> listOf("Accelerator", "The Future Sound of London", R.drawable.album26.toString(),
            "https://rateyourmusic.com/release/album/the_future_sound_of_london/accelerator/")

        27-> listOf("Lifeforms", "The Future Sound of London", R.drawable.album27.toString(),
            "https://rateyourmusic.com/release/album/the_future_sound_of_london/lifeforms/")
        28-> listOf("76:14", "Global Communication", R.drawable.album28.toString(),
            "https://rateyourmusic.com/release/album/global-communication/76_14/")
        29-> listOf("Galaxy Garden", "Lone", R.drawable.album29.toString(),
            "https://rateyourmusic.com/release/album/lone/galaxy-garden/")
        30-> listOf("Ambient 2: The Plateaux of Mirror", "Brian Eno", R.drawable.album30.toString(),
            "https://rateyourmusic.com/release/album/harold-budd-brian-eno/ambient-2-the-plateaux-of-mirror/")
        31-> listOf("Ambient 1: Music for Airports", "Brian Eno", R.drawable.album31.toString(),
            "https://rateyourmusic.com/release/album/brian-eno/ambient-1-music-for-airports/")
        32-> listOf("Apollo: Atmospheres & Soundtracks", "Brian Eno", R.drawable.album32.toString(),
            "https://rateyourmusic.com/release/album/brian-eno-with-daniel-lanois-and-roger-eno/apollo-atmospheres-and-soundtracks/")
        33-> listOf("Alien Observer", "Grouper", R.drawable.album33.toString(),
            "https://rateyourmusic.com/release/album/grouper/a-i-a-alien-observer/")
        34-> listOf("Room(s)", "Machinedrum", R.drawable.album34.toString(),
            "https://rateyourmusic.com/release/album/machinedrum/room_s/")
        35-> listOf("The Orb's Adventures Beyond the Ultraworld", "The Orb", R.drawable.album35.toString(),
            "https://rateyourmusic.com/release/album/orb/the-orbs-adventures-beyond-the-ultraworld/")
        36-> listOf("Timewind", "Klaus Schulze", R.drawable.album36.toString(),
            "https://rateyourmusic.com/release/album/klaus-schulze/timewind/")
        37-> listOf("Amber", "Autechre", R.drawable.album37.toString(),
            "https://rateyourmusic.com/release/album/autechre/amber/")
        38-> listOf("Program Music", "Kashiwa Daisuke", R.drawable.album38.toString(),
            "https://rateyourmusic.com/release/album/kashiwa-daisuke/program-music-i/")
        39-> listOf("Neu!", "Neu!", R.drawable.album39.toString(),
            "https://rateyourmusic.com/release/album/neu_/neu__f6/")

        40-> listOf("Tarot Sport", "Fuck Buttons", R.drawable.album40.toString(),
            "https://rateyourmusic.com/release/album/fuck-buttons/tarot-sport/")
        41-> listOf("Phaedra", "Tangerine Dream", R.drawable.album41.toString(),
            "https://rateyourmusic.com/release/album/tangerine-dream/phaedra/")
        42-> listOf("e2-e4", "Manuel Gottsching", R.drawable.album42.toString(),
            "https://rateyourmusic.com/release/album/manuel-gottsching/e2-e4/")
        43-> listOf("Mother Earth's Plantasia", "Mort Garson", R.drawable.album43.toString(),
            "https://rateyourmusic.com/release/album/mort-garson/mother-earths-plantasia/")
        44-> listOf("Rossz Csillag Allat Szuletett", "Venetian Snares", R.drawable.album44.toString(),
            "https://rateyourmusic.com/release/album/venetian-snares/rossz-csillag-alatt-szuletett/")
        45-> listOf("Velocity : Design : Comfort", "Sweet Trip", R.drawable.album45.toString(),
            "https://rateyourmusic.com/release/album/sweet-trip/velocity-design-comfort/")
        46-> listOf("Halica", "Sweet Trip", R.drawable.album46.toString(),
            "https://rateyourmusic.com/release/album/sweet-trip/halica-bliss-out-v_11/")
        47-> listOf("Immunity", "John Hopkins", R.drawable.album47.toString(),
            "https://rateyourmusic.com/release/album/jon-hopkins/immunity/")
        48-> listOf("Eingya", "Helios", R.drawable.album48.toString(),
            "https://rateyourmusic.com/release/album/helios/eingya/")
        49-> listOf("Discovery", "Daft Punk", R.drawable.album49.toString(),
            "https://rateyourmusic.com/release/album/daft-punk/discovery/")
        50-> listOf("Cross", "Justice", R.drawable.album50.toString(),
            "https://rateyourmusic.com/release/album/justice/%E2%80%A0/")
        51-> listOf("Are You Shpongled?", "Shpongle", R.drawable.album51.toString(),
            "https://rateyourmusic.com/release/album/shpongle/are-you-shpongled/")
        52-> listOf("Northern Exposure", "Sasha and John Digweed", R.drawable.album52.toString(),
            "https://rateyourmusic.com/release/djmix/sasha-and-john-digweed/northern-exposure/")

        53-> listOf("Timeless", "Goldie", R.drawable.album53.toString(),
            "https://rateyourmusic.com/release/album/goldie/timeless/")
        54-> listOf("Floral Shoppe", "Macintosh Plus", R.drawable.album54.toString(),
            "https://rateyourmusic.com/release/album/macintosh-plus/floral-shoppe/")
        55-> listOf("I'll Try Living Like This", "death's dynamic shroud.wmv", R.drawable.album55.toString(),
            "https://rateyourmusic.com/release/album/deaths-dynamic-shroud_wmv/ill-try-living-like-this/")
        56-> listOf("Faith In Persona", "death's dynamic shroud.wmv", R.drawable.album56.toString(),
            "https://rateyourmusic.com/release/album/deaths-dynamic-shroud_wmv/faith-in-persona-1/")
        57-> listOf("Blank Banshee 0", "Blank Banshee", R.drawable.album57.toString(),
            "https://rateyourmusic.com/release/album/blank-banshee/blank-banshee-0/")
        58-> listOf("...I Care Because You Do", "Aphex Twin", R.drawable.album58.toString(),
            "https://rateyourmusic.com/release/album/aphex-twin/_i-care-because-you-do/")
        59-> listOf("Seikan Seikou", "t e l e p a t h", R.drawable.album59.toString(),
            "https://rateyourmusic.com/release/album/t-e-l-e-p-a-t-h-%E3%83%86%E3%83%AC%E3%83%91%E3%82%B7%E3%83%BC%E8%83%BD%E5%8A%9B%E8%80%85/%E6%98%9F%E9%96%93%E6%80%A7%E4%BA%A4-seikan-seikou/")
        60-> listOf("Cyper Palace", "ICYTWAT", R.drawable.album60.toString(),
            "https://rateyourmusic.com/release/album/icytwat/cyber-palace.p/")
        61-> listOf("Blank Banshee 1", "Blank Banshee", R.drawable.album61.toString(),
            "https://rateyourmusic.com/release/album/blank-banshee/blank-banshee-1/")


        else -> {listOf("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")}
    }

    val name = details[0]
    val artist = details[1]
    val art = details[2].toInt()

    val rym = details[3]

    val listened = mutableStateOf(false)

}
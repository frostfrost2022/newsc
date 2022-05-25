package com.example.berwisata

object DataWisata {
    private val judulWisata = arrayOf(
        "Pulau komodo",
        "Trio Gili",
        "Raja ampat",
        "Danau sentai",
        "Taman laut bunaken"
    )
    private val detailWisata = arrayOf(
        "Pulau Komodo masuk dalam kawasan Taman Nasional Komodo bersama pulau-pulau lain di sekitar Kepulauan Nusa Tenggara. Pada tahun 1986, UNESCO menetapkan tempat wisata di Indonesia ini sebagai salah satu situs warisan dunia. Pulau ini dianggap sebagai habitat binatang komodo yang wajib dilindungi. Salah satu penghargaan tertinggi yang berhasil diraih adalah berhasil masuk dalam jajaran tujuh kejaiban alam di dunia atau yang lebih dikenal dengan New Seven Wonders of Nature pada tahun 2011.",
        "Gili Lombok Trio Gili merupakan tiga pulau cantik yang ada di Lombok. Ketiga pulau tersebut antara lain Gili Trawangan, Gili Meno dan Gili Air. Ketiganya tak hanya dikenal oleh wisatawan domestik, tapi juga telah berhasil mengundang banyak wisatawan mancanegara untuk datang.",
        "Raja Ampat menjadi primadona baru di dunia pariwisata Indonesia. Pesona tempat wisata di Indonesia ini mulai banyak dikenal baik oleh wisatawan domestik maupun mancanegara. Raja Ampat sendiri merupakan kumpulan dari pulau-pulau di ujung",
        "Danau Sentani disebut sebagai danau terbesar dengan di Papua. Tak mengherankan memang, karena danau ini memiliki luas sekitar 9.360 hektar dan berada di ketinggian 75 meter di atas permukaan laut. Tempat wisata di Indonesia ini dihiasi dengan 21 pulau di sekitarnya yang menjadi perkampungan warga",
        "Taman Laut Bunaken menjadi salah satu tempat wisata di Indonesia yang lagi-lagi ditetapkan UNESCO sebagai situs warisan dunia, tepatnya pada tahun 2005. Hal ini dikarenakan kekayaan dan keragaman biota lautnya yang luar biasa mulai dari terumbu karang, rumput laut sampai spesies ikan yang ada."
    )

    private val imgWisata = intArrayOf(
        R.drawable.pulaukomodo,
        R.drawable.gililombok,
        R.drawable.rajaampat,
        R.drawable.danausentani,
        R.drawable.tamanlautbunaken
    )
    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in judulWisata.indices){
                val wisata = Wisata()
                wisata.wisata = judulWisata[position]
                wisata.detail = detailWisata[position]
                wisata.img = imgWisata[position]
                list.add(wisata)

            }
            return list
        }


}
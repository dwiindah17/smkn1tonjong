package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.education,"Sejarah","About","SMK Negeri 1 Tonjong didirikan pada 17 Nopember 2003 berdasarkan SK Pendirian yang ada. Awalnya pada tahun 2004, SMK Negeri 1 Tonjong mendapat SK Bupati pembukaan program keahlian Teknik Kendaraan Ringan, Teknik Audio Video, dan Teknik Instalasi Pemanfaatan Tenaga Listrik. Pada perkembangannya dibuka program keahlian Animasi tepatnya pada 2010, Program Keahlian Teknik Sepeda Motor yang kemudian menjadi Teknik dan Bisnis Sepeda Motor, di tahun 2015, dan Teknik Elektronika Industri dan Multimedia pada tahun 2016 yang sekaligus menandai pembinaan SMK dan SMA oleh Propinsi.\n" +
                "Dengan melalui akreditasi oleh BAN SM, serta mendapatkan predikat yang baik, maka perkembangan SMK Negeri 1 Tonjong menjadi sebuah keniscayaan. Saat ini, peserta didik yang aktif setiap tahun mencapai sekitar 1500 siswa. Dukungan dari masyarakat dan elemen Dunia Usaha / Dunia Industri serta dari unsur pembinaan oleh Pemerintah membuat SMK Negeri 1 Tonjong selalu menjadi yang terdepan sebagai pilihan SMK di wilayah brebes selatan dan sekitarnya.\n" +
                "Jl. Raya Kutamendala Tonjong, Brebes, Jawa Tengah, Indonesia\n"))

        data?.add(DataModel(R.drawable.jurusan,"Jurusan","Jurusan", "Teknik Kendaraan Ringan Otomotif, Teknik Instalasi Tenaga Listrik, Teknik Audio Video, Animasi, Teknik Elektronika Industri, Teknik dan Bisnis Sepeda Motor, Multimedia"))

        data?.add(DataModel(R.drawable.prestasi,"Prestasi","Prestasi", "Peringkat 2 Kabupaten Jumbara, Peringkat 1 Baca Puisi,  Peringkat 3 Kejuaraan Taekwondo, Peringkat 2 Paskibra, Peringkat 3 Judo.  ."))

        data?.add(DataModel(R.drawable.ekstra,"Ekstrakurikuler","Ekstrakurikuler", "Bina Fisik,Pramuka Judo,Pencak Silat,Taekwondo,Bola Volley, Bola Basket, Futsal,Marching Band,Patrol Keamanan Sekolah,Paskibra,Rohis,Teater,PMR"))

        data?.add(DataModel(R.drawable.guru,"Guru","Guru", "Drs.Sodikun Atmo Yuliyanto. M.Pd. : Pend. Matematika, Drs. Joko Santoso : PMP dan KN, Bakdaturohman, S.Pd. : Fisika, Sri Hartati, M.Pd. : Bahasa dan Sastra Indonesia, Drs. Tejo Tri Darmo : Kimia, Sanuri, S.Pd. : Teknik Elektro, Uripah, S.Pd. : Fisika, M. Najib, S.Pd. : T.Bangunan, Nurokhim, S.Pd. : P.Matematika"  ))

        data?.add(DataModel(R.drawable.infoppdb,"Info PPDB","Info PPDB", "1.\tSurat Keterangan Nilai Raport Semester 1-5\n" +
                "2.\tNomor Induk Siswa Nasional (NISN)\n" +
                "3.\tKartu Keluarga (KK)\n" +
                "4.\tAkta Kelahiran\n" +
                "5.\tIjazah/Surat Keterangan Lulus\n" +
                "6.\tSurat Sehat (Pendengaran dan Tidak Buta Warna) dari Puskesmas\n" +
                "7.\tPakta Integritas\n" +
                "8.\tKIP/PKH (jika memiliki)\n" +
                "9.\tSurat Anak Tenaga Kesehatan Dokter, Kader, BABINSA/KAMTIBNAS Covid-19 (jika memiliki)\n" +
                "10.\tPiagam Penghargaan Juara Juara 1,2,3  tingkat Kabupatrn-Nasional (jika memiliki)\n"))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}
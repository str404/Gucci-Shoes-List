Readme.md

# Gucci Shoes List
| Grup | 13 |
| :---------------: | :---------------:|
| Audi Martya | 04 |
| Muhammad Satria Ramdhana Pratama | 18 |

## Deskripsi
Aplikasi "Gucci Shoes List" adalah aplikasi yang berisi tentang daftar-daftar sepatu bermerk gucci. Dimana untuk memasuki aplikasi ini harus login terlebih dahulu untuk bisa masuk ke halaman home yang berisi list-list sepatu. Daftar ini bisa di lihat detailnya, di tambah daftar baru, diedit isi dari daftar tersebut dan bisa dihapus juga .

## Screenshots
![Login](https://github.com/str404/Gucci-Shoes-List/blob/master/imageapp/login.png)

![Home/Tampilan Awal](https://github.com/str404/Gucci-Shoes-List/blob/master/imageapp/home.png)

![Detail](https://github.com/str404/Gucci-Shoes-List/blob/master/imageapp/detail.png)

![Tambah/add](https://github.com/str404/Gucci-Shoes-List/blob/master/imageapp/insert.png)

![Edit/rubah](https://github.com/str404/Gucci-Shoes-List/blob/master/imageapp/edit.png)

![OnClick](https://github.com/str404/Gucci-Shoes-List/blob/master/imageapp/menu.png)

## Android OS dan Level
min Sdk version yang digunakan adalah 25

## List class
+ LoginActivity.java
+ Class ini yang mengatur segala hal tentang login. Mulai dari username, password, dan intent untuk menuju halaman selanjutnya

+ TampilanActivity.java
+ Class ini yang mengatur segala fungsi yang ada di halaman home/awal. Mulai dari fungsi untuk tombol tambah, mengatur tampilan dan recycler, megatur onclick untuk memunculkan menu(detail, update, delete) . perintah untuk mengambil data dari database dan ditampilkan dan fungsi tombol logout

+ ClickListener dan RecyclerTouchListener.java
+ Untuk mengatur segala hal tentang click, entah onclick/onlongclick .

+ Shoes.java
+ Untuk melakukan instansiasi class-class yang dibutuhkan.

+ RecyclerViewAdapter
+ Untuk menghubungkan antara tampilan dan juga database. Bisa juga menampung data.

+ InsertShoes.java
+ Berisi tentang fungsi-fungsi untuk melakukan penambahan data ke database.

+ ViewShoes.java
+ Berisi fungsi-fungsi untuk menampilkan detail dari data yang kita pilih berdasarkan nama .

+ Update Shoes
+ Berisi tentang fungsi-fungsi untuk melakukan update/perubahan data dari database dimana data yang dipilih berdasarkan nama.

## Referensi
* [StackOverflow](https://stackoverflow.com/) - Referensi apabila terjadi masalah dalam program
* [Github Fahmiko](https://github.com/fahmiko/vpnmaker) - Untuk referensi kode-kode yang dibutuhkan/error-error yang terjadi

## Lisensi
Audi_Satria.Corp 2018. All rights reserved. 
Copyright 2018
Designed by AMPW AND MSTRRP
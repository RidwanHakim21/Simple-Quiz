package com.belajar.myapplication;

public class Questions {

    public String mQuestions[] = {
            "Siapakah Nama Bapak Anda?",
            "Dimanakah Letak Candi Borobudur?",
            "Siapakah Bapak Proklamator Indonesia?",
            "Berikut Adalah Contoh Dari Hasil Produksi Agraris, Yaitu?",
            "Pelanet Apakah Yang Berada Pada Urutan Kelima Dalam Sistem Tata Surya?",
            "Manakah Yang Lebih Besar, 18 Persen Dari 81 Atau 81 Persen Dari 18?",
            "Apakah Nama Dari Kejuaraan Bulu Tangkis Untuk Pria?",
            "Hewan Pemakan Segala Disebut Juga Sebagai?",
            "Petani Dan Nelayan Adalah Contoh Perkerjaan Yang Menghasilkan?",
            "Apakah Nama Air Terjun Tertinggi DiDunia?",
            "Dimanakah Letak Air Terjun Tertinggi Didunia Berada?",
            "Sebelum Makan Kita Harus?",
            "Nama Situs Terkenal Yang Diciptakan Oleh Mark Zuckerberg?",
            "Dinegara Manakah Menara Pisa Berada?",
            "Kanguru Merupakan Hewan Endemik Yang Berasal Dari Negara?",
            "Siapakah Cowok Terkece Didunia?",
            "Hewan Yang Paling Sering Kita lihat Saat Berada Dijalan Raya Adalah?",
            "Orang Apa Yang Tidak Akan Mati Ketika Ditembak Sebanyak Apapun?",
            "Kenapa Babi Bau?",
            "Burung Apa Yang Suka Nempel Di Dinding?"

    };

    private String mChoices [][] ={
            {"Ferguso", "Udin", "Mael Bukan Kaleng-Kaleng", "Alfonso"},
            {"Magelang", "Yogyakarta", "Surabaya", "Pacitan"},
            {"Suharto", "Sukisno", "Sukarno", "Sumarno"},
            {"Traktor Dan Cangkul", "Padi Dan Traktor", "Padi Dan Jagung", "Jagung Dan Traktor"},
            {"Jupiter", "Merkurius", "Saturnus", "Bumi"},
            {"10", "18", "81", "Sama Besar"},
            {"Djarum Super Cup", "Thomas Cup", "Sudirman Cup", "Uber Cup"},
            {"Herbivora", "Karnivora", "Omnivora", "Rakus"},
            {"Anak", "Uang", "Keringat", "Barang"},
            {"Salto Angel", "Curug Ciubeureum", "Niagara", "Curug Cikaso"},
            {"Venezuela", "Chozant", "Afrika", "Amerika"},
            {"Cuci Tangan", "Cuci Kaki", "Cuci Mulut", "Cuci Muka"},
            {"Instagram", "WhatsApp", "Amazon", "Facebook"},
            {"Sepanyol", "Perancis", "Itali", "Belanda"},
            {"Amerika", "Australia", "Irlandia", "Singapura"},
            {"Ridwan Hakim", "Cristiano Ronaldo", "Tom Cruise", "Zayn Malik"},
            {"Kucing", "Anjing", "Ayam", "Kijang"},
            {"Orang Kuat", "Orang Sakti", "Orang Gila", "Orang Ngga Kena"},
            {"Karena Jarang Mandi", "Karena Jorok", "Takdir", "Karena Keteknya 4"},
            {"Burung Dara", "Burung Emprit", "Burung-Burungan","Burungnya Cicak"},


    };

    private String mCorrectAnswer []={"Udin", "Magelang", "Sukarno", "Padi Dan Jagung", "Jupiter", "Sama Besar", "Thomas Cup", "Omnivora", "Barang", "Niagara", "Amerika", "Cuci Tangan", "Facebook", "Itali", "Australia",
            "Ridwan Hakim", "Kijang", "Orang Ngga Kena", "Karena Keteknya 4","Burungnya Cicak"};

    public String getQuestion (int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a){
        String choice = mChoices [a][0];
        return choice;
    }

    public String getChoice2 (int a) {
        String choice = mChoices [a][1];
        return choice;
    }

    public  String getChoice3 (int a) {
        String choice = mChoices [a][2];
        return choice;
    }

    public String getChoice4 (int a){
        String choice = mChoices [a][3];
        return choice;
    }

    public String getCorrectAnwer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }

}

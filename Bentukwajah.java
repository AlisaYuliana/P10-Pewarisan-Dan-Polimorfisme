class Bentukwajah{
    /*Membuat sebuah method respons pada class induk 
        dimana mengembalikan sebuah nilai String*/
        public String respons(){
            return("Perhatikan reaksi wajah saya\n");
        }
}

/*Membuat class-class lain dengan turunan 
    dari class Bentukwajah*/

class Senyum extends Bentukwajah{
    public String respons(){
        return("Senyum karena Senang\n");
    }
}

class Tertawa extends Bentukwajah{
    public String respons(){
        return("Tertawa karena Gembira\n");
    }
}

class Marah extends Bentukwajah{
    public String respons(){
        return("Kemarahan disebabkan Bertangkar\n");
    }
}

class Sedih extends Bentukwajah{
    public String respons(){
        return("Sedih disebabkan Cemburu\n");
    }
}
public class ClassB {
    String proprietario = "Ana";
    String cpf = "000.000.000-00";
    int idade = 36; 
    String nascimento = "26/02/1983";
    String estadoCivil = "Solteira";
    String unica = "Filha unica";
    String moro = "Sozinha";
    String tenho = "1 cachorro";



    //Função
    String nome(){ 
        String nomeProprietario = "Meu nome é " + proprietario + " portadora do cpf " + cpf + " sou " + estadoCivil;
        return nomeProprietario;
    }

    String propietarioNome(){ 
        String idadepropietario = "Tenho " + idade + " nasci no dia " + nascimento;
        return idadepropietario;
    }


    String civil(){ 
        String unicafilha = "Moro " + moro + " tenho de estimação " + tenho ;
        return unicafilha;
    }

}

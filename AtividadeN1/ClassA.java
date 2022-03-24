public class ClassA {
    String nomeImovel = "Dev´s";
    String imovel = "Empresa";
    String endereco = "Av. das figueiras";
    String cidade = "Sinop";
    String cor = "Branca";
    String funcionario = "9" ;
    String cnpj = " 00.000.000/0000-00";
    int fundada = 2008;
    ClassB proprietario = new ClassB();


    ClassA(String imovel){
        this.imovel = imovel;
    }  
    
    ClassA(String imovel, String nomeImovel){
        this.imovel = imovel;
        this.nomeImovel = nomeImovel;
    }  
    
    ClassA(String imovel,String endereco, String nomeImovel){
        this.imovel = imovel;
        this.nomeImovel = nomeImovel;
        this.endereco = endereco;
    }   
    ClassA(String imovel,String endereco, String nomeImovel,String cidade ){
        this.imovel = imovel;
        this.nomeImovel = nomeImovel;
        this.endereco = endereco;
        this.cidade = cidade;
    }   
    

    //Metodo
    void imovel(){
        System.out.println( "Tenho uma "+ imovel + " que fica na " + endereco );

    }

    void fundacao(){
        System.out.println("Minha " + imovel + "foi fundada em " + fundada + " em " + cidade);
    }

    void nomeEmpresa(){
        System.out.println("Tenho " + funcionario + " funcionarios "+ "trabalhando na empresa " + nomeImovel);
    }


}

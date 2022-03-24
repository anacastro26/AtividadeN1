public class Aula {
    
    public static void main(String[] args) {

       ClassA imoveA = new ClassA("Empresa","Dev´s", "Sinop","Av. das figueiras");

       System.out.println(imoveA.proprietario.nome());
       System.out.println(imoveA.proprietario.propietarioNome());
       System.out.println(imoveA.proprietario.civil());

       imoveA.imovel();
       imoveA.fundacao();
       imoveA.nomeEmpresa();


    }

    

    
}

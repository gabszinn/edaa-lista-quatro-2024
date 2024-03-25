package BuscaListaNomes;
public class ListaPessoas {
    private Pessoa[] listaPessoas;
        
    public ListaPessoas(Pessoa[] listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
        


    public void idadeAcima(int idade) {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getIdade() > idade) {
                System.out.println(pessoa.getNome());
            }
        }
    }


    public void idade(int idade){
        boolean verificador = false;
        for(Pessoa pessoa : listaPessoas){
            if (pessoa.getIdade() == idade){
                System.out.println("pessoa com 100 anos de idade: " + pessoa.getNome());
                verificador = true;
            }
        }
        if (!verificador){
            System.out.println("nao há pessoas com esta idade!");
        }
    }
    public void alterarIdade(int numero){
        for(Pessoa pessoa : listaPessoas){
            pessoa.setIdade(numero);
        }
        System.out.println("Nome das pessoas e suas idades:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa.getNome() + ": " + pessoa.getIdade() + " anos");
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPetshop;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa  implements IPessoa {

    private String tutorAnimal;
    private String endereco;
    private int telefone;
    private String nomeA;
    private String raca;
    private String cor;
    private float peso;
    private int idade;
    private String idadeAnim;

    public String getTutorAnimal() {
        return tutorAnimal;
    }

    public void setTutorAnimal(String tutorAnimal) {
        this.tutorAnimal = tutorAnimal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNomeA() {
        return nomeA;
    }

    public void setNomeA(String nomeA) {
        this.nomeA = nomeA;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 1) {
            throw new IllegalArgumentException("Idade inválida para o cadastro ...");
        }
        else{
            this.idade=idade;
        }
    }

    public String getIdadeAnim() {
        return idadeAnim;
    }

    public void setIdadeAnim(String idadeAnim) {
        if (idadeAnim< 1) {
            throw new IllegalArgumentException("Idade inválida para o cadastro ...");
        }
        else{
            this.idadeAnim = idadeAnim;
        }
    }

    @Override
    public void exibir() {
         System.out.printf("TutorAnimal: %s | Endereco: %s | Telefone: %d | NomeA: %s | raca: %d "
                 + "|Cor %s| Peso %d | Idade %d| dtnascAnim %d\n",
                 getTutorAnimal(),getEndereco(),getTelefone(),getNomeA(),getRaca(),getCor(),getPeso(),
                 getIdade(),getIdadeAnim());

    }
    public static Cliente novoCliente(){ 
    Cliente novoCliente = new Cliente();

		System.out.println("Digite o nome do Cliente: ");
		novoCliente.setNome(scanUsuario.next());
		scanUsuario.nextLine();

		while (novoCliente.getIdade() < 1) {
			try {
				System.out.println("Digite a idade do cliente: ");
				novoCliente.setIdade(scanUsuario.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Idade de cliente invÃ¡lida...");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de idade invalida...");
				scanUsuario.nextLine();
			}
		}
		
		while (novoCliente.getTelefone() < 0) {
			try {
				System.out.print("Digite o telefone do Cliente: \n");
				novoCliente.setTelefone(scanUsuario.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Valor de telefone invalido... ");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de telefone invalido... ");
				scanUsuario.nextLine();
			}
		}
		

		System.out.print("Digite a flor favorita do Cliente: \n");
		novoCliente.setFlorFavorita(scanUsuario.next());
		scanUsuario.nextLine();

		System.out.println("Digite o email do Cliente: ");
		novoCliente.setEmail(scanUsuario.next());

		// retorna array
                retorn novoCliente;
    }
}

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Método para realizar a operação de sacar em todas as contas de um cliente
    public void realizarSaque(Cliente cliente, double valor) {
        for (Conta conta : contas) {
            if (conta.getCliente().equals(cliente)) {
                conta.sacar(valor);
                break;
            }
        }
    }
}
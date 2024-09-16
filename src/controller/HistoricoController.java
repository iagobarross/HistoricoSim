package controller;

import br.edu.fateczl.pilhaString.PilhaString;

public class HistoricoController {

    public HistoricoController() {
        super();
    }
    
    public void inserirEndereco(PilhaString p, String endereco) {
        if (enderecoValido(endereco)) {
            try {
                p.push(endereco);
                System.out.println("Endereço inserido com sucesso.\n");
            } catch (Exception e) {
                System.err.println("Erro ao inserir o endereço: " + e.getMessage());
            }
        } else {
            System.out.println("Endereço inválido. Certifique-se de que comece com 'http://' e contenha 'www'.");
        }
    }
    
    public void removerEndereco(PilhaString p) {
        if (!p.isEmpty()) {
            try {
                String enderecoRemovido = p.pop();
                System.out.println("Endereço removido: " + enderecoRemovido + "\n");
            } catch (Exception e) {
                System.err.println("Erro ao remover o endereço: " + e.getMessage());
            }
        } else {
            System.out.println("O histórico está vazio.");
        }
    }
    
    public void consultarEndereco(PilhaString p) {
        if (!p.isEmpty()) {
            try {
                String ultimoEndereco = p.top();
                System.out.println("Último endereço visitado: " + ultimoEndereco + "\n");
            } catch (Exception e) {
                System.err.println("Erro ao consultar o último endereço: " + e.getMessage());
            }
        } else {
            System.out.println("O histórico está vazio.");
        }
    }
    
    private boolean enderecoValido(String endereco) {
        return endereco.startsWith("http://") && endereco.contains("www.");
    }
}
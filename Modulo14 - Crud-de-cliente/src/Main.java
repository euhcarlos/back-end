import dao.ClienteMapDAO;
import dao.ClienteSetDAO;
import dao.ICliente;
import domain.Cliente;

import javax.swing.*;
import java.util.Collection;

public class Main {

    private static ICliente iCliente;

    public static void main(String[] args) {
        iCliente = new ClienteSetDAO();

        String opcao = JOptionPane.showInputDialog(null, "1.Cadastro\n2.Consulta\n3.Excluir\n4.Alterar\n5.Consultar todos\n6.Sair", "OPÇÕES", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){
            if("".equals(opcao)){
                sair();
            }

            opcao = JOptionPane.showInputDialog(null, "1.Cadastro\n2.Consulta\n3.Excluir\n4.Alterar\n5.Consultar todos\n6.Sair", "OPÇÃO INVALIDA", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)){
            if(isCadastro(opcao)){
                String dado = JOptionPane.showInputDialog(null, "DIGITE NOME,CPF,TELEFONE", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                cadastro(dado);
            } else if (isConsulta(opcao)) {
                String dado = JOptionPane.showInputDialog(null, "DIGITE O CPF", "CONSULTA", JOptionPane.INFORMATION_MESSAGE);
                consultar(dado);
            } else if (isExcluir(opcao)){
                String dado = JOptionPane.showInputDialog(null, "DIGITE O CPF", "EXCLUIR", JOptionPane.INFORMATION_MESSAGE);
                excluir(dado);
            } else if (isAlterar(opcao)) {
                String dado = JOptionPane.showInputDialog(null, "DIGITE NOME,CPF,TELEFONE", "ALTERAR DADOS", JOptionPane.INFORMATION_MESSAGE);
                alterar(dado);
            } else if (isConsultaTodos(opcao)) {
                consultarTodos();
            } else if (isSair(opcao)) {
                sair();
            }

            opcao = JOptionPane.showInputDialog(null, "1.Cadastro\n2.Consulta\n3.Excluir\n4.Alterar\n5.Consultar todos\n6.Sair", "OPÇÕES", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultarTodos() {
        Collection<Cliente> clientes = iCliente.buscarTods();
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: " + clientes, "Sucesso",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void alterar(String dado) {
        String[] dadoSplit = dado.split(",");
        Cliente cliente = new Cliente(dadoSplit[0],dadoSplit[1],dadoSplit[2]);
        iCliente.alterar(cliente);
    }

    private static void excluir(String dado) {
        iCliente.excluir(Long.valueOf(dado));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void consultar(String dado) {
        Cliente cliente = iCliente.consultar(Long.valueOf(dado));
        if(cliente != null){
            JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso: " + cliente.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "ERRO",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastro(String dado) {
        String[] dadoSplit = dado.split(",");
        Cliente cliente = new Cliente(dadoSplit[0],dadoSplit[1],dadoSplit[2]);
        Boolean isCliente = iCliente.cadastro(cliente);
        if(isCliente){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isSair(String opcao) {
        if("6".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isConsultaTodos(String opcao) {
        if("5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isAlterar(String opcao) {
        if("4".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isExcluir(String opcao) {
        if("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isConsulta(String opcao) {
        if("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isCadastro(String opcao) {
        if("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void sair() {
        sair();
    }

    private static boolean isOpcaoValida(String opcao) {
        if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao)|| "5".equals(opcao) || "6".equals(opcao)){
            return true;
        }
        return false;
    }
}

package exception;

import javax.swing.*;

public class AppCliente {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null, "Digite um codigo de cliente", "Atencão", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontradoDoisExcpetion e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

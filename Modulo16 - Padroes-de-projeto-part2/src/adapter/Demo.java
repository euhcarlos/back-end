package adapter;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        String file = "aafaf.txt";
        DropBox drop = new DropBox();
        PersistenciaDeArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}

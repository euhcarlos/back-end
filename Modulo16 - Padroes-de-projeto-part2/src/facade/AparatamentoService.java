package facade;

public class AparatamentoService implements IApartamentoService{
    @Override
    public Boolean cadastraApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isParamentoCadastrado();
        Boolean isCampoValido = validarCompos();
        if(isCadastrado && !isCampoValido){
            return false;
        }
        return null;
    }

    private Boolean isParamentoCadastrado(){
        return false;
    }

    private Boolean validarCompos(){
        return true;
    }
}

package Usuario;

import java.util.Date;

public class Usuario {
    private String nome;
    private String sexo;
    private String telefone;
    private Date data;
    private String cpf;
    private String condicaoClinica;
    private String senha;
    private String nomeMedico;

    public Usuario(){

    }

    public Usuario(String nome, String sexo, String telefone, Date data, String cpf, String condicaoClinica, String senha, String nomeMedico) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.data = data;
        this.cpf = cpf;
        this.condicaoClinica = condicaoClinica;
        this.senha = senha;
        this.nomeMedico = nomeMedico;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCondicaoClinica() {
        return condicaoClinica;
    }

    public void setCondicaoClinica(String condicaoClinica) {
        this.condicaoClinica = condicaoClinica;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    // método de fazer login através do cpf e senha
    public String Fazerlogin(String cpf, String Password) {

        if (this.getCpf().equals(cpf) && this.getSenha().equals(Password)) {
            return "Login realizado com sucesso";
        } else {
            return "Erro ao fazer login";
        }


    }

    // método para cadastrar o usuário
    public String fazerCadastro(String nome,
                              String Sexo,
                              String telefone,
                              Date data,
                              String cpf,
                              String condicaoClinica,
                              String senha,
                              String nomeMedico){
        this.nome = nome;
        this.sexo = Sexo;
        this.telefone = telefone;
        this.data = data;
        this.cpf = cpf;
        this.condicaoClinica = condicaoClinica;
        this.senha = senha;
        this.nomeMedico = nomeMedico;
        return "===== Cadastro realizado! =====";



    }
}

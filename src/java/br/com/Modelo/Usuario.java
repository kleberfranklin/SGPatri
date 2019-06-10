/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

/**
 *
 * @author d732229
 */
public class Usuario {
    
//Atributos
        private int pkUsuario, pkDivisao, pkSetor, pkCargo, nrAtivo, pkPerfil;
        private String nmLogin, nmNome, sgDivisao, nmDivisao, sgSetor, nmSetor, nmRf, nmEmail, nmFoto, nmCargo, nmPerfil, nmLoginAtualizacao, nmNomeAtualizacao, dthrAtualizacao;

        
    
//Construtor
    public Usuario() {
    }

    public Usuario(int pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public Usuario(int pkUsuario, int nrAtivo, String nmLoginAtualizacao) {
        this.pkUsuario = pkUsuario;
        this.nrAtivo = nrAtivo;
        this.nmLoginAtualizacao = nmLoginAtualizacao;
    }

    
    //Construtor para cadastro
    public Usuario(int pkDivisao, int pkSetor, int nrAtivo, int pkPerfil, int pkCargo, String nmLogin, String nmNome, String nmRf, String nmEmail, String nmLoginAtualizacao) {
        this.pkDivisao = pkDivisao;
        this.pkSetor = pkSetor;
        this.nrAtivo = nrAtivo;
        this.pkCargo = pkCargo;
        this.pkPerfil = pkPerfil;
        this.nmLogin = nmLogin;
        this.nmNome = nmNome;
        this.nmRf = nmRf;
        this.nmEmail = nmEmail;
        this.nmLoginAtualizacao = nmLoginAtualizacao;
    }

    public Usuario(int pkUsuario, int pkDivisao, int pkSetor, int pkCargo, int nrAtivo, int pkPerfil, String nmLogin, String nmNome, String nmRf, String nmEmail, String nmLoginAtualizacao) {
        this(pkDivisao, pkSetor, nrAtivo, pkPerfil, pkCargo, nmLogin, nmNome, nmRf, nmEmail, nmLoginAtualizacao);
        this.pkUsuario = pkUsuario;
        
    }


//Getters e Setters
    public int getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(int pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public int getPkDivisao() {
        return pkDivisao;
    }

    public void setPkDivisao(int pkDivisao) {
        this.pkDivisao = pkDivisao;
    }

    public int getPkSetor() {
        return pkSetor;
    }

    public void setPkSetor(int pkSetor) {
        this.pkSetor = pkSetor;
    }

    public int getNrAtivo() {
        return nrAtivo;
    }

    public void setNrAtivo(int nrAtivo) {
        this.nrAtivo = nrAtivo;
    }
    
    public int getPkCargo() {
        return pkCargo;
    }

    public void setPkCargo(int pkCargo) {
        this.pkCargo = pkCargo;
    }

    public int getPkPerfil() {
        return pkPerfil;
    }

    public void setPkPerfil(int pkPerfil) {
        this.pkPerfil = pkPerfil;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getNmNome() {
        return nmNome;
    }

    public void setNmNome(String nmNome) {
        this.nmNome = nmNome;
    }

    public String getSgDivisao() {
        return sgDivisao;
    }

    public void setSgDivisao(String sgDivisao) {
        this.sgDivisao = sgDivisao;
    }

    public String getNmDivisao() {
        return nmDivisao;
    }

    public void setNmDivisao(String nmDivisao) {
        this.nmDivisao = nmDivisao;
    }

    public String getSgSetor() {
        return sgSetor;
    }

    public void setSgSetor(String sgSetor) {
        this.sgSetor = sgSetor;
    }

    public String getNmSetor() {
        return nmSetor;
    }

    public void setNmSetor(String nmSetor) {
        this.nmSetor = nmSetor;
    }

    public String getNmRf() {
        return nmRf;
    }

    public void setNmRf(String nmRf) {
        this.nmRf = nmRf;
    }
    
    public String getNmEmail(){
        return nmEmail;
    }

    public void setNmEmail(String nmEmail){
        this.nmEmail = nmEmail;
    }
            
    public String getNmFoto() {
        return nmFoto;
    }

    public void setNmFoto(String nmFoto) {
        this.nmFoto = nmFoto;
    }

    public String getNmCargo() {
        return nmCargo;
    }

    public void setNmCargo(String nmCargo) {
        this.nmCargo = nmCargo;
    }
    
    public String getNmPerfil() {
        return nmPerfil;
    }

    public void setNmPerfil(String nmPerfil) {
        this.nmPerfil = nmPerfil;
    }

    public String getNmLoginAtualizacao() {
        return nmLoginAtualizacao;
    }

    public void setNmLoginAtualizacao(String nmLoginAtualizacao) {
        this.nmLoginAtualizacao = nmLoginAtualizacao;
    }
    
    public String getNmNomeAtualizacao(){
        return nmNomeAtualizacao;
    }
    
    public void setNmNomeAtualizacao (String nmNomeAtualizacao){
        this.nmNomeAtualizacao = nmNomeAtualizacao;
    }
    
    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    void setPkUsuarioCap(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}

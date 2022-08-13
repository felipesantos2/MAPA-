/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa;

/**
 *
 * @author Felipe
 * 
 */
public class Ingressos {
    
    private String nome;
    private String cpf;
    private String evento;
    private int valorIngresso;
    private double tipo;
    private String data;
    
    
    public void setValorIngresso(int valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public int valorIngresso(){
        return this.valorIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public double getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
    
    
    public double valorFinal(){
        
        if(tipo == 1){
            //System.out.println("Ingresso pista");
           tipo = this.valorIngresso;
            
        } else if(tipo == 2){
            //System.out.println("Ingresso Vip");
            tipo = this.valorIngresso + (this.valorIngresso * 0.3);

        } else if(tipo == 3){
            //System.out.println("Ingresso Vip");
            tipo =this.valorIngresso + (this.valorIngresso * 0.6);
       
        } else {
            System.out.println("Tipo invalido");
         
        }
        return tipo;
    }
    
    
    
    
}

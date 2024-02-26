/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author aluno
 */
public class empresa {
    String nome;
    int qtdFunc;
    
   public empresa(){
    
   }
   public empresa(String nome, int qtd){
    this.nome = nome;
    this.qtdFunc = qtd;
   }
  public void setNome(String nome){
      this.nome = nome;
  }
  public void setQtdFunc(int qtd){
      this.qtdFunc = qtd;
  }
   public String getNome(){
       return this.nome;
   }

   public int getQtdFunc(){
       return this.qtdFunc;
   }
   
}

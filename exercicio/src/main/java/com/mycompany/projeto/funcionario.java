/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author aluno
 */
public class funcionario {
    String nome;
    double salBruto;
    boolean PJ;
    empresa empresa;

    public funcionario() {
    }
    
    public funcionario(String pnome, double sal, boolean pj, empresa empresa) {
        this.nome = pnome;
        this.salBruto = sal;
        this.PJ = pj;
        this.empresa = empresa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalBruto(double salBruto) {
        this.salBruto = salBruto;
    }

    public void setPJ(boolean PJ) {
        this.PJ = PJ;
    }

    public void setEmpresa(empresa empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public double getSalBruto() {
        return salBruto;
    }

    public boolean isPJ() {
        return PJ;
    }

    public empresa getEmpresa() {
        return empresa;
    }
    
    public double getSalario(){
        double sal;
         if (this.PJ == true){
           sal = (this.salBruto*0.8) - (0.01*this.empresa.getQtdFunc());
         }
           else{
                sal =  (this.salBruto*0.9) - (0.02*this.empresa.getQtdFunc());
                 }
           return sal;
       }
    }
  




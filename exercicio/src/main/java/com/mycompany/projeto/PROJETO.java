/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;

/**
 *
 * @author aluno
 */
public class PROJETO {

    public static void main(String[] args) {
        empresa Empresa = new empresa("mercado top", 10);
        funcionario n1 = new funcionario("joão", 1000, true, Empresa);
        
        
       System.out.println("Nome da empresa: " + Empresa.nome);
       System.out.println("Quantidade de funcionários: " + Empresa.qtdFunc);
       System.out.println("Nome do funcionário: " + n1.nome);
       System.out.println("Salário Bruto: " + n1.salBruto);
       System.out.println("Salário liquido: " + n1.getSalario());
       if(n1.PJ == true){
           System.out.println("PJ: SIM");
       }
       else {
           System.out.println("PJ: NÃO");
       }
        
    }
}

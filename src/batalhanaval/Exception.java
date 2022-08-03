/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalhanaval;

import java.util.ArrayList;

/**
 *
 * @author Samira Kaline
 */
public class Exception {
    
    private ArrayList<String> linhas = new ArrayList<>();

    public Exception() {
        linhas.add("A");
        linhas.add("B");
        linhas.add("C");
        linhas.add("D");
        linhas.add("E");
        linhas.add("F");
        linhas.add("G");
        linhas.add("H");
    }
    
    
    
    public boolean verificarNome(String nome){
        boolean isNumber = false;
        for(int i=0;i<nome.length();i++){
            if(!Character.isDigit(nome.charAt(i))){
                isNumber = true;
            }
        }
        return isNumber;
    }
    
    public boolean verificarNavios(String navio){
        return "submarino".equals(navio) || "cruzador".equals(navio) || "porta-avioes".equals(navio);
    }
    
    public boolean verificarLinha(String linha){
        boolean isTrue = false;
        for(String linhai:linhas){
            if(linhai.equals(linha)){
                isTrue = true;
            }
        }
        
        return isTrue;
    }
    
    public boolean verificarColuna(int coluna){
        return coluna>=1 && coluna<=8;
    }
    
}

package br.edu.ifsc.POO;

import java.util.HashMap;
import java.util.Scanner;

public class SequenciaDNA {

    public static void main(String[] args){
        HashMap<String, String> mapa= new HashMap<>();
        mapa.put("AAA", "K");
        mapa.put("AAC", "N");
        mapa.put("AAG", "K");
        mapa.put("AAU", "N");
        mapa.put("ACA", "T");
        mapa.put("ACC", "T");
        mapa.put("ACG", "T");
        mapa.put("ACU", "T");
        mapa.put("AGA", "R");
        mapa.put("AGC", "S");
        mapa.put("AGG", "R");
        mapa.put("AGU", "S");
        mapa.put("AUA", "I");
        mapa.put("AUC", "I");
        mapa.put("AUG", "M");
        mapa.put("AUU", "I");
        mapa.put("CAA", "Q");
        mapa.put("CAC", "H");
        mapa.put("CAG", "Q");
        mapa.put("CAU", "H");
        mapa.put("CCA", "P");
        mapa.put("CCC", "P");
        mapa.put("CCG", "P");
        mapa.put("CCU", "P");
        mapa.put("CGA", "R");
        mapa.put("CGC", "R");
        mapa.put("CGG", "R");
        mapa.put("CGU", "R");
        mapa.put("CUA", "L");
        mapa.put("CUC", "L");
        mapa.put("CUG", "L");
        mapa.put("CUU", "L");
        mapa.put("GAA", "E");
        mapa.put("GAC", "D");
        mapa.put("GAG", "E");
        mapa.put("GAU", "D");
        mapa.put("GCA", "A");
        mapa.put("GCC", "A");
        mapa.put("GCG", "A");
        mapa.put("GCU", "A");
        mapa.put("GGA", "G");
        mapa.put("GGC", "G");
        mapa.put("GGG", "G");
        mapa.put("GGU", "G");
        mapa.put("GUA", "V");
        mapa.put("GUC", "V");
        mapa.put("GUG", "V");
        mapa.put("GUU", "V");
        mapa.put("UAA", "*");
        mapa.put("UAC", "Y");
        mapa.put("UAG", "*");
        mapa.put("UAU", "Y");
        mapa.put("UCA", "S");
        mapa.put("UCC", "S");
        mapa.put("UCG", "S");
        mapa.put("UCU", "S");
        mapa.put("UGA", "*");
        mapa.put("UGC", "C");
        mapa.put("UGG", "W");
        mapa.put("UGU", "C");
        mapa.put("UUU", "F");
        mapa.put("UUC", "F");
        mapa.put("UUG", "L");
        mapa.put("UUU", "F");

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a sequência para conversão: ");
        String sequenciaDna;
        sequenciaDna = scan.nextLine().toUpperCase();
        System.out.println();

        String sequenciaRna = sequenciaDna.replace("T","U");

        System.out.println(sequenciaRna);
        System.out.println();

        StringBuilder sequenciaProteinas = new StringBuilder();

        for(int i=0;i < sequenciaRna.length(); i+=3){
            String trinca = sequenciaRna.substring(i, Math.min(i+3, sequenciaRna.length()));

            if(mapa.containsKey(trinca)){
                String aminoacido = mapa.get(trinca);
                if(aminoacido.equals("*")){
                    sequenciaProteinas.append("*");
                    break;
                }
                sequenciaProteinas.append(aminoacido);
            }
        }
        System.out.println("Sequência de proteínas: "+ sequenciaProteinas.toString());
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.usm.plugins.catalog.parsejson;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 *
 * @author HENRIQUE
 * Duas formar de fazer o parse. Uma com JsonObject e outra om JsonArray
 */
public class parse {

     public static void main(String[] args) {
          teste_jsonArray();
          teste_jsonObject();
         
     }


     private static String teste_jsonObject() {
         String str = "{ \"classes\": [{\"siglaSistema\":\"USD\",\"nomeClasse\":\"SOEPFL ADMINISTRACAO PROCERGS\",\"txtDescricao\":\"Perfil administrador do Service Desk como um todo.\"},{\"siglaSistema\":\"USD\",\"nomeClasse\":\"SOEPFL CLIENTE ANALISTA\",\"txtDescricao\":\"Perfil para clientes que administram seus itens de configuração.\"}]}";
         JsonObject json = new JsonParser().parse(str).getAsJsonObject();
         JsonArray classes=(JsonArray) json.get("classes");
         for (int i = 0; i < classes.size(); i++) {
            System.out.println(classes.get(0).getAsJsonObject().get("siglaSistema").getAsString());             
         }
         return null;
         
     }
     
     private static void teste_jsonArray() {
                  String str = "[{\"siglaSistema\":\"USD\",\"nomeClasse\":\"SOEPFL ADMINISTRACAO PROCERGS\",\"txtDescricao\":\"Perfil administrador do Service Desk como um todo.\"},{\"siglaSistema\":\"USD\",\"nomeClasse\":\"SOEPFL CLIENTE ANALISTA\",\"txtDescricao\":\"Perfil para clientes que administram seus itens de configuração.\"}]";
         JsonArray classes = new JsonParser().parse(str).getAsJsonArray();
         
         for (int i = 0; i < classes.size(); i++) {
            System.out.println(classes.get(0).getAsJsonObject().get("siglaSistema").getAsString());             
         }
     }
             
     
     
}

/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {
    
        public static final Scanner SCN = 
	  new Scanner(System.in, "Windows-1252")
	  .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
        public static void main(String[] args){
           
//           Variables
            int dias;
            String descuento = "20%";
           
//            Constantes
            final double multa = 60;
            final double importeD = multa * 20 / 100;
            final double importeFIN = multa - importeD;
            final int diasD = 30;
            
           
           System.out.printf("Alternativa de Multa%n");
           System.out.printf("====================%n");
           System.out.printf("Días de demora ...........: ");
           dias = SCN.nextInt();
           
           System.out.printf("---%n");
           System.out.printf(Locale.ENGLISH,"Importe inicial multa ....: %.2f€"
                   + "%n", multa);
           System.out.printf("---%n");
           System.out.printf("Plazo con descuento ......: %d días%n",diasD);
           System.out.printf("Tanto descuento ..........: %s %n", descuento);
           System.out.printf(Locale.ENGLISH,"Importe descuento ........: %.2f€"
                   + "%n",importeD);
           
           System.out.printf("---%n");
           
           if (dias <= 30) {
           System.out.printf(Locale.ENGLISH,"Importe final multa ......: %.2f€"
                   + "%n", importeFIN);
           } else {
               System.out.printf(Locale.ENGLISH,"Importe final multa ......: "
                       + "%.2f€%n", multa);
           }
           
           
       }
}

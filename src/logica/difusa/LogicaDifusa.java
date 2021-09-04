/*
 * johan munoz 	js.munoz.ai@gmail.com
 */
package logica.difusa;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Rule;

public class LogicaDifusa {

    public static void main(String[] args) throws Exception {
        // Load from 'FCL' file
        String fileName = "src/logica/difusa/Archivo FCL.fcl";
        FIS fis = FIS.load(fileName, true);
        // Error while loading?
        if (fis == null) {
            System.err.println("Can't load file: '" + fileName + "'");
            return;
        }
        // Set inputs
        fis.setVariable("area", 34);
        fis.setVariable("personas", 8);
        fis.setVariable("temperatura", 27);

        // Evaluate
        fis.evaluate();

        // Show
        JFuzzyChart.get().chart(fis.getFunctionBlock("potencia"));

        Double x = fis.getVariable("potencia").getLatestDefuzzifiedValue();
        System.err.println("Para los valores de salida el grado de pertenencia es: " + x);
        
        // Show rules
        for (Rule r : fis.getFunctionBlock("potencia").getFuzzyRuleBlock("No1").getRules()) {
            System.out.println(r);
        }
    }
}
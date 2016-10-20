package tasiproject.view;

import org.junit.Assert;
import org.junit.Test;
import tasiproject.controller.AssistanceController;
import tasiproject.models.Assistance;

/**
 * @author paolo rossi ramayoni 20105435
 */
public class Assistance_insert_test {

    //Prueba 1 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_correct_test() {
        //Variable initialization
        Assistance assistance = new Assistance();
        
        Assert.assertEquals(true, AssistanceController.registerAssistance(assistance).isValid());
    }
}
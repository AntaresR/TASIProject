package tasiproject.view;

import org.junit.Assert;
import org.junit.Test;
import tasiproject.controller.JustificationController;
import tasiproject.models.Employee;
import tasiproject.models.ErrorMessage;
import tasiproject.models.InconsistenceJustification;

/**
 * @author paolo
 */
public class Justification_insert_test {

    //Prueba 1 (correcta). 1a1, 2b1, 3c1, 4d1
    @Test
    public final void registerJustification_correct_test() {
        InconsistenceJustification inconsistenceJustification = new InconsistenceJustification();

        Employee employee = new Employee();
        inconsistenceJustification.setEmployee(employee);
        inconsistenceJustification.setExplanation("This is my explanation");
        inconsistenceJustification.setMotive("Por comisión de trabajo");//Por comisión de trabajo
        //Por compensación de horas extras
        //Sin justificación.
        inconsistenceJustification.setType(0);
        inconsistenceJustification.setStatus(0);

        ErrorMessage errorMessage = JustificationController.registerJustification(inconsistenceJustification);
        System.out.println(errorMessage.getMessage());
        Assert.assertEquals(true, errorMessage.isValid());
    }

    //Incorrectas
    //Prueba  2 : 1a2, 2b1, 3c1, 4d1
    @Test
    public final void registerJustification_inconsistence_on_reclamation_test() {
        InconsistenceJustification inconsistenceJustification = new InconsistenceJustification();

        Employee employee = new Employee();
        inconsistenceJustification.setEmployee(employee);
        inconsistenceJustification.setExplanation("This is my explanation");
        inconsistenceJustification.setMotive("Por compensación de horas extras");//Por comisión de trabajo
        //Por compensación de horas extras
        //Sin justificación.
        inconsistenceJustification.setType(1);
        inconsistenceJustification.setStatus(0);

        ErrorMessage errorMessage = JustificationController.registerJustification(inconsistenceJustification);
        System.out.println(errorMessage.getMessage());
        Assert.assertEquals(false, errorMessage.isValid());
    }

    //Prueba  3 : 1a1, 2b2, 3c1, 4d1
    @Test
    public final void registerJustification_empty_explanation_test() {
        InconsistenceJustification inconsistenceJustification = new InconsistenceJustification();

        Employee employee = new Employee();
        inconsistenceJustification.setEmployee(employee);
        inconsistenceJustification.setExplanation("");
        inconsistenceJustification.setMotive("Por comisión de trabajo");//Por comisión de trabajo
        //Por compensación de horas extras
        //Sin justificación.
        inconsistenceJustification.setType(0);
        inconsistenceJustification.setStatus(0);

        ErrorMessage errorMessage = JustificationController.registerJustification(inconsistenceJustification);
        System.out.println(errorMessage.getMessage());
        Assert.assertEquals(false, errorMessage.isValid());
    }

    //Prueba  4 : 1a1, 2b3, 3c1, 4d1
    @Test
    public final void registerJustification_null_explanation_test() {
        InconsistenceJustification inconsistenceJustification = new InconsistenceJustification();

        Employee employee = new Employee();
        inconsistenceJustification.setEmployee(employee);
        inconsistenceJustification.setExplanation(null);
        inconsistenceJustification.setMotive("Por comisión de trabajo");//Por comisión de trabajo
        //Por compensación de horas extras
        //Sin justificación.
        inconsistenceJustification.setType(0);
        inconsistenceJustification.setStatus(0);

        ErrorMessage errorMessage = JustificationController.registerJustification(inconsistenceJustification);
        System.out.println(errorMessage.getMessage());
        Assert.assertEquals(false, errorMessage.isValid());
    }

    //Prueba  5 : 1a1, 2b1, 3c1, 4d2
    @Test
    public final void registerJustification_incorrect_status_test() {
        InconsistenceJustification inconsistenceJustification = new InconsistenceJustification();

        Employee employee = new Employee();
        inconsistenceJustification.setEmployee(employee);
        inconsistenceJustification.setExplanation("This is my explanation");
        inconsistenceJustification.setMotive("Por comisión de trabajo");//Por comisión de trabajo
        //Por compensación de horas extras
        //Sin justificación.
        inconsistenceJustification.setType(0);
        inconsistenceJustification.setStatus(1);

        ErrorMessage errorMessage = JustificationController.registerJustification(inconsistenceJustification);
        System.out.println(errorMessage.getMessage());
        Assert.assertEquals(false, errorMessage.isValid());
    }
}
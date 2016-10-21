package tasiproject.models;

/**
 * @author paolo
 */
public class InconsistenceJustification {
    private Employee employee;
    private String motive;
    private String explanation;
    private int type; //0: late. 1: extra hours
    private int status;//0: not seen, 1: accepted, 2: not accepted

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    /**
     * @return the motive
     */
    public String getMotive() {
        return motive;
    }

    /**
     * @param motive the motive to set
     */
    public void setMotive(String motive) {
        this.motive = motive;
    }

    /**
     * @return the explanation
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * @param explanation the explanation to set
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }    
}
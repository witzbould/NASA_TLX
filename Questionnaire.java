import java.util.Objects;

/**
 * Created by witzb on 04.12.2016.
 */
public class Questionnaire {
    private Boolean isFinalized = false;
    private String SubjectId = "";
    private String FirstName = "";
    private String LastName = "";
    private String TaskId = "";
    private String TaskName = "";
    private Object [][] Data = {
            {"MD",null,null,null},
            {"PD",null,null,null},
            {"TD",null,null,null},
            {"OP",null,null,null},
            {"FR",null,null,null},
            {"EF",null,null,null},
    };



    public Boolean isFinalized() {
        return isFinalized;
    }

    public void setFinalized(Boolean finalized) {
        isFinalized = finalized;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String subjectId) {
        SubjectId = subjectId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTaskId() {
        return TaskId;
    }

    public void setTaskId(String taskId) {
        TaskId = taskId;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public Object[][] getData() {
        return Data;
    }

    public void setData(Object[][] data) {
        this.Data = data;
    }

    public void addWeight (String demand, Integer weight){
        for (int i =0; i<= 5; i++){
            if (Data[i][0].equals(demand)){
                Data[i][2] = weight;
            }
        }
    }
    public void addRaiting (String demand, Integer raiting){
        for (int i =0; i<= 5; i++){
            if (Data[i][0].equals(demand)){
                Data[i][1] = raiting;
            }
        }
    }
}

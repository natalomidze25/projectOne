import java.time.LocalDateTime;

public abstract class GeneralTask {
    private String name;
    private String description;
    private String userName;

    public GeneralTask(String description,String name, String userName) {
        this.name = name;
        this.userName = userName;
        this.description =description;
    }

    public void print(){
        System.out.println("name: "+name);
        System.out.println("userName: "+userName);
        System.out.println("description: "+description);
        System.out.println("type: "+this.getClass().getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

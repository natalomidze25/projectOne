public class RepeatableTask extends GeneralTask {
    private Integer taskCount;

    public RepeatableTask(String description, String name, String userName, Integer taskCount) {
        super(description,name, userName);
        this.taskCount = taskCount;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("taskCount: "+getTaskCount());
        System.out.println("\n-----------\n");
    }

    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }
}

public class BasicTask  extends GeneralTask{
    public BasicTask(String description,String name, String userName) {
        super(description,name, userName);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("\n-----------\n");
    }

}

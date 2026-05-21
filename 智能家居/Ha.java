package 智能家居;

public class Ha implements Switch {
    private String name;
    private boolean status;
    @Override
    public void press(){
        status=!status;
    }

    public Ha(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public Ha() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}


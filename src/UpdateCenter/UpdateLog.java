package UpdateCenter;

public class UpdateLog extends UpdateManager{
    public String updateVersion;

    public UpdateLog(){};
    public void setUpdateVer(String updateVersion){
        this.updateVersion=updateVersion;
        notifySubs();
    }
    public String getUpdateVersion(){
        return updateVersion;
    }

}

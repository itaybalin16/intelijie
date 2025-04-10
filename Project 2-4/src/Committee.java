import java.util.Arrays;

public class Committee {
    private String committeeName;
    private String[] teacherCommitteeArr;
    private String chairmanName;

    public Committee(String chairmanName, String committeeName, String[] teacherCommitteeArr) {
        this.chairmanName = chairmanName;
        this.committeeName = committeeName;
        this.teacherCommitteeArr = teacherCommitteeArr;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public String getCommitteeName() {
        return committeeName;
    }

    public void setCommitteeName(String committeeName) {
        this.committeeName = committeeName;
    }

    public String[] getTeacherCommitteeArr() {
        return teacherCommitteeArr;
    }

    public void setTeacherCommitteeArr(String[] teacherCommitteeArr) {
        this.teacherCommitteeArr = teacherCommitteeArr;
    }

    @Override
    public String toString() {
        return "Committee{" +
                "chairmanName='" + chairmanName + '\'' +
                ", committeeName='" + committeeName + '\'' +
                ", teacherCommitteeArr=" + Arrays.toString(teacherCommitteeArr) +
                '}';
    }

}
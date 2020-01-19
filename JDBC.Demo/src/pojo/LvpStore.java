package pojo;

import java.util.Objects;

public class LvpStore {
    private String streamId;
    private String name;
    private  String linkTel;
private  String name1;

    public String getStreamId() {
        return streamId;
    }

    public String getName() {
        return name;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public String getName1() {
        return name1;
    }

    @Override
    public String toString() {
        return "Lvp{" +
                "streamId='" + streamId + '\'' +
                ", name='" + name + '\'' +
                ", linkTel='" + linkTel + '\'' +
                ", name1='" + name1 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LvpStore lvp = (LvpStore) o;
        return Objects.equals(streamId, lvp.streamId) &&
                Objects.equals(name, lvp.name) &&
                Objects.equals(linkTel, lvp.linkTel) &&
                Objects.equals(name1, lvp.name1);
    }

    @Override
    public int hashCode() {

        return Objects.hash(streamId, name, linkTel, name1);
    }

    public void setStreamId(String streamId) {

        this.streamId = streamId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
}

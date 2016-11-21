package com.usetech.client.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by User on 18.11.2016.
 */
public class FrameBean implements Serializable {

    private static final long serialVersionUID = -5054749880970511861L;
    @JsonProperty(value = "token")
    private String token;
    @JsonProperty(value = "wfmId")
    private String wfmId;
    @JsonProperty(value = "iin")
    private Integer iin;
    @JsonProperty(value = "username")
    private String username;
    @JsonProperty(value = "timestamp")
    private String timestamp;
    @JsonProperty(value = "type")
    private String type;
    @JsonProperty(value = "camPric")
    private String camPric;
    @JsonProperty(value = "scanPic")
    private String scanPic;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getWfmId() {
        return wfmId;
    }

    public void setWfmId(String wfmId) {
        this.wfmId = wfmId;
    }

    public Integer getIin() {
        return iin;
    }

    public void setIin(Integer iin) {
        this.iin = iin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCamPric() {
        return camPric;
    }

    public void setCamPric(String camPric) {
        this.camPric = camPric;
    }

    public String getScanPic() {
        return scanPic;
    }

    public void setScanPic(String scanPic) {
        this.scanPic = scanPic;
    }

    @Override
    public String toString() {
        return "FrameBean{" +
                "token='" + token + '\'' +
                ", wfmId='" + wfmId + '\'' +
                ", iin=" + iin +
                ", username='" + username + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

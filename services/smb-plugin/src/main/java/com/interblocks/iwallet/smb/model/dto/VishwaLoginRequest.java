/*
 * Virtual Wallet
 * API for the Product iWallet
 *
 * OpenAPI spec version: 2.10.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package lk.sampath.iwallet.smb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

//import io.swagger.annotations.ApiModelProperty;

/**
 * LoginUser
 */
//@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-27T08:29:42.308Z")
public class VishwaLoginRequest {
    @JsonProperty("vishwaId")
    private String vishwaId = null;

    @JsonProperty("password")
    private String password = null;

    @JsonProperty("deviceID")
    private String deviceID = null;

    @JsonProperty("deviceInfo")
    private LoginUserDeviceInfo deviceInfo = null;

    public VishwaLoginRequest vishwaId(String vishwaId) {
        this.vishwaId = vishwaId;
        return this;
    }

    /**
     * email address of the user
     *
     * @return userID
     **/
    @JsonProperty("vishwaId")
//    @ApiModelProperty(example = "gimli@middleearth.com", required = true, value = "email address of the user")
    @NotNull
    public String getVishwaId() {
        return vishwaId;
    }

    public void setVishwaId(String vishwaId) {
        this.vishwaId = vishwaId;
    }

    public VishwaLoginRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
     * user pasword
     *
     * @return password
     **/
    @JsonProperty("password")
//    @ApiModelProperty(example = "PWD00007007", required = true, value = "user pasword")
    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public VishwaLoginRequest deviceID(String deviceID) {
        this.deviceID = deviceID;
        return this;
    }

    /**
     * Get deviceID
     *
     * @return deviceID
     **/
    @JsonProperty("deviceID")
//    @ApiModelProperty(example = "DID10098453321", value = "")
    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public VishwaLoginRequest deviceInfo(LoginUserDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }

    /**
     * Get deviceInfo
     *
     * @return deviceInfo
     **/
    @JsonProperty("deviceInfo")
//    @ApiModelProperty(value = "")
    public LoginUserDeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(LoginUserDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VishwaLoginRequest loginUser = (VishwaLoginRequest) o;
        return Objects.equals(this.vishwaId, loginUser.vishwaId) &&
                Objects.equals(this.password, loginUser.password) &&
                Objects.equals(this.deviceID, loginUser.deviceID) &&
                Objects.equals(this.deviceInfo, loginUser.deviceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vishwaId, password, deviceID, deviceInfo);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginUser {\n");

        sb.append("    vishwaId: ").append(toIndentedString(vishwaId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
        sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


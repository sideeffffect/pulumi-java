// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The device configuration. Eventually delivered to devices.
 * 
 */
public final class DeviceConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeviceConfigResponse Empty = new DeviceConfigResponse();

    /**
     * The device configuration data.
     * 
     */
    @Import(name="binaryData", required=true)
    private String binaryData;

    public String binaryData() {
        return this.binaryData;
    }

    /**
     * [Output only] The time at which this configuration version was updated in Cloud IoT Core. This timestamp is set by the server.
     * 
     */
    @Import(name="cloudUpdateTime", required=true)
    private String cloudUpdateTime;

    public String cloudUpdateTime() {
        return this.cloudUpdateTime;
    }

    /**
     * [Output only] The time at which Cloud IoT Core received the acknowledgment from the device, indicating that the device has received this configuration version. If this field is not present, the device has not yet acknowledged that it received this version. Note that when the config was sent to the device, many config versions may have been available in Cloud IoT Core while the device was disconnected, and on connection, only the latest version is sent to the device. Some versions may never be sent to the device, and therefore are never acknowledged. This timestamp is set by Cloud IoT Core.
     * 
     */
    @Import(name="deviceAckTime", required=true)
    private String deviceAckTime;

    public String deviceAckTime() {
        return this.deviceAckTime;
    }

    /**
     * [Output only] The version of this update. The version number is assigned by the server, and is always greater than 0 after device creation. The version must be 0 on the `CreateDevice` request if a `config` is specified; the response of `CreateDevice` will always have a value of 1.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private DeviceConfigResponse() {}

    private DeviceConfigResponse(DeviceConfigResponse $) {
        this.binaryData = $.binaryData;
        this.cloudUpdateTime = $.cloudUpdateTime;
        this.deviceAckTime = $.deviceAckTime;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceConfigResponse $;

        public Builder() {
            $ = new DeviceConfigResponse();
        }

        public Builder(DeviceConfigResponse defaults) {
            $ = new DeviceConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder binaryData(String binaryData) {
            $.binaryData = binaryData;
            return this;
        }

        public Builder cloudUpdateTime(String cloudUpdateTime) {
            $.cloudUpdateTime = cloudUpdateTime;
            return this;
        }

        public Builder deviceAckTime(String deviceAckTime) {
            $.deviceAckTime = deviceAckTime;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public DeviceConfigResponse build() {
            $.binaryData = Objects.requireNonNull($.binaryData, "expected parameter 'binaryData' to be non-null");
            $.cloudUpdateTime = Objects.requireNonNull($.cloudUpdateTime, "expected parameter 'cloudUpdateTime' to be non-null");
            $.deviceAckTime = Objects.requireNonNull($.deviceAckTime, "expected parameter 'deviceAckTime' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}

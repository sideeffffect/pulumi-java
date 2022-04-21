// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.AuthenticationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata of IoT device/IoT Edge device to be configured.
 * 
 */
public final class IoTDeviceInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final IoTDeviceInfoResponse Empty = new IoTDeviceInfoResponse();

    /**
     * Encrypted IoT device/IoT edge device connection string.
     * 
     */
    @Import(name="authentication")
    private @Nullable AuthenticationResponse authentication;

    public Optional<AuthenticationResponse> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * ID of the IoT device/edge device.
     * 
     */
    @Import(name="deviceId", required=true)
    private String deviceId;

    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Host name for the IoT hub associated to the device.
     * 
     */
    @Import(name="ioTHostHub", required=true)
    private String ioTHostHub;

    public String ioTHostHub() {
        return this.ioTHostHub;
    }

    /**
     * Id for the IoT hub associated to the device.
     * 
     */
    @Import(name="ioTHostHubId")
    private @Nullable String ioTHostHubId;

    public Optional<String> ioTHostHubId() {
        return Optional.ofNullable(this.ioTHostHubId);
    }

    private IoTDeviceInfoResponse() {}

    private IoTDeviceInfoResponse(IoTDeviceInfoResponse $) {
        this.authentication = $.authentication;
        this.deviceId = $.deviceId;
        this.ioTHostHub = $.ioTHostHub;
        this.ioTHostHubId = $.ioTHostHubId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IoTDeviceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IoTDeviceInfoResponse $;

        public Builder() {
            $ = new IoTDeviceInfoResponse();
        }

        public Builder(IoTDeviceInfoResponse defaults) {
            $ = new IoTDeviceInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder authentication(@Nullable AuthenticationResponse authentication) {
            $.authentication = authentication;
            return this;
        }

        public Builder deviceId(String deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        public Builder ioTHostHub(String ioTHostHub) {
            $.ioTHostHub = ioTHostHub;
            return this;
        }

        public Builder ioTHostHubId(@Nullable String ioTHostHubId) {
            $.ioTHostHubId = ioTHostHubId;
            return this;
        }

        public IoTDeviceInfoResponse build() {
            $.deviceId = Objects.requireNonNull($.deviceId, "expected parameter 'deviceId' to be non-null");
            $.ioTHostHub = Objects.requireNonNull($.ioTHostHub, "expected parameter 'ioTHostHub' to be non-null");
            return $;
        }
    }

}

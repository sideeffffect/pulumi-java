// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecureIotDeviceRemoteTunnelResponse {
    /**
     * The IoT device id to use when establishing the remote tunnel. This string is case-sensitive.
     * 
     */
    private final String deviceId;
    /**
     * Name of the IoT Hub.
     * 
     */
    private final String iotHubName;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.SecureIotDeviceRemoteTunnel'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"deviceId","iotHubName","type"})
    private SecureIotDeviceRemoteTunnelResponse(
        String deviceId,
        String iotHubName,
        String type) {
        this.deviceId = deviceId;
        this.iotHubName = iotHubName;
        this.type = type;
    }

    /**
     * The IoT device id to use when establishing the remote tunnel. This string is case-sensitive.
     * 
    */
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Name of the IoT Hub.
     * 
    */
    public String getIotHubName() {
        return this.iotHubName;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.SecureIotDeviceRemoteTunnel'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureIotDeviceRemoteTunnelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceId;
        private String iotHubName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecureIotDeviceRemoteTunnelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.iotHubName = defaults.iotHubName;
    	      this.type = defaults.type;
        }

        public Builder setDeviceId(String deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }

        public Builder setIotHubName(String iotHubName) {
            this.iotHubName = Objects.requireNonNull(iotHubName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SecureIotDeviceRemoteTunnelResponse build() {
            return new SecureIotDeviceRemoteTunnelResponse(deviceId, iotHubName, type);
        }
    }
}

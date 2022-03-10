// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchConfigurationEphemeralBlockDevice extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchConfigurationEphemeralBlockDevice Empty = new GetLaunchConfigurationEphemeralBlockDevice();

    /**
     * The Name of the device.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The Virtual Name of the device.
     * 
     */
    @InputImport(name="virtualName", required=true)
      private final String virtualName;

    public String getVirtualName() {
        return this.virtualName;
    }

    public GetLaunchConfigurationEphemeralBlockDevice(
        String deviceName,
        String virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.virtualName = Objects.requireNonNull(virtualName, "expected parameter 'virtualName' to be non-null");
    }

    private GetLaunchConfigurationEphemeralBlockDevice() {
        this.deviceName = null;
        this.virtualName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public GetLaunchConfigurationEphemeralBlockDevice build() {
            return new GetLaunchConfigurationEphemeralBlockDevice(deviceName, virtualName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SpotFleetRequestLaunchSpecificationEphemeralBlockDevice {
    private final String deviceName;
    private final String virtualName;

    @OutputCustomType.Constructor({"deviceName","virtualName"})
    private SpotFleetRequestLaunchSpecificationEphemeralBlockDevice(
        String deviceName,
        String virtualName) {
        this.deviceName = deviceName;
        this.virtualName = virtualName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }
    public String getVirtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchSpecificationEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchSpecificationEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setVirtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public SpotFleetRequestLaunchSpecificationEphemeralBlockDevice build() {
            return new SpotFleetRequestLaunchSpecificationEphemeralBlockDevice(deviceName, virtualName);
        }
    }
}

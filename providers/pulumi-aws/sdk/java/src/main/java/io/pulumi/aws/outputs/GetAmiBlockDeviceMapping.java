// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetAmiBlockDeviceMapping {
    /**
     * The physical name of the device.
     * 
     */
    private final String deviceName;
    /**
     * Map containing EBS information, if the device is EBS based. Unlike most object attributes, these are accessed directly (e.g., `ebs.volume_size` or `ebs["volume_size"]`) rather than accessed through the first element of a list (e.g., `ebs[0].volume_size`).
     * 
     */
    private final Map<String,String> ebs;
    /**
     * Suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    private final String noDevice;
    /**
     * The virtual device name (for instance stores).
     * 
     */
    private final String virtualName;

    @OutputCustomType.Constructor
    private GetAmiBlockDeviceMapping(
        @OutputCustomType.Parameter("deviceName") String deviceName,
        @OutputCustomType.Parameter("ebs") Map<String,String> ebs,
        @OutputCustomType.Parameter("noDevice") String noDevice,
        @OutputCustomType.Parameter("virtualName") String virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * The physical name of the device.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Map containing EBS information, if the device is EBS based. Unlike most object attributes, these are accessed directly (e.g., `ebs.volume_size` or `ebs["volume_size"]`) rather than accessed through the first element of a list (e.g., `ebs[0].volume_size`).
     * 
    */
    public Map<String,String> getEbs() {
        return this.ebs;
    }
    /**
     * Suppresses the specified device included in the block device mapping of the AMI.
     * 
    */
    public String getNoDevice() {
        return this.noDevice;
    }
    /**
     * The virtual device name (for instance stores).
     * 
    */
    public String getVirtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private Map<String,String> ebs;
        private String noDevice;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder ebs(Map<String,String> ebs) {
            this.ebs = Objects.requireNonNull(ebs);
            return this;
        }

        public Builder noDevice(String noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }

        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public GetAmiBlockDeviceMapping build() {
            return new GetAmiBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}

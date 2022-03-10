// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VolumeDevice {
    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * 
     */
    private final String devicePath;
    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private VolumeDevice(
        @OutputCustomType.Parameter("devicePath") String devicePath,
        @OutputCustomType.Parameter("name") String name) {
        this.devicePath = devicePath;
        this.name = name;
    }

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * 
    */
    public String getDevicePath() {
        return this.devicePath;
    }
    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String devicePath;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePath = defaults.devicePath;
    	      this.name = defaults.name;
        }

        public Builder devicePath(String devicePath) {
            this.devicePath = Objects.requireNonNull(devicePath);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public VolumeDevice build() {
            return new VolumeDevice(devicePath, name);
        }
    }
}

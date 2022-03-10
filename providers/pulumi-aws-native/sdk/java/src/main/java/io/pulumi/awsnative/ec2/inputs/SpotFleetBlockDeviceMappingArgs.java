// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetEbsBlockDeviceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetBlockDeviceMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetBlockDeviceMappingArgs Empty = new SpotFleetBlockDeviceMappingArgs();

    @InputImport(name="deviceName", required=true)
      private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="ebs")
      private final @Nullable Input<SpotFleetEbsBlockDeviceArgs> ebs;

    public Input<SpotFleetEbsBlockDeviceArgs> getEbs() {
        return this.ebs == null ? Input.empty() : this.ebs;
    }

    @InputImport(name="noDevice")
      private final @Nullable Input<String> noDevice;

    public Input<String> getNoDevice() {
        return this.noDevice == null ? Input.empty() : this.noDevice;
    }

    @InputImport(name="virtualName")
      private final @Nullable Input<String> virtualName;

    public Input<String> getVirtualName() {
        return this.virtualName == null ? Input.empty() : this.virtualName;
    }

    public SpotFleetBlockDeviceMappingArgs(
        Input<String> deviceName,
        @Nullable Input<SpotFleetEbsBlockDeviceArgs> ebs,
        @Nullable Input<String> noDevice,
        @Nullable Input<String> virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private SpotFleetBlockDeviceMappingArgs() {
        this.deviceName = Input.empty();
        this.ebs = Input.empty();
        this.noDevice = Input.empty();
        this.virtualName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceName;
        private @Nullable Input<SpotFleetEbsBlockDeviceArgs> ebs;
        private @Nullable Input<String> noDevice;
        private @Nullable Input<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetBlockDeviceMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder ebs(@Nullable Input<SpotFleetEbsBlockDeviceArgs> ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder ebs(@Nullable SpotFleetEbsBlockDeviceArgs ebs) {
            this.ebs = Input.ofNullable(ebs);
            return this;
        }

        public Builder noDevice(@Nullable Input<String> noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder noDevice(@Nullable String noDevice) {
            this.noDevice = Input.ofNullable(noDevice);
            return this;
        }

        public Builder virtualName(@Nullable Input<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = Input.ofNullable(virtualName);
            return this;
        }
        public SpotFleetBlockDeviceMappingArgs build() {
            return new SpotFleetBlockDeviceMappingArgs(deviceName, ebs, noDevice, virtualName);
        }
    }
}

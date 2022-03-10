// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.InstanceDiskArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Hardware of the Instance.
 * 
 */
public final class InstanceHardwareArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceHardwareArgs Empty = new InstanceHardwareArgs();

    /**
     * CPU count of the Instance.
     * 
     */
    @InputImport(name="cpuCount")
      private final @Nullable Input<Integer> cpuCount;

    public Input<Integer> getCpuCount() {
        return this.cpuCount == null ? Input.empty() : this.cpuCount;
    }

    /**
     * Disks attached to the Instance.
     * 
     */
    @InputImport(name="disks")
      private final @Nullable Input<List<InstanceDiskArgs>> disks;

    public Input<List<InstanceDiskArgs>> getDisks() {
        return this.disks == null ? Input.empty() : this.disks;
    }

    /**
     * RAM Size of the Instance.
     * 
     */
    @InputImport(name="ramSizeInGb")
      private final @Nullable Input<Integer> ramSizeInGb;

    public Input<Integer> getRamSizeInGb() {
        return this.ramSizeInGb == null ? Input.empty() : this.ramSizeInGb;
    }

    public InstanceHardwareArgs(
        @Nullable Input<Integer> cpuCount,
        @Nullable Input<List<InstanceDiskArgs>> disks,
        @Nullable Input<Integer> ramSizeInGb) {
        this.cpuCount = cpuCount;
        this.disks = disks;
        this.ramSizeInGb = ramSizeInGb;
    }

    private InstanceHardwareArgs() {
        this.cpuCount = Input.empty();
        this.disks = Input.empty();
        this.ramSizeInGb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceHardwareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cpuCount;
        private @Nullable Input<List<InstanceDiskArgs>> disks;
        private @Nullable Input<Integer> ramSizeInGb;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceHardwareArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
    	      this.disks = defaults.disks;
    	      this.ramSizeInGb = defaults.ramSizeInGb;
        }

        public Builder cpuCount(@Nullable Input<Integer> cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        public Builder cpuCount(@Nullable Integer cpuCount) {
            this.cpuCount = Input.ofNullable(cpuCount);
            return this;
        }

        public Builder disks(@Nullable Input<List<InstanceDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }

        public Builder disks(@Nullable List<InstanceDiskArgs> disks) {
            this.disks = Input.ofNullable(disks);
            return this;
        }

        public Builder ramSizeInGb(@Nullable Input<Integer> ramSizeInGb) {
            this.ramSizeInGb = ramSizeInGb;
            return this;
        }

        public Builder ramSizeInGb(@Nullable Integer ramSizeInGb) {
            this.ramSizeInGb = Input.ofNullable(ramSizeInGb);
            return this;
        }
        public InstanceHardwareArgs build() {
            return new InstanceHardwareArgs(cpuCount, disks, ramSizeInGb);
        }
    }
}

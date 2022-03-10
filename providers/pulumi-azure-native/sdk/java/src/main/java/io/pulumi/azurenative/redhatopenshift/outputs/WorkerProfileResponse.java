// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkerProfileResponse {
    /**
     * The number of worker VMs.  Must be between 3 and 20 (immutable).
     * 
     */
    private final @Nullable Integer count;
    /**
     * The disk size of the worker VMs.  Must be 128 or greater (immutable).
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * The worker profile name.  Must be "worker" (immutable).
     * 
     */
    private final @Nullable String name;
    /**
     * The Azure resource ID of the worker subnet (immutable).
     * 
     */
    private final @Nullable String subnetId;
    /**
     * The size of the worker VMs (immutable).
     * 
     */
    private final @Nullable String vmSize;

    @OutputCustomType.Constructor
    private WorkerProfileResponse(
        @OutputCustomType.Parameter("count") @Nullable Integer count,
        @OutputCustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("subnetId") @Nullable String subnetId,
        @OutputCustomType.Parameter("vmSize") @Nullable String vmSize) {
        this.count = count;
        this.diskSizeGB = diskSizeGB;
        this.name = name;
        this.subnetId = subnetId;
        this.vmSize = vmSize;
    }

    /**
     * The number of worker VMs.  Must be between 3 and 20 (immutable).
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * The disk size of the worker VMs.  Must be 128 or greater (immutable).
     * 
    */
    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * The worker profile name.  Must be "worker" (immutable).
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The Azure resource ID of the worker subnet (immutable).
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * The size of the worker VMs (immutable).
     * 
    */
    public Optional<String> getVmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable Integer diskSizeGB;
        private @Nullable String name;
        private @Nullable String subnetId;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.name = defaults.name;
    	      this.subnetId = defaults.subnetId;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }
        public WorkerProfileResponse build() {
            return new WorkerProfileResponse(count, diskSizeGB, name, subnetId, vmSize);
        }
    }
}

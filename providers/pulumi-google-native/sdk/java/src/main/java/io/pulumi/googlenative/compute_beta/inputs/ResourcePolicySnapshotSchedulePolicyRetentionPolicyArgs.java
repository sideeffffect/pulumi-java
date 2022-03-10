// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Policy for retention of scheduled snapshots.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs Empty = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs();

    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    @InputImport(name="maxRetentionDays")
      private final @Nullable Input<Integer> maxRetentionDays;

    public Input<Integer> getMaxRetentionDays() {
        return this.maxRetentionDays == null ? Input.empty() : this.maxRetentionDays;
    }

    /**
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
     */
    @InputImport(name="onSourceDiskDelete")
      private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete;

    public Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> getOnSourceDiskDelete() {
        return this.onSourceDiskDelete == null ? Input.empty() : this.onSourceDiskDelete;
    }

    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(
        @Nullable Input<Integer> maxRetentionDays,
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete) {
        this.maxRetentionDays = maxRetentionDays;
        this.onSourceDiskDelete = onSourceDiskDelete;
    }

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs() {
        this.maxRetentionDays = Input.empty();
        this.onSourceDiskDelete = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxRetentionDays;
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.onSourceDiskDelete = defaults.onSourceDiskDelete;
        }

        public Builder maxRetentionDays(@Nullable Input<Integer> maxRetentionDays) {
            this.maxRetentionDays = maxRetentionDays;
            return this;
        }

        public Builder maxRetentionDays(@Nullable Integer maxRetentionDays) {
            this.maxRetentionDays = Input.ofNullable(maxRetentionDays);
            return this;
        }

        public Builder onSourceDiskDelete(@Nullable Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete) {
            this.onSourceDiskDelete = onSourceDiskDelete;
            return this;
        }

        public Builder onSourceDiskDelete(@Nullable ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete onSourceDiskDelete) {
            this.onSourceDiskDelete = Input.ofNullable(onSourceDiskDelete);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(maxRetentionDays, onSourceDiskDelete);
        }
    }
}

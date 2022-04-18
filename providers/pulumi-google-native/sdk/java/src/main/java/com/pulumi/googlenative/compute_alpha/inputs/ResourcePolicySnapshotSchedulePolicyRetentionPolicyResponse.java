// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Policy for retention of scheduled snapshots.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse Empty = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse();

    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    @Import(name="maxRetentionDays", required=true)
      private final Integer maxRetentionDays;

    public Integer maxRetentionDays() {
        return this.maxRetentionDays;
    }

    @Import(name="onPolicySwitch", required=true)
      private final String onPolicySwitch;

    public String onPolicySwitch() {
        return this.onPolicySwitch;
    }

    /**
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
     */
    @Import(name="onSourceDiskDelete", required=true)
      private final String onSourceDiskDelete;

    public String onSourceDiskDelete() {
        return this.onSourceDiskDelete;
    }

    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse(
        Integer maxRetentionDays,
        String onPolicySwitch,
        String onSourceDiskDelete) {
        this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays, "expected parameter 'maxRetentionDays' to be non-null");
        this.onPolicySwitch = Objects.requireNonNull(onPolicySwitch, "expected parameter 'onPolicySwitch' to be non-null");
        this.onSourceDiskDelete = Objects.requireNonNull(onSourceDiskDelete, "expected parameter 'onSourceDiskDelete' to be non-null");
    }

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse() {
        this.maxRetentionDays = null;
        this.onPolicySwitch = null;
        this.onSourceDiskDelete = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRetentionDays;
        private String onPolicySwitch;
        private String onSourceDiskDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.onPolicySwitch = defaults.onPolicySwitch;
    	      this.onSourceDiskDelete = defaults.onSourceDiskDelete;
        }

        public Builder maxRetentionDays(Integer maxRetentionDays) {
            this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays);
            return this;
        }
        public Builder onPolicySwitch(String onPolicySwitch) {
            this.onPolicySwitch = Objects.requireNonNull(onPolicySwitch);
            return this;
        }
        public Builder onSourceDiskDelete(String onSourceDiskDelete) {
            this.onSourceDiskDelete = Objects.requireNonNull(onSourceDiskDelete);
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse build() {
            return new ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse(maxRetentionDays, onPolicySwitch, onSourceDiskDelete);
        }
    }
}

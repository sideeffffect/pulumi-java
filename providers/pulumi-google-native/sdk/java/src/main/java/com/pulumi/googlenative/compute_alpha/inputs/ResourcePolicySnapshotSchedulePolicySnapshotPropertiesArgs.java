// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specified snapshot properties for scheduled snapshots created by this policy.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs Empty = new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs();

    /**
     * Chain name that the snapshot is created in.
     * 
     */
    @Import(name="chainName")
    private @Nullable Output<String> chainName;

    public Optional<Output<String>> chainName() {
        return Optional.ofNullable(this.chainName);
    }

    /**
     * Indication to perform a &#39;guest aware&#39; snapshot.
     * 
     */
    @Import(name="guestFlush")
    private @Nullable Output<Boolean> guestFlush;

    public Optional<Output<Boolean>> guestFlush() {
        return Optional.ofNullable(this.guestFlush);
    }

    /**
     * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
     */
    @Import(name="storageLocations")
    private @Nullable Output<List<String>> storageLocations;

    public Optional<Output<List<String>>> storageLocations() {
        return Optional.ofNullable(this.storageLocations);
    }

    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs() {}

    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs $) {
        this.chainName = $.chainName;
        this.guestFlush = $.guestFlush;
        this.labels = $.labels;
        this.storageLocations = $.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs $;

        public Builder() {
            $ = new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs();
        }

        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs defaults) {
            $ = new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder chainName(@Nullable Output<String> chainName) {
            $.chainName = chainName;
            return this;
        }

        public Builder chainName(String chainName) {
            return chainName(Output.of(chainName));
        }

        public Builder guestFlush(@Nullable Output<Boolean> guestFlush) {
            $.guestFlush = guestFlush;
            return this;
        }

        public Builder guestFlush(Boolean guestFlush) {
            return guestFlush(Output.of(guestFlush));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            $.storageLocations = storageLocations;
            return this;
        }

        public Builder storageLocations(List<String> storageLocations) {
            return storageLocations(Output.of(storageLocations));
        }

        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }

        public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ManagementPolicyBaseBlobResponse;
import io.pulumi.azurenative.storage.inputs.ManagementPolicySnapShotResponse;
import io.pulumi.azurenative.storage.inputs.ManagementPolicyVersionResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Actions are applied to the filtered blobs when the execution condition is met.
 * 
 */
public final class ManagementPolicyActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementPolicyActionResponse Empty = new ManagementPolicyActionResponse();

    /**
     * The management policy action for base blob
     * 
     */
    @InputImport(name="baseBlob")
      private final @Nullable ManagementPolicyBaseBlobResponse baseBlob;

    public Optional<ManagementPolicyBaseBlobResponse> getBaseBlob() {
        return this.baseBlob == null ? Optional.empty() : Optional.ofNullable(this.baseBlob);
    }

    /**
     * The management policy action for snapshot
     * 
     */
    @InputImport(name="snapshot")
      private final @Nullable ManagementPolicySnapShotResponse snapshot;

    public Optional<ManagementPolicySnapShotResponse> getSnapshot() {
        return this.snapshot == null ? Optional.empty() : Optional.ofNullable(this.snapshot);
    }

    /**
     * The management policy action for version
     * 
     */
    @InputImport(name="version")
      private final @Nullable ManagementPolicyVersionResponse version;

    public Optional<ManagementPolicyVersionResponse> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ManagementPolicyActionResponse(
        @Nullable ManagementPolicyBaseBlobResponse baseBlob,
        @Nullable ManagementPolicySnapShotResponse snapshot,
        @Nullable ManagementPolicyVersionResponse version) {
        this.baseBlob = baseBlob;
        this.snapshot = snapshot;
        this.version = version;
    }

    private ManagementPolicyActionResponse() {
        this.baseBlob = null;
        this.snapshot = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagementPolicyBaseBlobResponse baseBlob;
        private @Nullable ManagementPolicySnapShotResponse snapshot;
        private @Nullable ManagementPolicyVersionResponse version;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseBlob = defaults.baseBlob;
    	      this.snapshot = defaults.snapshot;
    	      this.version = defaults.version;
        }

        public Builder baseBlob(@Nullable ManagementPolicyBaseBlobResponse baseBlob) {
            this.baseBlob = baseBlob;
            return this;
        }

        public Builder snapshot(@Nullable ManagementPolicySnapShotResponse snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder version(@Nullable ManagementPolicyVersionResponse version) {
            this.version = version;
            return this;
        }
        public ManagementPolicyActionResponse build() {
            return new ManagementPolicyActionResponse(baseBlob, snapshot, version);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that defines the blob inventory rule filter conditions.
 * 
 */
public final class BlobInventoryPolicyFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final BlobInventoryPolicyFilterResponse Empty = new BlobInventoryPolicyFilterResponse();

    /**
     * An array of predefined enum values. Valid values include blockBlob, appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     * 
     */
    @Import(name="blobTypes", required=true)
    private List<String> blobTypes;

    public List<String> blobTypes() {
        return this.blobTypes;
    }

    /**
     * Includes blob versions in blob inventory when value set to true.
     * 
     */
    @Import(name="includeBlobVersions")
    private @Nullable Boolean includeBlobVersions;

    public Optional<Boolean> includeBlobVersions() {
        return Optional.ofNullable(this.includeBlobVersions);
    }

    /**
     * Includes blob snapshots in blob inventory when value set to true.
     * 
     */
    @Import(name="includeSnapshots")
    private @Nullable Boolean includeSnapshots;

    public Optional<Boolean> includeSnapshots() {
        return Optional.ofNullable(this.includeSnapshots);
    }

    /**
     * An array of strings for blob prefixes to be matched.
     * 
     */
    @Import(name="prefixMatch")
    private @Nullable List<String> prefixMatch;

    public Optional<List<String>> prefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
    }

    private BlobInventoryPolicyFilterResponse() {}

    private BlobInventoryPolicyFilterResponse(BlobInventoryPolicyFilterResponse $) {
        this.blobTypes = $.blobTypes;
        this.includeBlobVersions = $.includeBlobVersions;
        this.includeSnapshots = $.includeSnapshots;
        this.prefixMatch = $.prefixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobInventoryPolicyFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyFilterResponse $;

        public Builder() {
            $ = new BlobInventoryPolicyFilterResponse();
        }

        public Builder(BlobInventoryPolicyFilterResponse defaults) {
            $ = new BlobInventoryPolicyFilterResponse(Objects.requireNonNull(defaults));
        }

        public Builder blobTypes(List<String> blobTypes) {
            $.blobTypes = blobTypes;
            return this;
        }

        public Builder blobTypes(String... blobTypes) {
            return blobTypes(List.of(blobTypes));
        }

        public Builder includeBlobVersions(@Nullable Boolean includeBlobVersions) {
            $.includeBlobVersions = includeBlobVersions;
            return this;
        }

        public Builder includeSnapshots(@Nullable Boolean includeSnapshots) {
            $.includeSnapshots = includeSnapshots;
            return this;
        }

        public Builder prefixMatch(@Nullable List<String> prefixMatch) {
            $.prefixMatch = prefixMatch;
            return this;
        }

        public Builder prefixMatch(String... prefixMatch) {
            return prefixMatch(List.of(prefixMatch));
        }

        public BlobInventoryPolicyFilterResponse build() {
            $.blobTypes = Objects.requireNonNull($.blobTypes, "expected parameter 'blobTypes' to be non-null");
            return $;
        }
    }

}

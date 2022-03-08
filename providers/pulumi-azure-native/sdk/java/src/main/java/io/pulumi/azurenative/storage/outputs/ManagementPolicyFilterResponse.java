// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.TagFilterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementPolicyFilterResponse {
    /**
     * An array of blob index tag based filters, there can be at most 10 tag filters
     * 
     */
    private final @Nullable List<TagFilterResponse> blobIndexMatch;
    /**
     * An array of predefined enum values. Currently blockBlob supports all tiering and delete actions. Only delete actions are supported for appendBlob.
     * 
     */
    private final List<String> blobTypes;
    /**
     * An array of strings for prefixes to be match.
     * 
     */
    private final @Nullable List<String> prefixMatch;

    @OutputCustomType.Constructor({"blobIndexMatch","blobTypes","prefixMatch"})
    private ManagementPolicyFilterResponse(
        @Nullable List<TagFilterResponse> blobIndexMatch,
        List<String> blobTypes,
        @Nullable List<String> prefixMatch) {
        this.blobIndexMatch = blobIndexMatch;
        this.blobTypes = blobTypes;
        this.prefixMatch = prefixMatch;
    }

    /**
     * An array of blob index tag based filters, there can be at most 10 tag filters
     * 
    */
    public List<TagFilterResponse> getBlobIndexMatch() {
        return this.blobIndexMatch == null ? List.of() : this.blobIndexMatch;
    }
    /**
     * An array of predefined enum values. Currently blockBlob supports all tiering and delete actions. Only delete actions are supported for appendBlob.
     * 
    */
    public List<String> getBlobTypes() {
        return this.blobTypes;
    }
    /**
     * An array of strings for prefixes to be match.
     * 
    */
    public List<String> getPrefixMatch() {
        return this.prefixMatch == null ? List.of() : this.prefixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TagFilterResponse> blobIndexMatch;
        private List<String> blobTypes;
        private @Nullable List<String> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobIndexMatch = defaults.blobIndexMatch;
    	      this.blobTypes = defaults.blobTypes;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder setBlobIndexMatch(@Nullable List<TagFilterResponse> blobIndexMatch) {
            this.blobIndexMatch = blobIndexMatch;
            return this;
        }

        public Builder setBlobTypes(List<String> blobTypes) {
            this.blobTypes = Objects.requireNonNull(blobTypes);
            return this;
        }

        public Builder setPrefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }
        public ManagementPolicyFilterResponse build() {
            return new ManagementPolicyFilterResponse(blobIndexMatch, blobTypes, prefixMatch);
        }
    }
}

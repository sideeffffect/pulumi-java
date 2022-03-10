// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.MetadataItemsItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MetadataResponse {
    /**
     * Specifies a fingerprint for this request, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
     * 
     */
    private final String fingerprint;
    /**
     * Array of key/value pairs. The total size of all keys and values must be less than 512 KB.
     * 
     */
    private final List<MetadataItemsItemResponse> items;
    /**
     * Type of the resource. Always compute#metadata for metadata.
     * 
     */
    private final String kind;

    @OutputCustomType.Constructor
    private MetadataResponse(
        @OutputCustomType.Parameter("fingerprint") String fingerprint,
        @OutputCustomType.Parameter("items") List<MetadataItemsItemResponse> items,
        @OutputCustomType.Parameter("kind") String kind) {
        this.fingerprint = fingerprint;
        this.items = items;
        this.kind = kind;
    }

    /**
     * Specifies a fingerprint for this request, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Array of key/value pairs. The total size of all keys and values must be less than 512 KB.
     * 
    */
    public List<MetadataItemsItemResponse> getItems() {
        return this.items;
    }
    /**
     * Type of the resource. Always compute#metadata for metadata.
     * 
    */
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fingerprint;
        private List<MetadataItemsItemResponse> items;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder items(List<MetadataItemsItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public MetadataResponse build() {
            return new MetadataResponse(fingerprint, items, kind);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2KindExpressionResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PartitionIdResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2DatastoreOptionsResponse {
    /**
     * @return The kind to process.
     * 
     */
    private final GooglePrivacyDlpV2KindExpressionResponse kind;
    /**
     * @return A partition ID identifies a grouping of entities. The grouping is always by project and namespace, however the namespace ID may be empty.
     * 
     */
    private final GooglePrivacyDlpV2PartitionIdResponse partitionId;

    @CustomType.Constructor
    private GooglePrivacyDlpV2DatastoreOptionsResponse(
        @CustomType.Parameter("kind") GooglePrivacyDlpV2KindExpressionResponse kind,
        @CustomType.Parameter("partitionId") GooglePrivacyDlpV2PartitionIdResponse partitionId) {
        this.kind = kind;
        this.partitionId = partitionId;
    }

    /**
     * @return The kind to process.
     * 
     */
    public GooglePrivacyDlpV2KindExpressionResponse kind() {
        return this.kind;
    }
    /**
     * @return A partition ID identifies a grouping of entities. The grouping is always by project and namespace, however the namespace ID may be empty.
     * 
     */
    public GooglePrivacyDlpV2PartitionIdResponse partitionId() {
        return this.partitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DatastoreOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2KindExpressionResponse kind;
        private GooglePrivacyDlpV2PartitionIdResponse partitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DatastoreOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.partitionId = defaults.partitionId;
        }

        public Builder kind(GooglePrivacyDlpV2KindExpressionResponse kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder partitionId(GooglePrivacyDlpV2PartitionIdResponse partitionId) {
            this.partitionId = Objects.requireNonNull(partitionId);
            return this;
        }        public GooglePrivacyDlpV2DatastoreOptionsResponse build() {
            return new GooglePrivacyDlpV2DatastoreOptionsResponse(kind, partitionId);
        }
    }
}

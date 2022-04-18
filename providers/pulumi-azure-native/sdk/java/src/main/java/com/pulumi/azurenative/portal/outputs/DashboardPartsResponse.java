// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.outputs;

import com.pulumi.azurenative.portal.outputs.DashboardPartsResponsePosition;
import com.pulumi.azurenative.portal.outputs.MarkdownPartMetadataResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardPartsResponse {
    /**
     * The dashboard part's metadata.
     * 
     */
    private final @Nullable MarkdownPartMetadataResponse metadata;
    /**
     * The dashboard's part position.
     * 
     */
    private final DashboardPartsResponsePosition position;

    @CustomType.Constructor
    private DashboardPartsResponse(
        @CustomType.Parameter("metadata") @Nullable MarkdownPartMetadataResponse metadata,
        @CustomType.Parameter("position") DashboardPartsResponsePosition position) {
        this.metadata = metadata;
        this.position = position;
    }

    /**
     * The dashboard part's metadata.
     * 
    */
    public Optional<MarkdownPartMetadataResponse> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The dashboard's part position.
     * 
    */
    public DashboardPartsResponsePosition position() {
        return this.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPartsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MarkdownPartMetadataResponse metadata;
        private DashboardPartsResponsePosition position;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPartsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.position = defaults.position;
        }

        public Builder metadata(@Nullable MarkdownPartMetadataResponse metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder position(DashboardPartsResponsePosition position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }        public DashboardPartsResponse build() {
            return new DashboardPartsResponse(metadata, position);
        }
    }
}

// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.myedgeorder.outputs.ProductFamilyResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListProductFamiliesResult {
    /**
     * Link for the next set of product families.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * List of product families.
     * 
     */
    private final List<ProductFamilyResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListProductFamiliesResult(
        @Nullable String nextLink,
        List<ProductFamilyResponse> value) {
        this.nextLink = nextLink;
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Link for the next set of product families.
     * 
     */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * List of product families.
     * 
     */
    public List<ProductFamilyResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListProductFamiliesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private List<ProductFamilyResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListProductFamiliesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(List<ProductFamilyResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ListProductFamiliesResult build() {
            return new ListProductFamiliesResult(nextLink, value);
        }
    }
}

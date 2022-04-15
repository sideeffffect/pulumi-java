// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.aws.emr.outputs.GetReleaseLabelsFilters;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReleaseLabelsResult {
    private final @Nullable GetReleaseLabelsFilters filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The returned release labels.
     * 
     */
    private final List<String> releaseLabels;

    @CustomType.Constructor
    private GetReleaseLabelsResult(
        @CustomType.Parameter("filters") @Nullable GetReleaseLabelsFilters filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("releaseLabels") List<String> releaseLabels) {
        this.filters = filters;
        this.id = id;
        this.releaseLabels = releaseLabels;
    }

    public Optional<GetReleaseLabelsFilters> filters() {
        return Optional.ofNullable(this.filters);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The returned release labels.
     * 
    */
    public List<String> releaseLabels() {
        return this.releaseLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReleaseLabelsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetReleaseLabelsFilters filters;
        private String id;
        private List<String> releaseLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReleaseLabelsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.releaseLabels = defaults.releaseLabels;
        }

        public Builder filters(@Nullable GetReleaseLabelsFilters filters) {
            this.filters = filters;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder releaseLabels(List<String> releaseLabels) {
            this.releaseLabels = Objects.requireNonNull(releaseLabels);
            return this;
        }
        public Builder releaseLabels(String... releaseLabels) {
            return releaseLabels(List.of(releaseLabels));
        }        public GetReleaseLabelsResult build() {
            return new GetReleaseLabelsResult(filters, id, releaseLabels);
        }
    }
}

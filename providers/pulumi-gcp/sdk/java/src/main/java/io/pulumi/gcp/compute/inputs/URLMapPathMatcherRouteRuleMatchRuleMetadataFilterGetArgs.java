// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs Empty = new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs();

    /**
     * The list of label value pairs that must match labels in the provided metadata
     * based on filterMatchCriteria  This list must not be empty and can have at the
     * most 64 entries.
     * Structure is documented below.
     * 
     */
    @Import(name="filterLabels", required=true)
      private final Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs>> filterLabels;

    public Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs>> filterLabels() {
        return this.filterLabels;
    }

    /**
     * Specifies how individual filterLabel matches within the list of filterLabels
     * contribute towards the overall metadataFilter match. Supported values are:
     * - MATCH_ANY: At least one of the filterLabels must have a matching label in the
     *   provided metadata.
     * - MATCH_ALL: All filterLabels must have matching labels in
     *   the provided metadata.
     *   Possible values are `MATCH_ALL` and `MATCH_ANY`.
     * 
     */
    @Import(name="filterMatchCriteria", required=true)
      private final Output<String> filterMatchCriteria;

    public Output<String> filterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs(
        Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs>> filterLabels,
        Output<String> filterMatchCriteria) {
        this.filterLabels = Objects.requireNonNull(filterLabels, "expected parameter 'filterLabels' to be non-null");
        this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria, "expected parameter 'filterMatchCriteria' to be non-null");
    }

    private URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs() {
        this.filterLabels = Codegen.empty();
        this.filterMatchCriteria = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs>> filterLabels;
        private Output<String> filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder filterLabels(Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs>> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }
        public Builder filterLabels(List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs> filterLabels) {
            this.filterLabels = Output.of(Objects.requireNonNull(filterLabels));
            return this;
        }
        public Builder filterLabels(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelGetArgs... filterLabels) {
            return filterLabels(List.of(filterLabels));
        }
        public Builder filterMatchCriteria(Output<String> filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }
        public Builder filterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Output.of(Objects.requireNonNull(filterMatchCriteria));
            return this;
        }        public URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs build() {
            return new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterGetArgs(filterLabels, filterMatchCriteria);
        }
    }
}

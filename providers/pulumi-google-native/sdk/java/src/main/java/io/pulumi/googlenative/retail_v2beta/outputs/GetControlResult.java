// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaSearchRequestFacetSpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetControlResult {
    /**
     * List of serving configuration ids that that are associated with this control. Note the association is managed via the ServingConfig, this is an output only denormalizeed view. Assumed to be in the same catalog.
     * 
     */
    private final List<String> associatedServingConfigIds;
    /**
     * The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
     */
    private final String displayName;
    /**
     * A facet specification to perform faceted search.
     * 
     */
    private final GoogleCloudRetailV2betaSearchRequestFacetSpecResponse facetSpec;
    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
     * 
     */
    private final String name;
    /**
     * A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost "gShoe" when query full matches "Running Shoes".
     * 
     */
    private final GoogleCloudRetailV2betaRuleResponse rule;
    /**
     * Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
     */
    private final List<String> solutionTypes;

    @OutputCustomType.Constructor
    private GetControlResult(
        @OutputCustomType.Parameter("associatedServingConfigIds") List<String> associatedServingConfigIds,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("facetSpec") GoogleCloudRetailV2betaSearchRequestFacetSpecResponse facetSpec,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("rule") GoogleCloudRetailV2betaRuleResponse rule,
        @OutputCustomType.Parameter("solutionTypes") List<String> solutionTypes) {
        this.associatedServingConfigIds = associatedServingConfigIds;
        this.displayName = displayName;
        this.facetSpec = facetSpec;
        this.name = name;
        this.rule = rule;
        this.solutionTypes = solutionTypes;
    }

    /**
     * List of serving configuration ids that that are associated with this control. Note the association is managed via the ServingConfig, this is an output only denormalizeed view. Assumed to be in the same catalog.
     * 
    */
    public List<String> getAssociatedServingConfigIds() {
        return this.associatedServingConfigIds;
    }
    /**
     * The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * A facet specification to perform faceted search.
     * 
    */
    public GoogleCloudRetailV2betaSearchRequestFacetSpecResponse getFacetSpec() {
        return this.facetSpec;
    }
    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost "gShoe" when query full matches "Running Shoes".
     * 
    */
    public GoogleCloudRetailV2betaRuleResponse getRule() {
        return this.rule;
    }
    /**
     * Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
    */
    public List<String> getSolutionTypes() {
        return this.solutionTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> associatedServingConfigIds;
        private String displayName;
        private GoogleCloudRetailV2betaSearchRequestFacetSpecResponse facetSpec;
        private String name;
        private GoogleCloudRetailV2betaRuleResponse rule;
        private List<String> solutionTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetControlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedServingConfigIds = defaults.associatedServingConfigIds;
    	      this.displayName = defaults.displayName;
    	      this.facetSpec = defaults.facetSpec;
    	      this.name = defaults.name;
    	      this.rule = defaults.rule;
    	      this.solutionTypes = defaults.solutionTypes;
        }

        public Builder associatedServingConfigIds(List<String> associatedServingConfigIds) {
            this.associatedServingConfigIds = Objects.requireNonNull(associatedServingConfigIds);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder facetSpec(GoogleCloudRetailV2betaSearchRequestFacetSpecResponse facetSpec) {
            this.facetSpec = Objects.requireNonNull(facetSpec);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder rule(GoogleCloudRetailV2betaRuleResponse rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public Builder solutionTypes(List<String> solutionTypes) {
            this.solutionTypes = Objects.requireNonNull(solutionTypes);
            return this;
        }
        public GetControlResult build() {
            return new GetControlResult(associatedServingConfigIds, displayName, facetSpec, name, rule, solutionTypes);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServingConfigResult {
    /**
     * Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 10. Notice that if both ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> boostControlIds;
    /**
     * The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final String displayName;
    /**
     * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity' * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    private final String diversityLevel;
    /**
     * Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> doNotAssociateControlIds;
    /**
     * The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec;
    /**
     * Whether to add additional category filters on the 'similar-items' model. If not specified, we enable it by default. Allowed values are: * 'no-category-match': No additional filtering of original results from the model and the customer's filters. * 'relaxed-category-match': Only keep results with categories that match at least one item categories in the PredictRequests's context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    private final String enableCategoryFilterLevel;
    /**
     * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> facetControlIds;
    /**
     * Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> filterControlIds;
    /**
     * Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> ignoreControlIds;
    /**
     * The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    private final String modelId;
    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}servingConfig/*
     * 
     */
    private final String name;
    /**
     * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> onewaySynonymsControlIds;
    /**
     * How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-reranking' If not specified, we choose default based on model type. Default value: 'no-price-reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    private final String priceRerankingLevel;
    /**
     * Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> redirectControlIds;
    /**
     * Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> replacementControlIds;
    /**
     * Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
     * 
     */
    private final List<String> solutionTypes;
    /**
     * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    private final List<String> twowaySynonymsControlIds;

    @OutputCustomType.Constructor
    private GetServingConfigResult(
        @OutputCustomType.Parameter("boostControlIds") List<String> boostControlIds,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("diversityLevel") String diversityLevel,
        @OutputCustomType.Parameter("doNotAssociateControlIds") List<String> doNotAssociateControlIds,
        @OutputCustomType.Parameter("dynamicFacetSpec") GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec,
        @OutputCustomType.Parameter("enableCategoryFilterLevel") String enableCategoryFilterLevel,
        @OutputCustomType.Parameter("facetControlIds") List<String> facetControlIds,
        @OutputCustomType.Parameter("filterControlIds") List<String> filterControlIds,
        @OutputCustomType.Parameter("ignoreControlIds") List<String> ignoreControlIds,
        @OutputCustomType.Parameter("modelId") String modelId,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("onewaySynonymsControlIds") List<String> onewaySynonymsControlIds,
        @OutputCustomType.Parameter("priceRerankingLevel") String priceRerankingLevel,
        @OutputCustomType.Parameter("redirectControlIds") List<String> redirectControlIds,
        @OutputCustomType.Parameter("replacementControlIds") List<String> replacementControlIds,
        @OutputCustomType.Parameter("solutionTypes") List<String> solutionTypes,
        @OutputCustomType.Parameter("twowaySynonymsControlIds") List<String> twowaySynonymsControlIds) {
        this.boostControlIds = boostControlIds;
        this.displayName = displayName;
        this.diversityLevel = diversityLevel;
        this.doNotAssociateControlIds = doNotAssociateControlIds;
        this.dynamicFacetSpec = dynamicFacetSpec;
        this.enableCategoryFilterLevel = enableCategoryFilterLevel;
        this.facetControlIds = facetControlIds;
        this.filterControlIds = filterControlIds;
        this.ignoreControlIds = ignoreControlIds;
        this.modelId = modelId;
        this.name = name;
        this.onewaySynonymsControlIds = onewaySynonymsControlIds;
        this.priceRerankingLevel = priceRerankingLevel;
        this.redirectControlIds = redirectControlIds;
        this.replacementControlIds = replacementControlIds;
        this.solutionTypes = solutionTypes;
        this.twowaySynonymsControlIds = twowaySynonymsControlIds;
    }

    /**
     * Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 10. Notice that if both ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getBoostControlIds() {
        return this.boostControlIds;
    }
    /**
     * The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity' * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
    */
    public String getDiversityLevel() {
        return this.diversityLevel;
    }
    /**
     * Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getDoNotAssociateControlIds() {
        return this.doNotAssociateControlIds;
    }
    /**
     * The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse getDynamicFacetSpec() {
        return this.dynamicFacetSpec;
    }
    /**
     * Whether to add additional category filters on the 'similar-items' model. If not specified, we enable it by default. Allowed values are: * 'no-category-match': No additional filtering of original results from the model and the customer's filters. * 'relaxed-category-match': Only keep results with categories that match at least one item categories in the PredictRequests's context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
    */
    public String getEnableCategoryFilterLevel() {
        return this.enableCategoryFilterLevel;
    }
    /**
     * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getFacetControlIds() {
        return this.facetControlIds;
    }
    /**
     * Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getFilterControlIds() {
        return this.filterControlIds;
    }
    /**
     * Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getIgnoreControlIds() {
        return this.ignoreControlIds;
    }
    /**
     * The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
    */
    public String getModelId() {
        return this.modelId;
    }
    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}servingConfig/*
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getOnewaySynonymsControlIds() {
        return this.onewaySynonymsControlIds;
    }
    /**
     * How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-reranking' If not specified, we choose default based on model type. Default value: 'no-price-reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
    */
    public String getPriceRerankingLevel() {
        return this.priceRerankingLevel;
    }
    /**
     * Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getRedirectControlIds() {
        return this.redirectControlIds;
    }
    /**
     * Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getReplacementControlIds() {
        return this.replacementControlIds;
    }
    /**
     * Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
     * 
    */
    public List<String> getSolutionTypes() {
        return this.solutionTypes;
    }
    /**
     * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
    */
    public List<String> getTwowaySynonymsControlIds() {
        return this.twowaySynonymsControlIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServingConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> boostControlIds;
        private String displayName;
        private String diversityLevel;
        private List<String> doNotAssociateControlIds;
        private GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec;
        private String enableCategoryFilterLevel;
        private List<String> facetControlIds;
        private List<String> filterControlIds;
        private List<String> ignoreControlIds;
        private String modelId;
        private String name;
        private List<String> onewaySynonymsControlIds;
        private String priceRerankingLevel;
        private List<String> redirectControlIds;
        private List<String> replacementControlIds;
        private List<String> solutionTypes;
        private List<String> twowaySynonymsControlIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServingConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boostControlIds = defaults.boostControlIds;
    	      this.displayName = defaults.displayName;
    	      this.diversityLevel = defaults.diversityLevel;
    	      this.doNotAssociateControlIds = defaults.doNotAssociateControlIds;
    	      this.dynamicFacetSpec = defaults.dynamicFacetSpec;
    	      this.enableCategoryFilterLevel = defaults.enableCategoryFilterLevel;
    	      this.facetControlIds = defaults.facetControlIds;
    	      this.filterControlIds = defaults.filterControlIds;
    	      this.ignoreControlIds = defaults.ignoreControlIds;
    	      this.modelId = defaults.modelId;
    	      this.name = defaults.name;
    	      this.onewaySynonymsControlIds = defaults.onewaySynonymsControlIds;
    	      this.priceRerankingLevel = defaults.priceRerankingLevel;
    	      this.redirectControlIds = defaults.redirectControlIds;
    	      this.replacementControlIds = defaults.replacementControlIds;
    	      this.solutionTypes = defaults.solutionTypes;
    	      this.twowaySynonymsControlIds = defaults.twowaySynonymsControlIds;
        }

        public Builder boostControlIds(List<String> boostControlIds) {
            this.boostControlIds = Objects.requireNonNull(boostControlIds);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder diversityLevel(String diversityLevel) {
            this.diversityLevel = Objects.requireNonNull(diversityLevel);
            return this;
        }

        public Builder doNotAssociateControlIds(List<String> doNotAssociateControlIds) {
            this.doNotAssociateControlIds = Objects.requireNonNull(doNotAssociateControlIds);
            return this;
        }

        public Builder dynamicFacetSpec(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse dynamicFacetSpec) {
            this.dynamicFacetSpec = Objects.requireNonNull(dynamicFacetSpec);
            return this;
        }

        public Builder enableCategoryFilterLevel(String enableCategoryFilterLevel) {
            this.enableCategoryFilterLevel = Objects.requireNonNull(enableCategoryFilterLevel);
            return this;
        }

        public Builder facetControlIds(List<String> facetControlIds) {
            this.facetControlIds = Objects.requireNonNull(facetControlIds);
            return this;
        }

        public Builder filterControlIds(List<String> filterControlIds) {
            this.filterControlIds = Objects.requireNonNull(filterControlIds);
            return this;
        }

        public Builder ignoreControlIds(List<String> ignoreControlIds) {
            this.ignoreControlIds = Objects.requireNonNull(ignoreControlIds);
            return this;
        }

        public Builder modelId(String modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder onewaySynonymsControlIds(List<String> onewaySynonymsControlIds) {
            this.onewaySynonymsControlIds = Objects.requireNonNull(onewaySynonymsControlIds);
            return this;
        }

        public Builder priceRerankingLevel(String priceRerankingLevel) {
            this.priceRerankingLevel = Objects.requireNonNull(priceRerankingLevel);
            return this;
        }

        public Builder redirectControlIds(List<String> redirectControlIds) {
            this.redirectControlIds = Objects.requireNonNull(redirectControlIds);
            return this;
        }

        public Builder replacementControlIds(List<String> replacementControlIds) {
            this.replacementControlIds = Objects.requireNonNull(replacementControlIds);
            return this;
        }

        public Builder solutionTypes(List<String> solutionTypes) {
            this.solutionTypes = Objects.requireNonNull(solutionTypes);
            return this;
        }

        public Builder twowaySynonymsControlIds(List<String> twowaySynonymsControlIds) {
            this.twowaySynonymsControlIds = Objects.requireNonNull(twowaySynonymsControlIds);
            return this;
        }
        public GetServingConfigResult build() {
            return new GetServingConfigResult(boostControlIds, displayName, diversityLevel, doNotAssociateControlIds, dynamicFacetSpec, enableCategoryFilterLevel, facetControlIds, filterControlIds, ignoreControlIds, modelId, name, onewaySynonymsControlIds, priceRerankingLevel, redirectControlIds, replacementControlIds, solutionTypes, twowaySynonymsControlIds);
        }
    }
}

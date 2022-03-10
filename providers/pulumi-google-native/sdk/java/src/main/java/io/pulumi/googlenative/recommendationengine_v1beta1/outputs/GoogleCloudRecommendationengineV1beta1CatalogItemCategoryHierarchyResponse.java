// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse {
    /**
     * Catalog item categories. Each category should be a UTF-8 encoded string with a length limit of 2 KiB. Note that the order in the list denotes the specificity (from least to most specific).
     * 
     */
    private final List<String> categories;

    @OutputCustomType.Constructor
    private GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse(@OutputCustomType.Parameter("categories") List<String> categories) {
        this.categories = categories;
    }

    /**
     * Catalog item categories. Each category should be a UTF-8 encoded string with a length limit of 2 KiB. Note that the order in the list denotes the specificity (from least to most specific).
     * 
    */
    public List<String> getCategories() {
        return this.categories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> categories;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
        }

        public Builder categories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }
        public GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse build() {
            return new GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse(categories);
        }
    }
}

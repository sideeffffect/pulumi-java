// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.AvailabilityInformationResponse;
import io.pulumi.azurenative.edgeorder.outputs.ConfigurationResponse;
import io.pulumi.azurenative.edgeorder.outputs.CostInformationResponse;
import io.pulumi.azurenative.edgeorder.outputs.DescriptionResponse;
import io.pulumi.azurenative.edgeorder.outputs.FilterablePropertyResponse;
import io.pulumi.azurenative.edgeorder.outputs.HierarchyInformationResponse;
import io.pulumi.azurenative.edgeorder.outputs.ImageInformationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ProductResponse {
    /**
     * Availability information of the product system.
     * 
     */
    private final AvailabilityInformationResponse availabilityInformation;
    /**
     * List of configurations for the product
     * 
     */
    private final List<ConfigurationResponse> configurations;
    /**
     * Cost information for the product system.
     * 
     */
    private final CostInformationResponse costInformation;
    /**
     * Description related to the product system.
     * 
     */
    private final DescriptionResponse description;
    /**
     * Display Name for the product system.
     * 
     */
    private final String displayName;
    /**
     * list of filters supported for a product
     * 
     */
    private final List<FilterablePropertyResponse> filterableProperties;
    /**
     * Hierarchy information of a product.
     * 
     */
    private final HierarchyInformationResponse hierarchyInformation;
    /**
     * Image information for the product system.
     * 
     */
    private final List<ImageInformationResponse> imageInformation;

    @OutputCustomType.Constructor
    private ProductResponse(
        @OutputCustomType.Parameter("availabilityInformation") AvailabilityInformationResponse availabilityInformation,
        @OutputCustomType.Parameter("configurations") List<ConfigurationResponse> configurations,
        @OutputCustomType.Parameter("costInformation") CostInformationResponse costInformation,
        @OutputCustomType.Parameter("description") DescriptionResponse description,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("filterableProperties") List<FilterablePropertyResponse> filterableProperties,
        @OutputCustomType.Parameter("hierarchyInformation") HierarchyInformationResponse hierarchyInformation,
        @OutputCustomType.Parameter("imageInformation") List<ImageInformationResponse> imageInformation) {
        this.availabilityInformation = availabilityInformation;
        this.configurations = configurations;
        this.costInformation = costInformation;
        this.description = description;
        this.displayName = displayName;
        this.filterableProperties = filterableProperties;
        this.hierarchyInformation = hierarchyInformation;
        this.imageInformation = imageInformation;
    }

    /**
     * Availability information of the product system.
     * 
    */
    public AvailabilityInformationResponse getAvailabilityInformation() {
        return this.availabilityInformation;
    }
    /**
     * List of configurations for the product
     * 
    */
    public List<ConfigurationResponse> getConfigurations() {
        return this.configurations;
    }
    /**
     * Cost information for the product system.
     * 
    */
    public CostInformationResponse getCostInformation() {
        return this.costInformation;
    }
    /**
     * Description related to the product system.
     * 
    */
    public DescriptionResponse getDescription() {
        return this.description;
    }
    /**
     * Display Name for the product system.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * list of filters supported for a product
     * 
    */
    public List<FilterablePropertyResponse> getFilterableProperties() {
        return this.filterableProperties;
    }
    /**
     * Hierarchy information of a product.
     * 
    */
    public HierarchyInformationResponse getHierarchyInformation() {
        return this.hierarchyInformation;
    }
    /**
     * Image information for the product system.
     * 
    */
    public List<ImageInformationResponse> getImageInformation() {
        return this.imageInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private List<ConfigurationResponse> configurations;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.configurations = defaults.configurations;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
        }

        public Builder availabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
            return this;
        }

        public Builder configurations(List<ConfigurationResponse> configurations) {
            this.configurations = Objects.requireNonNull(configurations);
            return this;
        }

        public Builder costInformation(CostInformationResponse costInformation) {
            this.costInformation = Objects.requireNonNull(costInformation);
            return this;
        }

        public Builder description(DescriptionResponse description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder filterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            this.filterableProperties = Objects.requireNonNull(filterableProperties);
            return this;
        }

        public Builder hierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }

        public Builder imageInformation(List<ImageInformationResponse> imageInformation) {
            this.imageInformation = Objects.requireNonNull(imageInformation);
            return this;
        }
        public ProductResponse build() {
            return new ProductResponse(availabilityInformation, configurations, costInformation, description, displayName, filterableProperties, hierarchyInformation, imageInformation);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceTypeOfferingsResult {
    private final @Nullable List<GetInstanceTypeOfferingsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return List of EC2 Instance Types.
     * 
     */
    private final List<String> instanceTypes;
    private final @Nullable String locationType;
    /**
     * @return List of location types.
     * 
     */
    private final List<String> locationTypes;
    /**
     * @return List of locations.
     * 
     */
    private final List<String> locations;

    @CustomType.Constructor
    private GetInstanceTypeOfferingsResult(
        @CustomType.Parameter("filters") @Nullable List<GetInstanceTypeOfferingsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceTypes") List<String> instanceTypes,
        @CustomType.Parameter("locationType") @Nullable String locationType,
        @CustomType.Parameter("locationTypes") List<String> locationTypes,
        @CustomType.Parameter("locations") List<String> locations) {
        this.filters = filters;
        this.id = id;
        this.instanceTypes = instanceTypes;
        this.locationType = locationType;
        this.locationTypes = locationTypes;
        this.locations = locations;
    }

    public List<GetInstanceTypeOfferingsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of EC2 Instance Types.
     * 
     */
    public List<String> instanceTypes() {
        return this.instanceTypes;
    }
    public Optional<String> locationType() {
        return Optional.ofNullable(this.locationType);
    }
    /**
     * @return List of location types.
     * 
     */
    public List<String> locationTypes() {
        return this.locationTypes;
    }
    /**
     * @return List of locations.
     * 
     */
    public List<String> locations() {
        return this.locations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeOfferingsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetInstanceTypeOfferingsFilter> filters;
        private String id;
        private List<String> instanceTypes;
        private @Nullable String locationType;
        private List<String> locationTypes;
        private List<String> locations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypeOfferingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.locationType = defaults.locationType;
    	      this.locationTypes = defaults.locationTypes;
    	      this.locations = defaults.locations;
        }

        public Builder filters(@Nullable List<GetInstanceTypeOfferingsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInstanceTypeOfferingsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceTypes(List<String> instanceTypes) {
            this.instanceTypes = Objects.requireNonNull(instanceTypes);
            return this;
        }
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        public Builder locationType(@Nullable String locationType) {
            this.locationType = locationType;
            return this;
        }
        public Builder locationTypes(List<String> locationTypes) {
            this.locationTypes = Objects.requireNonNull(locationTypes);
            return this;
        }
        public Builder locationTypes(String... locationTypes) {
            return locationTypes(List.of(locationTypes));
        }
        public Builder locations(List<String> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }        public GetInstanceTypeOfferingsResult build() {
            return new GetInstanceTypeOfferingsResult(filters, id, instanceTypes, locationType, locationTypes, locations);
        }
    }
}

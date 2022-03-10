// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.DynamicDeliveryAttributeMappingResponse;
import io.pulumi.azurenative.eventgrid.outputs.StaticDeliveryAttributeMappingResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPartnerTopicEventSubscriptionDeliveryAttributesResult {
    /**
     * A collection of DeliveryAttributeMapping
     * 
     */
    private final @Nullable List<Either<DynamicDeliveryAttributeMappingResponse,StaticDeliveryAttributeMappingResponse>> value;

    @OutputCustomType.Constructor
    private GetPartnerTopicEventSubscriptionDeliveryAttributesResult(@OutputCustomType.Parameter("value") @Nullable List<Either<DynamicDeliveryAttributeMappingResponse,StaticDeliveryAttributeMappingResponse>> value) {
        this.value = value;
    }

    /**
     * A collection of DeliveryAttributeMapping
     * 
    */
    public List<Either<DynamicDeliveryAttributeMappingResponse,StaticDeliveryAttributeMappingResponse>> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerTopicEventSubscriptionDeliveryAttributesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Either<DynamicDeliveryAttributeMappingResponse,StaticDeliveryAttributeMappingResponse>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerTopicEventSubscriptionDeliveryAttributesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable List<Either<DynamicDeliveryAttributeMappingResponse,StaticDeliveryAttributeMappingResponse>> value) {
            this.value = value;
            return this;
        }
        public GetPartnerTopicEventSubscriptionDeliveryAttributesResult build() {
            return new GetPartnerTopicEventSubscriptionDeliveryAttributesResult(value);
        }
    }
}

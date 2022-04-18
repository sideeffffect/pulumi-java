// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.InternetGatewayTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInternetGatewayResult {
    /**
     * ID of internet gateway.
     * 
     */
    private final @Nullable String internetGatewayId;
    /**
     * Any tags to assign to the internet gateway.
     * 
     */
    private final @Nullable List<InternetGatewayTag> tags;

    @CustomType.Constructor
    private GetInternetGatewayResult(
        @CustomType.Parameter("internetGatewayId") @Nullable String internetGatewayId,
        @CustomType.Parameter("tags") @Nullable List<InternetGatewayTag> tags) {
        this.internetGatewayId = internetGatewayId;
        this.tags = tags;
    }

    /**
     * ID of internet gateway.
     * 
    */
    public Optional<String> internetGatewayId() {
        return Optional.ofNullable(this.internetGatewayId);
    }
    /**
     * Any tags to assign to the internet gateway.
     * 
    */
    public List<InternetGatewayTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInternetGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String internetGatewayId;
        private @Nullable List<InternetGatewayTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInternetGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internetGatewayId = defaults.internetGatewayId;
    	      this.tags = defaults.tags;
        }

        public Builder internetGatewayId(@Nullable String internetGatewayId) {
            this.internetGatewayId = internetGatewayId;
            return this;
        }
        public Builder tags(@Nullable List<InternetGatewayTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(InternetGatewayTag... tags) {
            return tags(List.of(tags));
        }        public GetInternetGatewayResult build() {
            return new GetInternetGatewayResult(internetGatewayId, tags);
        }
    }
}

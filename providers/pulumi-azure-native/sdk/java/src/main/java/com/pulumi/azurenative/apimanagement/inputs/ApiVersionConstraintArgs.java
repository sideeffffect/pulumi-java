// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Control Plane Apis version constraint for the API Management service.
 * 
 */
public final class ApiVersionConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiVersionConstraintArgs Empty = new ApiVersionConstraintArgs();

    /**
     * Limit control plane API calls to API Management service with version equal to or newer than this value.
     * 
     */
    @Import(name="minApiVersion")
    private @Nullable Output<String> minApiVersion;

    /**
     * @return Limit control plane API calls to API Management service with version equal to or newer than this value.
     * 
     */
    public Optional<Output<String>> minApiVersion() {
        return Optional.ofNullable(this.minApiVersion);
    }

    private ApiVersionConstraintArgs() {}

    private ApiVersionConstraintArgs(ApiVersionConstraintArgs $) {
        this.minApiVersion = $.minApiVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiVersionConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiVersionConstraintArgs $;

        public Builder() {
            $ = new ApiVersionConstraintArgs();
        }

        public Builder(ApiVersionConstraintArgs defaults) {
            $ = new ApiVersionConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minApiVersion Limit control plane API calls to API Management service with version equal to or newer than this value.
         * 
         * @return builder
         * 
         */
        public Builder minApiVersion(@Nullable Output<String> minApiVersion) {
            $.minApiVersion = minApiVersion;
            return this;
        }

        /**
         * @param minApiVersion Limit control plane API calls to API Management service with version equal to or newer than this value.
         * 
         * @return builder
         * 
         */
        public Builder minApiVersion(String minApiVersion) {
            return minApiVersion(Output.of(minApiVersion));
        }

        public ApiVersionConstraintArgs build() {
            return $;
        }
    }

}

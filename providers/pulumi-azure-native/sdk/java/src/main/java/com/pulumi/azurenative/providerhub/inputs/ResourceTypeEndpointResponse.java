// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.ResourceTypeEndpointResponseFeaturesRule;
import com.pulumi.azurenative.providerhub.inputs.ResourceTypeExtensionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceTypeEndpointResponse Empty = new ResourceTypeEndpointResponse();

    @Import(name="apiVersions")
    private @Nullable List<String> apiVersions;

    public Optional<List<String>> apiVersions() {
        return Optional.ofNullable(this.apiVersions);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="extensions")
    private @Nullable List<ResourceTypeExtensionResponse> extensions;

    public Optional<List<ResourceTypeExtensionResponse>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    @Import(name="featuresRule")
    private @Nullable ResourceTypeEndpointResponseFeaturesRule featuresRule;

    public Optional<ResourceTypeEndpointResponseFeaturesRule> featuresRule() {
        return Optional.ofNullable(this.featuresRule);
    }

    @Import(name="locations")
    private @Nullable List<String> locations;

    public Optional<List<String>> locations() {
        return Optional.ofNullable(this.locations);
    }

    @Import(name="requiredFeatures")
    private @Nullable List<String> requiredFeatures;

    public Optional<List<String>> requiredFeatures() {
        return Optional.ofNullable(this.requiredFeatures);
    }

    @Import(name="timeout")
    private @Nullable String timeout;

    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ResourceTypeEndpointResponse() {}

    private ResourceTypeEndpointResponse(ResourceTypeEndpointResponse $) {
        this.apiVersions = $.apiVersions;
        this.enabled = $.enabled;
        this.extensions = $.extensions;
        this.featuresRule = $.featuresRule;
        this.locations = $.locations;
        this.requiredFeatures = $.requiredFeatures;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceTypeEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceTypeEndpointResponse $;

        public Builder() {
            $ = new ResourceTypeEndpointResponse();
        }

        public Builder(ResourceTypeEndpointResponse defaults) {
            $ = new ResourceTypeEndpointResponse(Objects.requireNonNull(defaults));
        }

        public Builder apiVersions(@Nullable List<String> apiVersions) {
            $.apiVersions = apiVersions;
            return this;
        }

        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder extensions(@Nullable List<ResourceTypeExtensionResponse> extensions) {
            $.extensions = extensions;
            return this;
        }

        public Builder extensions(ResourceTypeExtensionResponse... extensions) {
            return extensions(List.of(extensions));
        }

        public Builder featuresRule(@Nullable ResourceTypeEndpointResponseFeaturesRule featuresRule) {
            $.featuresRule = featuresRule;
            return this;
        }

        public Builder locations(@Nullable List<String> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        public Builder requiredFeatures(@Nullable List<String> requiredFeatures) {
            $.requiredFeatures = requiredFeatures;
            return this;
        }

        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }

        public Builder timeout(@Nullable String timeout) {
            $.timeout = timeout;
            return this;
        }

        public ResourceTypeEndpointResponse build() {
            return $;
        }
    }

}

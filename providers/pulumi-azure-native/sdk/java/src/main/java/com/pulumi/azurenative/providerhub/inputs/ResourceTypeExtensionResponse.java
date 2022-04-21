// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeExtensionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceTypeExtensionResponse Empty = new ResourceTypeExtensionResponse();

    @Import(name="endpointUri")
    private @Nullable String endpointUri;

    public Optional<String> endpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }

    @Import(name="extensionCategories")
    private @Nullable List<String> extensionCategories;

    public Optional<List<String>> extensionCategories() {
        return Optional.ofNullable(this.extensionCategories);
    }

    @Import(name="timeout")
    private @Nullable String timeout;

    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ResourceTypeExtensionResponse() {}

    private ResourceTypeExtensionResponse(ResourceTypeExtensionResponse $) {
        this.endpointUri = $.endpointUri;
        this.extensionCategories = $.extensionCategories;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceTypeExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceTypeExtensionResponse $;

        public Builder() {
            $ = new ResourceTypeExtensionResponse();
        }

        public Builder(ResourceTypeExtensionResponse defaults) {
            $ = new ResourceTypeExtensionResponse(Objects.requireNonNull(defaults));
        }

        public Builder endpointUri(@Nullable String endpointUri) {
            $.endpointUri = endpointUri;
            return this;
        }

        public Builder extensionCategories(@Nullable List<String> extensionCategories) {
            $.extensionCategories = extensionCategories;
            return this;
        }

        public Builder extensionCategories(String... extensionCategories) {
            return extensionCategories(List.of(extensionCategories));
        }

        public Builder timeout(@Nullable String timeout) {
            $.timeout = timeout;
            return this;
        }

        public ResourceTypeExtensionResponse build() {
            return $;
        }
    }

}

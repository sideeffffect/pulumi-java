// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub;

import com.pulumi.azurenative.providerhub.inputs.SkuResourcePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SkusArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkusArgs Empty = new SkusArgs();

    @Import(name="properties")
    private @Nullable Output<SkuResourcePropertiesArgs> properties;

    public Optional<Output<SkuResourcePropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @Import(name="providerNamespace", required=true)
    private Output<String> providerNamespace;

    public Output<String> providerNamespace() {
        return this.providerNamespace;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * The SKU.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    private SkusArgs() {}

    private SkusArgs(SkusArgs $) {
        this.properties = $.properties;
        this.providerNamespace = $.providerNamespace;
        this.resourceType = $.resourceType;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkusArgs $;

        public Builder() {
            $ = new SkusArgs();
        }

        public Builder(SkusArgs defaults) {
            $ = new SkusArgs(Objects.requireNonNull(defaults));
        }

        public Builder properties(@Nullable Output<SkuResourcePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(SkuResourcePropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder providerNamespace(Output<String> providerNamespace) {
            $.providerNamespace = providerNamespace;
            return this;
        }

        public Builder providerNamespace(String providerNamespace) {
            return providerNamespace(Output.of(providerNamespace));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public SkusArgs build() {
            $.providerNamespace = Objects.requireNonNull($.providerNamespace, "expected parameter 'providerNamespace' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}

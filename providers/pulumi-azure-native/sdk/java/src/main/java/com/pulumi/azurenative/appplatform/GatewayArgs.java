// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.appplatform.inputs.GatewayPropertiesArgs;
import com.pulumi.azurenative.appplatform.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * The name of Spring Cloud Gateway.
     * 
     */
    @Import(name="gatewayName")
      private final @Nullable Output<String> gatewayName;

    public Output<String> gatewayName() {
        return this.gatewayName == null ? Codegen.empty() : this.gatewayName;
    }

    /**
     * Spring Cloud Gateway properties payload
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<GatewayPropertiesArgs> properties;

    public Output<GatewayPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Sku of the Spring Cloud Gateway resource
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    public GatewayArgs(
        @Nullable Output<String> gatewayName,
        @Nullable Output<GatewayPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        @Nullable Output<SkuArgs> sku) {
        this.gatewayName = gatewayName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.sku = sku;
    }

    private GatewayArgs() {
        this.gatewayName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.sku = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gatewayName;
        private @Nullable Output<GatewayPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private @Nullable Output<SkuArgs> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayName = defaults.gatewayName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.sku = defaults.sku;
        }

        public Builder gatewayName(@Nullable Output<String> gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public Builder gatewayName(@Nullable String gatewayName) {
            this.gatewayName = Codegen.ofNullable(gatewayName);
            return this;
        }
        public Builder properties(@Nullable Output<GatewayPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable GatewayPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }        public GatewayArgs build() {
            return new GatewayArgs(gatewayName, properties, resourceGroupName, serviceName, sku);
        }
    }
}

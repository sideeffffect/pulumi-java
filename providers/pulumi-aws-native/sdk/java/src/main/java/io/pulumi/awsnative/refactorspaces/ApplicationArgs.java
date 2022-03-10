// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.refactorspaces.enums.ApplicationProxyType;
import io.pulumi.awsnative.refactorspaces.inputs.ApplicationApiGatewayProxyInputArgs;
import io.pulumi.awsnative.refactorspaces.inputs.ApplicationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    @InputImport(name="apiGatewayProxy")
      private final @Nullable Input<ApplicationApiGatewayProxyInputArgs> apiGatewayProxy;

    public Input<ApplicationApiGatewayProxyInputArgs> getApiGatewayProxy() {
        return this.apiGatewayProxy == null ? Input.empty() : this.apiGatewayProxy;
    }

    @InputImport(name="environmentIdentifier")
      private final @Nullable Input<String> environmentIdentifier;

    public Input<String> getEnvironmentIdentifier() {
        return this.environmentIdentifier == null ? Input.empty() : this.environmentIdentifier;
    }

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="proxyType")
      private final @Nullable Input<ApplicationProxyType> proxyType;

    public Input<ApplicationProxyType> getProxyType() {
        return this.proxyType == null ? Input.empty() : this.proxyType;
    }

    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ApplicationTagArgs>> tags;

    public Input<List<ApplicationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public ApplicationArgs(
        @Nullable Input<ApplicationApiGatewayProxyInputArgs> apiGatewayProxy,
        @Nullable Input<String> environmentIdentifier,
        @Nullable Input<String> name,
        @Nullable Input<ApplicationProxyType> proxyType,
        @Nullable Input<List<ApplicationTagArgs>> tags,
        @Nullable Input<String> vpcId) {
        this.apiGatewayProxy = apiGatewayProxy;
        this.environmentIdentifier = environmentIdentifier;
        this.name = name;
        this.proxyType = proxyType;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private ApplicationArgs() {
        this.apiGatewayProxy = Input.empty();
        this.environmentIdentifier = Input.empty();
        this.name = Input.empty();
        this.proxyType = Input.empty();
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApiGatewayProxyInputArgs> apiGatewayProxy;
        private @Nullable Input<String> environmentIdentifier;
        private @Nullable Input<String> name;
        private @Nullable Input<ApplicationProxyType> proxyType;
        private @Nullable Input<List<ApplicationTagArgs>> tags;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGatewayProxy = defaults.apiGatewayProxy;
    	      this.environmentIdentifier = defaults.environmentIdentifier;
    	      this.name = defaults.name;
    	      this.proxyType = defaults.proxyType;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder apiGatewayProxy(@Nullable Input<ApplicationApiGatewayProxyInputArgs> apiGatewayProxy) {
            this.apiGatewayProxy = apiGatewayProxy;
            return this;
        }

        public Builder apiGatewayProxy(@Nullable ApplicationApiGatewayProxyInputArgs apiGatewayProxy) {
            this.apiGatewayProxy = Input.ofNullable(apiGatewayProxy);
            return this;
        }

        public Builder environmentIdentifier(@Nullable Input<String> environmentIdentifier) {
            this.environmentIdentifier = environmentIdentifier;
            return this;
        }

        public Builder environmentIdentifier(@Nullable String environmentIdentifier) {
            this.environmentIdentifier = Input.ofNullable(environmentIdentifier);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder proxyType(@Nullable Input<ApplicationProxyType> proxyType) {
            this.proxyType = proxyType;
            return this;
        }

        public Builder proxyType(@Nullable ApplicationProxyType proxyType) {
            this.proxyType = Input.ofNullable(proxyType);
            return this;
        }

        public Builder tags(@Nullable Input<List<ApplicationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<ApplicationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder vpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public ApplicationArgs build() {
            return new ApplicationArgs(apiGatewayProxy, environmentIdentifier, name, proxyType, tags, vpcId);
        }
    }
}

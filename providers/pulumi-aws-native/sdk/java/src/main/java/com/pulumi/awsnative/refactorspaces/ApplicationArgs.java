// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.refactorspaces;

import com.pulumi.awsnative.refactorspaces.enums.ApplicationProxyType;
import com.pulumi.awsnative.refactorspaces.inputs.ApplicationApiGatewayProxyInputArgs;
import com.pulumi.awsnative.refactorspaces.inputs.ApplicationTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    @Import(name="apiGatewayProxy")
    private @Nullable Output<ApplicationApiGatewayProxyInputArgs> apiGatewayProxy;

    public Optional<Output<ApplicationApiGatewayProxyInputArgs>> apiGatewayProxy() {
        return Optional.ofNullable(this.apiGatewayProxy);
    }

    @Import(name="environmentIdentifier")
    private @Nullable Output<String> environmentIdentifier;

    public Optional<Output<String>> environmentIdentifier() {
        return Optional.ofNullable(this.environmentIdentifier);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="proxyType")
    private @Nullable Output<ApplicationProxyType> proxyType;

    public Optional<Output<ApplicationProxyType>> proxyType() {
        return Optional.ofNullable(this.proxyType);
    }

    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ApplicationTagArgs>> tags;

    /**
     * @return Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    public Optional<Output<List<ApplicationTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.apiGatewayProxy = $.apiGatewayProxy;
        this.environmentIdentifier = $.environmentIdentifier;
        this.name = $.name;
        this.proxyType = $.proxyType;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArgs $;

        public Builder() {
            $ = new ApplicationArgs();
        }

        public Builder(ApplicationArgs defaults) {
            $ = new ApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiGatewayProxy(@Nullable Output<ApplicationApiGatewayProxyInputArgs> apiGatewayProxy) {
            $.apiGatewayProxy = apiGatewayProxy;
            return this;
        }

        public Builder apiGatewayProxy(ApplicationApiGatewayProxyInputArgs apiGatewayProxy) {
            return apiGatewayProxy(Output.of(apiGatewayProxy));
        }

        public Builder environmentIdentifier(@Nullable Output<String> environmentIdentifier) {
            $.environmentIdentifier = environmentIdentifier;
            return this;
        }

        public Builder environmentIdentifier(String environmentIdentifier) {
            return environmentIdentifier(Output.of(environmentIdentifier));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder proxyType(@Nullable Output<ApplicationProxyType> proxyType) {
            $.proxyType = proxyType;
            return this;
        }

        public Builder proxyType(ApplicationProxyType proxyType) {
            return proxyType(Output.of(proxyType));
        }

        /**
         * @param tags Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ApplicationTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ApplicationTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder tags(ApplicationTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ApplicationArgs build() {
            return $;
        }
    }

}

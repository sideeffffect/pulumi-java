// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * 
     */
    @Import(name="deploymentConfig")
    private @Nullable Output<EndpointDeploymentConfigArgs> deploymentConfig;

    public Optional<Output<EndpointDeploymentConfigArgs>> deploymentConfig() {
        return Optional.ofNullable(this.deploymentConfig);
    }

    /**
     * The name of the endpoint configuration to use.
     * 
     */
    @Import(name="endpointConfigName", required=true)
    private Output<String> endpointConfigName;

    public Output<String> endpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * The name of the endpoint.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EndpointArgs() {}

    private EndpointArgs(EndpointArgs $) {
        this.deploymentConfig = $.deploymentConfig;
        this.endpointConfigName = $.endpointConfigName;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointArgs $;

        public Builder() {
            $ = new EndpointArgs();
        }

        public Builder(EndpointArgs defaults) {
            $ = new EndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder deploymentConfig(@Nullable Output<EndpointDeploymentConfigArgs> deploymentConfig) {
            $.deploymentConfig = deploymentConfig;
            return this;
        }

        public Builder deploymentConfig(EndpointDeploymentConfigArgs deploymentConfig) {
            return deploymentConfig(Output.of(deploymentConfig));
        }

        public Builder endpointConfigName(Output<String> endpointConfigName) {
            $.endpointConfigName = endpointConfigName;
            return this;
        }

        public Builder endpointConfigName(String endpointConfigName) {
            return endpointConfigName(Output.of(endpointConfigName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public EndpointArgs build() {
            $.endpointConfigName = Objects.requireNonNull($.endpointConfigName, "expected parameter 'endpointConfigName' to be non-null");
            return $;
        }
    }

}

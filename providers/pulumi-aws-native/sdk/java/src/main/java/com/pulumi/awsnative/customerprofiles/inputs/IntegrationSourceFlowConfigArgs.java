// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.awsnative.customerprofiles.enums.IntegrationConnectorType;
import com.pulumi.awsnative.customerprofiles.inputs.IntegrationIncrementalPullConfigArgs;
import com.pulumi.awsnative.customerprofiles.inputs.IntegrationSourceConnectorPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationSourceFlowConfigArgs extends ResourceArgs {

    public static final IntegrationSourceFlowConfigArgs Empty = new IntegrationSourceFlowConfigArgs();

    @Import(name="connectorProfileName")
    private @Nullable Output<String> connectorProfileName;

    public Optional<Output<String>> connectorProfileName() {
        return Optional.ofNullable(this.connectorProfileName);
    }

    @Import(name="connectorType", required=true)
    private Output<IntegrationConnectorType> connectorType;

    public Output<IntegrationConnectorType> connectorType() {
        return this.connectorType;
    }

    @Import(name="incrementalPullConfig")
    private @Nullable Output<IntegrationIncrementalPullConfigArgs> incrementalPullConfig;

    public Optional<Output<IntegrationIncrementalPullConfigArgs>> incrementalPullConfig() {
        return Optional.ofNullable(this.incrementalPullConfig);
    }

    @Import(name="sourceConnectorProperties", required=true)
    private Output<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties;

    public Output<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties() {
        return this.sourceConnectorProperties;
    }

    private IntegrationSourceFlowConfigArgs() {}

    private IntegrationSourceFlowConfigArgs(IntegrationSourceFlowConfigArgs $) {
        this.connectorProfileName = $.connectorProfileName;
        this.connectorType = $.connectorType;
        this.incrementalPullConfig = $.incrementalPullConfig;
        this.sourceConnectorProperties = $.sourceConnectorProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationSourceFlowConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationSourceFlowConfigArgs $;

        public Builder() {
            $ = new IntegrationSourceFlowConfigArgs();
        }

        public Builder(IntegrationSourceFlowConfigArgs defaults) {
            $ = new IntegrationSourceFlowConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectorProfileName(@Nullable Output<String> connectorProfileName) {
            $.connectorProfileName = connectorProfileName;
            return this;
        }

        public Builder connectorProfileName(String connectorProfileName) {
            return connectorProfileName(Output.of(connectorProfileName));
        }

        public Builder connectorType(Output<IntegrationConnectorType> connectorType) {
            $.connectorType = connectorType;
            return this;
        }

        public Builder connectorType(IntegrationConnectorType connectorType) {
            return connectorType(Output.of(connectorType));
        }

        public Builder incrementalPullConfig(@Nullable Output<IntegrationIncrementalPullConfigArgs> incrementalPullConfig) {
            $.incrementalPullConfig = incrementalPullConfig;
            return this;
        }

        public Builder incrementalPullConfig(IntegrationIncrementalPullConfigArgs incrementalPullConfig) {
            return incrementalPullConfig(Output.of(incrementalPullConfig));
        }

        public Builder sourceConnectorProperties(Output<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties) {
            $.sourceConnectorProperties = sourceConnectorProperties;
            return this;
        }

        public Builder sourceConnectorProperties(IntegrationSourceConnectorPropertiesArgs sourceConnectorProperties) {
            return sourceConnectorProperties(Output.of(sourceConnectorProperties));
        }

        public IntegrationSourceFlowConfigArgs build() {
            $.connectorType = Objects.requireNonNull($.connectorType, "expected parameter 'connectorType' to be non-null");
            $.sourceConnectorProperties = Objects.requireNonNull($.sourceConnectorProperties, "expected parameter 'sourceConnectorProperties' to be non-null");
            return $;
        }
    }

}

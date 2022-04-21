// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.inputs.AwsCloudTrailDataConnectorDataTypesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsCloudTrailDataConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsCloudTrailDataConnectorArgs Empty = new AwsCloudTrailDataConnectorArgs();

    /**
     * The Aws Role Arn (with CloudTrailReadOnly policy) that is used to access the Aws account.
     * 
     */
    @Import(name="awsRoleArn")
    private @Nullable Output<String> awsRoleArn;

    public Optional<Output<String>> awsRoleArn() {
        return Optional.ofNullable(this.awsRoleArn);
    }

    /**
     * Connector ID
     * 
     */
    @Import(name="dataConnectorId")
    private @Nullable Output<String> dataConnectorId;

    public Optional<Output<String>> dataConnectorId() {
        return Optional.ofNullable(this.dataConnectorId);
    }

    /**
     * The available data types for the connector.
     * 
     */
    @Import(name="dataTypes")
    private @Nullable Output<AwsCloudTrailDataConnectorDataTypesArgs> dataTypes;

    public Optional<Output<AwsCloudTrailDataConnectorDataTypesArgs>> dataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }

    /**
     * The kind of the data connector
     * Expected value is &#39;AmazonWebServicesCloudTrail&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private AwsCloudTrailDataConnectorArgs() {}

    private AwsCloudTrailDataConnectorArgs(AwsCloudTrailDataConnectorArgs $) {
        this.awsRoleArn = $.awsRoleArn;
        this.dataConnectorId = $.dataConnectorId;
        this.dataTypes = $.dataTypes;
        this.kind = $.kind;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsCloudTrailDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsCloudTrailDataConnectorArgs $;

        public Builder() {
            $ = new AwsCloudTrailDataConnectorArgs();
        }

        public Builder(AwsCloudTrailDataConnectorArgs defaults) {
            $ = new AwsCloudTrailDataConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsRoleArn(@Nullable Output<String> awsRoleArn) {
            $.awsRoleArn = awsRoleArn;
            return this;
        }

        public Builder awsRoleArn(String awsRoleArn) {
            return awsRoleArn(Output.of(awsRoleArn));
        }

        public Builder dataConnectorId(@Nullable Output<String> dataConnectorId) {
            $.dataConnectorId = dataConnectorId;
            return this;
        }

        public Builder dataConnectorId(String dataConnectorId) {
            return dataConnectorId(Output.of(dataConnectorId));
        }

        public Builder dataTypes(@Nullable Output<AwsCloudTrailDataConnectorDataTypesArgs> dataTypes) {
            $.dataTypes = dataTypes;
            return this;
        }

        public Builder dataTypes(AwsCloudTrailDataConnectorDataTypesArgs dataTypes) {
            return dataTypes(Output.of(dataTypes));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public AwsCloudTrailDataConnectorArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}

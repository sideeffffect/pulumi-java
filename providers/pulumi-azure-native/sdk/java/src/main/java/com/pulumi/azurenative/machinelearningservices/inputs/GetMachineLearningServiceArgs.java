// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMachineLearningServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMachineLearningServiceArgs Empty = new GetMachineLearningServiceArgs();

    /**
     * Set to True to include Model details.
     * 
     */
    @Import(name="expand")
    private @Nullable Boolean expand;

    public Optional<Boolean> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Azure Machine Learning service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetMachineLearningServiceArgs() {}

    private GetMachineLearningServiceArgs(GetMachineLearningServiceArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMachineLearningServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMachineLearningServiceArgs $;

        public Builder() {
            $ = new GetMachineLearningServiceArgs();
        }

        public Builder(GetMachineLearningServiceArgs defaults) {
            $ = new GetMachineLearningServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder expand(@Nullable Boolean expand) {
            $.expand = expand;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetMachineLearningServiceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}

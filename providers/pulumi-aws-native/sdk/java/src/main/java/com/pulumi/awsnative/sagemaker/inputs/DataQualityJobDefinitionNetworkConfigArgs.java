// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionVpcConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
 * 
 */
public final class DataQualityJobDefinitionNetworkConfigArgs extends ResourceArgs {

    public static final DataQualityJobDefinitionNetworkConfigArgs Empty = new DataQualityJobDefinitionNetworkConfigArgs();

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    @Import(name="enableInterContainerTrafficEncryption")
    private @Nullable Output<Boolean> enableInterContainerTrafficEncryption;

    /**
     * @return Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    public Optional<Output<Boolean>> enableInterContainerTrafficEncryption() {
        return Optional.ofNullable(this.enableInterContainerTrafficEncryption);
    }

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    @Import(name="enableNetworkIsolation")
    private @Nullable Output<Boolean> enableNetworkIsolation;

    /**
     * @return Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    public Optional<Output<Boolean>> enableNetworkIsolation() {
        return Optional.ofNullable(this.enableNetworkIsolation);
    }

    @Import(name="vpcConfig")
    private @Nullable Output<DataQualityJobDefinitionVpcConfigArgs> vpcConfig;

    public Optional<Output<DataQualityJobDefinitionVpcConfigArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    private DataQualityJobDefinitionNetworkConfigArgs() {}

    private DataQualityJobDefinitionNetworkConfigArgs(DataQualityJobDefinitionNetworkConfigArgs $) {
        this.enableInterContainerTrafficEncryption = $.enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = $.enableNetworkIsolation;
        this.vpcConfig = $.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataQualityJobDefinitionNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionNetworkConfigArgs $;

        public Builder() {
            $ = new DataQualityJobDefinitionNetworkConfigArgs();
        }

        public Builder(DataQualityJobDefinitionNetworkConfigArgs defaults) {
            $ = new DataQualityJobDefinitionNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
         * 
         * @return builder
         * 
         */
        public Builder enableInterContainerTrafficEncryption(@Nullable Output<Boolean> enableInterContainerTrafficEncryption) {
            $.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }

        /**
         * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
         * 
         * @return builder
         * 
         */
        public Builder enableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
            return enableInterContainerTrafficEncryption(Output.of(enableInterContainerTrafficEncryption));
        }

        /**
         * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
         * 
         * @return builder
         * 
         */
        public Builder enableNetworkIsolation(@Nullable Output<Boolean> enableNetworkIsolation) {
            $.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        /**
         * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
         * 
         * @return builder
         * 
         */
        public Builder enableNetworkIsolation(Boolean enableNetworkIsolation) {
            return enableNetworkIsolation(Output.of(enableNetworkIsolation));
        }

        public Builder vpcConfig(@Nullable Output<DataQualityJobDefinitionVpcConfigArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(DataQualityJobDefinitionVpcConfigArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        public DataQualityJobDefinitionNetworkConfigArgs build() {
            return $;
        }
    }

}

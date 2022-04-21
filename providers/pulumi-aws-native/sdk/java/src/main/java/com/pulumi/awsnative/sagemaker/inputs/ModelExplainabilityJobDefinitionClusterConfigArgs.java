// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for the cluster used to run model monitoring jobs.
 * 
 */
public final class ModelExplainabilityJobDefinitionClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelExplainabilityJobDefinitionClusterConfigArgs Empty = new ModelExplainabilityJobDefinitionClusterConfigArgs();

    /**
     * The number of ML compute instances to use in the model monitoring job. For distributed processing jobs, specify a value greater than 1. The default value is 1.
     * 
     */
    @Import(name="instanceCount", required=true)
    private Output<Integer> instanceCount;

    public Output<Integer> instanceCount() {
        return this.instanceCount;
    }

    /**
     * The ML compute instance type for the processing job.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the model monitoring job.
     * 
     */
    @Import(name="volumeKmsKeyId")
    private @Nullable Output<String> volumeKmsKeyId;

    public Optional<Output<String>> volumeKmsKeyId() {
        return Optional.ofNullable(this.volumeKmsKeyId);
    }

    /**
     * The size of the ML storage volume, in gigabytes, that you want to provision. You must specify sufficient ML storage for your scenario.
     * 
     */
    @Import(name="volumeSizeInGB", required=true)
    private Output<Integer> volumeSizeInGB;

    public Output<Integer> volumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    private ModelExplainabilityJobDefinitionClusterConfigArgs() {}

    private ModelExplainabilityJobDefinitionClusterConfigArgs(ModelExplainabilityJobDefinitionClusterConfigArgs $) {
        this.instanceCount = $.instanceCount;
        this.instanceType = $.instanceType;
        this.volumeKmsKeyId = $.volumeKmsKeyId;
        this.volumeSizeInGB = $.volumeSizeInGB;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelExplainabilityJobDefinitionClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelExplainabilityJobDefinitionClusterConfigArgs $;

        public Builder() {
            $ = new ModelExplainabilityJobDefinitionClusterConfigArgs();
        }

        public Builder(ModelExplainabilityJobDefinitionClusterConfigArgs defaults) {
            $ = new ModelExplainabilityJobDefinitionClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceCount(Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder volumeKmsKeyId(@Nullable Output<String> volumeKmsKeyId) {
            $.volumeKmsKeyId = volumeKmsKeyId;
            return this;
        }

        public Builder volumeKmsKeyId(String volumeKmsKeyId) {
            return volumeKmsKeyId(Output.of(volumeKmsKeyId));
        }

        public Builder volumeSizeInGB(Output<Integer> volumeSizeInGB) {
            $.volumeSizeInGB = volumeSizeInGB;
            return this;
        }

        public Builder volumeSizeInGB(Integer volumeSizeInGB) {
            return volumeSizeInGB(Output.of(volumeSizeInGB));
        }

        public ModelExplainabilityJobDefinitionClusterConfigArgs build() {
            $.instanceCount = Objects.requireNonNull($.instanceCount, "expected parameter 'instanceCount' to be non-null");
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            $.volumeSizeInGB = Objects.requireNonNull($.volumeSizeInGB, "expected parameter 'volumeSizeInGB' to be non-null");
            return $;
        }
    }

}

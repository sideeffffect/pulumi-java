// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.DomainResourceSpecInstanceType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainResourceSpecArgs extends ResourceArgs {

    public static final DomainResourceSpecArgs Empty = new DomainResourceSpecArgs();

    /**
     * The instance type that the image version runs on.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<DomainResourceSpecInstanceType> instanceType;

    /**
     * @return The instance type that the image version runs on.
     * 
     */
    public Optional<Output<DomainResourceSpecInstanceType>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @Import(name="sageMakerImageArn")
    private @Nullable Output<String> sageMakerImageArn;

    /**
     * @return The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    public Optional<Output<String>> sageMakerImageArn() {
        return Optional.ofNullable(this.sageMakerImageArn);
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @Import(name="sageMakerImageVersionArn")
    private @Nullable Output<String> sageMakerImageVersionArn;

    /**
     * @return The ARN of the image version created on the instance.
     * 
     */
    public Optional<Output<String>> sageMakerImageVersionArn() {
        return Optional.ofNullable(this.sageMakerImageVersionArn);
    }

    private DomainResourceSpecArgs() {}

    private DomainResourceSpecArgs(DomainResourceSpecArgs $) {
        this.instanceType = $.instanceType;
        this.sageMakerImageArn = $.sageMakerImageArn;
        this.sageMakerImageVersionArn = $.sageMakerImageVersionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainResourceSpecArgs $;

        public Builder() {
            $ = new DomainResourceSpecArgs();
        }

        public Builder(DomainResourceSpecArgs defaults) {
            $ = new DomainResourceSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType The instance type that the image version runs on.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<DomainResourceSpecInstanceType> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The instance type that the image version runs on.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(DomainResourceSpecInstanceType instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
         * 
         * @return builder
         * 
         */
        public Builder sageMakerImageArn(@Nullable Output<String> sageMakerImageArn) {
            $.sageMakerImageArn = sageMakerImageArn;
            return this;
        }

        /**
         * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
         * 
         * @return builder
         * 
         */
        public Builder sageMakerImageArn(String sageMakerImageArn) {
            return sageMakerImageArn(Output.of(sageMakerImageArn));
        }

        /**
         * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
         * 
         * @return builder
         * 
         */
        public Builder sageMakerImageVersionArn(@Nullable Output<String> sageMakerImageVersionArn) {
            $.sageMakerImageVersionArn = sageMakerImageVersionArn;
            return this;
        }

        /**
         * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
         * 
         * @return builder
         * 
         */
        public Builder sageMakerImageVersionArn(String sageMakerImageVersionArn) {
            return sageMakerImageVersionArn(Output.of(sageMakerImageVersionArn));
        }

        public DomainResourceSpecArgs build() {
            return $;
        }
    }

}

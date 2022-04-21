// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront;

import com.pulumi.awsnative.cloudfront.inputs.FunctionConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.FunctionMetadataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    @Import(name="autoPublish")
    private @Nullable Output<Boolean> autoPublish;

    public Optional<Output<Boolean>> autoPublish() {
        return Optional.ofNullable(this.autoPublish);
    }

    @Import(name="functionCode")
    private @Nullable Output<String> functionCode;

    public Optional<Output<String>> functionCode() {
        return Optional.ofNullable(this.functionCode);
    }

    @Import(name="functionConfig")
    private @Nullable Output<FunctionConfigArgs> functionConfig;

    public Optional<Output<FunctionConfigArgs>> functionConfig() {
        return Optional.ofNullable(this.functionConfig);
    }

    @Import(name="functionMetadata")
    private @Nullable Output<FunctionMetadataArgs> functionMetadata;

    public Optional<Output<FunctionMetadataArgs>> functionMetadata() {
        return Optional.ofNullable(this.functionMetadata);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FunctionArgs() {}

    private FunctionArgs(FunctionArgs $) {
        this.autoPublish = $.autoPublish;
        this.functionCode = $.functionCode;
        this.functionConfig = $.functionConfig;
        this.functionMetadata = $.functionMetadata;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionArgs $;

        public Builder() {
            $ = new FunctionArgs();
        }

        public Builder(FunctionArgs defaults) {
            $ = new FunctionArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoPublish(@Nullable Output<Boolean> autoPublish) {
            $.autoPublish = autoPublish;
            return this;
        }

        public Builder autoPublish(Boolean autoPublish) {
            return autoPublish(Output.of(autoPublish));
        }

        public Builder functionCode(@Nullable Output<String> functionCode) {
            $.functionCode = functionCode;
            return this;
        }

        public Builder functionCode(String functionCode) {
            return functionCode(Output.of(functionCode));
        }

        public Builder functionConfig(@Nullable Output<FunctionConfigArgs> functionConfig) {
            $.functionConfig = functionConfig;
            return this;
        }

        public Builder functionConfig(FunctionConfigArgs functionConfig) {
            return functionConfig(Output.of(functionConfig));
        }

        public Builder functionMetadata(@Nullable Output<FunctionMetadataArgs> functionMetadata) {
            $.functionMetadata = functionMetadata;
            return this;
        }

        public Builder functionMetadata(FunctionMetadataArgs functionMetadata) {
            return functionMetadata(Output.of(functionMetadata));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FunctionArgs build() {
            return $;
        }
    }

}

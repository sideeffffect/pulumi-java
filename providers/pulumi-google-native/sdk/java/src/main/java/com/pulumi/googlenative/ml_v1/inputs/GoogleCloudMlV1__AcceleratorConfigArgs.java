// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__AcceleratorConfigType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a hardware accelerator request config. Note that the AcceleratorConfig can be used in both Jobs and Versions. Learn more about [accelerators for training](/ml-engine/docs/using-gpus) and [accelerators for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
 * 
 */
public final class GoogleCloudMlV1__AcceleratorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__AcceleratorConfigArgs Empty = new GoogleCloudMlV1__AcceleratorConfigArgs();

    /**
     * The number of accelerators to attach to each machine running the job.
     * 
     */
    @Import(name="count")
    private @Nullable Output<String> count;

    public Optional<Output<String>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * The type of accelerator to use.
     * 
     */
    @Import(name="type")
    private @Nullable Output<GoogleCloudMlV1__AcceleratorConfigType> type;

    public Optional<Output<GoogleCloudMlV1__AcceleratorConfigType>> type() {
        return Optional.ofNullable(this.type);
    }

    private GoogleCloudMlV1__AcceleratorConfigArgs() {}

    private GoogleCloudMlV1__AcceleratorConfigArgs(GoogleCloudMlV1__AcceleratorConfigArgs $) {
        this.count = $.count;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__AcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__AcceleratorConfigArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1__AcceleratorConfigArgs();
        }

        public Builder(GoogleCloudMlV1__AcceleratorConfigArgs defaults) {
            $ = new GoogleCloudMlV1__AcceleratorConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(@Nullable Output<String> count) {
            $.count = count;
            return this;
        }

        public Builder count(String count) {
            return count(Output.of(count));
        }

        public Builder type(@Nullable Output<GoogleCloudMlV1__AcceleratorConfigType> type) {
            $.type = type;
            return this;
        }

        public Builder type(GoogleCloudMlV1__AcceleratorConfigType type) {
            return type(Output.of(type));
        }

        public GoogleCloudMlV1__AcceleratorConfigArgs build() {
            return $;
        }
    }

}

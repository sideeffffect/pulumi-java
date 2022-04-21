// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks_v1.enums.AcceleratorConfigType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of a hardware accelerator. Note that not all combinations of `type` and `core_count` are valid. Check [GPUs on Compute Engine](/compute/docs/gpus/#gpus-list) to find a valid combination. TPUs are not supported.
 * 
 */
public final class AcceleratorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AcceleratorConfigArgs Empty = new AcceleratorConfigArgs();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @Import(name="coreCount")
    private @Nullable Output<String> coreCount;

    public Optional<Output<String>> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    /**
     * Type of this accelerator.
     * 
     */
    @Import(name="type")
    private @Nullable Output<AcceleratorConfigType> type;

    public Optional<Output<AcceleratorConfigType>> type() {
        return Optional.ofNullable(this.type);
    }

    private AcceleratorConfigArgs() {}

    private AcceleratorConfigArgs(AcceleratorConfigArgs $) {
        this.coreCount = $.coreCount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcceleratorConfigArgs $;

        public Builder() {
            $ = new AcceleratorConfigArgs();
        }

        public Builder(AcceleratorConfigArgs defaults) {
            $ = new AcceleratorConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder coreCount(@Nullable Output<String> coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        public Builder coreCount(String coreCount) {
            return coreCount(Output.of(coreCount));
        }

        public Builder type(@Nullable Output<AcceleratorConfigType> type) {
            $.type = type;
            return this;
        }

        public Builder type(AcceleratorConfigType type) {
            return type(Output.of(type));
        }

        public AcceleratorConfigArgs build() {
            return $;
        }
    }

}

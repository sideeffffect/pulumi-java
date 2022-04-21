// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TensorFlow distribution configuration.
 * 
 */
public final class TensorFlowArgs extends com.pulumi.resources.ResourceArgs {

    public static final TensorFlowArgs Empty = new TensorFlowArgs();

    /**
     * Enum to determine the job distribution type.
     * Expected value is &#39;TensorFlow&#39;.
     * 
     */
    @Import(name="distributionType", required=true)
    private Output<String> distributionType;

    public Output<String> distributionType() {
        return this.distributionType;
    }

    /**
     * Number of parameter server tasks.
     * 
     */
    @Import(name="parameterServerCount")
    private @Nullable Output<Integer> parameterServerCount;

    public Optional<Output<Integer>> parameterServerCount() {
        return Optional.ofNullable(this.parameterServerCount);
    }

    /**
     * Number of workers. Overwrites the node count in compute binding.
     * 
     */
    @Import(name="workerCount")
    private @Nullable Output<Integer> workerCount;

    public Optional<Output<Integer>> workerCount() {
        return Optional.ofNullable(this.workerCount);
    }

    private TensorFlowArgs() {}

    private TensorFlowArgs(TensorFlowArgs $) {
        this.distributionType = $.distributionType;
        this.parameterServerCount = $.parameterServerCount;
        this.workerCount = $.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TensorFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TensorFlowArgs $;

        public Builder() {
            $ = new TensorFlowArgs();
        }

        public Builder(TensorFlowArgs defaults) {
            $ = new TensorFlowArgs(Objects.requireNonNull(defaults));
        }

        public Builder distributionType(Output<String> distributionType) {
            $.distributionType = distributionType;
            return this;
        }

        public Builder distributionType(String distributionType) {
            return distributionType(Output.of(distributionType));
        }

        public Builder parameterServerCount(@Nullable Output<Integer> parameterServerCount) {
            $.parameterServerCount = parameterServerCount;
            return this;
        }

        public Builder parameterServerCount(Integer parameterServerCount) {
            return parameterServerCount(Output.of(parameterServerCount));
        }

        public Builder workerCount(@Nullable Output<Integer> workerCount) {
            $.workerCount = workerCount;
            return this;
        }

        public Builder workerCount(Integer workerCount) {
            return workerCount(Output.of(workerCount));
        }

        public TensorFlowArgs build() {
            $.distributionType = Codegen.stringProp("distributionType").output().arg($.distributionType).require();
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeTemplateNodeTypeFlexibilityArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTemplateNodeTypeFlexibilityArgs Empty = new NodeTemplateNodeTypeFlexibilityArgs();

    @Import(name="cpus")
    private @Nullable Output<String> cpus;

    public Optional<Output<String>> cpus() {
        return Optional.ofNullable(this.cpus);
    }

    @Import(name="localSsd")
    private @Nullable Output<String> localSsd;

    public Optional<Output<String>> localSsd() {
        return Optional.ofNullable(this.localSsd);
    }

    @Import(name="memory")
    private @Nullable Output<String> memory;

    public Optional<Output<String>> memory() {
        return Optional.ofNullable(this.memory);
    }

    private NodeTemplateNodeTypeFlexibilityArgs() {}

    private NodeTemplateNodeTypeFlexibilityArgs(NodeTemplateNodeTypeFlexibilityArgs $) {
        this.cpus = $.cpus;
        this.localSsd = $.localSsd;
        this.memory = $.memory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTemplateNodeTypeFlexibilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTemplateNodeTypeFlexibilityArgs $;

        public Builder() {
            $ = new NodeTemplateNodeTypeFlexibilityArgs();
        }

        public Builder(NodeTemplateNodeTypeFlexibilityArgs defaults) {
            $ = new NodeTemplateNodeTypeFlexibilityArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpus(@Nullable Output<String> cpus) {
            $.cpus = cpus;
            return this;
        }

        public Builder cpus(String cpus) {
            return cpus(Output.of(cpus));
        }

        public Builder localSsd(@Nullable Output<String> localSsd) {
            $.localSsd = localSsd;
            return this;
        }

        public Builder localSsd(String localSsd) {
            return localSsd(Output.of(localSsd));
        }

        public Builder memory(@Nullable Output<String> memory) {
            $.memory = memory;
            return this;
        }

        public Builder memory(String memory) {
            return memory(Output.of(memory));
        }

        public NodeTemplateNodeTypeFlexibilityArgs build() {
            return $;
        }
    }

}

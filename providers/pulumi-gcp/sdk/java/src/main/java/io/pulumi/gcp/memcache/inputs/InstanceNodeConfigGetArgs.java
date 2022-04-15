// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.memcache.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class InstanceNodeConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNodeConfigGetArgs Empty = new InstanceNodeConfigGetArgs();

    /**
     * Number of CPUs per node.
     * 
     */
    @Import(name="cpuCount", required=true)
      private final Output<Integer> cpuCount;

    public Output<Integer> cpuCount() {
        return this.cpuCount;
    }

    /**
     * Memory size in Mebibytes for each memcache node.
     * 
     */
    @Import(name="memorySizeMb", required=true)
      private final Output<Integer> memorySizeMb;

    public Output<Integer> memorySizeMb() {
        return this.memorySizeMb;
    }

    public InstanceNodeConfigGetArgs(
        Output<Integer> cpuCount,
        Output<Integer> memorySizeMb) {
        this.cpuCount = Objects.requireNonNull(cpuCount, "expected parameter 'cpuCount' to be non-null");
        this.memorySizeMb = Objects.requireNonNull(memorySizeMb, "expected parameter 'memorySizeMb' to be non-null");
    }

    private InstanceNodeConfigGetArgs() {
        this.cpuCount = Codegen.empty();
        this.memorySizeMb = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNodeConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> cpuCount;
        private Output<Integer> memorySizeMb;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNodeConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
    	      this.memorySizeMb = defaults.memorySizeMb;
        }

        public Builder cpuCount(Output<Integer> cpuCount) {
            this.cpuCount = Objects.requireNonNull(cpuCount);
            return this;
        }
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = Output.of(Objects.requireNonNull(cpuCount));
            return this;
        }
        public Builder memorySizeMb(Output<Integer> memorySizeMb) {
            this.memorySizeMb = Objects.requireNonNull(memorySizeMb);
            return this;
        }
        public Builder memorySizeMb(Integer memorySizeMb) {
            this.memorySizeMb = Output.of(Objects.requireNonNull(memorySizeMb));
            return this;
        }        public InstanceNodeConfigGetArgs build() {
            return new InstanceNodeConfigGetArgs(cpuCount, memorySizeMb);
        }
    }
}

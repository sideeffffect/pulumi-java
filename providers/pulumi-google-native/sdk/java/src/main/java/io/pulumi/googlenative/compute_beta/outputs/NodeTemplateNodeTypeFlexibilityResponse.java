// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeTemplateNodeTypeFlexibilityResponse {
    private final String cpus;
    private final String localSsd;
    private final String memory;

    @OutputCustomType.Constructor
    private NodeTemplateNodeTypeFlexibilityResponse(
        @OutputCustomType.Parameter("cpus") String cpus,
        @OutputCustomType.Parameter("localSsd") String localSsd,
        @OutputCustomType.Parameter("memory") String memory) {
        this.cpus = cpus;
        this.localSsd = localSsd;
        this.memory = memory;
    }

    public String getCpus() {
        return this.cpus;
    }
    public String getLocalSsd() {
        return this.localSsd;
    }
    public String getMemory() {
        return this.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateNodeTypeFlexibilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpus;
        private String localSsd;
        private String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateNodeTypeFlexibilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpus = defaults.cpus;
    	      this.localSsd = defaults.localSsd;
    	      this.memory = defaults.memory;
        }

        public Builder cpus(String cpus) {
            this.cpus = Objects.requireNonNull(cpus);
            return this;
        }

        public Builder localSsd(String localSsd) {
            this.localSsd = Objects.requireNonNull(localSsd);
            return this;
        }

        public Builder memory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        public NodeTemplateNodeTypeFlexibilityResponse build() {
            return new NodeTemplateNodeTypeFlexibilityResponse(cpus, localSsd, memory);
        }
    }
}

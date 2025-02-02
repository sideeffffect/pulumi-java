// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodeInputResponse {
    /**
     * @return The name of the upstream node in the pipeline which output is used as input of the current node.
     * 
     */
    private final String nodeName;

    @CustomType.Constructor
    private NodeInputResponse(@CustomType.Parameter("nodeName") String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * @return The name of the upstream node in the pipeline which output is used as input of the current node.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeName = defaults.nodeName;
        }

        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }        public NodeInputResponse build() {
            return new NodeInputResponse(nodeName);
        }
    }
}

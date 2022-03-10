// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.EnterpriseChannelNodeResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Enterprise Channel.
 * 
 */
public final class EnterpriseChannelPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnterpriseChannelPropertiesResponse Empty = new EnterpriseChannelPropertiesResponse();

    /**
     * The nodes associated with the Enterprise Channel.
     * 
     */
    @InputImport(name="nodes", required=true)
      private final List<EnterpriseChannelNodeResponse> nodes;

    public List<EnterpriseChannelNodeResponse> getNodes() {
        return this.nodes;
    }

    /**
     * The current state of the Enterprise Channel.
     * 
     */
    @InputImport(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public EnterpriseChannelPropertiesResponse(
        List<EnterpriseChannelNodeResponse> nodes,
        @Nullable String state) {
        this.nodes = Objects.requireNonNull(nodes, "expected parameter 'nodes' to be non-null");
        this.state = state;
    }

    private EnterpriseChannelPropertiesResponse() {
        this.nodes = List.of();
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EnterpriseChannelNodeResponse> nodes;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodes = defaults.nodes;
    	      this.state = defaults.state;
        }

        public Builder nodes(List<EnterpriseChannelNodeResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public EnterpriseChannelPropertiesResponse build() {
            return new EnterpriseChannelPropertiesResponse(nodes, state);
        }
    }
}

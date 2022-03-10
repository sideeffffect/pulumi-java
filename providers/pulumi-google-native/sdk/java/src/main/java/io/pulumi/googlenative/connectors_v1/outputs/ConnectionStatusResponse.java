// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectionStatusResponse {
    /**
     * Description.
     * 
     */
    private final String description;
    /**
     * State.
     * 
     */
    private final String state;
    /**
     * Status provides detailed information for the state.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private ConnectionStatusResponse(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("status") String status) {
        this.description = description;
        this.state = state;
        this.status = status;
    }

    /**
     * Description.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * State.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Status provides detailed information for the state.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String state;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ConnectionStatusResponse build() {
            return new ConnectionStatusResponse(description, state, status);
        }
    }
}

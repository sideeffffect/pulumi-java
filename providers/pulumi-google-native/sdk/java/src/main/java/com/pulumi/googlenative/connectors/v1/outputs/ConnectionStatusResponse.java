// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionStatusResponse {
    /**
     * @return Description.
     * 
     */
    private final String description;
    /**
     * @return State.
     * 
     */
    private final String state;
    /**
     * @return Status provides detailed information for the state.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private ConnectionStatusResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("status") String status) {
        this.description = description;
        this.state = state;
        this.status = status;
    }

    /**
     * @return Description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return State.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Status provides detailed information for the state.
     * 
     */
    public String status() {
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
        }        public ConnectionStatusResponse build() {
            return new ConnectionStatusResponse(description, state, status);
        }
    }
}

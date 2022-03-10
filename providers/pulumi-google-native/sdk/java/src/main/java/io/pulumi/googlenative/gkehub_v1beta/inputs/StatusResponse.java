// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Status specifies state for the subcomponent.
 * 
 */
public final class StatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final StatusResponse Empty = new StatusResponse();

    /**
     * Code specifies AppDevExperienceFeature's subcomponent ready state.
     * 
     */
    @InputImport(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * Description is populated if Code is Failed, explaining why it has failed.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    public StatusResponse(
        String code,
        String description) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
    }

    private StatusResponse() {
        this.code = null;
        this.description = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String description;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.description = defaults.description;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public StatusResponse build() {
            return new StatusResponse(code, description);
        }
    }
}

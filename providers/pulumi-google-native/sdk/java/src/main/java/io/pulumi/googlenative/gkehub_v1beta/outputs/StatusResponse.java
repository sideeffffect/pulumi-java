// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StatusResponse {
    /**
     * Code specifies AppDevExperienceFeature's subcomponent ready state.
     * 
     */
    private final String code;
    /**
     * Description is populated if Code is Failed, explaining why it has failed.
     * 
     */
    private final String description;

    @OutputCustomType.Constructor({"code","description"})
    private StatusResponse(
        String code,
        String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * Code specifies AppDevExperienceFeature's subcomponent ready state.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Description is populated if Code is Failed, explaining why it has failed.
     * 
    */
    public String getDescription() {
        return this.description;
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

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public StatusResponse build() {
            return new StatusResponse(code, description);
        }
    }
}

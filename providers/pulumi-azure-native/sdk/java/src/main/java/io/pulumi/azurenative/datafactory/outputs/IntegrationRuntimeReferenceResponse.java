// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeReferenceResponse {
    /**
     * Arguments for integration runtime.
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * Reference integration runtime name.
     * 
     */
    private final String referenceName;
    /**
     * Type of integration runtime.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private IntegrationRuntimeReferenceResponse(
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,Object> parameters,
        @OutputCustomType.Parameter("referenceName") String referenceName,
        @OutputCustomType.Parameter("type") String type) {
        this.parameters = parameters;
        this.referenceName = referenceName;
        this.type = type;
    }

    /**
     * Arguments for integration runtime.
     * 
    */
    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Reference integration runtime name.
     * 
    */
    public String getReferenceName() {
        return this.referenceName;
    }
    /**
     * Type of integration runtime.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> parameters;
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder referenceName(String referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public IntegrationRuntimeReferenceResponse build() {
            return new IntegrationRuntimeReferenceResponse(parameters, referenceName, type);
        }
    }
}

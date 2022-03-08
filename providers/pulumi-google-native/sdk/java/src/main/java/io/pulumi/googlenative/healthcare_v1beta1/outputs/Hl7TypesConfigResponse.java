// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.TypeResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.VersionSourceResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class Hl7TypesConfigResponse {
    /**
     * The HL7v2 type definitions.
     * 
     */
    private final List<TypeResponse> type;
    /**
     * The version selectors that this config applies to. A message must match ALL version sources to apply.
     * 
     */
    private final List<VersionSourceResponse> version;

    @OutputCustomType.Constructor({"type","version"})
    private Hl7TypesConfigResponse(
        List<TypeResponse> type,
        List<VersionSourceResponse> version) {
        this.type = type;
        this.version = version;
    }

    /**
     * The HL7v2 type definitions.
     * 
    */
    public List<TypeResponse> getType() {
        return this.type;
    }
    /**
     * The version selectors that this config applies to. A message must match ALL version sources to apply.
     * 
    */
    public List<VersionSourceResponse> getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7TypesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TypeResponse> type;
        private List<VersionSourceResponse> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7TypesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setType(List<TypeResponse> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(List<VersionSourceResponse> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Hl7TypesConfigResponse build() {
            return new Hl7TypesConfigResponse(type, version);
        }
    }
}

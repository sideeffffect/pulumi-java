// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BuildSignatureResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BuildTypeResponse {
    /**
     * Version of the builder which produced this Note.
     * 
     */
    private final String builderVersion;
    /**
     * Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
     * 
     */
    private final BuildSignatureResponse signature;

    @OutputCustomType.Constructor
    private BuildTypeResponse(
        @OutputCustomType.Parameter("builderVersion") String builderVersion,
        @OutputCustomType.Parameter("signature") BuildSignatureResponse signature) {
        this.builderVersion = builderVersion;
        this.signature = signature;
    }

    /**
     * Version of the builder which produced this Note.
     * 
    */
    public String getBuilderVersion() {
        return this.builderVersion;
    }
    /**
     * Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
     * 
    */
    public BuildSignatureResponse getSignature() {
        return this.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String builderVersion;
        private BuildSignatureResponse signature;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
    	      this.signature = defaults.signature;
        }

        public Builder builderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }

        public Builder signature(BuildSignatureResponse signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }
        public BuildTypeResponse build() {
            return new BuildTypeResponse(builderVersion, signature);
        }
    }
}

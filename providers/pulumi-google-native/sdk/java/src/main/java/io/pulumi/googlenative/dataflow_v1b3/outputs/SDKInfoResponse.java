// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SDKInfoResponse {
    /**
     * The SDK Language.
     * 
     */
    private final String language;
    /**
     * Optional. The SDK version.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"language","version"})
    private SDKInfoResponse(
        String language,
        String version) {
        this.language = language;
        this.version = version;
    }

    /**
     * The SDK Language.
     * 
    */
    public String getLanguage() {
        return this.language;
    }
    /**
     * Optional. The SDK version.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SDKInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String language;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SDKInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.language = defaults.language;
    	      this.version = defaults.version;
        }

        public Builder setLanguage(String language) {
            this.language = Objects.requireNonNull(language);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public SDKInfoResponse build() {
            return new SDKInfoResponse(language, version);
        }
    }
}

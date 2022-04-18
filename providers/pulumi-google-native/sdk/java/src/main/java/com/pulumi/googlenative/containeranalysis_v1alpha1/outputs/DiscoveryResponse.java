// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiscoveryResponse {
    /**
     * The kind of analysis that is handled by this discovery.
     * 
     */
    private final String analysisKind;

    @CustomType.Constructor
    private DiscoveryResponse(@CustomType.Parameter("analysisKind") String analysisKind) {
        this.analysisKind = analysisKind;
    }

    /**
     * The kind of analysis that is handled by this discovery.
     * 
    */
    public String analysisKind() {
        return this.analysisKind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analysisKind;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisKind = defaults.analysisKind;
        }

        public Builder analysisKind(String analysisKind) {
            this.analysisKind = Objects.requireNonNull(analysisKind);
            return this;
        }        public DiscoveryResponse build() {
            return new DiscoveryResponse(analysisKind);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CodeSigningConfigAllowedPublishers {
    /**
     * List of Signing profile version Arns
     * 
     */
    private final List<String> signingProfileVersionArns;

    @OutputCustomType.Constructor({"signingProfileVersionArns"})
    private CodeSigningConfigAllowedPublishers(List<String> signingProfileVersionArns) {
        this.signingProfileVersionArns = signingProfileVersionArns;
    }

    /**
     * List of Signing profile version Arns
     * 
    */
    public List<String> getSigningProfileVersionArns() {
        return this.signingProfileVersionArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigAllowedPublishers defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> signingProfileVersionArns;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigAllowedPublishers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingProfileVersionArns = defaults.signingProfileVersionArns;
        }

        public Builder setSigningProfileVersionArns(List<String> signingProfileVersionArns) {
            this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns);
            return this;
        }
        public CodeSigningConfigAllowedPublishers build() {
            return new CodeSigningConfigAllowedPublishers(signingProfileVersionArns);
        }
    }
}

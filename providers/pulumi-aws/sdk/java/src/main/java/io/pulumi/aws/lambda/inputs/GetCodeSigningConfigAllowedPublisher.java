// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetCodeSigningConfigAllowedPublisher extends io.pulumi.resources.InvokeArgs {

    public static final GetCodeSigningConfigAllowedPublisher Empty = new GetCodeSigningConfigAllowedPublisher();

    /**
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package.
     * 
     */
    @Import(name="signingProfileVersionArns", required=true)
      private final List<String> signingProfileVersionArns;

    public List<String> signingProfileVersionArns() {
        return this.signingProfileVersionArns;
    }

    public GetCodeSigningConfigAllowedPublisher(List<String> signingProfileVersionArns) {
        this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns, "expected parameter 'signingProfileVersionArns' to be non-null");
    }

    private GetCodeSigningConfigAllowedPublisher() {
        this.signingProfileVersionArns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCodeSigningConfigAllowedPublisher defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> signingProfileVersionArns;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCodeSigningConfigAllowedPublisher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingProfileVersionArns = defaults.signingProfileVersionArns;
        }

        public Builder signingProfileVersionArns(List<String> signingProfileVersionArns) {
            this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns);
            return this;
        }
        public Builder signingProfileVersionArns(String... signingProfileVersionArns) {
            return signingProfileVersionArns(List.of(signingProfileVersionArns));
        }        public GetCodeSigningConfigAllowedPublisher build() {
            return new GetCodeSigningConfigAllowedPublisher(signingProfileVersionArns);
        }
    }
}

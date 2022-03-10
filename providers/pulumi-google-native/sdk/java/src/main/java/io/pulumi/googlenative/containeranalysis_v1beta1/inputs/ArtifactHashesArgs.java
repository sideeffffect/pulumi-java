// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a hash object for use in Materials and Products.
 * 
 */
public final class ArtifactHashesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArtifactHashesArgs Empty = new ArtifactHashesArgs();

    @InputImport(name="sha256")
      private final @Nullable Input<String> sha256;

    public Input<String> getSha256() {
        return this.sha256 == null ? Input.empty() : this.sha256;
    }

    public ArtifactHashesArgs(@Nullable Input<String> sha256) {
        this.sha256 = sha256;
    }

    private ArtifactHashesArgs() {
        this.sha256 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactHashesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactHashesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256 = defaults.sha256;
        }

        public Builder sha256(@Nullable Input<String> sha256) {
            this.sha256 = sha256;
            return this;
        }

        public Builder sha256(@Nullable String sha256) {
            this.sha256 = Input.ofNullable(sha256);
            return this;
        }
        public ArtifactHashesArgs build() {
            return new ArtifactHashesArgs(sha256);
        }
    }
}

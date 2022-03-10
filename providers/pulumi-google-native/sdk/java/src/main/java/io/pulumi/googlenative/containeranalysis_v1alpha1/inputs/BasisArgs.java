// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.FingerprintArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Basis describes the base image portion (Note) of the DockerImage relationship. Linked occurrences are derived from this or an equivalent image via: FROM Or an equivalent reference, e.g. a tag of the resource_url.
 * 
 */
public final class BasisArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasisArgs Empty = new BasisArgs();

    /**
     * The fingerprint of the base image.
     * 
     */
    @InputImport(name="fingerprint")
      private final @Nullable Input<FingerprintArgs> fingerprint;

    public Input<FingerprintArgs> getFingerprint() {
        return this.fingerprint == null ? Input.empty() : this.fingerprint;
    }

    /**
     * The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    @InputImport(name="resourceUrl")
      private final @Nullable Input<String> resourceUrl;

    public Input<String> getResourceUrl() {
        return this.resourceUrl == null ? Input.empty() : this.resourceUrl;
    }

    public BasisArgs(
        @Nullable Input<FingerprintArgs> fingerprint,
        @Nullable Input<String> resourceUrl) {
        this.fingerprint = fingerprint;
        this.resourceUrl = resourceUrl;
    }

    private BasisArgs() {
        this.fingerprint = Input.empty();
        this.resourceUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FingerprintArgs> fingerprint;
        private @Nullable Input<String> resourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(BasisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.resourceUrl = defaults.resourceUrl;
        }

        public Builder fingerprint(@Nullable Input<FingerprintArgs> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder fingerprint(@Nullable FingerprintArgs fingerprint) {
            this.fingerprint = Input.ofNullable(fingerprint);
            return this;
        }

        public Builder resourceUrl(@Nullable Input<String> resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }

        public Builder resourceUrl(@Nullable String resourceUrl) {
            this.resourceUrl = Input.ofNullable(resourceUrl);
            return this;
        }
        public BasisArgs build() {
            return new BasisArgs(fingerprint, resourceUrl);
        }
    }
}

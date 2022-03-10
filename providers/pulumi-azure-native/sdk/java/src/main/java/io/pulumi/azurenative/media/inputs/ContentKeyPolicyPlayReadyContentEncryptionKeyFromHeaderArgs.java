// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies that the content key ID is in the PlayReady header.
 * 
 */
public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs Empty = new ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs(Input<String> odataType) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs() {
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder odataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs build() {
            return new ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs(odataType);
        }
    }
}

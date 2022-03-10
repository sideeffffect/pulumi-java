// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetKMSCryptoKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKMSCryptoKeyArgs Empty = new GetKMSCryptoKeyArgs();

    /**
     * The `id` of the Google Cloud Platform KeyRing to which the key belongs.
     * 
     */
    @InputImport(name="keyRing", required=true)
      private final String keyRing;

    public String getKeyRing() {
        return this.keyRing;
    }

    /**
     * The CryptoKey's name.
     * A CryptoKey’s name belonging to the specified Google Cloud Platform KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetKMSCryptoKeyArgs(
        String keyRing,
        String name) {
        this.keyRing = Objects.requireNonNull(keyRing, "expected parameter 'keyRing' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetKMSCryptoKeyArgs() {
        this.keyRing = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSCryptoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyRing;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSCryptoKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyRing = defaults.keyRing;
    	      this.name = defaults.name;
        }

        public Builder keyRing(String keyRing) {
            this.keyRing = Objects.requireNonNull(keyRing);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetKMSCryptoKeyArgs build() {
            return new GetKMSCryptoKeyArgs(keyRing, name);
        }
    }
}

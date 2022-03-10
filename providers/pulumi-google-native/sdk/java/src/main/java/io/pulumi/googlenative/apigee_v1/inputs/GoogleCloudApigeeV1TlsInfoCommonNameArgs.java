// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudApigeeV1TlsInfoCommonNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1TlsInfoCommonNameArgs Empty = new GoogleCloudApigeeV1TlsInfoCommonNameArgs();

    /**
     * The TLS Common Name string of the certificate.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    /**
     * Indicates whether the cert should be matched against as a wildcard cert.
     * 
     */
    @InputImport(name="wildcardMatch")
      private final @Nullable Input<Boolean> wildcardMatch;

    public Input<Boolean> getWildcardMatch() {
        return this.wildcardMatch == null ? Input.empty() : this.wildcardMatch;
    }

    public GoogleCloudApigeeV1TlsInfoCommonNameArgs(
        @Nullable Input<String> value,
        @Nullable Input<Boolean> wildcardMatch) {
        this.value = value;
        this.wildcardMatch = wildcardMatch;
    }

    private GoogleCloudApigeeV1TlsInfoCommonNameArgs() {
        this.value = Input.empty();
        this.wildcardMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1TlsInfoCommonNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> value;
        private @Nullable Input<Boolean> wildcardMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1TlsInfoCommonNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.wildcardMatch = defaults.wildcardMatch;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder wildcardMatch(@Nullable Input<Boolean> wildcardMatch) {
            this.wildcardMatch = wildcardMatch;
            return this;
        }

        public Builder wildcardMatch(@Nullable Boolean wildcardMatch) {
            this.wildcardMatch = Input.ofNullable(wildcardMatch);
            return this;
        }
        public GoogleCloudApigeeV1TlsInfoCommonNameArgs build() {
            return new GoogleCloudApigeeV1TlsInfoCommonNameArgs(value, wildcardMatch);
        }
    }
}

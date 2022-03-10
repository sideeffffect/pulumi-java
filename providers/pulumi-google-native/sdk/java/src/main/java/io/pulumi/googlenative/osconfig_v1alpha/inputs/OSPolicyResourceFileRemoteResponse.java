// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a file available via some URI.
 * 
 */
public final class OSPolicyResourceFileRemoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceFileRemoteResponse Empty = new OSPolicyResourceFileRemoteResponse();

    /**
     * SHA256 checksum of the remote file.
     * 
     */
    @InputImport(name="sha256Checksum", required=true)
      private final String sha256Checksum;

    public String getSha256Checksum() {
        return this.sha256Checksum;
    }

    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format `{protocol}://{location}`.
     * 
     */
    @InputImport(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public OSPolicyResourceFileRemoteResponse(
        String sha256Checksum,
        String uri) {
        this.sha256Checksum = Objects.requireNonNull(sha256Checksum, "expected parameter 'sha256Checksum' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private OSPolicyResourceFileRemoteResponse() {
        this.sha256Checksum = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileRemoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sha256Checksum;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileRemoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.uri = defaults.uri;
        }

        public Builder sha256Checksum(String sha256Checksum) {
            this.sha256Checksum = Objects.requireNonNull(sha256Checksum);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public OSPolicyResourceFileRemoteResponse build() {
            return new OSPolicyResourceFileRemoteResponse(sha256Checksum, uri);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
 * 
 */
public final class OriginEndpointSpekeKeyProvider extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointSpekeKeyProvider Empty = new OriginEndpointSpekeKeyProvider();

    /**
     * An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for enforcing secure end-to-end data transfer with the key provider service.
     * 
     */
    @InputImport(name="certificateArn")
      private final @Nullable String certificateArn;

    public Optional<String> getCertificateArn() {
        return this.certificateArn == null ? Optional.empty() : Optional.ofNullable(this.certificateArn);
    }

    /**
     * The resource ID to include in key requests.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing the key provider service.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The system IDs to include in key requests.
     * 
     */
    @InputImport(name="systemIds", required=true)
      private final List<String> systemIds;

    public List<String> getSystemIds() {
        return this.systemIds;
    }

    /**
     * The URL of the external key provider service.
     * 
     */
    @InputImport(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public OriginEndpointSpekeKeyProvider(
        @Nullable String certificateArn,
        String resourceId,
        String roleArn,
        List<String> systemIds,
        String url) {
        this.certificateArn = certificateArn;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.systemIds = Objects.requireNonNull(systemIds, "expected parameter 'systemIds' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private OriginEndpointSpekeKeyProvider() {
        this.certificateArn = null;
        this.resourceId = null;
        this.roleArn = null;
        this.systemIds = List.of();
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointSpekeKeyProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateArn;
        private String resourceId;
        private String roleArn;
        private List<String> systemIds;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointSpekeKeyProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.resourceId = defaults.resourceId;
    	      this.roleArn = defaults.roleArn;
    	      this.systemIds = defaults.systemIds;
    	      this.url = defaults.url;
        }

        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder systemIds(List<String> systemIds) {
            this.systemIds = Objects.requireNonNull(systemIds);
            return this;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public OriginEndpointSpekeKeyProvider build() {
            return new OriginEndpointSpekeKeyProvider(certificateArn, resourceId, roleArn, systemIds, url);
        }
    }
}

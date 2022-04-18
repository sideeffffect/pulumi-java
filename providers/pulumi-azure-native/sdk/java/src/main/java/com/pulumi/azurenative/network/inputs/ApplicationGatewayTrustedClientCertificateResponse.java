// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trusted client certificates of an application gateway.
 * 
 */
public final class ApplicationGatewayTrustedClientCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayTrustedClientCertificateResponse Empty = new ApplicationGatewayTrustedClientCertificateResponse();

    /**
     * Certificate public data.
     * 
     */
    @Import(name="data")
      private final @Nullable String data;

    public Optional<String> data() {
        return this.data == null ? Optional.empty() : Optional.ofNullable(this.data);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the trusted client certificate that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the trusted client certificate resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ApplicationGatewayTrustedClientCertificateResponse(
        @Nullable String data,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.data = data;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewayTrustedClientCertificateResponse() {
        this.data = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayTrustedClientCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayTrustedClientCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ApplicationGatewayTrustedClientCertificateResponse build() {
            return new ApplicationGatewayTrustedClientCertificateResponse(data, etag, id, name, provisioningState, type);
        }
    }
}

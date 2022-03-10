// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AkamaiAccessControlResponse;
import io.pulumi.azurenative.media.inputs.IPAccessControlResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Streaming endpoint access control definition.
 * 
 */
public final class StreamingEndpointAccessControlResponse extends io.pulumi.resources.InvokeArgs {

    public static final StreamingEndpointAccessControlResponse Empty = new StreamingEndpointAccessControlResponse();

    /**
     * The access control of Akamai
     * 
     */
    @InputImport(name="akamai")
      private final @Nullable AkamaiAccessControlResponse akamai;

    public Optional<AkamaiAccessControlResponse> getAkamai() {
        return this.akamai == null ? Optional.empty() : Optional.ofNullable(this.akamai);
    }

    /**
     * The IP access control of the streaming endpoint.
     * 
     */
    @InputImport(name="ip")
      private final @Nullable IPAccessControlResponse ip;

    public Optional<IPAccessControlResponse> getIp() {
        return this.ip == null ? Optional.empty() : Optional.ofNullable(this.ip);
    }

    public StreamingEndpointAccessControlResponse(
        @Nullable AkamaiAccessControlResponse akamai,
        @Nullable IPAccessControlResponse ip) {
        this.akamai = akamai;
        this.ip = ip;
    }

    private StreamingEndpointAccessControlResponse() {
        this.akamai = null;
        this.ip = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingEndpointAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AkamaiAccessControlResponse akamai;
        private @Nullable IPAccessControlResponse ip;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingEndpointAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.akamai = defaults.akamai;
    	      this.ip = defaults.ip;
        }

        public Builder akamai(@Nullable AkamaiAccessControlResponse akamai) {
            this.akamai = akamai;
            return this;
        }

        public Builder ip(@Nullable IPAccessControlResponse ip) {
            this.ip = ip;
            return this;
        }
        public StreamingEndpointAccessControlResponse build() {
            return new StreamingEndpointAccessControlResponse(akamai, ip);
        }
    }
}

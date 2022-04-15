// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigSpCertificateGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigSpConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigSpConfigGetArgs Empty = new TenantInboundSamlConfigSpConfigGetArgs();

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    @Import(name="callbackUri", required=true)
      private final Output<String> callbackUri;

    public Output<String> callbackUri() {
        return this.callbackUri;
    }

    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    @Import(name="spCertificates")
      private final @Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates;

    public Output<List<TenantInboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates() {
        return this.spCertificates == null ? Codegen.empty() : this.spCertificates;
    }

    /**
     * Unique identifier for all SAML entities.
     * 
     */
    @Import(name="spEntityId", required=true)
      private final Output<String> spEntityId;

    public Output<String> spEntityId() {
        return this.spEntityId;
    }

    public TenantInboundSamlConfigSpConfigGetArgs(
        Output<String> callbackUri,
        @Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates,
        Output<String> spEntityId) {
        this.callbackUri = Objects.requireNonNull(callbackUri, "expected parameter 'callbackUri' to be non-null");
        this.spCertificates = spCertificates;
        this.spEntityId = Objects.requireNonNull(spEntityId, "expected parameter 'spEntityId' to be non-null");
    }

    private TenantInboundSamlConfigSpConfigGetArgs() {
        this.callbackUri = Codegen.empty();
        this.spCertificates = Codegen.empty();
        this.spEntityId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantInboundSamlConfigSpConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> callbackUri;
        private @Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates;
        private Output<String> spEntityId;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigSpConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUri = defaults.callbackUri;
    	      this.spCertificates = defaults.spCertificates;
    	      this.spEntityId = defaults.spEntityId;
        }

        public Builder callbackUri(Output<String> callbackUri) {
            this.callbackUri = Objects.requireNonNull(callbackUri);
            return this;
        }
        public Builder callbackUri(String callbackUri) {
            this.callbackUri = Output.of(Objects.requireNonNull(callbackUri));
            return this;
        }
        public Builder spCertificates(@Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateGetArgs>> spCertificates) {
            this.spCertificates = spCertificates;
            return this;
        }
        public Builder spCertificates(@Nullable List<TenantInboundSamlConfigSpConfigSpCertificateGetArgs> spCertificates) {
            this.spCertificates = Codegen.ofNullable(spCertificates);
            return this;
        }
        public Builder spCertificates(TenantInboundSamlConfigSpConfigSpCertificateGetArgs... spCertificates) {
            return spCertificates(List.of(spCertificates));
        }
        public Builder spEntityId(Output<String> spEntityId) {
            this.spEntityId = Objects.requireNonNull(spEntityId);
            return this;
        }
        public Builder spEntityId(String spEntityId) {
            this.spEntityId = Output.of(Objects.requireNonNull(spEntityId));
            return this;
        }        public TenantInboundSamlConfigSpConfigGetArgs build() {
            return new TenantInboundSamlConfigSpConfigGetArgs(callbackUri, spCertificates, spEntityId);
        }
    }
}

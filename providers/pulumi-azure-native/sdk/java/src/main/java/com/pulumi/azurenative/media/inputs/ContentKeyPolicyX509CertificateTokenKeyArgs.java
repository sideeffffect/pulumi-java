// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a certificate for token validation.
 * 
 */
public final class ContentKeyPolicyX509CertificateTokenKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyX509CertificateTokenKeyArgs Empty = new ContentKeyPolicyX509CertificateTokenKeyArgs();

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET)
     * 
     */
    @Import(name="rawBody", required=true)
    private Output<String> rawBody;

    public Output<String> rawBody() {
        return this.rawBody;
    }

    private ContentKeyPolicyX509CertificateTokenKeyArgs() {}

    private ContentKeyPolicyX509CertificateTokenKeyArgs(ContentKeyPolicyX509CertificateTokenKeyArgs $) {
        this.odataType = $.odataType;
        this.rawBody = $.rawBody;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyX509CertificateTokenKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyX509CertificateTokenKeyArgs $;

        public Builder() {
            $ = new ContentKeyPolicyX509CertificateTokenKeyArgs();
        }

        public Builder(ContentKeyPolicyX509CertificateTokenKeyArgs defaults) {
            $ = new ContentKeyPolicyX509CertificateTokenKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public Builder rawBody(Output<String> rawBody) {
            $.rawBody = rawBody;
            return this;
        }

        public Builder rawBody(String rawBody) {
            return rawBody(Output.of(rawBody));
        }

        public ContentKeyPolicyX509CertificateTokenKeyArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            $.rawBody = Objects.requireNonNull($.rawBody, "expected parameter 'rawBody' to be non-null");
            return $;
        }
    }

}

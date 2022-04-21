// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateArgs Empty = new GetCertificateArgs();

    /**
     * The ARN of the issued certificate.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    /**
     * The Amazon Resource Name (ARN) for the private CA to issue the certificate.
     * 
     */
    @Import(name="certificateAuthorityArn", required=true)
    private String certificateAuthorityArn;

    public String certificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    private GetCertificateArgs() {}

    private GetCertificateArgs(GetCertificateArgs $) {
        this.arn = $.arn;
        this.certificateAuthorityArn = $.certificateAuthorityArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateArgs $;

        public Builder() {
            $ = new GetCertificateArgs();
        }

        public Builder(GetCertificateArgs defaults) {
            $ = new GetCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            $.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }

        public GetCertificateArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.certificateAuthorityArn = Objects.requireNonNull($.certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
            return $;
        }
    }

}

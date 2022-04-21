// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * TlsCertificate Resource
 * 
 */
public final class TlsCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final TlsCertificateResponse Empty = new TlsCertificateResponse();

    /**
     * PEM representation.
     * 
     */
    @Import(name="cert", required=true)
    private String cert;

    public String cert() {
        return this.cert;
    }

    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
     * 
     */
    @Import(name="expireTime", required=true)
    private String expireTime;

    public String expireTime() {
        return this.expireTime;
    }

    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    @Import(name="serialNumber", required=true)
    private String serialNumber;

    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Sha1 Fingerprint of the certificate.
     * 
     */
    @Import(name="sha1Fingerprint", required=true)
    private String sha1Fingerprint;

    public String sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    private TlsCertificateResponse() {}

    private TlsCertificateResponse(TlsCertificateResponse $) {
        this.cert = $.cert;
        this.createTime = $.createTime;
        this.expireTime = $.expireTime;
        this.serialNumber = $.serialNumber;
        this.sha1Fingerprint = $.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCertificateResponse $;

        public Builder() {
            $ = new TlsCertificateResponse();
        }

        public Builder(TlsCertificateResponse defaults) {
            $ = new TlsCertificateResponse(Objects.requireNonNull(defaults));
        }

        public Builder cert(String cert) {
            $.cert = cert;
            return this;
        }

        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder expireTime(String expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        public Builder sha1Fingerprint(String sha1Fingerprint) {
            $.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public TlsCertificateResponse build() {
            $.cert = Objects.requireNonNull($.cert, "expected parameter 'cert' to be non-null");
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.expireTime = Objects.requireNonNull($.expireTime, "expected parameter 'expireTime' to be non-null");
            $.serialNumber = Objects.requireNonNull($.serialNumber, "expected parameter 'serialNumber' to be non-null");
            $.sha1Fingerprint = Objects.requireNonNull($.sha1Fingerprint, "expected parameter 'sha1Fingerprint' to be non-null");
            return $;
        }
    }

}
